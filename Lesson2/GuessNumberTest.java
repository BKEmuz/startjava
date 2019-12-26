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
            System.out.println(p1.getName() + " введите ваше число");
            int p1Number = scan.nextInt();
            p1.SetNumber(p1Number);
            System.out.println(p2.getName() + " введите ваше число");
            int p2Number = scan.nextInt();
            p2.SetNumber(p2Number);
            GuessNumber game = new GuessNumber(p1.getName(), p1.getNumber(), p2.getName(), p2.getNumber());
            game.start();

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

                if (answer.equals("Да") || answer.equals("Нет")) {
                break;
                }

            } while (true);

        } while (answer.equals("Да"));
    }
}