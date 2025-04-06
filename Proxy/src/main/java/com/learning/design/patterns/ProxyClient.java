package com.learning.design.patterns;

import java.awt.geom.Point2D;

public class ProxyClient {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A1.jpg");
        img.setLocation(new Point2D.Double(10, 10));

        System.out.println("Image location: " + img.getLocation());
        System.out.println("Rendering image...");
        img.render();
    }
}