package net.skyscanner.pages.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;
import net.skyscanner.pages.widgets.impl.AbstractAnyWidgetImpl;

@ImplementedBy(AbstractAnyWidgetImpl.class)
public interface AnyWidget extends WidgetObject {
}
