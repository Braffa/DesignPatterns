package com.braffa.creational.singleton;

import java.io.Serializable;

public class SerializedSingletonWithReadResolve implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingletonWithReadResolve() {

	}

	private static class SingletonHelper {
		private static final SerializedSingletonWithReadResolve instance = new SerializedSingletonWithReadResolve();
	}

	public static SerializedSingletonWithReadResolve getInstance() {
		return SingletonHelper.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
