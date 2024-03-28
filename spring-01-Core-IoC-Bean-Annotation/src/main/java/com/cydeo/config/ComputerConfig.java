package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.monitorfactory.SonyMonitor;
import com.cydeo.motherboardfactory.AsusMotherboard;
import com.cydeo.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean
    @Primary
    public Monitor monitorSony(){
        return new SonyMonitor("25inch Beast", "Sony", 25);
    }

    @Bean
    public Monitor monitorSony2(){
        return new SonyMonitor("40inch Beast", "Sony", 40);
    }

    @Bean
    public Case caseDell(){
        return new DellCase("220B", "Dell", "220");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-156", "Asus", 2, 3, "v-12-3");
    }


}
