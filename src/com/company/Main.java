package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss=new Boss(500,50,"Физ");
        System.out.println(boss.getHealth() + "\n " + boss.getDamage()+ "\n "+
                boss.getBossDamageType());


        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth()+"\n"+createHeroes()[i].getDamage()+"\n"
                    + createHeroes()[i].getHeroesAttackType());
        }

    }
    public static Hero[] createHeroes(){
        Hero naruto= new Hero(300,50,"Расэнган");
        Hero sasuke= new Hero(250,50,"Кирин");
        Hero obito= new Hero(300,50);
        Hero[] heroes={naruto,sasuke,obito};
        return heroes;

    }
}
