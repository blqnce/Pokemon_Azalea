package net.falconidos.pokemonazalea.network.c2s;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.action.StarterAction;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public record StarterActionC2SPayload(String pokemon, StarterAction action) implements CustomPayload {

    public static final Id<StarterActionC2SPayload> ID = new Id<>(Identifier.of(PokemonAzalea.MOD_ID, "starter_action"));

    public static final PacketCodec<RegistryByteBuf, StarterActionC2SPayload> CODEC =
            PacketCodec.of(StarterActionC2SPayload::write, StarterActionC2SPayload::read);

    private static void write(StarterActionC2SPayload p, RegistryByteBuf buf) {

        buf.writeString(p.pokemon());
        buf.writeEnumConstant(p.action());
    }

    private static StarterActionC2SPayload read(RegistryByteBuf buf) {
        return new StarterActionC2SPayload(
                buf.readString(),
                buf.readEnumConstant(StarterAction.class)
        );
    }

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
