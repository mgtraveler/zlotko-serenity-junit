package net.skyscanner.pages.widgets.impl.search;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.skyscanner.pages.widgets.impl.AbstractAnyWidgetImpl;
import net.skyscanner.pages.widgets.search.SearchFlightsWidget;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

import static net.skyscanner.utils.WebDriverUtil.waitUntilElementsArePresent;

@Getter
public class SearchFlightsWidgetImpl extends AbstractAnyWidgetImpl implements SearchFlightsWidget {

    @FindBy(id = "origin-fsc-search")
    private WebElementFacade fromOriginInput;

    @FindBy(id = "destination-fsc-search")
    private WebElementFacade toDestinationInput;

    @FindBy(xpath = ".//*[contains(@class, 'suggestion-value')]")
    private List<WebElementFacade> suggestions;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElementFacade searchFlightsButton;

    public SearchFlightsWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                                   final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchFlightsWidgetImpl(final PageObject page, final ElementLocator locator,
                                   final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public WebElementFacade getSuggestion(String text) {
        waitUntilElementsArePresent(getSuggestions());
        return getSuggestions()
                .stream()
                .filter(element -> element.getText().contains(text))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(String.format("No suggestion containing '%s' text", text)));
    }
}
