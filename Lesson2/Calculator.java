public class Calculator {
    public int numberA;
    public int numberB;
    public char operator;

    public int useCalculate(int numberA, int numberB, char operator) {
        int result = 1;

        switch (operator) {
            case '+': result = numberA + numberB; break;
            case '-': result = numberA - numberB; break;
            case '/': result = numberA / numberB; break;
            case '*': result = numberA * numberB; break;
            case '^': for (int i = 1; i <= numberB; i++) {
                      result *= numberA;
                      }
                     break;
            case '%': result = numberA % numberB; break;
            default: System.out.println("Неверный оператор"); break;
        }
        return result;
    }
}