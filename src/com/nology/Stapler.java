package com.nology;

public class Stapler extends Stationary implements StationaryInterface{

    public Stapler(int quantity) {
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
