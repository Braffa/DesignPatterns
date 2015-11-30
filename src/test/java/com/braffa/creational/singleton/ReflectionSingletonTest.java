package com.braffa.creational.singleton;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class ReflectionSingletonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SingletonEager instanceOne = SingletonEager.getInstance();
		SingletonEager instanceTwo = SingletonEager.getInstance();

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		assertEquals("The hascodes should be equal as it is the same insyance of the object ",  instanceOne.hashCode(), instanceTwo.hashCode());
	}

	@Test
	public void reflectionSingletonTest() {
		/*
		 * 	notice that hashCode of both the instances are not same that destroys the singleton pattern. 
		 * 	Reflection is very powerful
		 */
		SingletonEager instanceOne = SingletonEager.getInstance();
		SingletonEager instanceTwo = null;
		try {
			Constructor<?> [] constructors = SingletonEager.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (SingletonEager) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		assertFalse("The hascodes should be equal as it is the same insyance of the object ",  instanceOne.hashCode() == instanceTwo.hashCode());
		
	}

}
