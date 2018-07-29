package net.skyscanner.pages.widgets;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public abstract class CommonWidgetImpl extends WidgetObjectImpl implements CommonWidget {

    public CommonWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                            final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public CommonWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
