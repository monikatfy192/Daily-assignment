package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class inventoryTest extends inventory {
    inventory inventory;
    @BeforeEach
    void setUp() {
     inventory=new inventory();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        inventory= null;
    }
    @org.junit.jupiter.api.Test
    void testAddQuantity() throws Exception {
        int excpected= 7;
        //act
        int actual= inventory.addquantity("phone", 5);
        //assert
        assertEquals(excpected,actual);
    }

    @org.junit.jupiter.api.Test
    void testBuyItem() throws Exception {
        int excpected= 3;
        //act
        int actual= inventory.buyItem("laptop", 5);
        //assert
        assertEquals(excpected,actual);
    }
    @org.junit.jupiter.api.Test
    void testAddItem() {
        assertThrows(Exception.class, ()->addquantity("lap", 5));
    }
    @org.junit.jupiter.api.Test
    void testBuyingUnavailablequantity() {
        assertThrows(Exception.class, ()->buyItem("laptop", 5));
    }
    @org.junit.jupiter.api.Test
    void testAddProduct() {

    }

}