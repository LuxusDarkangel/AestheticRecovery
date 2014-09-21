package luxusdarkangel.aestheticrecovery;

import scala.tools.nsc.backend.icode.analysis.CopyPropagation.Record;
import luxusdarkangel.aestheticrecovery.blocks.CuarzoCorrupto;
import luxusdarkangel.aestheticrecovery.blocks.DeathGlass;
import luxusdarkangel.aestheticrecovery.blocks.FluoAmarilla;
import luxusdarkangel.aestheticrecovery.blocks.FluoAzul;
import luxusdarkangel.aestheticrecovery.blocks.FluoBlanca;
import luxusdarkangel.aestheticrecovery.blocks.FluoMagenta;
import luxusdarkangel.aestheticrecovery.blocks.FluoMorada;
import luxusdarkangel.aestheticrecovery.blocks.FluoNaranja;
import luxusdarkangel.aestheticrecovery.blocks.FluoRoja;
import luxusdarkangel.aestheticrecovery.blocks.FluoRosa;
import luxusdarkangel.aestheticrecovery.blocks.FluoVerde;
import luxusdarkangel.aestheticrecovery.blocks.ParedRunica;
import luxusdarkangel.aestheticrecovery.blocks.Separador;
import luxusdarkangel.aestheticrecovery.items.Aether;
import luxusdarkangel.aestheticrecovery.items.Aurora;
import luxusdarkangel.aestheticrecovery.items.Darkness;
import luxusdarkangel.aestheticrecovery.items.Dream;
import luxusdarkangel.aestheticrecovery.items.Infusion;
import luxusdarkangel.aestheticrecovery.items.ItemComodin1;
import luxusdarkangel.aestheticrecovery.items.ItemComodin10;
import luxusdarkangel.aestheticrecovery.items.ItemComodin11;
import luxusdarkangel.aestheticrecovery.items.ItemComodin12;
import luxusdarkangel.aestheticrecovery.items.ItemComodin13;
import luxusdarkangel.aestheticrecovery.items.ItemComodin14;
import luxusdarkangel.aestheticrecovery.items.ItemComodin15;
import luxusdarkangel.aestheticrecovery.items.ItemComodin2;
import luxusdarkangel.aestheticrecovery.items.ItemComodin3;
import luxusdarkangel.aestheticrecovery.items.ItemComodin4;
import luxusdarkangel.aestheticrecovery.items.ItemComodin5;
import luxusdarkangel.aestheticrecovery.items.ItemComodin6;
import luxusdarkangel.aestheticrecovery.items.ItemComodin7;
import luxusdarkangel.aestheticrecovery.items.ItemComodin8;
import luxusdarkangel.aestheticrecovery.items.ItemComodin9;
import luxusdarkangel.aestheticrecovery.items.Luxus;
import luxusdarkangel.aestheticrecovery.items.Pressing;
import luxusdarkangel.aestheticrecovery.items.Slave;
import luxusdarkangel.aestheticrecovery.items.TrozoDiamante;
import luxusdarkangel.aestheticrecovery.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = AestheticRecovery.modid, name = "Aesthetic Recovery", version = "Pre-Alpha 0.1")
public class AestheticRecovery
{
	
	@SidedProxy(clientSide="luxusdarkangel.aestheticrecovery.proxy.ClientProxy", serverSide="luxusdarkangel.aestheticrecovery.proxy.CommonProxy")
	
	public static CommonProxy proxy;
    public static final String modid = "AestheticRecovery";
    public static CreativeTabs AestheticRecoveryTab;
    public static CreativeTabs AestheticRecoveryTabMusic;
    public static Block pared_runica;
    public static Block cuarzo_corrupto;
    public static Block fluo_amarilla;
    public static Block fluo_azul;
    public static Block fluo_blanca;
    public static Block fluo_magenta;
    public static Block fluo_morada;
    public static Block fluo_naranja;
    public static Block fluo_roja;
    public static Block fluo_rosa;
    public static Block fluo_verde;
    public static Block separador;
    public static Block cristal_maldito;
    public static Item darkness;
    public static Item aether;
    public static Item pressing;
    public static Item trozo_diamante;
    public static Item aurora;
    public static Item slave;
    public static Item infusion;
    public static Item luxus;
    public static Item dream;
    public static Item item_comodin1;
    public static Item item_comodin2;
    public static Item item_comodin3;
    public static Item item_comodin4;
    public static Item item_comodin5;
    public static Item item_comodin6;
    public static Item item_comodin7;
    public static Item item_comodin8;
    public static Item item_comodin9;
    public static Item item_comodin10;
    public static Item item_comodin11;
    public static Item item_comodin12;
    public static Item item_comodin13;
    public static Item item_comodin14;
    public static Item item_comodin15;
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    	AestheticRecoveryTab = new CreativeTabs("Aesthetic Recovery"){
    		@SideOnly(Side.CLIENT)
    		public int getTabIconItemIndex(){
    			return AestheticRecovery.pared_runica.blockID;
    		}
    	};
    	
    	AestheticRecoveryTabMusic = new CreativeTabs("Aesthetic Recovery Music"){
    		@SideOnly(Side.CLIENT)
    		public int getTabIconItemIndex(){
    			return AestheticRecovery.aether.itemID;
    		}
    	};
    	
    	MinecraftForge.EVENT_BUS.register(new SoundHandler());
    	
    	
    	pared_runica = new ParedRunica(2646, Material.rock).setUnlocalizedName("pared_runica");
    	
    	registerBlock(pared_runica, pared_runica.getUnlocalizedName(), "Pared Runica");
    	
    	cuarzo_corrupto = new CuarzoCorrupto(2647, Material.rock).setUnlocalizedName("cuarzo_corrupto");
    	
    	registerBlock(cuarzo_corrupto, cuarzo_corrupto.getUnlocalizedName(), "Cuarzo Corrupto");
    	
    	fluo_amarilla = new FluoAmarilla(2857, Material.rock).setUnlocalizedName("fluo_amarilla");
    	
    	registerBlock(fluo_amarilla, fluo_amarilla.getUnlocalizedName(), "Fluorita Amarilla");
    	
    	fluo_azul = new FluoAzul(2858, Material.rock).setUnlocalizedName("fluo_azul");
    	
    	registerBlock(fluo_azul, fluo_azul.getUnlocalizedName(), "Fluorita Azul");
    	
    	fluo_blanca = new FluoBlanca(2859, Material.rock).setUnlocalizedName("fluo_blanca");
    	
    	registerBlock(fluo_blanca, fluo_blanca.getUnlocalizedName(), "Fluorita Blanca");
    	
    	fluo_magenta = new FluoMagenta(2860, Material.rock).setUnlocalizedName("fluo_magenta");
    	
    	registerBlock(fluo_magenta, fluo_magenta.getUnlocalizedName(), "Fluorita Magenta");
    	
    	fluo_morada = new FluoMorada(2861, Material.rock).setUnlocalizedName("fluo_morada");
    	
    	registerBlock(fluo_morada, fluo_morada.getUnlocalizedName(), "Fluorita Morada");
    	
    	fluo_naranja = new FluoNaranja(2862, Material.rock).setUnlocalizedName("fluo_naranja");
    	
    	registerBlock(fluo_naranja, fluo_naranja.getUnlocalizedName(), "Fluorita Naranja");
    	
    	fluo_roja = new FluoRoja(2863, Material.rock).setUnlocalizedName("fluo_roja");
    	
    	registerBlock(fluo_roja, fluo_roja.getUnlocalizedName(), "Fluorita Roja");
    	
    	fluo_rosa = new FluoRosa(2864, Material.rock).setUnlocalizedName("fluo_rosa");
    	
    	registerBlock(fluo_rosa, fluo_rosa.getUnlocalizedName(), "Fluorita Rosa");
    	
    	fluo_verde = new FluoVerde(2865, Material.rock).setUnlocalizedName("fluo_verde");
    	
    	registerBlock(fluo_verde, fluo_verde.getUnlocalizedName(), "Fluorita Verde");
    	
    	separador = new Separador(2866, Material.rock).setUnlocalizedName("separador");
    	
    	registerBlock(separador, separador.getUnlocalizedName(), "Separador");
    	
    	cristal_maldito = new DeathGlass(2867).setUnlocalizedName("cristal_maldito");
    	
    	registerBlock(cristal_maldito, cristal_maldito.getUnlocalizedName(), "Cristal Maldito");
    	
    	aether = new Aether(2868, modid + ":aether").setUnlocalizedName("aether");
    	
    	registerItem(aether, aether.getUnlocalizedName(), "Music Disc");
    	
    	darkness = new Darkness(2869, modid + ":darkness").setUnlocalizedName("darkness");
    	
    	registerItem(darkness, darkness.getUnlocalizedName(), "Music Disc");
    	
    	pressing = new Pressing(2870, modid + ":pressing").setUnlocalizedName("pressing");
    	
    	registerItem(pressing, pressing.getUnlocalizedName(), "Music Disc");
    	
    	trozo_diamante = new TrozoDiamante(2871).setUnlocalizedName("trozo_diamante");
    	
    	registerItem(trozo_diamante, trozo_diamante.getUnlocalizedName(), "Trozo de Diamante");
    	
    	aurora = new Aurora(2872, modid + ":aurora").setUnlocalizedName("aurora");
    	
    	registerItem(aurora, aurora.getUnlocalizedName(), "Music Disc");
    	
    	slave = new Slave(2873, modid + ":slave").setUnlocalizedName("slave");
    	
    	registerItem(slave, slave.getUnlocalizedName(), "Music Disc");
    	
    	infusion = new Infusion(2874, modid + ":infusion").setUnlocalizedName("infusion");
    	
    	registerItem(infusion, infusion.getUnlocalizedName(), "Music Disc");
    	
    	luxus = new Luxus(2875, modid + ":luxus").setUnlocalizedName("luxus");
    	
    	registerItem(luxus, luxus.getUnlocalizedName(), "Music Disc");
    	
    	dream = new Dream(2876, modid + ":dream").setUnlocalizedName("dream");
    	
    	registerItem(dream, dream.getUnlocalizedName(), "Music Disc");
    	
    	item_comodin1 = new ItemComodin1(2877).setUnlocalizedName("item_comodin1");
    	
    	registerItem(item_comodin1, item_comodin1.getUnlocalizedName(), "Item Comodin 1");
    	
    	item_comodin2 = new ItemComodin2(2878).setUnlocalizedName("item_comodin2");
    	
    	registerItem(item_comodin2, item_comodin2.getUnlocalizedName(), "Item Comodin 2");
    	
    	item_comodin3 = new ItemComodin3(2879).setUnlocalizedName("item_comodin3");
    	
    	registerItem(item_comodin3, item_comodin3.getUnlocalizedName(), "Item Comodin 3");
    	
    	item_comodin4 = new ItemComodin4(2880).setUnlocalizedName("item_comodin4");
    	
    	registerItem(item_comodin4, item_comodin4.getUnlocalizedName(), "Item Comodin 4");
    	
    	item_comodin5 = new ItemComodin5(2881).setUnlocalizedName("item_comodin5");
    	
    	registerItem(item_comodin5, item_comodin5.getUnlocalizedName(), "Item Comodin 5");
    	
    	item_comodin6 = new ItemComodin6(2882).setUnlocalizedName("item_comodin6");
    	
    	registerItem(item_comodin6, item_comodin6.getUnlocalizedName(), "Item Comodin 6");
    	
    	item_comodin7 = new ItemComodin7(2883).setUnlocalizedName("item_comodin7");
    	
    	registerItem(item_comodin7, item_comodin7.getUnlocalizedName(), "Item Comodin 7");
    	
    	item_comodin8 = new ItemComodin8(2884).setUnlocalizedName("item_comodin8");
    	
    	registerItem(item_comodin8, item_comodin8.getUnlocalizedName(), "Item Comodin 8");
    	
    	item_comodin9 = new ItemComodin9(2885).setUnlocalizedName("item_comodin9");
    	
    	registerItem(item_comodin9, item_comodin9.getUnlocalizedName(), "Item Comodin 9");
    	
    	item_comodin10 = new ItemComodin10(2886).setUnlocalizedName("item_comodin10");
    	
    	registerItem(item_comodin10, item_comodin10.getUnlocalizedName(), "Item Comodin 10");
    	
    	item_comodin11 = new ItemComodin11(2887).setUnlocalizedName("item_comodin11");
    	
    	registerItem(item_comodin11, item_comodin11.getUnlocalizedName(), "Item Comodin 11");
    	
    	item_comodin12 = new ItemComodin12(2888).setUnlocalizedName("item_comodin12");
    	
    	registerItem(item_comodin12, item_comodin12.getUnlocalizedName(), "Item Comodin 12");
    	
    	item_comodin13 = new ItemComodin13(2889).setUnlocalizedName("item_comodin13");
    	
    	registerItem(item_comodin13, item_comodin13.getUnlocalizedName(), "Item Comodin 13");
    	
    	item_comodin14 = new ItemComodin14(2890).setUnlocalizedName("item_comodin14");
    	
    	registerItem(item_comodin14, item_comodin14.getUnlocalizedName(), "Item Comodin 14");
    	
    	item_comodin15 = new ItemComodin15(2891).setUnlocalizedName("item_comodin15");
    	
    	registerItem(item_comodin15, item_comodin15.getUnlocalizedName(), "Item Comodin 15");
    	
    	proxy.registerRandomStuff();
    	
    }
    	
	private void registerItem(Item item, String string, String name) {
		GameRegistry.registerItem(item, string);
		LanguageRegistry.addName(item, name);
	}

	public void registerBlock(Block block, String string, String name) {
		GameRegistry.registerBlock(block, string);
		LanguageRegistry.addName(block, name);
    }
}
