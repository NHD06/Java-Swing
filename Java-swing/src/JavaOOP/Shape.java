package JavaOOP;

import java.util.Scanner;

public class Shape {
    public double S;
    public void calculateArea(){
        System.out.println("Dien tich la: " + S);
    }
    public static class Circle extends Shape{
        public double r;
        public double pi = 3.14;
        @Override
        public void calculateArea() {
            S =  pi * r * r;
            System.out.println("S hinh tron: " + S);
        }
    }
    public static class Rectangle extends Shape{
        public double length, width;
        @Override
        public void calculateArea() {
            S =  length * width;
            System.out.println("S hinh chu nhat la: " + S);
        }
        
    }
    public static class Triangle extends Shape {
        public double base, height;
        @Override
        public void calculateArea() {
            S =  (base * height) / 2;
            System.out.println("S hinh tam giac: " + S);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape.Circle circle = new Circle();
        Shape.Rectangle rectangle = new Rectangle();
        Shape.Triangle triangle = new Triangle();
        System.out.println("Enter the type of shape: ");
        circle.r = scanner.nextDouble();
        rectangle.length = scanner.nextDouble();
        rectangle.width = scanner.nextDouble();
        triangle.base = scanner.nextDouble();
        triangle.height = scanner.nextDouble();
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}