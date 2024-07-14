package com.fxw.extend_.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class NotePad extends Computer{

    String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo1() {
        getDetails();
        System.out.println("color = " + color);
    }
}
