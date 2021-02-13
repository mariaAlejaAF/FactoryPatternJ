package com.designpatterns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EnemyShipFactory factoryVonFeinde = new EnemyShipFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("Which Enemy? R/U/B ");
        String wahl = sc.nextLine();

        EnemyShip myEnemy = factoryVonFeinde.makeEnemyShip(wahl);
        //Recuerda que esto es importante. El main debe ocuparse de resolver esas cosas de null. Con esto ya podemos
        //utilizar las otras cosas que hacemos.
        try {
            myEnemy.actuar();
        }catch (NullPointerException e){
            System.out.println("Nop. No se creó el enemigo");
        }


    }
}
