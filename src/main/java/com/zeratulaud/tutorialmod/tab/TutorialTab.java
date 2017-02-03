package com.zeratulaud.tutorialmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Zerat on 2/3/2017.
 */
public class TutorialTab extends CreativeTabs {

    public TutorialTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.BONE;
    }
}
