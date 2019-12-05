import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator simple = new Calculator();
        Scanner scanNumbers = new Scanner(System.in);

        do {
            System.out.println("Введите первое число:");
            simple.numberA = scanNumbers.nextInt();
            scanNumbers.nextLine();
            System.out.println("Введите знак математической операции:");
            String mathSymbol = scanNumbers.nextLine();
            simple.operator = mathSymbol.charAt(0);
            System.out.println("Введите второе число:");
            simple.numberB = scanNumbers.nextInt();
            scanNumbers.nextLine();
            System.out.println("Результат вычисления " + simple.useCalculate(simple.numberA, simple.numberB, simple.operator));
            System.out.println("Хотите продолжить? [да/нет]: ");
            simple.answer = scanNumbers.nextLine();
            simple.Continue();
        } while (simple.isContinue);
    }
}
