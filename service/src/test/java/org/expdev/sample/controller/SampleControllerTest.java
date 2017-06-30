package org.expdev.sample.controller;

import org.junit.Test;

/**
 * @author rloghin
 */
public class SampleControllerTest {

    SampleController controller = new SampleController();

    @Test
    public void testHello() {
        controller.home();
    }
}
