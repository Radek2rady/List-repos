package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.HelloDIproject.Printer;
import com.greenfoxacademy.hellobeanworld.PlayingColors.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    private final Printer printer;
    private final MyColor myColor;

    @Autowired
    public HellobeanworldApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        printer.log("SOME SPRING INFO");
        printer.log(LocalDateTime.now() + " MY PRINTER SAYS --- hello");
        printer.log("SOME SPRING INFO");

        myColor.printColor();


    }
}
