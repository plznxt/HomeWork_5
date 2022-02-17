package com.company;

public class Boss {
    private int health;
    private int damage;
    private String bossDamageType;

    public Boss(int health, int damage, String bossDamageType) {
        this.health = health;
        this.damage = damage;
        this.bossDamageType = bossDamageType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDamageType() {
        return bossDamageType;
    }

    public void setBossDamageType(String bossDamageType) {
        this.bossDamageType = bossDamageType;
    }
}
