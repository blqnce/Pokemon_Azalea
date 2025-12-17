package net.falconidos.pokemonazalea.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.block.custom.BuddingUltraCrystalBlock;
import net.falconidos.pokemonazalea.block.custom.UltraCrystalBud;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLUE_ULTRA_CRYSTAL_BLOCK = registerBlock("blue_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .ticksRandomly()
                    .strength(1.5F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    ));

    public static final Block BLUE_ULTRA_CRYSTAL_BUD = registerBlock(
            "blue_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLUE)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block GREEN_ULTRA_CRYSTAL_BLOCK = registerBlock("green_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block GREEN_ULTRA_CRYSTAL_BUD = registerBlock(
            "green_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block ORANGE_ULTRA_CRYSTAL_BLOCK = registerBlock("orange_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block ORANGE_ULTRA_CRYSTAL_BUD = registerBlock(
            "orange_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block PINK_ULTRA_CRYSTAL_BLOCK = registerBlock("pink_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block PINK_ULTRA_CRYSTAL_BUD = registerBlock(
            "pink_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block RED_ULTRA_CRYSTAL_BLOCK = registerBlock("red_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block RED_ULTRA_CRYSTAL_BUD = registerBlock(
            "red_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block WHITE_ULTRA_CRYSTAL_BLOCK = registerBlock("white_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block WHITE_ULTRA_CRYSTAL_BUD = registerBlock(
            "white_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block YELLOW_ULTRA_CRYSTAL_BLOCK = registerBlock("yellow_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.YELLOW)
                            .ticksRandomly()
                            .strength(1.5F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block YELLOW_ULTRA_CRYSTAL_BUD = registerBlock(
            "yellow_ultra_crystal_bud",
            new UltraCrystalBud(
                    7.0F,
                    3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.YELLOW)
                            .solid()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                            .strength(1.5F)
                            .luminance(state -> 5)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(PokemonAzalea.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {

        Registry.register(Registries.ITEM, Identifier.of(PokemonAzalea.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks(){

        PokemonAzalea.LOGGER.info("Registering Mod Blocks for " + PokemonAzalea.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BLUE_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.BLUE_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.GREEN_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.GREEN_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.ORANGE_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.ORANGE_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.PINK_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.PINK_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.RED_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.RED_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.WHITE_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.WHITE_ULTRA_CRYSTAL_BUD);

            entries.add(ModBlocks.YELLOW_ULTRA_CRYSTAL_BLOCK);
            entries.add(ModBlocks.YELLOW_ULTRA_CRYSTAL_BUD);

        });

    }

}
