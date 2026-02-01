package net.falconidos.pokemonazalea.sound;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {

    public static final SoundEvent GYM_LEADER = registerSoundEvent("theme.gym.leader");
    public static final SoundEvent LEGENDARY = registerSoundEvent("theme.legendary");
    public static final SoundEvent ULTRABEAST= registerSoundEvent("theme.ultrabeast");
    public static final SoundEvent GYM_FOOL = registerSoundEvent("theme.gym.fool");
    public static final SoundEvent ELITEFOUR = registerSoundEvent("theme.elitefour");
    public static final SoundEvent EVIL_TEAM = registerSoundEvent("theme.evil.team");
    public static final SoundEvent EVIL_LEADER = registerSoundEvent("theme.evil.leader");
    public static final SoundEvent GYM_TRAINER = registerSoundEvent("theme.gym.trainer");
    public static final SoundEvent STARTER_GET = registerSoundEvent("starter.get");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(PokemonAzalea.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        PokemonAzalea.LOGGER.info("Registering Mod Sounds for " + PokemonAzalea.MOD_ID);
    }
}
