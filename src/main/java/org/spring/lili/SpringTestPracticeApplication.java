package org.spring.lili;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTestPracticeApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringTestPracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringTestPracticeApplication.class, args);
    }

}
