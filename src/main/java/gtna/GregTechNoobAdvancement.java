package gtna;

import gtna.common.CommonProxy;
import gtna.common.block.GTNAMetaBlocks;
import gtna.common.metatileentities.GTNAMetaTileEntities;
import gregtech.api.GTValues;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(   modid        = GregTechNoobAdvancement.MODID,
        name         = GregTechNoobAdvancement.NAME,
        version      = GregTechNoobAdvancement.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP + "required-after:gcym")
public class GregTechNoobAdvancement {

    public static final String MODID = "gtna";
    public static final String NAME = "GT Noob Advancement Core";
    public static final String VERSION = "0.0.1";

    @SidedProxy(modId = MODID, clientSide = "gtna.common.ClientProxy", serverSide = "gtna.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        GCYSMetaItems.initMetaItems();
        GCYMMetaBlocks.init();
        GCYMMetaTileEntities.init();

        proxy.preLoad();
    }
}
