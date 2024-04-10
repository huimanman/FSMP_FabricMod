package net.sakurapavilion.fsmp;

import net.fabricmc.api.ModInitializer;

import net.sakurapavilion.fsmp.block.ModBlocks;
import net.sakurapavilion.fsmp.item.ModItemGroups;
import net.sakurapavilion.fsmp.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fsmp implements ModInitializer {
	public static final String MOD_ID = "fsmp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//物品类
		ModItems.registerFSMPItems();
		//物品选项卡类
		ModItemGroups.registerFSMPItemGroup();
		//方块类
		ModBlocks.registerFSMPBlocks();
	}
}