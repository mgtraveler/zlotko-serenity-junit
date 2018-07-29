package net.skyscanner.steps;

import net.skyscanner.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CommonSteps extends ScenarioSteps {

    private HomePage homePage;

    @Step
    public void userOpensHomePage() {
        homePage.open();
    }
}
