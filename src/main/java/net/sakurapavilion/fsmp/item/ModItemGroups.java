package net.sakurapavilion.fsmp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sakurapavilion.fsmp.Fsmp;
import net.sakurapavilion.fsmp.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup FsmpItemGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(Fsmp.MOD_ID,"fsmp_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fsmp"))
                    .icon(() -> new ItemStack(ModBlocks.FSMP_CRAFTING_TABLE)).entries(((displayContext, entries) -> {
                        //region 将物品加入物品组

                        entries.add(ModItems.SLIME_CORE);

                        entries.add(ModBlocks.FSMP_CRAFTING_TABLE);

                        //endregion
                    })).build());
    public static void registerFSMPItemGroup(){
        Fsmp.LOGGER.info(Fsmp.MOD_ID + " ItemGroups is loaded!");
    }
}
