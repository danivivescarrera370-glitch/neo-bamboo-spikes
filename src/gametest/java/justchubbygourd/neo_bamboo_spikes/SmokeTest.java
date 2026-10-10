package justfatlard.bamboo_spikes.gametest;

import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.neoforged.neoforge.gametest.GameTestHolder;

/**
 * This mod loads, its mixins bind, and a world comes up with it installed.
 *
 * <p>Nothing is asserted beyond getting there, and getting there proves most of it: a mixin that no
 * longer applies refuses the mod outright, a registration that throws takes the client down, and a
 * datapack that will not parse fails the world.
 */
@GameTestHolder("bamboo_spikes_justfatlard") // Must match your NeoForge MOD_ID exactly
public final class SmokeTest {

	@GameTest(template = "bamboo_spikes_justfatlard:empty") // Points to an empty NBT structure file for the environment
	public static void smokeTest(GameTestHelper helper) {
		// By reaching this point, the game has successfully booted, the world loaded, 
		// registries were verified, and Mixins injected without crashing the runtime.
		helper.succeed();
	}
}
