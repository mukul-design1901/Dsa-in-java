package com.mukul.properties.inheritance;

public class BoxPrize extends BoxofWeight {
    double cost;

    public BoxPrize() {
        super();
        this.cost = 1000;
    }

    public BoxPrize(double lenght, double widht, double height, double weight, double cost) {
        super(lenght, widht, height, weight);
        this.cost = cost;
    }

}
