
package testo.fluid;

import testo.init.TestoModItems;
import testo.init.TestoModFluids;
import testo.init.TestoModFluidTypes;
import testo.init.TestoModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class TestoFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TestoModFluidTypes.TESTO_TYPE.get(), () -> TestoModFluids.TESTO.get(), () -> TestoModFluids.FLOWING_TESTO.get()).explosionResistance(100f)
			.slopeFindDistance(16).bucket(() -> TestoModItems.TESTO_BUCKET.get()).block(() -> (LiquidBlock) TestoModBlocks.TESTO.get());

	private TestoFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends TestoFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TestoFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
