package pl.js6pak.notessential.mixins;

import gg.essential.data.OnboardingData;
import kotlin.jvm.JvmStatic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(OnboardingData.class)
public class OnboardingDataMixin {
    @JvmStatic
    @Overwrite(remap = false)
    public static final boolean hasAcceptedTos() {
        return false;
    }

    @JvmStatic
    @Overwrite(remap = false)
    public static final boolean hasDeniedTos() {
        return true;
    }
}
