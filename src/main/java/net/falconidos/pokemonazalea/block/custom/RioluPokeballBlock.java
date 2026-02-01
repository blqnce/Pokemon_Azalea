package net.falconidos.pokemonazalea.block.custom;

import com.mojang.serialization.MapCodec;
import net.falconidos.pokemonazalea.block.entity.custom.RioluEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.Map;


public class RioluPokeballBlock extends BlockWithEntity implements BlockEntityProvider {

    public static final MapCodec<RioluPokeballBlock> CODEC = createCodec(RioluPokeballBlock::new);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 7.0D, 12.0D);
    public static final Map<Direction, VoxelShape> BLOCK_SHAPE_BY_DIRECTION = new EnumMap<>(Direction.class);

    static {
        for (Direction dir : Direction.Type.HORIZONTAL) {
            BLOCK_SHAPE_BY_DIRECTION.put(dir, rotateShape(dir, SHAPE));
        }
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec(){
        return CODEC;
    }

    public RioluPokeballBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {

            BlockEntity be = world.getBlockEntity(pos);
            if (be instanceof RioluEntity riolu) {

                MinecraftServer server = world.getServer();
                CommandManager commandManager = server.getCommandManager();
                commandManager.executeWithPrefix(player.getCommandSource().withLevel(4).withSilent(), "playsound pokemonazalea:riolu_cry player " + player.getName().getString());

                player.openHandledScreen(riolu);
                return ActionResult.CONSUME;
            }



        }

        return ActionResult.SUCCESS;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        return BLOCK_SHAPE_BY_DIRECTION.get(facing);
    }

    @Override
    public @Nullable BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }


    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RioluEntity(pos, state);
    }

    private static VoxelShape rotateShape(Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[]{shape, VoxelShapes.empty()};
        int times = (to.getHorizontal() - Direction.NORTH.getHorizontal() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.union(buffer[1],
                    VoxelShapes.cuboid(
                            1 - maxZ, minY, minX,
                            1 - minZ, maxY, maxX
                    )));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }
        return buffer[0];
    }

}
