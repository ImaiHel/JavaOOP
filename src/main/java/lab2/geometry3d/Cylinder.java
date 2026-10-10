package lab2.geometry3d;

import lab2.exceptions.InvalidHeightException;
import lab2.geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) throws InvalidHeightException {
        if (height <= 0) {
            throw new InvalidHeightException("Высота должна быть больше нуля: " + height);
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{base=" + base + ", height=" + height + "}";
    }
}