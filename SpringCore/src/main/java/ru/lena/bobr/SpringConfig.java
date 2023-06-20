package ru.lena.bobr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("ru.lena.bobr")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
