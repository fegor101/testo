
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TestoModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestoMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAINTAB = REGISTRY.register("maintab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.testo.maintab")).icon(() -> new ItemStack(Blocks.BLACK_CANDLE_CAKE)).displayItems((parameters, tabData) -> {
				tabData.accept(TestoModItems.TESTO_BUCKET.get());
			})

					.build());
}
