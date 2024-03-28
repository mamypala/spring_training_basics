package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.config.ComputerConfig;
import com.cydeo.config.RandomConfig;
import com.cydeo.monitorfactory.Monitor;
import com.cydeo.monitorfactory.SonyMonitor;
import com.cydeo.motherboardfactory.AsusMotherboard;
import com.cydeo.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        System.out.println("Creating container!");

        // creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);

        // creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("---------- Retrieving the beans ----------");

        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPc = new PC(dell, sony, asus);

        myPc.powerUp();
        dell.pressPowerButton();

        System.out.println("---------- Retrieving the beans ----------");

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc2 = new PC(theCase,theMonitor,theMotherboard);

        System.out.println("---------- Multiple Objects ----------");

//        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class); // Default Bean Name
//        Monitor theMonitor3 = container.getBean("sony", Monitor.class); // Custom Bean Name
//        Monitor theMonitor4 = container.getBean(Monitor.class); // @Primary
//
//
//


    }
}
