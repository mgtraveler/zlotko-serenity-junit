package net.skyscanner;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.skyscanner.core.props.Props.PROPS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    static {
        getPages().getConfiguration().setDefaultBaseUrl(PROPS.baseHost());
    }
}
