package net.pardini.mb2es;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
public class Application {
// ------------------------------ FIELDS ------------------------------

    private Logger logger = LoggerFactory.getLogger(getClass());

// --------------------------- main() method ---------------------------

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
