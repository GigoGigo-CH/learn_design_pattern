package Patterns.FactoryMethod.factory;

import Patterns.FactoryMethod.buttons.Button;
import Patterns.FactoryMethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
