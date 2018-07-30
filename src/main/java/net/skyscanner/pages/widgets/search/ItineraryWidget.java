package net.skyscanner.pages.widgets.search;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.skyscanner.pages.widgets.AnyWidget;
import net.skyscanner.pages.widgets.impl.search.ItineraryWidgetImpl;

import java.util.List;

@ImplementedBy(ItineraryWidgetImpl.class)
public interface ItineraryWidget extends AnyWidget {

    List<WebElementFacade> getItineraries();
}
