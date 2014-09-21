package luxusdarkangel.aestheticrecovery.items;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Pressing extends ItemRecord
{	
    public Pressing(int id, String recordName)
    {
        super(id, recordName);
        this.maxStackSize = 1;
		this.setCreativeTab(AestheticRecovery.AestheticRecoveryTabMusic);
    }

    @SideOnly(Side.CLIENT)
    public String getRecordTitle()
    {
        return "LuxusDarkangel - Pressing";
    }
    
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.getBlockId(par4, par5, par6) == Block.jukebox.blockID && par3World.getBlockMetadata(par4, par5, par6) == 0)
        {
            if (par3World.isRemote)
            {
                return true;
            }
            else
            {
                ((BlockJukeBox)Block.jukebox).insertRecord(par3World, par4, par5, par6, par1ItemStack);
                par3World.playAuxSFXAtEntity((EntityPlayer)null, 1005, par4, par5, par6, this.itemID);
                --par1ItemStack.stackSize;
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
    	this.itemIcon = reg.registerIcon(AestheticRecovery.modid + ":pressing");
    }
}