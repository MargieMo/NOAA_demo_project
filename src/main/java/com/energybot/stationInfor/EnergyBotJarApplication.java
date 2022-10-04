package com.energybot.stationInfor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.energybot.stationInfor.db.mappers")
@ComponentScan(basePackages = {"com.energybot"})
public class EnergyBotJarApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnergyBotJarApplication.class, args);
    }
}
