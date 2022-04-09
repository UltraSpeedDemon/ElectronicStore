package com.example.ethancurtis_assignment2comp1008;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicStoreTest {  //tests for both model classes

    private ElectronicStore store1;
    //getters for instances not included

    @BeforeEach
    void setUp() {
        store1 = new ElectronicStore("Nvidia","RTX 3090","Graphics Card",1000.00);
    }

    @Test
    void setBrand() { //set Brand test
        store1.setBrand("Nvidia");
        assertEquals("Nvidia",store1.getBrand());
    }

    @Test
    void setName() { //set Name test
        store1.setName("RTX 3090");
        assertEquals("RTX 3090",store1.getName());
    }

    @Test
    void setPart() { //set Part test
        store1.setPart("Graphics Card");
        assertEquals("Graphics Card",store1.getPart());
    }

    @Test
    void setPrice() { //set Price test
        store1.setPrice(100.00);
        assertEquals(100.00, store1.getPrice());
    }

    @Test
    void getBrand() { //get Price test
        store1.getBrand();
    }

    @Test
    void getName() { //get Name test
        store1.getName();
    }

    @Test
    void getPart() { //get Part test
        store1.getPart();
    }

    @Test
    void getPrice() { //get Price test
        store1.getPrice();
    }
}