package net.openhft.chronicle.ticker;

import org.junit.Test;

public class NanoTickerTest implements BaseTickerTest {

    @Test
    public void perfTest() {
        driver(NanoTicker.INSTANCE);
    }

}