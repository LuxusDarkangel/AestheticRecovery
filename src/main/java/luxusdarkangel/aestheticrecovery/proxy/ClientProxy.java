package luxusdarkangel.aestheticrecovery.proxy;

import luxusdarkangel.aestheticrecovery.AestheticRecovery;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRandomStuff() {
		
		LanguageRegistry.instance().addStringLocalization(AestheticRecovery.AestheticRecoveryTab.getTranslatedTabLabel(), "Aesthetic Recovery");
    	LanguageRegistry.instance().addStringLocalization(AestheticRecovery.AestheticRecoveryTabMusic.getTranslatedTabLabel(), "Aesthetic Recovery Music");
	}
	
}
