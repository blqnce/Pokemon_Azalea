package net.falconidos.pokemonazalea.block.custom;

import com.mojang.serialization.MapCodec;
import net.falconidos.pokemonazalea.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingUltraCrystalBlock extends UltraCrystalBlock {

    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingUltraCrystalBlock(AbstractBlock.Settings settings) {

        super(settings);

    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            Block block = null;
            if (canGrowIn(blockState)) {

                if(getDefaultMapColor() == MapColor.BLUE){
                    block = ModBlocks.BLUE_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.GREEN){
                    block = ModBlocks.GREEN_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.ORANGE){
                    block = ModBlocks.ORANGE_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.PINK){
                    block = ModBlocks.PINK_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.RED){
                    block = ModBlocks.RED_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.WHITE){
                    block = ModBlocks.WHITE_ULTRA_CRYSTAL_BUD;
                } else if(getDefaultMapColor() == MapColor.YELLOW){
                    block = ModBlocks.YELLOW_ULTRA_CRYSTAL_BUD;
                }
            }

            if (block != null) {
                BlockState blockState2 = block.getDefaultState()
                        .with(AmethystClusterBlock.FACING, direction)
                        .with(AmethystClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
                world.setBlockState(blockPos, blockState2);
            }
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }

}
