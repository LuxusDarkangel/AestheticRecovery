package luxusdarkangel.aestheticrecovery;

import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler
{
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe

public void onSoundsLoaded(SoundLoadEvent event)
{
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":aether.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":darkness.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":pressing.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":aurora.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":slave.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":infusion.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":luxus.ogg");
                  event.manager.soundPoolStreaming.addSound(AestheticRecovery.modid + ":dream.ogg");
           }
}