package com.learning.design.patterns;

import com.learning.design.patterns.uifactory.MacUIFactory;
import com.learning.design.patterns.uifactory.WindowUIFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new WindowUIFactory());
        application.paint();

        Application application1 = new Application(new MacUIFactory());
        application1.paint();
    }
}