import java.util.Scanner;

public class GuessNumber {
    private String p1Name;
    private int p1Number;
    private String p2Name;
    private int p2Number;

    public GuessNumber (Player p1, Player p2) {
        this.p1Name = p1.getName();
        this.p2Name = p2.getName();
    }

    public void start() {
        boolean p1isright = false;
        boolean p2isright = false;
        int compNumber = (int) (Math.random() * 100);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println(p1Name + " введите ваше число");
            int p1Number = scan.nextInt();
            System.out.println(p2Name + " введите ваше число");
            int p2Number = scan.nextInt();
            System.out.println("Число которое загадал компьютер " + compNumber);
            System.out.println("Игрок " + p1Name + " думает, что это " + p1Number);
            System.out.println("Игрок " + p2Name + " думает, что это " + p2Number);
            if (p1Number == compNumber) {
                p1isright = true;
            }

            if (p2Number == compNumber) {
                p2isright = true;
            }

            if (p1isright || p2isright) {
                if (p1isright){
                    System.out.println("Игрок " + p1Name + " победил!");
                } else if (p2isright) {
                    System.out.println("Игрок " + p2Name + " победил!");
                }

                break;

            } else {
                System.out.println("Попробуйте еще раз, победителя нет");
                break;
            }
        }
    }
}


