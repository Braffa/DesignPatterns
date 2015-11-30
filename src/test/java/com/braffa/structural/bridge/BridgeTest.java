/*
  http://www.javacodegeeks.com/2015/09/bridge-design-pattern.html
  
  You should use the Bridge Pattern when:
    1. You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example, 
       when the implementation must be selected or switched at run-time.
    2. Both the abstractions and their implementations should be extensible by sub-classing. In this case, the Bridge pattern 
       lets you combine the different abstractions and implementations and extend them independently.
    3. Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have 
       to be recompiled.
    4. You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be 
       hidden from the client.
 */
package com.braffa.structural.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.braffa.structural.bridge.cartype.AbstractCar;
import com.braffa.structural.bridge.cartype.BigWheel;
import com.braffa.structural.bridge.cartype.Motoren;
import com.braffa.structural.bridge.product.CentralLocking;
import com.braffa.structural.bridge.product.GearLocking;
import com.braffa.structural.bridge.product.IProduct;

public class BridgeTest {

	@Test
	public void test() {
		IProduct product = new CentralLocking("Central Locking System");
		
		AbstractCar car = new BigWheel(product, "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		assertEquals("Incorrect car type ", "BigWheel xz model", car.getCarType());
		assertEquals("Incorrect product  ", "Central Locking System", car.getProduct().productName());

		System.out.println();
		
		IProduct product2 = new GearLocking("Gear Locking System");
		car = new BigWheel(product2, "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		assertEquals("Incorrect car type ", "BigWheel xz model", car.getCarType());
		assertEquals("Incorrect product  ", "Gear Locking System", car.getProduct().productName());

		System.out.println();

		car = new Motoren(product, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		assertEquals("Incorrect car type ", "Motoren lm model", car.getCarType());
		assertEquals("Incorrect product  ", "Central Locking System", car.getProduct().productName());

		System.out.println();

		car = new Motoren(product2, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		assertEquals("Incorrect car type ", "Motoren lm model", car.getCarType());
		assertEquals("Incorrect product  ", "Gear Locking System", car.getProduct().productName());
	}

}
