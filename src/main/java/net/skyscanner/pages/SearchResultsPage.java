package net.skyscanner.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.skyscanner.pages.widgets.search.ItineraryWidget;
import org.openqa.selenium.WebDriver;

@Getter
public class SearchResultsPage extends AnyPage {

    @FindBy(xpath = ".//*[contains(@class, 'day-list-container')]")
    private ItineraryWidget itineraryWidget;

    public SearchResultsPage(final WebDriver driver) {
        super(driver);
    }
}
