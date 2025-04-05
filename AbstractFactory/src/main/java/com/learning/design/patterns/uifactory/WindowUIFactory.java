package com.learning.design.patterns.uifactory;

import com.learning.design.patterns.Button;
import com.learning.design.patterns.Checkbox;
import com.learning.design.patterns.os.window.WindowButton;
import com.learning.design.patterns.os.window.WindowCheckbox;

public class WindowUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
