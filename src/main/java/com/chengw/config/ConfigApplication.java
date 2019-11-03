package com.chengw.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author chengw
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigApplication.class, args);;
        final String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        System.out.println("[----------------------------------------------]");
        System.out.println("> service started: "+ Arrays.toString(activeProfiles));
        System.out.println("[----------------------------------------------]");
    }

}
