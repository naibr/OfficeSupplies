package com.nology;

public class A4Booklet extends Stationary implements StationaryInterface{

    public A4Booklet(int quantity) {
        super(quantity);
    }

    @Override
    public int addItems(int num) {
        return setQuantity(getQuantity() + num);
    }

    @Override
    public int removeItems(int num) {
        return setQuantity(getQuantity() - num);
    }
}
