package com.example.ethancurtis_assignment2comp1008;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest { //tests for both model classes

    private Computer test1;
    //getLocation not called/tested it's a string value

    @BeforeEach
    void setUp() { //setup test
        test1 = new Computer("30 Cove Street");
            ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.19);
            ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.89);
            ElectronicStore part3 = new ElectronicStore("Intel","I7-9700K","CPU",745.49);
            ElectronicStore part4 = new ElectronicStore("Asus","Z-390 Prime","MotherBoard",329.29);
            ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",282.59);
            ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.29);
            test1.addPart(part1);
            test1.addPart(part2);
            test1.addPart(part3);
            test1.addPart(part4);
            test1.addPart(part5);
            test1.addPart(part6);
    }

    @Test
    void setLocation() { //set Location test
        test1.setLocation("Barrie Public Library");
        assertEquals("Barrie Public Library",test1.getLocation());
    }

    @Test
    void addPart() {
    }

    @Test
    void getNumOfParts() {
    }

    @Test
    void getComputerValue() {
    }

    @Test
    void testGetParts() {
    }
}