package src.com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Введите первое число:");
            int numberA = scan.nextInt();
            calc.setNnumberA(numberA);
            scan.nextLine();

            System.out.println("Введите знак математической операции:");
            String sign = scan.nextLine();
            char operator = sign.charAt(0);
            calc.setOperator(operator);

            System.out.println("Введите второе число:");
            int numberB = scan.nextInt();
            calc.setNnumberB(numberB);
            scan.nextLine();

            System.out.println("Результат вычисления " + calc.calculate());

               do {
                   System.out.println("Хотите продолжить? [Да/Нет]: ");
                   answer = scan.nextLine();
                   switch (answer) {
                       case "Да":
                           answer = "Да";
                           break;
                       case "Нет":
                           answer = "Нет";
                           break;
                   }

                   if (answer.equals("Да") | answer.equals("Нет")) {
                       break;
                   }

               } while (true);

            if (answer.equals("Нет")) {
                break;
            }

        } while (true);
    }
}
