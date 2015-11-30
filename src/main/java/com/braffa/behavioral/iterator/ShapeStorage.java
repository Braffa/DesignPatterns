package com.braffa.behavioral.iterator;

public class ShapeStorage {

	private Shape[] shapes = new Shape[5];
	private int index;

	public void addShape(String name) {
		int i = index++;
		shapes[i] = new Shape(i, name);
	}

	public Shape[] getShapes() {
		return shapes;
	}
	
	public int length () {
		int len = 0;
		for (Shape s : shapes) {
			if (s != null) {
				len++;
			}
		}
		return len;
	}
}
