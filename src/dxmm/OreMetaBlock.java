package dxmm;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreMetaBlock extends Block
{
	public OreMetaBlock(int id) {
		super(id, Material.rock);setCreativeTab(dxm.tab);}
	
	@SideOnly(Side.CLIENT)public static Icon[] icons;
	
	@Override@SideOnly(Side.CLIENT)
	
	public void registerIcons(IconRegister icon) {
		icons = new Icon[Names.oreMetaBlock_unlocalizedName.length];
		for(int i = 0; i < icons.length; i++) {icons[i] = icon.registerIcon(dxm.modid.toLowerCase() + ":" + Names.oreMetaBlock_unlocalizedName[i]);}}
	
	@Override public Icon getIcon(int side, int meta) {return icons[meta];}
	
	@Override public int damageDropped(int meta) {return meta;}
	
	@Override public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < Names.oreMetaBlock_name.length; i++) {list.add(new ItemStack(this, 1, i));}
		}
	}