package net.falconidos.pokemonazalea;

import net.fabricmc.api.ModInitializer;

import net.falconidos.pokemonazalea.block.ModBlocks;

import net.falconidos.pokemonazalea.block.entity.ModBlockEntities;
import net.falconidos.pokemonazalea.item.ModItemGroups;
import net.falconidos.pokemonazalea.network.PokemonAzaleaPackets;
import net.falconidos.pokemonazalea.screen.ModGuiTextures;
import net.falconidos.pokemonazalea.screen.ModScreenHandlers;
import net.falconidos.pokemonazalea.sound.ModMusicType;
import net.falconidos.pokemonazalea.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.falconidos.pokemonazalea.world.gen.ModWorldGeneration;


public class PokemonAzalea implements ModInitializer {
	public static final String MOD_ID = "pokemonazalea";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {




		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModMusicType.registerMusics();

		ModWorldGeneration.generateModWorldGen();

		ModBlockEntities.registerBlockEntities();

		ModScreenHandlers.registerScreenHandlers();

		PokemonAzaleaPackets.registerC2S();

	}
}