package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumber {
    Player p1;
    Player p2;
    Scanner scan = new Scanner(System.in);

    public void start() {
        boolean p1isright = false;
        boolean p2isright = false;
        p1 = new Player();
        p2 = new Player();
        int compNumber = (int) (Math.random() * 100);
       // System.out.println("Игрок 1 введите ваше имя");
        p1.setName(scan.nextLine());
       // System.out.println("Игрок 2 введите ваше имя");
        p2.setName(scan.nextLine());

        while (true) {
          //  System.out.println("Игрок 1 введите ваше число");
            p1.setNumber (scan.nextInt());
          //  System.out.println("Игрок " + p1.getName() + " думает, что это " + p1.getNumber());
           // System.out.println("Игрок 2 введите ваше число");
            p2.setNumber (scan.nextInt());
            //System.out.println("Игрок " + p2.getName() + " думает, что это " + p1.getNumber());

            if (p1.getNumber() == compNumber) {
                p1isright = true;
              //  System.out.println("Игрок 1 победил!");
                break;
            } else if (p2.getNumber() == compNumber) {
                p2isright = true;
               // System.out.println("Игрок 2 победил!");
                break;
            } else {
               // System.out.println("Попробуйте еще раз, победителя нет");
                break;
            }
        }
    }
}
