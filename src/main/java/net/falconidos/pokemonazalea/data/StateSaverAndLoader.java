package net.falconidos.pokemonazalea.data;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.PersistentState;
import net.minecraft.world.PersistentStateManager;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.UUID;

public class StateSaverAndLoader extends PersistentState {

    public Integer totalStarters = 0;

    public HashMap<UUID, PlayerData> players = new HashMap<>();

    @Override
    public NbtCompound writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup){

        nbt.putInt("totalStarters", totalStarters);

        NbtCompound playersNbt = new NbtCompound();
        players.forEach((uuid, playerData) -> {
            NbtCompound playerNbt = new NbtCompound();
            playerNbt.putInt("starterSelected", playerData.starterSelected);
            playersNbt.put(uuid.toString(), playerNbt);

        });
        nbt.put("players", playersNbt);

        return nbt;

    }

    public static StateSaverAndLoader createFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {

        StateSaverAndLoader state = new StateSaverAndLoader();
        state.totalStarters = tag.getInt("totalStarters");

        NbtCompound playersNbt = tag.getCompound("players");
        playersNbt.getKeys().forEach(key -> {
            PlayerData playerData = new PlayerData();

            playerData.starterSelected = playersNbt.getCompound(key).getInt("starterSelected");

            UUID uuid = UUID.fromString(key);
            state.players.put(uuid, playerData);

        });

        return state;

    }

    public static StateSaverAndLoader createNew(){
        StateSaverAndLoader state = new StateSaverAndLoader();
        state.totalStarters = 0;
        state.players = new HashMap<>();
        return state;
    }

    private static Type<StateSaverAndLoader> type = new Type<>(
            StateSaverAndLoader::createNew,
            StateSaverAndLoader::createFromNbt,
            null
    );

    public static StateSaverAndLoader getServerState(MinecraftServer server) {
        PersistentStateManager persistentStateManager = server.getWorld(World.OVERWORLD).getPersistentStateManager();
        StateSaverAndLoader state = persistentStateManager.getOrCreate(type, PokemonAzalea.MOD_ID);
        state.markDirty();

        return state;
    }

    public static PlayerData getPlayerState(LivingEntity player) {
        StateSaverAndLoader serverState = getServerState(player.getWorld().getServer());
        PlayerData playerState = serverState.players.computeIfAbsent(player.getUuid(), uuid -> new PlayerData());

        return playerState;
    }


}
