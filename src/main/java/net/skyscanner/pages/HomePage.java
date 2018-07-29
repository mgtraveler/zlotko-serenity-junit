package net.skyscanner.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.skyscanner.pages.widgets.search.SearchFlightsWidget;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@Getter
@DefaultUrl("/")
public class HomePage extends AnyPage {

    @FindBy(id = "flights-search-controls-root")
    private SearchFlightsWidget searchFlightsWidget;

    public HomePage(final WebDriver driver) {
        super(driver);
    }
}
