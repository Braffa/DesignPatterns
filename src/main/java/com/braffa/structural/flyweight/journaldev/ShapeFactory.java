package com.braffa.structural.flyweight.journaldev;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<ShapeType, IShape> shapes = new HashMap<ShapeType, IShape>();

	public static IShape getShape(ShapeType type) {
		IShape shapeImpl = shapes.get(type);
		if (shapeImpl == null) {
			System.out.println("Creating " + type + " shape");
			
			if (type.equals(ShapeType.OVAL_FILL)) {
				shapeImpl = new Oval(true);
			} else if (type.equals(ShapeType.OVAL_NOFILL)) {
				shapeImpl = new Oval(false);
			} else if (type.equals(ShapeType.LINE)) {
				shapeImpl = new Line();
			}
			
			System.out.println("adding " + type + " to shape factory");
			shapes.put(type, shapeImpl);
		} else {
			System.out.println("getting " + type + " shape from shape factory");
		}
		return shapeImpl;
	}

}
