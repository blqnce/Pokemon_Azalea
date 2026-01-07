package net.falconidos.pokemonazalea.sound;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.minecraft.sound.MusicSound;

import static net.minecraft.sound.MusicType.createIngameMusic;

// Pruebas de musica de bioma

public class ModMusicType {

    public static final MusicSound GYM_LEADER = createIngameMusic(ModSounds.THEME_GYM_LEADER);


    public static void registerMusics() {
        PokemonAzalea.LOGGER.info("Registering Mod Musics for " + PokemonAzalea.MOD_ID);
    }
}