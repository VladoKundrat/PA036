package cz.muni.pa036.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="cz.muni.pa036.logging")
@SpringBootApplication(scanBasePackages={"cz.muni.pa036.logging"})
@EnableAutoConfiguration
//@EntityScan(basePackages="cz.muni.pa036.logging")
public class PA036Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PA036Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PA036Application.class, args);
    }
}
