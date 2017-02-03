package com.zeratulaud.tutorialmod.item;

import com.zeratulaud.tutorialmod.TutorialMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Zerat on 2/3/2017.
 */
public class ModItems {

    public static Item tutorialItem;

    public static void preinit() {
        tutorialItem = new ItemTutorialItem(EnumHelper.addToolMaterial("DICK",3, 1, 8.0F, 6.0F, 30),"tutorial_item");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(tutorialItem, new ResourceLocation(TutorialMod.MODID, "tutorial_item"));

    }

    public static void registerRenderers() {
        registerRenderer(tutorialItem);
    }

    public static void registerRenderer(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
