public class Calculator {
    int numberA;
    int numberB;
    char operator;

    public int Calculate() {
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
}





