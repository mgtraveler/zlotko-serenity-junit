package net.skyscanner.core.props;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:base.properties", "classpath:serenity.properties"})
public interface Configuration extends Config {

    @Key("webdriver.driver")
    public String browser();

    @Key("base.host")
    public String baseHost();

    @Key("webdriver.timeouts.implicitlywait")
    public long timeoutImplicitelyWait();

    @Key("webdriver.wait.for.timeout")
    public long timeoutExplicitelyWait();

    @Key("serenity.timeout")
    public long serenityTimeout();

    @Key("polling.wait")
    public long pollingWait();
}
