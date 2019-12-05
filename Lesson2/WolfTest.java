public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("кобель");
        wolfOne.setNickname("Борзый");
        wolfOne.setWeight(10.4);
        wolfOne.setAge(8);
        wolfOne.setColor("белый");

        System.out.println("Возраст волка " + wolfOne.getNickname() + " " + wolfOne.getAge() + " лет");
        System.out.println("Волк " + wolfOne.getNickname() + " имеет " + wolfOne.getColor() + " цвет");
        System.out.println("Волк " + wolfOne.getNickname() + " - " + wolfOne.getSex());
        System.out.println("Волк " + wolfOne.getNickname() + " весит " + wolfOne.getWeight() + " кг.");
        //wolfOne.run();
        //wolfOne.sitDown();
        //wolfOne.useHowlSkill();
        //wolfOne.useHuntSkill();
        //wolfOne.walk();
    }
}
