package com.learning.design.patterns.uifactory;

import com.learning.design.patterns.Button;
import com.learning.design.patterns.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
