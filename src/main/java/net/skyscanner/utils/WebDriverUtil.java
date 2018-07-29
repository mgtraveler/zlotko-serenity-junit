package net.skyscanner.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

import static net.skyscanner.core.logger.Logger.LOGGER;
import static net.skyscanner.core.props.Props.PROPS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public final class WebDriverUtil {

    private WebDriverUtil() {
    }

    public static void maximizeBrowser() {
        getDriver().manage().window().maximize();
        LOGGER.info("Browser window was maximized");
    }

    public static void waitUntilElementsArePresent(List<WebElementFacade> elementFacades) {
        fluentWait().until((WebDriver driver) -> !elementFacades.isEmpty());
    }

    public static FluentWait<WebDriver> fluentWait() {
        return new FluentWait<>(getDriver())
                .withTimeout(Duration.ofMillis(PROPS.timeoutExplicitelyWait()))
                .pollingEvery(Duration.ofMillis(PROPS.pollingWait()))
                .ignoring(TimeoutException.class);
    }
}
