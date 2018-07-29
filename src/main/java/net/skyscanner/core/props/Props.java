package net.skyscanner.core.props;

import org.aeonbits.owner.ConfigFactory;

public class Props {

    public static final Configuration PROPS = ConfigFactory.create(Configuration.class, System.getProperties());

    private Props() {
    }
}