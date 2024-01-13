package com.Entities;
import java.util.Scanner;
public class TestTriangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the hypotenuse of the triangle: ");
        double hypotenuse = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height, hypotenuse);
        
        System.out.println("Type of base: " + Triangle.getType(base));
        System.out.println("Type of height: " + Triangle.getType(height));
        System.out.println("Type of hypotenuse: " + Triangle.getType(hypotenuse));
        
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
        
 
        scanner.close();
    }


}
