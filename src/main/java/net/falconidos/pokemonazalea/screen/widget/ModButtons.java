package net.falconidos.pokemonazalea.screen.widget;

import net.falconidos.pokemonazalea.screen.ModGuiTextures;
import net.minecraft.text.Text;

public final class ModButtons {

    private ModButtons() {}

    public static Button accept(int baseX, int baseY, int x, int y, Button.PressAction onPress){
        return new Button(baseX + x, baseY + y, 36, 13, ModGuiTextures.ACCEPT , onPress, Text.translatable(""));
    }

    public static Button reject(int baseX, int baseY, int x, int y, Button.PressAction onPress){
        return new Button(baseX + x, baseY + y, 36, 13, ModGuiTextures.REJECT , onPress, Text.translatable(""));
    }

    public static Button blocked(int baseX, int baseY, int x, int y, Button.PressAction onPress){
        return new Button(baseX + x, baseY + y, 29, 12, ModGuiTextures.BLOCKED , onPress, Text.translatable("button.pokemonazalea.blocked"));
    }



}
