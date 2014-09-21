package luxusdarkangel.aestheticrecovery.items;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TrozoDiamante extends Item {

	public TrozoDiamante(int par1){
		super(par1);	
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
}
   
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
    	this.itemIcon = reg.registerIcon(AestheticRecovery.modid + ":trozo_diamante");
    }
}