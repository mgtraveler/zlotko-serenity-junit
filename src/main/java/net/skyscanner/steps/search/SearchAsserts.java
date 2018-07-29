package net.skyscanner.steps.search;

import net.skyscanner.pages.SearchResultsPage;
import net.skyscanner.steps.CommonAsserts;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SearchAsserts extends CommonAsserts {

    private SearchResultsPage searchResultsPage;

    @Step
    public void userShouldSeeItinerariesInSearchResults() {
        assertThat(searchResultsPage.getItineraryWidget().getItineraries()).
                as("Itineraries in search results").
                isNotEmpty();
    }
}
