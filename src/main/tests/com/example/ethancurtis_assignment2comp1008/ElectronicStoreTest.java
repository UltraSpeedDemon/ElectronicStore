package com.example.ethancurtis_assignment2comp1008;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicStoreTest {

    private ElectronicStore store1;
    //getters for instances not included

    @BeforeEach
    void setUp() {
        store1 = new ElectronicStore("Nvidia","RTX 3090","Graphics Card",1000.00);
    }

    @Test
    void setBrand() { //set Brand test
        store1.setBrand("Intel");
        assertEquals("Intel",store1.getBrand());
    }

    @Test
    void setName() { //set Name test
        store1.setBrand("GTX 1080");
        assertEquals("GTX 1080",store1.getName());
    }

    @Test
    void setPart() { //set Part test
        store1.setBrand("CPU");
        assertEquals("CPU",store1.getPart());
    }

    @Test
    void setPrice() { //set Price test
        store1.setPrice(100.00);
        assertEquals(100.00, store1.getPrice());
    }
}