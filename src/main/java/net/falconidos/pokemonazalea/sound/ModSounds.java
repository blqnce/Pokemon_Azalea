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

    //Cry

    public static final SoundEvent APPLIN_CRY = registerSoundEvent("applin_cry");
    public static final SoundEvent VULPIX_CRY = registerSoundEvent("vulpix_cry");
    public static final SoundEvent HONEDGE_CRY = registerSoundEvent("honedge_cry");
    public static final SoundEvent ABRA_CRY = registerSoundEvent("abra_cry");
    public static final SoundEvent SNEASEL_CRY = registerSoundEvent("sneasel_cry");
    public static final SoundEvent SCYTHER_CRY = registerSoundEvent("scyther_cry");
    public static final SoundEvent SPRIGATITTO_CRY = registerSoundEvent("sprigatitto_cry");
    public static final SoundEvent MUDKIP_CRY = registerSoundEvent("mudkip_cry");
    public static final SoundEvent LITTEN_CRY = registerSoundEvent("litten_cry");
    public static final SoundEvent GLIGAR_CRY = registerSoundEvent("gligar_cry");
    public static final SoundEvent ELEKID_CRY = registerSoundEvent("elekid_cry");
    public static final SoundEvent ROOKIDEE_CRY = registerSoundEvent("rookidee_cry");
    public static final SoundEvent TINKATINK_CRY = registerSoundEvent("tinkatink_cry");
    public static final SoundEvent RIOLU_CRY = registerSoundEvent("riolu_cry");
    public static final SoundEvent PAWNIARD_CRY = registerSoundEvent("pawniard_cry");
    public static final SoundEvent MUNCHLAX_CRY = registerSoundEvent("munchlax_cry");
    public static final SoundEvent NACLI_CRY = registerSoundEvent("nacli_cry");
    public static final SoundEvent GASTLY_CRY = registerSoundEvent("gastly_cry");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(PokemonAzalea.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        PokemonAzalea.LOGGER.info("Registering Mod Sounds for " + PokemonAzalea.MOD_ID);
    }
}
