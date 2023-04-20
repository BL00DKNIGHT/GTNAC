package gtna;

import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.material.properties.*;
//import gregtech.api.unification.OreDictUnifier;
import static gtna.GTNAValues.*;
import static gregtech.api.unification.material.Materials.*;

public class GTNAMaterials {

    public static final Material InfinitySus = new Material.Builder(21900, "infinitysus")
            .dust()
            //.color(0x0045A0).iconSet(MaterialIconSet.INFINITY)
            //.flags([MaterialFlags.GENERATE_PLATE, MaterialFlags.DISABLE_DECOMPOSITION])
            //.components(Carbon, 8, Hydrogen, 9, Nitrogen, 1, Oxygen, 2)
            .build();

    /*public static void onMaterialsInit() {
        Materials.Iron.addFlags(GENERATE_FRAME);
    }*/
}