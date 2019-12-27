import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок 1 введите ваше имя");
        String p1Name = scan.nextLine();
        Player p1 = new Player(p1Name);
        System.out.println("Игрок 2 введите ваше имя");
        String p2Name = scan.nextLine();
        Player p2 = new Player(p2Name);
        String answer;

        do {

            GuessNumber game = new GuessNumber(p1, p2);
            game.start();

            do {
                System.out.println("Хотите продолжить? [Да/Нет]: ");
                answer = scan.nextLine();

                if (answer.equals("Да") || answer.equals("Нет")) {
                break;
                }

            } while (true);

        } while (answer.equals("Да"));
    }
}

