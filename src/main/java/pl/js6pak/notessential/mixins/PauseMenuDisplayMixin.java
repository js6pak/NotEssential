package pl.js6pak.notessential.mixins;

import gg.essential.event.gui.GuiDrawScreenEvent;
import gg.essential.handlers.PauseMenuDisplay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PauseMenuDisplay.class)
public class PauseMenuDisplayMixin {
    @Inject(method = "drawScreen", at = @At("HEAD"), cancellable = true, remap = false)
    private void cancelDrawScreen(GuiDrawScreenEvent event, CallbackInfo ci) {
        ci.cancel();
    }
}
