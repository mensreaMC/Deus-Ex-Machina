package dxmm;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class ItemGalena extends Item
{
       public ItemGalena(int id)
       {
             super(id);
             setHasSubtypes(true);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
       
       public String getUnlocalizedNames(ItemStack itemstack)
       {
    	   String name = "";
    			   switch(itemstack.getItemDamage())
    			   {
    		             case 0:
    		             {
    		                    name = "world";
    		                    break;
    		             }
    		             case 1:
    		             {
    		                    name = "nether";
    		                    break;
    		             }
    		             default: name = "broken";
    		       }
    		       return getUnlocalizedName() + "." + name;
}
       public int getMetadata(int par1)
       {
    	   return par1;
       }


       @SideOnly(Side.CLIENT)

       public void registerIcons(IconRegister par1IconRegister)
       {
           this.itemIcon = par1IconRegister.registerIcon(dxm.modid + ":" + (this.getUnlocalizedName().substring(5)));
       }
}