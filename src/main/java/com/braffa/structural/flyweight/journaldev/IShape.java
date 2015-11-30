package com.braffa.structural.flyweight.journaldev;

import java.awt.Color;
import java.awt.Graphics;

public interface IShape {
	public void draw(Graphics g, int x, int y, int width, int height,
			Color color);
}
