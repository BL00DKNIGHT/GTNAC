package gtna.common.block;

import gregtech.common.ConfigHolder;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

public class GTNAMiscBlocks extends VariantActiveBlock<GTNAMiscBlocks.UniqueCasingType> {

    public GTNAMiscBlocks() {
        super(Material.IRON);
        setTranslationKey("misc_blocks");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 1);
        setDefaultState(getState(MiscCasingType.CHEMICALINERT_VENT));
    }

    @Override
    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum MiscCasingType implements IStringSerializable {

        CHEMICALINERT_VENT("chemical_inert_vent"),
        ASSEMBLY_CORE("assembly_core");

        private final String name;

        MiscCasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return this.name;
        }

    }
}
