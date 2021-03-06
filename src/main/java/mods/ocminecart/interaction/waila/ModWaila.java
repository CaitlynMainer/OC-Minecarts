package mods.ocminecart.interaction.waila;

import cpw.mods.fml.common.event.FMLInterModComms;
import mcp.mobius.waila.api.IWailaRegistrar;
import mods.ocminecart.common.minecart.ComputerCart;

public class ModWaila {
	
	public static void initWailaModule(){
		FMLInterModComms.sendMessage("Waila", "register", "mods.ocminecart.interaction.waila.ModWaila.register");
	}
	
	public static void register(IWailaRegistrar registrar){
		ComputerCartDataProvider ccdp = new ComputerCartDataProvider();
		
		registrar.registerNBTProvider(ccdp, ComputerCart.class);
		
		registrar.registerBodyProvider(ccdp, ComputerCart.class);
		registrar.registerHeadProvider(ccdp, ComputerCart.class);
	}
}
