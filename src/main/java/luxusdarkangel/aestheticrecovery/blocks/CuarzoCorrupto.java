package luxusdarkangel.aestheticrecovery.blocks;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityRecordPlayer;
import net.minecraft.world.World;

public class CuarzoCorrupto extends Block {

	public CuarzoCorrupto(int id, Material material) {
		super(id, material);
		
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTab);
		this.setHardness(1);
	}

		public void registerIcons(IconRegister iconRegister) {
			this.blockIcon = iconRegister.registerIcon(AestheticRecovery.modid + ":" + this.getUnlocalizedName().substring(5));
		}

	    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	    {
	        if (par1World.getBlockMetadata(par2, par3, par4) == 0)
	        {
	            return false;
	        }
	        else
	        {
	            this.ejectRecord(par1World, par2, par3, par4);
	            return true;
	        }
	    }

	    public void insertRecord(World par1World, int par2, int par3, int par4, ItemStack par5ItemStack)
	    {
	        if (!par1World.isRemote)
	        {
	            TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)par1World.getBlockTileEntity(par2, par3, par4);

	            if (tileentityrecordplayer != null)
	            {
	                tileentityrecordplayer.func_96098_a(par5ItemStack.copy());
	                par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
	            }
	        }
	    }

	    public void ejectRecord(World par1World, int par2, int par3, int par4)
	    {
	        if (!par1World.isRemote)
	        {
	            TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)par1World.getBlockTileEntity(par2, par3, par4);

	            if (tileentityrecordplayer != null)
	            {
	                ItemStack itemstack = tileentityrecordplayer.func_96097_a();

	                if (itemstack != null)
	                {
	                    par1World.playAuxSFX(1005, par2, par3, par4, 0);
	                    par1World.playRecord((String)null, par2, par3, par4);
	                    tileentityrecordplayer.func_96098_a((ItemStack)null);
	                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
	                    float f = 0.7F;
	                    double d0 = (double)(par1World.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	                    double d1 = (double)(par1World.rand.nextFloat() * f) + (double)(1.0F - f) * 0.2D + 0.6D;
	                    double d2 = (double)(par1World.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
	                    ItemStack itemstack1 = itemstack.copy();
	                    EntityItem entityitem = new EntityItem(par1World, (double)par2 + d0, (double)par3 + d1, (double)par4 + d2, itemstack1);
	                    entityitem.delayBeforeCanPickup = 10;
	                    par1World.spawnEntityInWorld(entityitem);
	                }
	            }
	        }
	    }

	    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	    {
	        this.ejectRecord(par1World, par2, par3, par4);
	        super.breakBlock(par1World, par2, par3, par4, par5, par6);
	    }

	    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	    {
	        if (!par1World.isRemote)
	        {
	            super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
	        }
	    }

	    public TileEntity createNewTileEntity(World par1World)
	    {
	        return new TileEntityRecordPlayer();
	    }

}
