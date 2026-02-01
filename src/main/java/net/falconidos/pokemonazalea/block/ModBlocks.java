package net.falconidos.pokemonazalea.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block GREEN_ULTRA_CRYSTAL_BLOCK = registerBlock("green_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block ORANGE_ULTRA_CRYSTAL_BLOCK = registerBlock("orange_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block PINK_ULTRA_CRYSTAL_BLOCK = registerBlock("pink_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block RED_ULTRA_CRYSTAL_BLOCK = registerBlock("red_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block WHITE_ULTRA_CRYSTAL_BLOCK = registerBlock("white_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block YELLOW_ULTRA_CRYSTAL_BLOCK = registerBlock("yellow_ultra_crystal_block",
            new BuddingUltraCrystalBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.YELLOW)
                            .ticksRandomly()
                            .strength(-1.0F, 3600000.0F)
                            .dropsNothing()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
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
                            .requiresTool()
            )
    );

    public static final Block APPLIN_POKEBALL = registerBlock("applin_pokeball",
            new ApplinPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block VULPIX_POKEBALL = registerBlock("vulpix_pokeball",
            new VulpixPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block ABRA_POKEBALL = registerBlock("abra_pokeball",
            new AbraPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block HONEDGE_POKEBALL = registerBlock("honedge_pokeball",
            new HonedgePokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block SNEASEL_POKEBALL = registerBlock("sneasel_pokeball",
            new SneaselPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block SCYTHER_POKEBALL = registerBlock("scyther_pokeball",
            new ScytherPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block SPRIGATITTO_POKEBALL = registerBlock("sprigatitto_pokeball",
            new SprigatittoPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block MUDKIP_POKEBALL = registerBlock("mudkip_pokeball",
            new MudkipPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block LITTEN_POKEBALL = registerBlock("litten_pokeball",
            new LittenPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block GLIGAR_POKEBALL = registerBlock("gligar_pokeball",
            new GligarPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block ELEKID_POKEBALL = registerBlock("elekid_pokeball",
            new ElekidPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block ROOKIDEE_POKEBALL = registerBlock("rookidee_pokeball",
            new RookideePokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block TINKATINK_POKEBALL = registerBlock("tinkatink_pokeball",
            new TinkatinkPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block RIOLU_POKEBALL = registerBlock("riolu_pokeball",
            new RioluPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block PAWNIARD_POKEBALL = registerBlock("pawniard_pokeball",
            new PawniardPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block MUNCHLAX_POKEBALL = registerBlock("munchlax_pokeball",
            new MunchlaxPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block NACLI_POKEBALL = registerBlock("nacli_pokeball",
            new NacliPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
            )
    );

    public static final Block GASTLY_POKEBALL = registerBlock("gastly_pokeball",
            new GastlyPokeballBlock(AbstractBlock.Settings.create()
                    .strength(-1.0F, 3600000.0F)
                    .dropsNothing()
                    .allowsSpawning(Blocks::never)
                    .nonOpaque()
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
