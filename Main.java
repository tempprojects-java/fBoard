package com.gmail.gak.artem;

public class Main {

	public static void main(String[] args) {
		Point pA = new Point(1, -4);
		Point pB = new Point(3, 5);
		Point pC = new Point(4, 8);

		Rectangle rectangle = new Rectangle(pA, pB, pC);
		Circle circle = new Circle(pA, pB);
		Triangle triangle = new Triangle(pA, pB, pC);

		Board board = new Board(2);

		board.setFigure(triangle, new IntPoint(1, 1));
		board.setFigure(circle, new IntPoint(0, 1));
		board.unsetFigure(new IntPoint(1, 1));
		board.setFigure(rectangle, new IntPoint(1, 1));
		board.setFigure(circle, new IntPoint(1, 0));

		System.out.println(board.getInfo());

	}

}
