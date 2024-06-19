import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку 'a': ");
        String a = scanner.nextLine();

        System.out.print("Введите строку 'b': ");
        String b = scanner.nextLine();

        CompareStrings(a, b);

        scanner.close();
    }

    public static void CompareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
