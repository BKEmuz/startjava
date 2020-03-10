package com.startjava.lesson_1.game;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 75;
        Scanner scanPlayerNumber = new Scanner(System.in);
        System.out.println("Загадайте число от 0 до 100");
        while (true) {
            int playerNumber = scanPlayerNumber.nextInt();
            if (playerNumber > compNumber)  {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }

            if (playerNumber < compNumber)  {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                break;
            }
        }
        System.out.println("Вы угадали!");
    }
}