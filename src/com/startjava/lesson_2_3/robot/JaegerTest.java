package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger ("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9, "Assault Mount 3.25 Sting-Blades", "XIG Supercell Chamber");
        System.out.println("Имя робота 1 " + jaeger1.getModelName());
        System.out.println("Имя робота 1 " + jaeger1.getModelName());
        System.out.println(jaeger1.getModelName() + " имеет уровень брони " + jaeger1.getArmor());
        System.out.println("Энергетическое ядро " + jaeger1.getModelName() + " " + jaeger1.getEnergyCore());
        System.out.println("Рост " + jaeger1.getModelName() + " " + jaeger1.getHeight());
        System.out.println("Марка " + jaeger1.getModelName() + " " + jaeger1.getMark());
        System.out.println("Происхождение " + jaeger1.getModelName() + " " + jaeger1.getOrigin());
        System.out.println("Скорость " + jaeger1.getModelName() + " " + jaeger1.getSpeed());
        System.out.println("Сила " + jaeger1.getModelName() + " " + jaeger1.getStrenght());
        System.out.println("Оружие " + jaeger1.getModelName() + " " + jaeger1.getWeapon());
        System.out.println("Вес " + jaeger1.getModelName() + " " + jaeger1.getWeight());
        jaeger1.useWeapon();
        jaeger1.moveForward();
        jaeger1.jump();
        jaeger1.powerOff();

        Jaeger jaeger2 = new Jaeger ("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 5, 7, 4, "Ballistic mortar cannons V-PI EnergyCaster", "Iso-thor reaction chamber");
        System.out.println("Имя робота 2 " + jaeger2.getModelName());
        System.out.println(jaeger2.getModelName() + " имеет уровень брони " + jaeger2.getArmor());
        System.out.println("Энергетическое ядро " + jaeger2.getModelName() + " " + jaeger2.getEnergyCore());
        System.out.println("Рост " + jaeger2.getModelName() + " " + jaeger2.getHeight());
        System.out.println("Марка " + jaeger2.getModelName() + " " + jaeger2.getMark());
        System.out.println("Происхождение " + jaeger2.getModelName() + " " + jaeger2.getOrigin());
        System.out.println("Скорость " + jaeger2.getModelName() + " " + jaeger2.getSpeed());
        System.out.println("Сила " + jaeger2.getModelName() + " " + jaeger2.getStrenght());
        System.out.println("Оружие " + jaeger2.getModelName() + " " + jaeger2.getWeapon());
        System.out.println("Вес " + jaeger2.getModelName() + " " + jaeger2.getWeight());
        jaeger2.useWeapon();
        jaeger2.moveForward();
        jaeger2.jump();
        jaeger2.powerOff();
    }
}