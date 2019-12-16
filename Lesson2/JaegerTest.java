public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setArmor(9);
        jaeger1.setEnergyCore("XIG Supercell Chamber");
        jaeger1.setHeight(76.2f);
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setSpeed(10);
        jaeger1.setStrenght(10);
        jaeger1.setWeapon("Assault Mount 3.25 Sting-Blades");
        jaeger1.setWeight(1.850f);
        jaeger2.setModelName("Coyote Tango");
        jaeger2.setArmor(4);
        jaeger2.setEnergyCore("Iso-thor reaction chamber");
        jaeger2.setHeight(85.34f);
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Japan");
        jaeger2.setSpeed(5);
        jaeger2.setStrenght(7);
        jaeger2.setWeapon("Ballistic mortar cannons V-PI EnergyCaster");
        jaeger2.setWeight(2.312f);

        System.out.println(jaeger2.getModelName() + " имеет броню " +jaeger2.getArmor());
        System.out.println("Имя робота 1 " + jaeger1.getModelName());
        System.out.println("Имя робота 2 " + jaeger2.getModelName());
        System.out.println(jaeger1.getModelName() + " имеет уровень брони " + jaeger1.getArmor());
        System.out.println(jaeger2.getModelName() + " имеет уровень брони " + jaeger2.getArmor());
        System.out.println("Энергетическое ядро " + jaeger1.getModelName() + " " + jaeger1.getEnergyCore());
        System.out.println("Энергетическое ядро " + jaeger2.getModelName() + " " + jaeger2.getEnergyCore());
        System.out.println("Рост " + jaeger1.getModelName() + " " + jaeger1.getHeight());
        System.out.println("Рост " + jaeger2.getModelName() + " " + jaeger2.getHeight());
        System.out.println("Марка " + jaeger1.getModelName() + " " + jaeger1.getMark());
        System.out.println("Марка " + jaeger2.getModelName() + " " + jaeger2.getMark());
        System.out.println("Происхождение " + jaeger1.getModelName() + " " + jaeger1.getOrigin());
        System.out.println("Происхождение " + jaeger2.getModelName() + " " + jaeger2.getOrigin());
        System.out.println("Скорость " + jaeger1.getModelName() + " " + jaeger1.getSpeed());
        System.out.println("Скорость " + jaeger2.getModelName() + " " + jaeger2.getSpeed());
        System.out.println("Сила " + jaeger1.getModelName() + " " + jaeger1.getStrenght());
        System.out.println("Сила " + jaeger2.getModelName() + " " + jaeger2.getStrenght());
        System.out.println("Оружие " + jaeger1.getModelName() + " " + jaeger1.getWeapon());
        System.out.println("Оружие " + jaeger2.getModelName() + " " + jaeger2.getWeapon());
        System.out.println("Вес " + jaeger1.getModelName() + " " + jaeger1.getWeight());
        System.out.println("Вес " + jaeger2.getModelName() + " " + jaeger2.getWeight());
        System.out.println("Робот " + jaeger1.getModelName() + " атаковал " + "робота " + jaeger2.getModelName());
        jaeger1.useWeapon();
        jaeger2.jump();
        jaeger1.moveForward();
        jaeger2.powerOff();
    }
}