package com.gmail.gak.artem;

public class Rectangle extends Shape {
	private Point pA;
	private Point pB;
	private Point pC;

	public Rectangle(Point pA, Point pB, Point pC) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	public Rectangle() {
		super();
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

	public Point getpC() {
		return pC;
	}

	public void setpC(Point pC) {
		this.pC = pC;
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + getPerimetr() + ", s=" + getArea() + "]";
	}

	@Override
	public double getPerimetr() {
		double a = Utility.getDistance(pA, pB);
		double b = Utility.getDistance(pA, pC);

		double result = ((a + b) * 2);
		return Utility.cutDouble(result);
	}

	@Override
	public double getArea() {
		double a = Utility.getDistance(pA, pB);
		double b = Utility.getDistance(pA, pC);

		double result = (a * b);
		return Utility.cutDouble(result);
	}
}
