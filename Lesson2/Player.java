public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    void SetNumber(int number) {
        this.number = number;
    }
}