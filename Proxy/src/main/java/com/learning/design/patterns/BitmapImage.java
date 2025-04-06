package com.learning.design.patterns;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        // Loads image from disk
        System.out.println("Loading image from disk: " + filename);
        this.name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendering image: " + name + " at location: " + location);
    }
}
