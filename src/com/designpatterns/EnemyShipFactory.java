package com.designpatterns;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String e){

        EnemyShip enemy;

        if(e.equals("R")) enemy = new RocketEnemyShip();
        else if (e.equals("U")) enemy = new UFOEnemyShip();
        else if (e.equals("B")) enemy = new BigUFOEnemyShip();
        else enemy = null;

        return enemy;
    }
}
