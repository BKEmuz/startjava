package src.com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Игрок 1 введите ваше имя");
        String p1Name = scan.nextLine();
        Player p1 = new Player();
        //System.out.println("Игрок 2 введите ваше имя");
        String p2Name = scan.nextLine();
        Player p2 = new Player();
        String answer;

        do {
            GuessNumber game = new GuessNumber();
            game.start();

            do {
                //System.out.println("Хотите продолжить? [Да/Нет]: ");
                answer = scan.nextLine();

                if (answer.equals("Да") || answer.equals("Нет")) {
                break;
                }

            } while (true);

        } while (answer.equals("Да"));
    }
}

