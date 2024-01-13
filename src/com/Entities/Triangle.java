package com.Entities;

public class Triangle {
	private double base;
	private double height;
	private double hypotenuse;
	public Triangle(double base, double height, double hypotenuse) {
		super();
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHypotenuse() {
		return hypotenuse;
	}
	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}
	public static String getType(Object value) {
        if (value instanceof Double) {
            return "double";
        } else if (value instanceof Integer) {
            return "integer";
        } else if (value instanceof Character) {
            return "character";
        } else {
            return "unknown type";
        }
    }
	 public double calculatePerimeter() {
	        return base + height + hypotenuse;
	    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
