package com.gmail.gak.artem;

public class Circle extends Shape {
	private Point pA;
	private Point pB;

	public Circle(Point pA, Point pB) {
		super();
		this.pA = pA;
		this.pB = pB;
	}

	public Circle() {
		super();
	}

	private double getRadius() {
		return (Utility.getDistance(pA, pB) / 2);
	}

	public Point getpA() {
		return pA;
	}

	public void setpA(Point pA) {
		this.pA = pA;
	}

	public Point getpB() {
		return pB;
	}

	public void setpB(Point pB) {
		this.pB = pB;
	}

	@Override
	public String toString() {
		return "Circle [p=" + getPerimetr() + ", s=" + getArea() + "]";
	}

	@Override
	public double getPerimetr() {
		double r = getRadius();
		double result = 2 * Math.PI * r;
		return Utility.cutDouble(result);
	}

	@Override
	public double getArea() {
		double r = getRadius();
		double result = (Math.PI * (r * r));
		return Utility.cutDouble(result);
	}
}
