package minecraftlover.moonvent.RemoveAttackCooldown.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Player.class)
public class AttackCooldownMixin {
	@ModifyReturnValue(method = "getAttackStrengthScale", at = @At("RETURN"))
	private float resetAttackCooldown(float original) {
    	return 1.0f;
	}
}
