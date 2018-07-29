package net.skyscanner.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;

import static net.skyscanner.core.logger.Logger.LOGGER;
import static net.skyscanner.utils.WebDriverUtil.maximizeBrowser;

public class AnyPage extends PageObject {

    public AnyPage(final WebDriver driver) {
        super(driver);
    }

    @WhenPageOpens
    public void eventOpened() {
        LOGGER.info("Url opened: {}", getDriver().getCurrentUrl());
        maximizeBrowser();
    }
}

