package net.sakurapavilion.fsmp.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.sakurapavilion.fsmp.Fsmp;

public class ModBlocks {
    //region 注册方块

    //FSMP工作台
    public static final Block FSMP_CRAFTING_TABLE = registerBlock("fsmp_crafting_table",
            new Block(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE).sounds(BlockSoundGroup.SNOW).strength(1.5f,0.5f).mapColor(DyeColor.WHITE)));
    //endregion
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(Fsmp.MOD_ID, name),block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Fsmp.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerFSMPBlocks(){
        Fsmp.LOGGER.info(Fsmp.MOD_ID + " Blocks is loaded!");
    }
}
