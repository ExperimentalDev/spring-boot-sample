package org.expdev.sample;

import org.expdev.sample.controller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rloghin
 */
@SpringBootApplication
public class SampleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
