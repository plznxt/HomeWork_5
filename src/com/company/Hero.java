package com.company;

public class Hero {
private int health;
private int damage;
private String heroesAttackType;

    public Hero(int health, int damage, String heroesAttackType) {
        this.health = health;
        this.damage = damage;
        this.heroesAttackType = heroesAttackType;
    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
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
}
