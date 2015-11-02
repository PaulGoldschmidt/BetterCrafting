package com.github.paulgoldschmidt.BetterCrafting;

/**
 * Created by Paul Goldschmidt on 01.11.2015.
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class NewBlocks extends Block {

   public NewBlocks(Material material, String unlocalizedName, float hardness, float resistance, float lightLevel, String tool, int harvestlevel) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setLightLevel(lightLevel);
        this.setHarvestLevel(tool, harvestlevel);
        this.registerTexture();
    }

    private void registerTexture(String unlockName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().
                register(Item.getItemFromBlock(this), 0, new ModelResourceLocation("bettercrafting:" + unlockName));
    }
}
