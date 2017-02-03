package com.zeratulaud.tutorialmod;

import com.zeratulaud.tutorialmod.item.ModItems;
import com.zeratulaud.tutorialmod.proxy.CommonProxy;
import com.zeratulaud.tutorialmod.tab.TutorialTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, version = TutorialMod.VERSION, name = TutorialMod.NAME)
public class TutorialMod {
    public static final String MODID = "tutorialmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tutorial Mod";

    @SidedProxy(clientSide = "com.zeratulaud.tutorialmod.proxy.ClientProxy", serverSide = "com.zeratulaud.tutorialmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TutorialMod instance;

    public static TutorialTab tabTutorial;

    @EventHandler
    public void  preinit(FMLPreInitializationEvent event){

        tabTutorial = new TutorialTab(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preinit();
        proxy.preinit(event);
    }

    @EventHandler
    public void  init(FMLInitializationEvent event){

        proxy.init(event);
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

        proxy.postinit (event);
    }
}
