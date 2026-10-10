package lab2.geometry2d;

import lab2.exceptions.InvalidRadiusException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException("Радиус должен быть больше нуля: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}