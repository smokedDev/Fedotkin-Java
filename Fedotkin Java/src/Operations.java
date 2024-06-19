import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 'a': ");
        int a = scanner.nextInt();

        System.out.print("Введите число 'b': ");
        int b = scanner.nextInt();

        Comparison(a, b);

        scanner.close();
    }

    public static void Comparison(int a, int b) {
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение арифметических операций
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Обработка деления
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
        } else {
            double result = (double) a / b;
            System.out.println("a / b = " + result);
        }
    }
}

