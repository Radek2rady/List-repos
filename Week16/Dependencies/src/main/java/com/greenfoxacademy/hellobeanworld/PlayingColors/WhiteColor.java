package com.greenfoxacademy.hellobeanworld.PlayingColors;

import com.greenfoxacademy.hellobeanworld.HelloDIproject.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class WhiteColor implements MyColor {

    @Autowired
    private Printer printer;

    @Override
    public void printColor() {
        printer.log("It is white in color");
    }
}
