package net.skyscanner.pages.widgets.search.impl;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.skyscanner.pages.widgets.CommonWidgetImpl;
import net.skyscanner.pages.widgets.search.ItineraryWidget;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

@Getter
public class ItineraryWidgetImpl extends CommonWidgetImpl implements ItineraryWidget {

    @FindBy(xpath = ".//article")
    private List<WebElementFacade> itineraries;

    public ItineraryWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                               final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public ItineraryWidgetImpl(final PageObject page, final ElementLocator locator,
                               final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
