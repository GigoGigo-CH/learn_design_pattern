package Patterns.FactoryMethod.factory;

import Patterns.FactoryMethod.buttons.Button;
import Patterns.FactoryMethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
