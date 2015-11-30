/*
 *	Composite
 *		A composite object contains group of leaf objects and we should provide
 *		some helper methods to add or delete leafs from the group. We can also
 *		provide a method to remove all the elements from the group.
 *
 *		Notice that composite also implements component and behaves similar to
 *		leaf except that it can contain group of leaf elements.
 */
package com.braffa.structural.composite.journaldev.composite;

import java.util.ArrayList;
import java.util.List;

import com.braffa.structural.composite.journaldev.basecomponent.IShape;

public class Drawing implements IShape {
	// collection of Shapes
	private List<IShape> shapes = new ArrayList<IShape>();

	@Override
	public void draw(String fillColor) {
		for (IShape sh : shapes) {
			sh.draw(fillColor);
		}
	}

	// adding shape to drawing
	public void add(IShape s) {
		this.shapes.add(s);
	}

	// removing shape from drawing
	public void remove(IShape s) {
		shapes.remove(s);
	}

	// removing all the shapes
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
	
	public int getNoOfShapes () {
		return shapes.size();
	}
	
	public IShape getShape (int pos) {
		return shapes.get(pos);
	}
}
