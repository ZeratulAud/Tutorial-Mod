package com.zeratulaud.tutorialmod.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zerat on 2/3/2017.
 */
public class CommonProxy {

    @Mod.EventHandler
    public void  preinit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void  init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void  postinit(FMLPostInitializationEvent event){

    }
}
