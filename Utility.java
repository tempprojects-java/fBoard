package com.gmail.gak.artem;

import java.text.DecimalFormat;

public class Utility {
	public Utility() {
		super();
	}

	public static double getDistance(Point pA, Point pB) {
		return Math.hypot(pA.getX() - pB.getX(), pA.getY() - pB.getY());
	}

	// TODO For triangle / I don't know Exceptions
	public static boolean IsPointsOnLine(Point pA, Point pB, Point pC) {
		return (pC.getX() * (pB.getY() - pA.getY()) - pC.getY() * (pB.getX() - pA.getX()) == pA.getX() * pB.getY()
				- pB.getX() * pA.getY());
	}
	
	public static double cutDouble(double number) {
		DecimalFormat decimalFormat = new DecimalFormat("##0.000");
		return Double.parseDouble(decimalFormat.format(number));
	}
}
