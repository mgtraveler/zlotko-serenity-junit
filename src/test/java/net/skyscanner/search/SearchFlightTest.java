package net.skyscanner.search;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.skyscanner.BaseTest;
import net.skyscanner.steps.CommonSteps;
import net.skyscanner.steps.search.SearchAsserts;
import net.skyscanner.steps.search.SearchSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class SearchFlightTest extends BaseTest {

    private final String origin;
    private final String destination;

    @Steps
    CommonSteps commonSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    SearchAsserts searchAsserts;

    public SearchFlightTest(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {"Riga", "Lviv"},
                {"Hong Kong", "Kiev"}
        });
    }

    @Test
    public void testCanSearchForFlights() {
        commonSteps.userOpensHomePage();
        searchSteps.userSearchesForFlight(origin, destination);
        searchAsserts.userShouldSeeItinerariesInSearchResults();
    }
}
