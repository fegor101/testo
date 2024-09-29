
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.fluid.TestoFluid;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class TestoModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TestoMod.MODID);
	public static final RegistryObject<FlowingFluid> TESTO = REGISTRY.register("testo", () -> new TestoFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_TESTO = REGISTRY.register("flowing_testo", () -> new TestoFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(TESTO.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TESTO.get(), RenderType.translucent());
		}
	}
}
