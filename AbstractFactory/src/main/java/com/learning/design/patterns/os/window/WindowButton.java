package com.learning.design.patterns.os.window;

import com.learning.design.patterns.Button;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowButton.");
    }
}
