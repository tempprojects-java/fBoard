package com.gmail.gak.artem;

public class IntPoint {
	public int x;
	public int y;

	public IntPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public IntPoint() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x:" + x + ",y:" + y + "]";
	}
}
