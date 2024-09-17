package com.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com.model")
public class ApplicationConfig {

}
