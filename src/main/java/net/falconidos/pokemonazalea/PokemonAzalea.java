package net.falconidos.pokemonazalea;

import net.fabricmc.api.ModInitializer;

import net.falconidos.pokemonazalea.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PokemonAzalea implements ModInitializer {
	public static final String MOD_ID = "pokemonazalea";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

	}
}