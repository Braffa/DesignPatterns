/*
 *	Flyweight design pattern
 * 		Flyweight design pattern is used
 *		when we need to create a lot of Objects of a class. Since every object
 *		consumes memory space that can be crucial for low memory devices, such
 *		as mobile devices or embedded systems, flyweight design pattern can be
 *		applied to reduce the load on memory by sharing objects.
 *
 *		Before we apply flyweight design pattern, we need to consider following factors:
 *
 *			1.	The number of Objects to be created by application should be huge.
 *			2.	The object creation is heavy on memory and it can be time consuming too.
 *			3.	The object properties can be divided into intrinsic and extrinsic
 *				properties, extrinsic properties of an Object should be defined by the
 *				client program.
 *
 *		To apply flyweight pattern, we need to divide Object property into intrinsic
 *		and extrinsic properties. Intrinsic properties make the Object unique
 *		whereas extrinsic properties are set by client code and used to perform
 *		different operations. For example, an Object Circle can have extrinsic
 *		properties such as color and width.
 *		For applying flyweight pattern, we need to create a Flyweight factory that
 *		returns the shared objects. For our example, let’s say we need to create a
 *		drawing with lines and Ovals. So we will have an interface Shape and its
 *		concrete implementations as Line and Oval. Oval class will have intrinsic
 *		property to determine whether to fill the Oval with given color or not
 *		whereas Line will not have any intrinsic property.
 *
 *	1.	In our example, the client code is not forced to create object using
 *		Flyweight factory but we can force that to make sure client code uses
 *		flyweight pattern implementation but its a complete design decision
 *		for particular application.
 *	2.	Flyweight pattern introduces complexity and if number of shared
 *		objects are huge then there is a trade of between memory and time, so
 *		we need to use it judiciously based on our requirements.
 *	3.	Flyweight pattern implementation is not useful when the number of
 *		intrinsic properties of Object is huge, making implementation of
 *		Factory class complex.
 */

package com.braffa.structural.flyweight.journaldev;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingClient extends JFrame {

	private static final long serialVersionUID = -1350200437285282550L;
	private final int WIDTH;
	private final int HEIGHT;
	private static final ShapeType shapes[] = { ShapeType.LINE,
			ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL };
	private static final Color colors[] = { Color.RED, Color.GREEN,
			Color.YELLOW };

	public DrawingClient(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		Container contentPane = getContentPane();
		JButton startButton = new JButton("Draw");
		final JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(startButton, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Graphics g = panel.getGraphics();
				for (int i = 0; i < 20; ++i) {
					IShape shape = ShapeFactory.getShape(getRandomShape());
					shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
							getRandomHeight(), getRandomColor());
				}
			}
		});

	}

	private ShapeType getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}

	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 10));
	}

	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	public static void main(String[] args) {
		DrawingClient drawing = new DrawingClient(500, 600);
	}
}
