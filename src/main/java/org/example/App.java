package org.example;

import org.example.geometry.Circle;
import org.example.geometry.Rectangle;
import org.example.geometry.Triangle;
import org.example.geometry.utils.GeometryUtils;
import org.example.threedimensional.Cube;
import org.example.threedimensional.Sphere;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(4.2);
        Rectangle rectangle = new Rectangle(5, 5);
        Triangle triangle = new Triangle(3, 4, 5);
        Cube cube = new Cube(1);
        Sphere sphere = new Sphere(1);
        System.out.println("Круг: \n Площадь: " + circle.getArea() +
                "\n Периметр: " + circle.getPerimeter() +
                "\nПрямоугольник: \n Площадь: " + rectangle.getArea() +
                "\n Периметр: " + rectangle.getPerimeter() +
                "\nТреугольник: \n Площадь: " + triangle.getArea() +
                "\n Периметр: " + triangle.getPerimeter());

        double areaOfTriangle = GeometryUtils.convertToMeters(triangle.getArea(), "см");
        System.out.println("Площадь треугольника в метрах: " + areaOfTriangle);

        System.out.println("Для куба: " + cube.getSurfaceArea() + "  " + cube.getVolume() +
                "\nДля сферы: " + sphere.getSurfaceArea() + "  " + sphere.getVolume());
    }
}