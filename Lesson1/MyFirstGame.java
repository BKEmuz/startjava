import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 75;
        boolean isPlayerWin = false;

        while (isPlayerWin != true) {
            System.out.println("Загадайте число от 0 до 100");
            Scanner scanPlayerNumber = new Scanner(System.in);
            int playerNumber = scanPlayerNumber.nextInt();

            if (playerNumber == compNumber) {
                isPlayerWin = true;
                System.out.println("Вы угадали!");
            }

            if (playerNumber > compNumber)  {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }

            if (playerNumber < compNumber)  {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }

        }
    }
}