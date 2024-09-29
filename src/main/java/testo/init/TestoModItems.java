
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class TestoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestoMod.MODID);
	public static final RegistryObject<Item> TESTO_BUCKET = REGISTRY.register("testo_bucket", () -> new TestoItem());
	// Start of user code block custom items
	// End of user code block custom items
}
