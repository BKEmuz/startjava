public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.age = 4;
        wolfOne.color = "серый";
        wolfOne.nickname = "Тузик";
        wolfOne.sex = "кабель";
        wolfOne.weight = 25.5;

        System.out.println("Возраст волка " + wolfOne.nickname + "а " + wolfOne.age + " года");
        System.out.println("Волк " + wolfOne.nickname + " имеет " + wolfOne.color + " цвет");
        System.out.println("Волк " + wolfOne.nickname + " - " + wolfOne.sex);
        System.out.println("Волк " + wolfOne.nickname + " весит " + wolfOne.weight + " кг.");
        wolfOne.run();
        wolfOne.sitDown();
        wolfOne.useHowlSkill();
        wolfOne.useHuntSkill();
        wolfOne.walk();
    }
}