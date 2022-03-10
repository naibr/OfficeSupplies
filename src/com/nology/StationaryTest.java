package com.nology;

import static org.junit.Assert.*;

public class StationaryTest {

    @org.junit.Test
    public void getQuantity() {
        fail("This test has not been created yet");
    }

    @org.junit.Test
    public void setQuantity() {
//        Arrange
        Pen pen = new Pen(0);
//        Act
        pen.setQuantity(1000);
//        Assert
        assertEquals(1000,pen.getQuantity());
    }

    @org.junit.Test
    public void RemovePens() {
        //        Arrange
        Pen pen = new Pen(1000);
//        Act
        pen.removeItems(258);
//        Assert
        assertEquals(742, pen.getQuantity());

    }

}