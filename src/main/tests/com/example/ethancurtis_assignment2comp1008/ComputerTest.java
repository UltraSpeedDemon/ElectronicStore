package com.example.ethancurtis_assignment2comp1008;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest { //tests for both model classes

    private Computer test1;
    //getLocation not called/tested it's a string value
    //lines uncovered are exception argument lines

    @BeforeEach
    void setUp() { //setup test
        test1 = new Computer("30 Cove Street");
    }

    @Test
    void setLocation() { //set Location test
        test1.setLocation("Barrie Public Library");
        assertEquals("Barrie Public Library",test1.getLocation());
    }

    @Test
    void addPart() { //add part test
        ElectronicStore part6 = new ElectronicStore("Corsair","275R Mid-Tower","Case",109.29);
            test1.addPart(part6);
    }

    @Test
    void getNumOfParts() { //num of parts test
        ElectronicStore part5 = new ElectronicStore("G-SKILL","Trident-Z 32GB","Ram",282.59);
            test1.addPart(part5);
        test1.getComputerValue();

    }

    @Test
    void getComputerValue() { //computer value test
        ElectronicStore part2 = new ElectronicStore("Cooler Master","Hyper 212 Black","CPU Fan",59.89);
            test1.addPart(part2);
        test1.getComputerValue();
    }

    @Test
    void testGetParts() { //test get parts method
        int i = 0;
            ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.19);
        test1.addPart(part1);
        test1.getParts(i);
    }

    @Test
    void testGetNumOfParts() {
        ElectronicStore part1 = new ElectronicStore("Nvidia","RTX 3070","Graphics Card",1199.19);
        test1.addPart(part1);
        test1.getNumOfParts();
    }
}