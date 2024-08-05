package com.adapterbiscuit.model;

public class Biscuit implements IItems {

	private String name;
    private double mrp;

    public Biscuit(String name, double mrp) {
        this.name = name;
        this.mrp = mrp;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public double getItemPrice() {
        return mrp;
    }

}
