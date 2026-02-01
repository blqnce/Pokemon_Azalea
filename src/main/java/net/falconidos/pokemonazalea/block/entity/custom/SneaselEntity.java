package net.falconidos.pokemonazalea.block.entity.custom;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.falconidos.pokemonazalea.block.entity.ModBlockEntities;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.sneasel.SneaselScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;


public class SneaselEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos> {

    public SneaselEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SNEASEL_BE, pos, state);
    }


    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SneaselScreenHandler(syncId, inv, this.pos);
    }


    public Text getDisplayName() {
        return Text.translatable("gui.sneasel");
    }


    public BlockPos getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return this.pos;
    }
}
