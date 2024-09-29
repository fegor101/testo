
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TestoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestoMod.MODID);
	public static final RegistryObject<Block> TESTO = REGISTRY.register("testo", () -> new TestoBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
