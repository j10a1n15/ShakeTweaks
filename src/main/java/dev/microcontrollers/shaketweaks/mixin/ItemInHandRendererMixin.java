package dev.microcontrollers.shaketweaks.mixin;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.microcontrollers.shaketweaks.config.ShakeTweaksConfig;
import net.minecraft.client.renderer.ItemInHandRenderer;
//? if >=1.21.5 {
import org.joml.Quaternionfc;
//?} else {
/*import org.joml.Quaternionf;
*///?}
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ItemInHandRenderer.class)
public class ItemInHandRendererMixin {
    @WrapWithCondition(method = "renderHandsWithItems", at = @At(value = "INVOKE", target = /*? if >=1.21.5 {*/ "Lcom/mojang/blaze3d/vertex/PoseStack;mulPose(Lorg/joml/Quaternionfc;)V" /*?} else {*/ /*"Lcom/mojang/blaze3d/vertex/PoseStack;mulPose(Lorg/joml/Quaternionf;)V" *//*?}*/))
    private boolean removeHandSway(PoseStack instance, /*? if >=1.21.5 {*/ Quaternionfc /*?} else {*/ /*Quaternionf *//*?}*/ quaternion) {
        return !ShakeTweaksConfig.CONFIG.instance().disableHandViewSway;
    }
}
