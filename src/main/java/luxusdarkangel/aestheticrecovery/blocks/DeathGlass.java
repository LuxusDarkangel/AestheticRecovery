package luxusdarkangel.aestheticrecovery.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

	public class DeathGlass extends Block
	{
	    public DeathGlass(int par1)
	    {
	        super(par1, Material.rock);
	        this.setTickRandomly(true);
			this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
			this.setHardness(1);
	    }
	    
	    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        float f = 0.0625F;
	        return AxisAlignedBB.getAABBPool().getAABB((double)((float)par2 + f), (double)par3, (double)((float)par4 + f), (double)((float)(par2 + 1) - f), (double)((float)(par3 + 1) - f), (double)((float)(par4 + 1) - f));
	    }

	    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	    {

	    }
	    
	    public void registerIcons(IconRegister iconRegister) {
			this.blockIcon = iconRegister.registerIcon(AestheticRecovery.modid + ":" + this.getUnlocalizedName().substring(5));
		}
	    
	    public boolean isOpaqueCube(){
	        return false;
	    }
		
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }

	    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	    {
	        par5Entity.attackEntityFrom(DamageSource.magic, 10.0F);
	    }
}