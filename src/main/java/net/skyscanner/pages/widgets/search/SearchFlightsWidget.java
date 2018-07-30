package net.skyscanner.pages.widgets.search;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.skyscanner.pages.widgets.AnyWidget;
import net.skyscanner.pages.widgets.impl.search.SearchFlightsWidgetImpl;

import java.util.List;

@ImplementedBy(SearchFlightsWidgetImpl.class)
public interface SearchFlightsWidget extends AnyWidget {

    WebElementFacade getFromOriginInput();

    WebElementFacade getToDestinationInput();

    List<WebElementFacade> getSuggestions();

    WebElementFacade  getSuggestion(String text);

    WebElementFacade getSearchFlightsButton();
}
