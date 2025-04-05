package com.learning.design.patterns.os.mac;

import com.learning.design.patterns.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacButton.");
    }
}
