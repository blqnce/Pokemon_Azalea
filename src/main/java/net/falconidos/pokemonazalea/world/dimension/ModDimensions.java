package net.falconidos.pokemonazalea.world.dimension;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> ISLAND_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(PokemonAzalea.MOD_ID, "island"));
    public static final RegistryKey<World> ISLAND_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(PokemonAzalea.MOD_ID, "island"));
    public static final RegistryKey<DimensionType> ISLAND_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
           Identifier.of(PokemonAzalea.MOD_ID, "island_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ISLAND_DIM_TYPE, new DimensionType(
                OptionalLong.empty(),
                true,
                false,
                false,
                true,
                1.0,
                true,
                false,
                -64,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                0.0F,
                new DimensionType.MonsterSettings(false, true, UniformIntProvider.create(0, 7), 0)
        )
        );
    }
}
