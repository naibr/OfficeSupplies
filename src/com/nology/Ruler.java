package com.nology;

public class Ruler extends Stationary implements StationaryInterface{

    public Ruler(int quantity) {
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
