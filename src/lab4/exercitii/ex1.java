package lab4.exercitii;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primul sir: ");
        String str1 = scanner.nextLine();

        System.out.print("Al doilea sir: ");
        String str2 = scanner.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("Primul sir este mai mic lexicografic");
        } else if (result > 0) {
            System.out.println("Al doilea sir este mai mic lexicografic");
        } else {
            System.out.println("Sirurile sunt egale");
        }

        scanner.close();
    }
}
