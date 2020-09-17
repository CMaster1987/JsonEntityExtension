package cl.c_master.jex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cl.c_master.jex.impl.EntityModelResourceListener;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

public class Jex implements ClientModInitializer
{
	public static Identifier id = new Identifier("jex:entity_data");
	public Logger log = LogManager.getLogger();
	
	@Override
	public void onInitializeClient() {
		// TODO Auto-generated method stub
		log.debug("Mod initialized correctly!");
		try
		{
		ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(EntityModelResourceListener.INSTANCE);
		}
		catch(Exception e)
		{
			log.info("Failed to load the class due to: " + e.getMessage());
		}
	}

}
