/*package gtna.common.item;

import gregtech.api.items.metaitem.*;
import gregtech.api.items.metaitem.stats.IItemContainerItemProvider;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.api.unification.ore.OrePrefix;

import static gregtech.api.unification.material.MarkerMaterials.*;
import static gtna.common.item.GTNAMetaItems;

public class GTNAMetaItem extends StandardMetaItem {

    public GTNAMetaItem() { super(); }

    @Override
    public void GTNAregisterSubItem() {
		
		//Items
		MICAINSULATOR = addItem(???, "insulator.mica")
        POTATOS = addItem(117, "battery.re.ulv.potatos").addComponents(ElectricStats.createRechargeableBattery(BigInteger.16, GTValues.ULV)).setUnificationData(OrePrefix.battery, Tier.ULV).setModelAmount(8).setCreativeTabs(GregTechAPI.TAB_GREGTECH_TOOLS);
		//FSC
		FLUIX_BOULE = additem(365, "boule.fluix");
		FLUIX_WAFER = addItem(366, "wafer.fluix");
		SIMPLE_FLUIX_SYSTEMATIC_WAFER  = addItem(367, "wafer.simple_fluix_systematic_chip");
		BASIC_FLUIX_SYSTEMATIC_WAFER   = addItem(368, "wafer.basic_fluix_systematic_chip");
		COMPLEX_FLUIX_SYSTEMATIC_WAFER = addItem(369, "wafer.complex_fluix_systematic_chip");
		SIMPLE_FLUIX_SYSTEMATIC_PLATE  = addItem(370, "plate.simple_fluix_systematic_chip");
		BASIC_FLUIX_SYSTEMATIC_PLATE   = addItem(375, "plate.basic_fluix_systematic_chip");
		COMPLEX_FLUIX_SYSTEMATIC_PLATE = addItem(376, "plate.complex_fluix_systematic_chip");
		
		//Boards
		BOARD_CNT  		      = addItem(111, "board.cnt")
		CIRCUIT_BOARD_CNT     = addItem(112, "circuit_board.cnt")
		BOARD_OPTICAL  		  = addItem(113, "board.optical")
		CIRCUIT_BOARD_OPTICAL = addItem(114, "circuit_board.optical")
		BOARD_MATRIX  		  = addItem(115, "board.matrix")
		CIRCUIT_BOARD_MATRIX  = addItem(116, "circuit_board.matrix")

		// T7: CNT
        CNT_PROCESSOR_LUV = addItem(648, "circuit.cnt_processor").setUnificationData(OrePrefix.circuit, Tier.LuV);
		CNT_ASSEMBLY_ZPM  = addItem(649, "circuit.cnt_assembly").setUnificationData(OrePrefix.circuit, Tier.ZPM);
		CNT_COMPUTER_UV   = addItem(650, "circuit.cnt_computer").setUnificationData(OrePrefix.circuit, Tier.UV);
		
		// T9: Optical
		OPT_PROCESSOR_UV  = addItem(651, "circuit.optical_processor").setUnificationData(OrePrefix.circuit, Tier.UV);
		OPT_ASSEMBLY_UHV  = addItem(652, "circuit.optical_assembly").setUnificationData(OrePrefix.circuit, Tier.UHV); 
		OPT_COMPUTER_UEV  = addItem(653, "circuit.optical_computer").setUnificationData(OrePrefix.circuit, Tier.UEV);
		
		// T10: Matrix
		MAT_PROCESSOR_LUV = addItem(648, "circuit.matrix_processor").setUnificationData(OrePrefix.circuit, Tier.UHV).setInvisibleIf(!GregTechAPI.isHighTier());
		MAT_ASSEMBLY_ZPM  = addItem(649, "circuit.matrix_assembly").setUnificationData(OrePrefix.circuit, Tier.UEV).setInvisibleIf(!GregTechAPI.isHighTier());
		MAT_COMPUTER_UV   = addItem(650, "circuit.matrix_computer").setUnificationData(OrePrefix.circuit, Tier.UIV).setInvisibleIf(!GregTechAPI.isHighTier());
		
		// T11: Hyperspatial
		HYP_PROCESSOR_LUV = addItem(648, "circuit.hyperspatial_processor").setUnificationData(OrePrefix.circuit, Tier.UEV).setInvisibleIf(!GregTechAPI.isHighTier());
		HYP_ASSEMBLY_ZPM  = addItem(649, "circuit.hyperspatial_assembly").setUnificationData(OrePrefix.circuit, Tier.UIV).setInvisibleIf(!GregTechAPI.isHighTier());
		HYP_COMPUTER_UV   = addItem(650, "circuit.hyperspatial_computer").setUnificationData(OrePrefix.circuit, Tier.UXV).setInvisibleIf(!GregTechAPI.isHighTier());
		
		// T12: Omnischronal
		OCH_PROCESSOR_LUV = addItem(648, "circuit.omnischronal_processor").setUnificationData(OrePrefix.circuit, Tier.UIV).setInvisibleIf(!GregTechAPI.isHighTier());
		OCH_ASSEMBLY_ZPM  = addItem(649, "circuit.omnischronal_assembly").setUnificationData(OrePrefix.circuit, Tier.UXV).setInvisibleIf(!GregTechAPI.isHighTier());
		OCH_COMPUTER_UV   = addItem(650, "circuit.omnischronal_computer").setUnificationData(OrePrefix.circuit, Tier.OpV).setInvisibleIf(!GregTechAPI.isHighTier());
		
		// T13: Infinity
		INF_PROCESSOR_LUV = addItem(648, "circuit.infinity_processor").setUnificationData(OrePrefix.circuit, Tier.UXV).setInvisibleIf(!GregTechAPI.isHighTier());
		INF_ASSEMBLY_ZPM  = addItem(649, "circuit.infinity_assembly").setUnificationData(OrePrefix.circuit, Tier.OpV).setInvisibleIf(!GregTechAPI.isHighTier());
		INF_COMPUTER_UV   = addItem(650, "circuit.infinity_computer").setUnificationData(OrePrefix.circuit, Tier.MAX).setInvisibleIf(!GregTechAPI.isHighTier());
		
		//free ids: 111-125
    }
}*/