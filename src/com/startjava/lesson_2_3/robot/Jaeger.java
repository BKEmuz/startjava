package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;
    private String weapon;
    private String energy;

    public Jaeger (String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor, String weapon, String energy) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
        this.weapon = weapon;
        this.energy = energy;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getModelName() {
        return modelName;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    String getMark() {
        return mark;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    String getOrigin() {
        return origin;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getHeight() {
        return height;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    int getStrenght() {
        return strenght;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    int getArmor() {
        return armor;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    String getWeapon() {
        return weapon;
    }

    void setEnergyCore(String energy) {
        this.energy = energy;
    }

    String getEnergyCore() {
        return energy;
    }

    void moveForward() {
        System.out.println(modelName + " движется вперед");
    }

    void useWeapon() {
        System.out.println(modelName + " ведет огонь по противнику из " + weapon);
    }

    void jump() {
        System.out.println(modelName + " прыгает в верх на 10 метров ");
    }

    void powerOff() {
        System.out.println(modelName + " завершает работу ");
    }
}


