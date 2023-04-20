package gtna.common.block;  

import gtna.common.block.GTNAMiscBlocks;
import gtna.common.block.GTNACasings;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GTNAMetaBlocks {

    public static GTNAMiscBlocks MISC_CASING;
    public static GTNACasings MULTI_CASING;

    public static void init() {
        MISC_CASING = new BlockUniqueCasing();
        MISC_CASING.setRegistryName("misc_casing");
        MULTI_CASING = new BlockLargeMultiblockCasing();
        MULTI_CASING.setRegistryName("multi_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        UNIQUE_CASING.onModelRegister();
        registerItemModel(MULTI_CASING);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            MetaBlocks.statePropertiesToString(state.getProperties())));
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> String getPropertyName(IProperty<T> property, Comparable<?> value) {
        return property.getName((T) value);
    }
}
