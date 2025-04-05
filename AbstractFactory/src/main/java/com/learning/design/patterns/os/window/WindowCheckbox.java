package com.learning.design.patterns.os.window;

import com.learning.design.patterns.Checkbox;

public class WindowCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowCheckbox.");
    }
}
