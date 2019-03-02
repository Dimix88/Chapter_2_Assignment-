package com.dimitri;

public class PriceMakerImpl implements PriceMaker {

    @Override
    public double fullPrice(double quantity, double pricePerItem){

        return quantity * pricePerItem;

    }
}
