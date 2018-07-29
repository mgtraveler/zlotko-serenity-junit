package net.skyscanner.steps.search;

import net.skyscanner.pages.HomePage;
import net.skyscanner.pages.widgets.search.SearchFlightsWidget;
import net.skyscanner.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class SearchSteps extends CommonSteps {

    private HomePage homePage;

    @Step
    public void userSearchesForFlight(String origin, String destination) {
        SearchFlightsWidget searchFlightsWidget = homePage.getSearchFlightsWidget();

        searchFlightsWidget
                .getFromOriginInput()
                .type(origin);
        searchFlightsWidget
                .getSuggestion(origin)
                .click();

        searchFlightsWidget
                .getToDestinationInput()
                .type(destination);
        searchFlightsWidget
                .getSuggestion(destination)
                .click();

        searchFlightsWidget
                .getSearchFlightsButton()
                .click();
    }
}
