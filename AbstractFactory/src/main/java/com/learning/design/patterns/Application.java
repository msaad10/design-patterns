package com.learning.design.patterns;

import com.learning.design.patterns.uifactory.UIFactory;

public class Application {
    private Button button;
    private Checkbox checkox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkox.paint();
    }
}
