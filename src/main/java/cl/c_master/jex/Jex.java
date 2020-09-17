package cl.c_master.jex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;

public class Jex implements ClientModInitializer
{
	public static Identifier id = new Identifier("jex:entity_data");
	public Logger log = LogManager.getLogger();
	@Override
	public void onInitializeClient() {
		// TODO Auto-generated method stub
		log.debug("Mod initialized correctly!");
	}

}
