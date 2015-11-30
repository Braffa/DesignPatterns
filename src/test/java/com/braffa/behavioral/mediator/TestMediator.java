/*
 * http://www.javacodegeeks.com/2015/09/mediator-design-pattern.html
 * 
 * When to use the Mediator Pattern
 *   1. A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured 
 *      and difficult to understand.
 *   2. Reusing an object is difficult because it refers to and communicates with many other objects.
 *   3. A behavior that’s distributed between several classes should be customizable without a lot of sub-classing.
 */

package com.braffa.behavioral.mediator;

import org.junit.Before;
import org.junit.Test;

import com.braffa.behavioral.mediator.machine.Button;
import com.braffa.behavioral.mediator.machine.Heater;
import com.braffa.behavioral.mediator.machine.IMachineMediator;
import com.braffa.behavioral.mediator.machine.Machine;
import com.braffa.behavioral.mediator.machine.Motor;
import com.braffa.behavioral.mediator.machine.Sensor;
import com.braffa.behavioral.mediator.machine.SoilRemoval;
import com.braffa.behavioral.mediator.machine.Valve;
import com.braffa.behavioral.mediator.machine.mediator.CottonMediator;
import com.braffa.behavioral.mediator.machine.mediator.DenimMediator;

public class TestMediator {
	IMachineMediator mediator;
	Machine machine;
	Heater heater;
	Motor motor;
	Sensor sensor;
	SoilRemoval soilRemoval;
	Valve valve;
	Button button;
	
	@Before
	public void setUp() throws Exception {
		mediator = null;
		sensor = new Sensor();
		soilRemoval = new SoilRemoval();
		motor = new Motor();
		machine = new Machine();
		heater = new Heater();
		valve = new Valve();
		button = new Button();
	}

	@Test
	public void cottonMediatorTest() {
	
		mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);
		
		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		
		button.press();
		
		System.out.println("******************************************************************************");
		
		mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);
		
		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		
		button.press();
	}
	
	public void denimMediatorTest() {

		mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);
		
		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		
		button.press();
		
		System.out.println("******************************************************************************");
		
		mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);
		
		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		
		button.press();
	}
}
