package net.falconidos.pokemonazalea.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup POKEMON_AZALEA = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PokemonAzalea.MOD_ID, "pokemon_azalea_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLUE_ULTRA_CRYSTAL_BUD))
                    .displayName(Text.translatable("itemgroup.pokemonazalea.pokemon_azalea_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.BLUE_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.GREEN_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.GREEN_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.RED_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.RED_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.YELLOW_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.YELLOW_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.ORANGE_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.ORANGE_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.PINK_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.PINK_ULTRA_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.WHITE_ULTRA_CRYSTAL_BUD);
                        entries.add(ModBlocks.WHITE_ULTRA_CRYSTAL_BLOCK);

                    })
                    .build());

    public static void registerItemGroups(){

        PokemonAzalea.LOGGER.info("Registrando grupos de item para" + PokemonAzalea.MOD_ID);

    }

}
