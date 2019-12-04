public class Wolf {
    String sex;
    String nickname;
    double weight;
    int age;
    String color;

    void walk() {
        System.out.println(nickname + " идет");
    }

    void sitDown() {
        System.out.println(nickname + " сидит");
    }

    void run() {
        System.out.println(nickname + " бежит");
    }

    void useHowlSkill() {
        System.out.println(nickname + " воет");
    }

    void useHuntSkill() {
        System.out.println(nickname + " охотится");
    }

}