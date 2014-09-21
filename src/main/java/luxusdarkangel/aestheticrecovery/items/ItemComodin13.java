package luxusdarkangel.aestheticrecovery.items;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemComodin13 extends Item {

	public ItemComodin13(int par1){
		super(par1);	
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
}
   
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
    	this.itemIcon = reg.registerIcon(AestheticRecovery.modid + ":item_comodin");
    }
}