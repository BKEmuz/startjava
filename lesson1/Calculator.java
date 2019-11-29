
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        System.out.println("Введите любое целое число a");
        Scanner scana = new Scanner(System.in);
        int a = scana.nextInt();
        System.out.println("Введите любое целое число b");
        Scanner scanb = new Scanner(System.in);
        int b = scanb.nextInt();
        System.out.println("Введите одно из действий +, -, *, /, ^, %");
        Scanner scanc = new Scanner(System.in);
        String s = scanc.nextLine();
        char c = s.charAt(0);
        if (c == '+') {
            System.out.println("Сумма числа a и числа b = " + (a + b));
        } 	else if (c == '-') {
            System.out.println("Разница числа a и числа b = " + (a - b));
        } 	else if (c == '/') {
            System.out.println("Частное числа a и числа b = " + (a / b));
        } 	else if (c == '*') {
            System.out.println("Произведение числа a и числа b = " + (a * b));
        } 	else if (c == '^') {
            System.out.println("Степень числа a = " + (a * a));
        } 	else if (c == '%') {
            System.out.println("Остаток от деления числа a на число b = " + (a % b));
        }

        else {
            System.out.println("Неверный оператор");

        }

    }

}