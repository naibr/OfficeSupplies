package com.nology;

public class Pen extends Stationary implements StationaryInterface{

    public Pen(int quantity) {
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
