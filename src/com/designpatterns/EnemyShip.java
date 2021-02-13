package com.designpatterns;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public void setName(String name) {
        this.name = name;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    private void display(){
        System.out.println("I am the enemy " + name);
    }
    private void followHero(){
        System.out.println("Enemy "+ name + "follows Hero");
    }
    private void pummmm(){
        System.out.println("This Enemy wirft "+amtDamage+ "Angriffe");
    }

    public void actuar(){
            display();
            followHero();
            pummmm();
    }


}
