package net.sakurapavilion.fsmp.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sakurapavilion.fsmp.Fsmp;

public class ModItems {
    //region 注册物品
    //史莱姆核心 slime_core
    public static final Item SLIME_CORE = registerItems("slime_core",new Item(new FabricItemSettings()));
    //endregion
    private static Item registerItems (String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(Fsmp.MOD_ID,name), item);
    }
    public static void registerFSMPItems(){
        Fsmp.LOGGER.info(Fsmp.MOD_ID + " Items is loaded!");
    }

}
