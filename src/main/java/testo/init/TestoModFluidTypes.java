
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class TestoModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TestoMod.MODID);
	public static final RegistryObject<FluidType> TESTO_TYPE = REGISTRY.register("testo", () -> new TestoFluidType());
}
