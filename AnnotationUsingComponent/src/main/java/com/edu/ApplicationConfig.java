package com.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.edu")
public class ApplicationConfig {

/*@Bean // all object of bean
public Samsung getPhone()
{
	return new Samsung();
}
@Bean
public MobileProcessor getProcessor()
{
	return new SnapDragon();
}*/
}