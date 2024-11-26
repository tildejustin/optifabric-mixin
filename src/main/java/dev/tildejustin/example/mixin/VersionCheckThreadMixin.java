package dev.tildejustin.example.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;

@Pseudo
@Debug(export = true)
@Mixin(targets = "VersionCheckThread", remap = false)
public abstract class VersionCheckThreadMixin extends Thread {
    @ModifyExpressionValue(method = "LVersionCheckThread;run()V", at = @At(value = "INVOKE", target = "LConfig;compareRelease(Ljava/lang/String;Ljava/lang/String;)I"), remap = false)
    public int debugPrint(int original) {
        System.out.println("mixin succeeded");
        return 1;
    }
}
