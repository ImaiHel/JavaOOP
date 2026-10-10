package lab2;

import lab2.geometry2d.Circle;
import lab2.geometry2d.Rectangle;
import lab2.geometry3d.Cylinder;
import lab2.exceptions.InvalidHeightException;
import lab2.exceptions.InvalidRadiusException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Button");
        Button button = new Button();
        button.click();
        button.click();
        button.click();

        System.out.println("\nЗадание 2: Balance");
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(3);
        balance.result();
        balance.addRight(2);
        balance.result();
        balance.addRight(1);
        balance.result();

        System.out.println("\nЗадание 3: Bell");
        Bell bell = new Bell();
        for (int i = 0; i < 5; i++) {
            bell.sound();
        }

        System.out.println("\nЗадание 4: OddEvenSeparator");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.even();
        separator.odd();

        System.out.println("\nЗадание 5: Table");
        Table table = new Table(2, 3);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(0, 2, 3);
        table.setValue(1, 0, 4);
        table.setValue(1, 1, 5);
        table.setValue(1, 2, 6);
        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Среднее: " + table.average());
        System.out.println("Строк: " + table.rows() + ", столбцов: " + table.cols());

        System.out.println("\nЗадание 6: Geometry");
        try {
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(3, 4);
            System.out.println(circle);
            System.out.println("Площадь круга: " + circle.area());
            System.out.println("Периметр круга: " + circle.perimeter());
            System.out.println(rectangle);
            System.out.println("Площадь прямоугольника: " + rectangle.area());
            System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

            Cylinder cylinder = new Cylinder(circle, 10);
            System.out.println(cylinder);
            System.out.println("Объём цилиндра: " + cylinder.volume());
        } catch (InvalidRadiusException | InvalidHeightException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}