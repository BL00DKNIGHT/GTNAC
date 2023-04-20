package gtna.common.metatileentities;

import gtna.GregTechNoobAdvancement;
import gtna.GTNAValues;
import gtna.common.metatileentities.multiblock.generator.*;
import gtna.common.metatileentities.multiblock.electric.*;
import gtna.common.metatileentities.multiblock.steam.*;
//import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

import java.util.function.Function;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class GTNAMetaTileEntities {

    public static MetaTileEntitySteamSmelter STEAM_SMELTER;

    public static void init() {
        STEAM_SMELTER = registerMetaTileEntity(32199, new MetaTileEntitySteamSmelter(gtnaId("steam_smelter")));
    }
    
    private static ResourceLocation gtnaId(String name) {
        return new ResourceLocation(GTNAValues.MODID, name);
    }
}
