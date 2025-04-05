package com.learning.design.patterns.os.mac;

import com.learning.design.patterns.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacCheckbox.");
    }
}
