
package testo.item;

import testo.init.TestoModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class TestoItem extends BucketItem {
	public TestoItem() {
		super(TestoModFluids.TESTO, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
