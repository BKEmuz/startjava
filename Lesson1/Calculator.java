import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число a");
        Scanner scanNumbers = new Scanner(System.in);
        int numberA = scanNumbers.nextInt();
        System.out.println("Введите любое целое число b");
        int numberB = scanNumbers.nextInt();
        System.out.println("Введите одно из действий +, -, *, /, ^, %");
        Scanner scanString = new Scanner(System.in); //Если не использовать новый Scanner объект строка 13 считывается пустой.
        String mathSymbol = scanString.nextLine(); // По каким то причинам считывает пустую строку, не предлагает ввести число с консоли
        char mathSymbolChar = mathSymbol.charAt(0);

        if (mathSymbolChar == '+') {
            System.out.println("Сумма числа a и числа b = " + (numberA + numberB));
        } else if (mathSymbolChar == '-') {
            System.out.println("Разница числа a и числа b = " + (numberA - numberB));
        } else if (mathSymbolChar == '/') {
            System.out.println("Частное числа a и числа b = " + (numberA / numberB));
        } else if (mathSymbolChar == '*') {
            System.out.println("Произведение числа a и числа b = " + (numberA * numberB));
        } else if (mathSymbolChar == '^') {
            int result = 1;
            int i;
            for (i = 1; i <= numberB; i++ ) {
                result = result * numberA;
            }
            System.out.println("Число а в степени b = " + result);
        } else if (mathSymbolChar == '%') {
            System.out.println("Остаток от деления числа a на число b = " + (numberA % numberB));
        } else {
            System.out.println("Неверный оператор");
        }
    }
}