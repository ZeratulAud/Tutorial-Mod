package com.zeratulaud.tutorialmod.proxy;

import com.zeratulaud.tutorialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zerat on 2/3/2017.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void preinit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenderers();
    }

    @Override
    public void postinit(FMLPostInitializationEvent event) {

    }
}
