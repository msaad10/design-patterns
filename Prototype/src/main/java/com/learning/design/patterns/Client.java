package com.learning.design.patterns;

import javafx.geometry.Point3D;

public class Client {
    public static void main(String[] args) {
        Swordsman swordsMan = new Swordsman();
        swordsMan.move(new Point3D(-10, 0, 0), 20);

        swordsMan.attack();

        System.out.println(swordsMan);

        try {
            Swordsman swordsMan1 = (Swordsman) swordsMan.clone();
            System.out.println(swordsMan1);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}