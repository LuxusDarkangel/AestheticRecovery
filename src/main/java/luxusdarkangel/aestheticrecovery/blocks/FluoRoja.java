package luxusdarkangel.aestheticrecovery.blocks;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class FluoRoja extends Block {

	public FluoRoja(int id, Material material) {
		super(id, material);
		
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
		this.setHardness(1);
	}

		public void registerIcons(IconRegister iconRegister) {
			this.blockIcon = iconRegister.registerIcon(AestheticRecovery.modid + ":" + this.getUnlocalizedName().substring(5));
		}
}
