package com.learning.design.patterns;

import java.awt.geom.Point2D;

public interface Image {
    void  setLocation(Point2D point2D);
    Point2D getLocation();
    void render();
}
