package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//  ABSTRACT CLASSES AND INTERFACES

        Player player = new WebPlayer(0.5,1);
        WebPlayer webPlayer = new WebPlayer(0.3,2);
        Player androidPlayer = new AndroidPlayer(0.4, 3);
        IPlayable applePlayer = new ApplePlayer(0.2,4);
        AndroidPlayer androidPlayer1 = new AndroidPlayer(0.5,5);


        player.close();
        androidPlayer.close();
        applePlayer.play();
        androidPlayer1.close(); // esto se puede hacer porque es de tipo AndroidPlayer y tiene todos los métodos
        androidPlayer1.pause(); // esto se puede hacer porque es de tipo AndroidPlayer y tiene todos los métodos
        //applePlayer.close(); esto no se puede hacer porque es de tipo IPlayable y no tiene ese método
        System.out.println(androidPlayer1.share());


//  BIG DECIMAL CLASS

        System.out.println(1.2-1.0);
        BigDecimal big1 = new BigDecimal("1.2");
        BigDecimal big2 = new BigDecimal("1.0");
        //big1 - big2 No se puede
        System.out.println(big1.subtract(big2));

        BigDecimal big3 = new BigDecimal("10.0");
        BigDecimal big4 = new BigDecimal("3.0");
        System.out.println(big3.divide(big4, RoundingMode.HALF_EVEN));

        BigDecimal big5 = new BigDecimal("45.83475250");
        BigDecimal big6 = new BigDecimal("12.345436");
        System.out.println(big5.divide(big6, RoundingMode.HALF_EVEN));
        System.out.println(big5.setScale(3, RoundingMode.HALF_EVEN));

        System.out.println(big3.compareTo(big6));
// como big3 es menor que big6 el resutlado es negativo -1, si es mayor será 1 y si es igual será 0

    }
}
