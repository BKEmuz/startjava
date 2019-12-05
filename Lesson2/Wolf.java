public class Wolf {
    private String sex;
    private String nickname;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(nickname + " идет");
    }

    public void sitDown() {
        System.out.println(nickname + " сидит");
    }

    public void run() {
        System.out.println(nickname + " бежит");
    }

    public void useHowlSkill() {
        System.out.println(nickname + " воет");
    }

    public void useHuntSkill() {
        System.out.println(nickname + " охотится");
    }

}


