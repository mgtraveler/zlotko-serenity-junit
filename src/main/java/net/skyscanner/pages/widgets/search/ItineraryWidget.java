package net.skyscanner.pages.widgets.search;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.skyscanner.pages.widgets.CommonWidget;
import net.skyscanner.pages.widgets.search.impl.ItineraryWidgetImpl;

import java.util.List;

@ImplementedBy(ItineraryWidgetImpl.class)
public interface ItineraryWidget extends CommonWidget {

    List<WebElementFacade> getItineraries();
}
