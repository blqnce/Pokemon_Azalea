package net.falconidos.pokemonazalea.block.entity.custom;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.falconidos.pokemonazalea.block.entity.ModBlockEntities;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.applin.ApplinScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.vulpix.VulpixScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;


public class VulpixEntity extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPos> {

    public VulpixEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.VULPIX_BE, pos, state);
    }



    public BlockPos getScreenOpeningData(ServerPlayerEntity serverPlayerEntity) {
        return this.pos;
    }



    public Text getDisplayName() {
        return Text.translatable("gui.vulpix");
    }


    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new VulpixScreenHandler(syncId, playerInventory, this.pos);

    }
}
