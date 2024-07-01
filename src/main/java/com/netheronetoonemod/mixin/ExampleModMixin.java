package com.netheronetoonemod.mixin;

import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DimensionType.class)
public class ExampleModMixin {
    @Inject(method = "coordinateScale", at = @At("HEAD"), cancellable = true)
    private void onCoordinateScale(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(1.0);
    }
}