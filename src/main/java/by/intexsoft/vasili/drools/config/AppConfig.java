package by.intexsoft.vasili.drools.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * General configuration
 */
@Configuration
@ImportResource("classpath:drools-context.xml")
@ComponentScan("by.intexsoft.vasili.drools.service")
public class AppConfig {
}
