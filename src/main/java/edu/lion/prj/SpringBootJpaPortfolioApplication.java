package edu.lion.prj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootJpaPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaPortfolioApplication.class, args);
    }

}
