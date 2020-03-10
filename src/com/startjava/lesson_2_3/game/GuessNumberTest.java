package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            GuessNumber game = new GuessNumber();
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

