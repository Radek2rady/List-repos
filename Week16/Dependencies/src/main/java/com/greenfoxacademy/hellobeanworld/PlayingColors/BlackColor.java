package com.greenfoxacademy.hellobeanworld.PlayingColors;

import com.greenfoxacademy.hellobeanworld.HelloDIproject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackColor implements MyColor {

    @Autowired
    private Printer printer;

    @Override
    public void printColor() {

        printer.log("It is black in color");
    }
}
