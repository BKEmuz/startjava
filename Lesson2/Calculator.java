public class Calculator {
    private int numberA;
    private int numberB;
    private char operator;

    void setNnumberA(int numberA) {
        this.numberA = numberA;
    }

    void setNnumberB(int numberB) {
        this.numberB = numberB;
    }

    void setOperator(char operator) {
        this.operator = operator;
    }

    public int calculate() {
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





