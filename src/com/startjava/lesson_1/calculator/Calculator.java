package com.startjava.lesson_1.calculator;
public class Calculator {
    public int numberA;
    public int numberB;
    public char operator;
    public boolean isContinue;
    public String answer;

    public int useCalculate(int numberA, int numberB, char operator) {
        int result = 1;

        switch (operator) {
            case '+':
                result = numberA + numberB;
                break;
            case '-':
                result = numberA - numberB;
                break;
            case '/':
                result = numberA / numberB;
                break;
            case '*':
                result = numberA * numberB;
                break;
            case '^':
                for (int i = 1; i <= numberB; i++) {
                    result *= numberA;
                }
                break;
            case '%':
                result = numberA % numberB;
                break;
            default:
                System.out.println("Неверный оператор");
                break;
        }
        return result;
    }

    public void Continue() {
        switch (answer) {
            case "Да":
                isContinue = true;
                break;
            case "Нет":
                isContinue = false;
                break;
            default:
                System.out.println("Хотите продолжить? [да/нет]:");
                isContinue = true;
                break;
        }
    }
}





