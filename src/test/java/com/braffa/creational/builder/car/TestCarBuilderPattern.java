/*
 * http://www.javacodegeeks.com/2015/09/builder-design-pattern.html
 * 
 * Use the Builder pattern when
 *    1.	The algorithm for creating a complex object should be independent of the parts that make up the object 
 *    		and how they’re assembled.
 *    2.	The construction process must allow different representations for the object that’s constructed.
 */

package com.braffa.creational.builder.car;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.braffa.creational.builder.car.Car;
import com.braffa.creational.builder.car.CarDirector;
import com.braffa.creational.builder.car.ICarBuilder;
import com.braffa.creational.builder.car.model.SedanCarBuilder;
import com.braffa.creational.builder.car.model.SportsCarBuilder;


public class TestCarBuilderPattern {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void SedanCarBuilderTest() {
		ICarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);

		assertEquals("Incorrect body style ", "External dimensions: overall length (inches): 202.9, overall width (inches): 76.2, overall height (inches): 60.7, wheelbase (inches): 112.9, front track (inches): 65.3, rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5", car.getBodyStyle());
		assertEquals("Incorrect brakes ", "Four-wheel disc brakes: two ventilated. Electronic brake distribution", car.getBreaks());
		assertEquals("Incorrect engine ", "3.5L Duramax V 6 DOHC", car.getEngine());
		assertEquals("Incorrect fuel type ", "Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range", car.getFuelType());
		assertEquals("Incorrect power ", "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm", car.getPower());
		assertEquals("Incorrect seats ", "Front seat center armrest.Rear seat center armrest.Split-folding rear seats", car.getSeats());
		assertEquals("Incorrect windows ", "Laminated side windows.Fixed rear window with defroster", car.getWindows());
		
		
		
		carBuilder = new SportsCarBuilder();
		director = new CarDirector(carBuilder);
		director.build();
		car = carBuilder.getCar();
		System.out.println(car);
	}
	
	@Test
	public void SportsCarBuilderTest() {
		ICarBuilder carBuilder = new SportsCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);

		assertEquals("Incorrect body style ", "External dimensions: overall length (inches): 192.3, overall width (inches): 75.5, overall height (inches): 54.2, wheelbase (inches): 112.3, front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7", car.getBodyStyle());
		assertEquals("Incorrect brakes ", "Four-wheel disc brakes: two ventilated. Electronic brake distribution. StabiliTrak stability control", car.getBreaks());
		assertEquals("Incorrect engine ", "3.6L V 6 DOHC and variable valve timing", car.getEngine());
		assertEquals("Incorrect fuel type ", "Gasoline 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range", car.getFuelType());
		assertEquals("Incorrect power ", "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm", car.getPower());
		assertEquals("Incorrect seats ", "Driver sports front seat with one power adjustments manual height, front passenger seat sports front seat with one power adjustments", car.getSeats());
		assertEquals("Incorrect windows ", "Front windows with one-touch on two windows", car.getWindows());

	}

}
