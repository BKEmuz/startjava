public class Player {
    String name;
    int number = (int) (Math.random() * 10);

    public Player (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }
}