package dxm.biological.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import dxm.biological.BioSpawnMain;

public class ItemHemp extends Item
{
    public ItemHemp(int id)
    {
        super(id);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        world.spawnParticle("smoke", player.posX, player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("smoke", player.posX - 0.3D, player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("smoke", player.posX, player.posY - 0.3D, player.posZ, 0.0D, 0.0D, 0.0D);
        world.spawnParticle("smoke", player.posX, player.posY, player.posZ - 0.3D, 0.0D, 0.0D, 0.0D);
        // Just slowness XXX
        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 900, 2));
        player.addPotionEffect(new PotionEffect(Potion.hunger.id, 900, 0));
        // player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 900, 9));
        // player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 900, 9));
        // Find different effect XXX
        player.addPotionEffect(new PotionEffect(Potion.jump.id, 900, 0));
        return new ItemStack(itemStack.getItem(), itemStack.stackSize - 1);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(BioSpawnMain.modID + ":" + this.getUnlocalizedName());
    }
}