package com.codeup.coronatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //tells spring to create a "proxy" to call the method (fetchVirusData)
public class CoronaTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaTrackerApplication.class, args);
    }

}
