import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean isContinue = false;

        do {
            System.out.println("Введите первое число:");
            calc.numberA = scan.nextInt();
            scan.nextLine();

            System.out.println("Введите знак математической операции:");
            String sign = scan.nextLine();
            calc.operator = sign.charAt(0);

            System.out.println("Введите второе число:");
            calc.numberB = scan.nextInt();
            scan.nextLine();

            System.out.println("Результат вычисления " + calc.Calculate());

            boolean exit = false;
               do {
                   System.out.println("Хотите продолжить? [Да/Нет]: ");
                   String answer = scan.nextLine();
                   switch (answer) {
                       case "Да":
                           isContinue = true;
                           exit = true;
                           break;
                       case "Нет":
                           isContinue = false;
                           exit = true;
                           break;
                   }

                   if (exit) {
                       break;
                   }
               } while (true);
        } while (isContinue);
    }
}
