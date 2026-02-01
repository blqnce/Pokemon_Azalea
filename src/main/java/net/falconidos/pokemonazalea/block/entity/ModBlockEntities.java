package net.falconidos.pokemonazalea.block.entity;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.block.ModBlocks;
import net.falconidos.pokemonazalea.block.entity.custom.*;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<ApplinEntity> APPLIN_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "applin_be"),
            BlockEntityType.Builder.create(ApplinEntity::new, ModBlocks.APPLIN_POKEBALL).build(null));

    public static final BlockEntityType<VulpixEntity> VULPIX_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "vulpix_be"),
            BlockEntityType.Builder.create(VulpixEntity::new, ModBlocks.VULPIX_POKEBALL).build(null));

    public static final BlockEntityType<AbraEntity> ABRA_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "abra_be"),
            BlockEntityType.Builder.create(AbraEntity::new, ModBlocks.ABRA_POKEBALL).build(null));

    public static final BlockEntityType<GastlyEntity> GASTLY_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "gastly_be"),
            BlockEntityType.Builder.create(GastlyEntity::new, ModBlocks.GASTLY_POKEBALL).build(null));

    public static final BlockEntityType<NacliEntity> NACLI_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "nacli_be"),
            BlockEntityType.Builder.create(NacliEntity::new, ModBlocks.NACLI_POKEBALL).build(null));

    public static final BlockEntityType<MunchlaxEntity> MUNCHLAX_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "munchlax_be"),
            BlockEntityType.Builder.create(MunchlaxEntity::new, ModBlocks.MUNCHLAX_POKEBALL).build(null));

    public static final BlockEntityType<PawniardEntity> PAWNIARD_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "pawniard_be"),
            BlockEntityType.Builder.create(PawniardEntity::new, ModBlocks.PAWNIARD_POKEBALL).build(null));

    public static final BlockEntityType<RioluEntity> RIOLU_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "riolu_be"),
            BlockEntityType.Builder.create(RioluEntity::new, ModBlocks.RIOLU_POKEBALL).build(null));

    public static final BlockEntityType<TinkatinkEntity> TINKATINK_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "tinkatink_be"),
            BlockEntityType.Builder.create(TinkatinkEntity::new, ModBlocks.TINKATINK_POKEBALL).build(null));

    public static final BlockEntityType<RookideeEntity> ROOKIDEE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "rookidee_be"),
            BlockEntityType.Builder.create(RookideeEntity::new, ModBlocks.ROOKIDEE_POKEBALL).build(null));

    public static final BlockEntityType<HonedgeEntity> HONEDGE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "honedge_be"),
            BlockEntityType.Builder.create(HonedgeEntity::new, ModBlocks.HONEDGE_POKEBALL).build(null));

    public static final BlockEntityType<SneaselEntity> SNEASEL_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "sneasel_be"),
            BlockEntityType.Builder.create(SneaselEntity::new, ModBlocks.SNEASEL_POKEBALL).build(null));

    public static final BlockEntityType<ScytherEntity> SCYTHER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "scyther_be"),
            BlockEntityType.Builder.create(ScytherEntity::new, ModBlocks.SCYTHER_POKEBALL).build(null));

    public static final BlockEntityType<SprigatittoEntity> SPRIGATITTO_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "sprigatitto_be"),
            BlockEntityType.Builder.create(SprigatittoEntity::new, ModBlocks.SPRIGATITTO_POKEBALL).build(null));

    public static final BlockEntityType<MudkipEntity> MUDKIP_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "mudkip_be"),
            BlockEntityType.Builder.create(MudkipEntity::new, ModBlocks.MUDKIP_POKEBALL).build(null));

    public static final BlockEntityType<LittenEntity> LITTEN_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "litten_be"),
            BlockEntityType.Builder.create(LittenEntity::new, ModBlocks.LITTEN_POKEBALL).build(null));

    public static final BlockEntityType<GligarEntity> GLIGAR_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "gligar_be"),
            BlockEntityType.Builder.create(GligarEntity::new, ModBlocks.GLIGAR_POKEBALL).build(null));

    public static final BlockEntityType<ElekidEntity> ELEKID_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PokemonAzalea.MOD_ID, "elekid_be"),
            BlockEntityType.Builder.create(ElekidEntity::new, ModBlocks.ELEKID_POKEBALL).build(null));


    public static void registerBlockEntities(){
        PokemonAzalea.LOGGER.info("Registering block entities for " + PokemonAzalea.MOD_ID);
    }


}
