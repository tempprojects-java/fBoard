package com.gmail.gak.artem;

import java.util.Arrays;

public class Board {
	private Shape[][] matrix;
	private int size;

	public Board(int size) {
		super();
		this.matrix = new Shape[size][size];
		this.size = size;
	}

	public Board() {
		super();
	}

	public boolean setFigure(Shape figure, IntPoint p) {
		if (!isValidPosition(p) || !isEmptyPosition(p)) {
			return false;
		}

		matrix[(int)p.getX()][(int)p.getY()] = figure;

		return true;
	}

	public boolean unsetFigure(IntPoint p) {
		if (!isValidPosition(p) || isEmptyPosition(p)) {
			return false;
		}

		matrix[(int)p.getX()][(int)p.getY()] = null;

		return true;
	}

	private boolean isValidPosition(IntPoint p) {
		if ((p.getX() > (size - 1)) || p.getX() < 0) {
			return false;
		}
		if ((p.getY() > (size - 1)) || p.getY() < 0) {
			return false;
		}

		return true;
	}

	private boolean isEmptyPosition(IntPoint p) {
		if (matrix[(int)p.getX()][(int)p.getY()] != null) {
			return false;
		}

		return true;
	}

	public Shape[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(Shape[][] matrix) {
		this.matrix = matrix;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Board [matrix=" + Arrays.toString(matrix) + ", size=" + size + "]";
	}

	public StringBuilder getInfo() {
		StringBuilder output = new StringBuilder();
		double s = 0.0;

		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				if (matrix[i][j] != null) {
					s = s + matrix[i][j].getArea();
					output.append("[x:" + i + ", y:" + j + "] => [" + matrix[i][j].toString() + "]\n");
				}
			}
		}

		output.append("\n(S) => " + Utility.cutDouble(s));
		return output;
	}
}