package net.falconidos.pokemonazalea.block.entity.custom;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.falconidos.pokemonazalea.block.entity.ModBlockEntities;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.scyther.ScytherScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;


public class ScytherEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos> {

    public ScytherEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SCYTHER_BE, pos, state);
    }


    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new ScytherScreenHandler(syncId, inv, this.pos);
    }


    public Text getDisplayName() {
        return Text.translatable("gui.scyther");
    }


    public BlockPos getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return this.pos;
    }
}
