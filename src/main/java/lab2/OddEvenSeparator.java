package lab2;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void even() {
        System.out.print("Чётные: ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public void odd() {
        System.out.print("Нечётные: ");
        for (int n : numbers) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}