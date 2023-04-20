package gtna.common;

import gtna.GregTechNoobAdvancement;
import gtna.common.block.GTNAMetaBlocks;
import gtna.common.item.GTNAMetaItems;
import gtna.recipe.GTNARecipeLoader;
import gregtech.api.block.VariantItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
import java.util.function.Function;

@Mod.EventBusSubscriber(modid = GregTechNoobAdvancement.MODID)
public class CommonProxy {

    public void preLoad() {
        GTNAMetaItems.init();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(GTNAMetaBlocks.MISC_CASING);
        registry.register(GTNAMetaBlocks.MULTI_CASING);
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(createItemBlock(GTNAMetaBlocks.MISC_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(GTNAMetaBlocks.MULTI_CASING, VariantItemBlock::new));
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent()
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        // Main recipe registration
        // This is called AFTER GregTech registers recipes, so
        // anything here is safe to call removals in
        GTNARecipeLoader.init();
    }
}
