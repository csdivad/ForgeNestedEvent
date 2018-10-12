package com.example.examplemod.event;

import com.example.examplemod.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.IOException;

@Mod.EventBusSubscriber
public class EventHandler {

	@SubscribeEvent
	public static void handleNestedEvent(OuterEvent.NestedEvent event) {
		System.out.println("A NESTED EVENT HAPPENED");
	}

}
