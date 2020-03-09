package src.com.startjava.lesson_2_3.game;
public class Player {

    private String name;
    private int number;


     String getName() {
        return name;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }
    void setName(String name) {
        this.name = name;
    }
}