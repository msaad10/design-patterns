package com.learning.design.patterns.uifactory;

import com.learning.design.patterns.Button;
import com.learning.design.patterns.Checkbox;
import com.learning.design.patterns.os.mac.MacButton;
import com.learning.design.patterns.os.mac.MacCheckbox;
import com.learning.design.patterns.os.window.WindowButton;
import com.learning.design.patterns.os.window.WindowCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
