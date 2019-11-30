
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число a");
        Scanner scanNumberA = new Scanner(System.in);
        int numberA = scanNumberA.nextInt();
        System.out.println("Введите любое целое число b");
        Scanner scanNumberB = new Scanner(System.in);
        int numberB = scanNumberB.nextInt();
        System.out.println("Введите одно из действий +, -, *, /, ^, %");
        Scanner scanMathSymbol = new Scanner(System.in);
        String mathSymbol = scanMathSymbol.nextLine();
        char mathSymbolChar = mathSymbol.charAt(0);
        if (mathSymbolChar == '+') {
            System.out.println("Сумма числа a и числа b = " + (numberA + numberB));
        } 	else if (mathSymbolChar == '-') {
            System.out.println("Разница числа a и числа b = " + (numberA - numberB));
        } 	else if (mathSymbolChar == '/') {
            System.out.println("Частное числа a и числа b = " + (numberA / numberB));
        } 	else if (mathSymbolChar == '*') {
            System.out.println("Произведение числа a и числа b = " + (numberA * numberB));
        } 	else if (mathSymbolChar == '^') {
            System.out.println("Степень числа a = " + (numberA * numberA));
        } 	else if (mathSymbolChar == '%') {
            System.out.println("Остаток от деления числа a на число b = " + (numberA % numberB));
        } 

        else {
            System.out.println("Неверный оператор");
        }
    }
}