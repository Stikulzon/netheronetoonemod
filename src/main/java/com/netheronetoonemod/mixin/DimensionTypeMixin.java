package com.netheronetoonemod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.world.dimension.DimensionType.class)
public class DimensionTypeMixin {
    @Inject(method = "coordinateScale", at = @At("HEAD"), cancellable = true)
    private void onCoordinateScale(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(1.0);
    }
}