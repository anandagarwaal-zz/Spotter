package com.example.archanmishra.spotter.async;

/**
 * Created by archan.mishra on 28/12/17.
 */

public class KoinexResponse {
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "symbol='" + symbol + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    private String symbol;

    private String price;

}
