package com.learning.design.patterns;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {
    private BitmapImage realImage;
    private String fileName;
    private Point2D location;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (realImage != null) {
            realImage.setLocation(point2D);
        }
        else {
            this.location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if (realImage != null) {
            return realImage.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if (realImage == null) {
            realImage = new BitmapImage(fileName);
            if(location != null) {
                realImage.setLocation(location);
            }
        }
        realImage.render();
    }
}
