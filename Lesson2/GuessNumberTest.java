import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок 1 введите ваше имя");
        String p1Name = scan.nextLine();
        System.out.println("Игрок 2 введите ваше имя");
        String p2Name = scan.nextLine();
        String answer;

        do {
            Player p1 = new Player(p1Name);
            Player p2 = new Player(p2Name);
            GuessNumber game = new GuessNumber(p1.getName(), p1.getNumber(), p2.getName(), p2.getNumber());
            
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

