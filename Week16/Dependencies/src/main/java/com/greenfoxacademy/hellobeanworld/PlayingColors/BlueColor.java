package com.greenfoxacademy.hellobeanworld.PlayingColors;

import com.greenfoxacademy.hellobeanworld.HelloDIproject.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class BlueColor implements MyColor {

    @Autowired
    private Printer printer;

    public void printColor() {

        printer.log("It is blue in color");
    }
}
