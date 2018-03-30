package com.gmail.gak.artem;

public class Triangle extends Shape {
	private Point pA;
	private Point pB;
	private Point pC;

	public Triangle(Point pA, Point pB, Point pC) {
		super();
		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	public Triangle() {
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
	public double getPerimetr() {
		double a = Utility.getDistance(pA, pB);
		double b = Utility.getDistance(pB, pC);
		double c = Utility.getDistance(pA, pC);

		double result = (a + b + c);
		return Utility.cutDouble(result);
	}

	@Override
	public double getArea() {
		double a = Utility.getDistance(pA, pB);
		double b = Utility.getDistance(pB, pC);
		double c = Utility.getDistance(pA, pC);

		double p = getPerimetr() / 2;

		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return Utility.cutDouble(result);
	}

	@Override
	public String toString() {
		return "Triangle [p=" + getPerimetr() + ", s=" + getArea() + "]";
	}
}
