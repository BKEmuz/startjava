import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число a");
        Scanner scanNumbers = new Scanner(System.in);
        int numberA = scanNumbers.nextInt();
        System.out.println("Введите любое целое число b");
        int numberB = scanNumbers.nextInt();
        scanNumbers.nextLine();
        System.out.println("Введите одно из действий +, -, *, /, ^, %");
        String mathSymbol = scanNumbers.nextLine(); 
        char operator = mathSymbol.charAt(0);

        if (operator == '+') {
            System.out.println("Сумма числа a и числа b = " + (numberA + numberB));
        } else if (operator == '-') {
            System.out.println("Разница числа a и числа b = " + (numberA - numberB));
        } else if (operator == '/') {
            System.out.println("Частное числа a и числа b = " + (numberA / numberB));
        } else if (operator == '*') {
            System.out.println("Произведение числа a и числа b = " + (numberA * numberB));
        } else if (operator == '^') {
            int result = 1;
            for (int i = 1; i <= numberB; i++ ) {
                result *= numberA;
            }
            System.out.println("Число а в степени b = " + result);
        } else if (operator == '%') {
            System.out.println("Остаток от деления числа a на число b = " + (numberA % numberB));
        } else {
            System.out.println("Неверный оператор");
        }
    }
}