/*
 *	Leaf Objects
 *		Leaf implements base component and these are the building block for the
 *		composite. We can create multiple leaf objects such as Triangle, Circle etc.
 */

package com.braffa.structural.composite.journaldev.leafobjects;

import com.braffa.structural.composite.journaldev.basecomponent.IShape;

public class Circle implements IShape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}