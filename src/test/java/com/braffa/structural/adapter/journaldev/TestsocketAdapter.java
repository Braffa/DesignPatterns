/*
 *  While implementing Adapter pattern, there are two approaches – class
 *	adapter and object adapter, however both these approaches produce same
 *	result.
 *	1.	Class Adapter – This form uses java inheritance and extends the
 *		source interface, in our case Socket class.
 *	2.	Object Adapter – This form uses Java Composition and adapter
 *		contains the source object.
 *
 *	Notice that both the adapter implementations are almost same and they
 *	implement the SocketAdapter interface. The adapter interface can also be an
 *	abstract class.
 *
 */

package com.braffa.structural.adapter.journaldev;

import org.junit.Before;
import org.junit.Test;

public class TestsocketAdapter {

	@Before
	public void setUp() throws Exception {
	}

	private static Volt getVolt(ISocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}

	@Test
	public void testObjectAdapter() {

		ISocketAdapter sockAdapter = new SocketObjectAdapterImpl();

		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);

		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out
				.println("v120 volts using Object Adapter=" + v120.getVolts());

	}

	@Test
	public void testClassAdapter() {
		ISocketAdapter sockAdapter = new SocketClassAdapterImpl();

		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);

		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());

	}
}
