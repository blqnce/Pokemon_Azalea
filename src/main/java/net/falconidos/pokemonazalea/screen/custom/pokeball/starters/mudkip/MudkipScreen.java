package net.falconidos.pokemonazalea.screen.custom.pokeball.starters.mudkip;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.falconidos.pokemonazalea.action.StarterAction;
import net.falconidos.pokemonazalea.network.c2s.StarterActionC2SPayload;
import net.falconidos.pokemonazalea.screen.ModGuiTextures;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.mudkip.MudkipScreenHandler;
import net.falconidos.pokemonazalea.screen.widget.Button;
import net.falconidos.pokemonazalea.screen.widget.ModButtons;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;

public class MudkipScreen extends HandledScreen<MudkipScreenHandler> {

    private Button accept,reject;

    private String pokemon = "mudkip";

    public MudkipScreen(MudkipScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = 290;
        this.backgroundHeight = 250;
    }


    protected void init() {

        int baseX = (this.width - this.backgroundWidth) / 2;
        int baseY = (this.height - this.backgroundHeight) / 2;

        this.accept = ModButtons.accept(baseX, baseY, 90, 212, b-> sendAction(StarterAction.ACCEPT));
        this.reject = ModButtons.reject(baseX, baseY, 130, 212, b -> sendAction(StarterAction.REJECT));

        this.addDrawableChild(accept);
        this.addDrawableChild(reject);

        updateButtons();


    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, ModGuiTextures.MUDKIP);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(ModGuiTextures.MUDKIP, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    private void updateButtons() {

        accept.visible=true;
        accept.active=true;

        reject.visible=true;
        reject.active=true;

    }

    @Override
    protected void drawForeground(DrawContext ctx, int mouseX, int mouseY) { }


    private void sendAction(StarterAction action) {
        if (client == null || client.player == null) return;

        if (action == StarterAction.ACCEPT) {
                ClientPlayNetworking.send(new StarterActionC2SPayload(pokemon, action));
                client.player.closeHandledScreen();

        }

        if (action == StarterAction.REJECT) {
            client.player.closeHandledScreen();
        }

    }



}
