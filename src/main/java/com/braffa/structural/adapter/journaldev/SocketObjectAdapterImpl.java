/*
 *  While implementing Adapter pattern, there are two approaches – class
 *	adapter and object adapter, however both these approaches produce same
 *	result.
 *	1.	Class Adapter – This form uses java inheritance and extends the
 *		source interface, in our case Socket class.
 *	2.	Object Adapter – This form uses Java Composition and adapter
 *		contains the source object.
 *
 *	Here is the Object adapter implementation of our adapter.
 *
 */

package com.braffa.structural.adapter.journaldev;

public class SocketObjectAdapterImpl implements ISocketAdapter {

	// Using Composition for adapter pattern
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		return sock.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
	
}
