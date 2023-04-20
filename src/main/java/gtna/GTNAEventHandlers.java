package gtna;

import gtna.GregTechNoobAdvancement;
import gtna.GTNAMaterialFlagAddition;
import gtna.GTNAMaterials;
import gregtech.api.GregTechAPI;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GregTechNoobAdvancement.MODID)
public class GTNAEventHandlers {

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(GregTechAPI.MaterialEvent event) {
        GTNAMaterials.init();
    }

    @SubscribeEvent
    public static void registerMaterialsPost(GregTechAPI.PostMaterialEvent event) {
        GTNAPostMaterials.init();
    }
}
