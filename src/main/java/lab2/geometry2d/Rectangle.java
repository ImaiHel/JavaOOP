package lab2.geometry2d;

import lab2.exceptions.InvalidRadiusException;

public class Rectangle implements Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) throws InvalidRadiusException {
        if (width <= 0 || height <= 0) {
            throw new InvalidRadiusException("Стороны прямоугольника должны быть больше нуля");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}