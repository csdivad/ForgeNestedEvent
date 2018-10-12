package com.example.examplemod.event;

import com.example.examplemod.ExampleMod;
import net.minecraftforge.fml.common.eventhandler.Event;

public class OuterEvent extends Event {

	public OuterEvent() {
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
		System.out.println("OUTER OUTER OUTER OUTER OUTER OUTER OUTER");
	}

	public static class NestedEvent extends OuterEvent {
		public NestedEvent(String asd) {
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
			System.out.println("NESTED NESTED NESTED NESTED NESTED NESTED ");
		}
	}

}