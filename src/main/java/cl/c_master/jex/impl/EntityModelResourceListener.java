package cl.c_master.jex.impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import cl.c_master.jex.Jex;
import net.fabricmc.fabric.api.resource.SimpleResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

public class EntityModelResourceListener implements SimpleResourceReloadListener<Iterable<Identifier>>{

	@Override
	public Identifier getFabricId() {
		// TODO Auto-generated method stub
		return Jex.id;
	}

	@Override
	public CompletableFuture<Iterable<Identifier>> load(ResourceManager manager, Profiler profiler, Executor executor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<Void> apply(Iterable<Identifier> data, ResourceManager manager, Profiler profiler, Executor executor) {
		// TODO Auto-generated method stub
		return null;
	}

}
