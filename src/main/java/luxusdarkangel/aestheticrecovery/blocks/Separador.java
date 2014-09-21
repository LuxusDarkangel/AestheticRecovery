package luxusdarkangel.aestheticrecovery.blocks;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Separador extends Block {

	public Separador(int id, Material material) {
		super(id, material);
		
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
		this.setHardness(1);
        this.setTickRandomly(true);
	}

	public boolean isOpaqueCube(){
        return false;
    }
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
		public void registerIcons(IconRegister iconRegister) {
			this.blockIcon = iconRegister.registerIcon(AestheticRecovery.modid + ":" + this.getUnlocalizedName().substring(5));
		}
}
