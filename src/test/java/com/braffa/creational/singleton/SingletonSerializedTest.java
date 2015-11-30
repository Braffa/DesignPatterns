package com.braffa.creational.singleton;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class SingletonSerializedTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			SerializedSingleton instanceOne = SerializedSingleton.getInstance();

			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
					"filename.ser"));
			out.writeObject(instanceOne);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream(
					"filename.ser"));
			SerializedSingleton instanceTwo = (SerializedSingleton) in
					.readObject();
			in.close();

			System.out.println("instanceOne hashCode = "
					+ instanceOne.hashCode());
			System.out.println("instanceTwo hashCode = "
					+ instanceTwo.hashCode());
			
			assertFalse("The hascodes should be not equal as they are different nstances of the object ",  instanceOne.hashCode() == instanceTwo.hashCode());


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReadResolve () {
		try {
			SerializedSingletonWithReadResolve instanceOne = SerializedSingletonWithReadResolve.getInstance();

			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
					"filename.ser"));
			out.writeObject(instanceOne);
			out.close();

			// deserailize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream(
					"filename.ser"));
			SerializedSingletonWithReadResolve instanceTwo = (SerializedSingletonWithReadResolve) in
					.readObject();
			in.close();

			System.out.println("instanceOne hashCode = "
					+ instanceOne.hashCode());
			System.out.println("instanceTwo hashCode = "
					+ instanceTwo.hashCode());
			
			assertTrue("The hascodes should be equal as it is the same instance of the object as we have used readResolve ",  instanceOne.hashCode() == instanceTwo.hashCode());


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
