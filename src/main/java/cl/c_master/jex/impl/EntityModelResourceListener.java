package cl.c_master.jex.impl;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import com.google.common.collect.ImmutableList;

import cl.c_master.jex.Jex;
import net.fabricmc.fabric.api.resource.ResourceReloadListenerKeys;
import net.fabricmc.fabric.api.resource.SimpleResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

public class EntityModelResourceListener implements SimpleResourceReloadListener
{
	public static final EntityModelResourceListener INSTANCE = new EntityModelResourceListener();
	public EntityModelResourceListener()
	{
		
	}
	@Override
	public Identifier getFabricId() {
		// TODO Auto-generated method stub
		return Jex.id;
	}
	@Override
	public CompletableFuture load(ResourceManager manager, Profiler profiler, Executor executor) {
		// TODO Auto-generated method stub
		return CompletableFuture.supplyAsync(() -> manager.findResources("models/entity", s -> s.endsWith(".json")), executor);
	}
	@Override
	public CompletableFuture apply(Object data, ResourceManager manager, Profiler profiler, Executor executor) {
		// TODO Auto-generated method stub
		return CompletableFuture.completedFuture(manager.findResources("models/entity", s -> s.endsWith(".json")));
	}
	

}
