package domain;

import java.math.BigDecimal;

public class Stock {
    private String id;
    private String name;
    private StockPrice price;
    private BigDecimal priceInEuro;

    public Stock(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Stock(String id, String name, StockPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StockPrice getPrice() {
        return price;
    }

    public void setPriceInEuro(BigDecimal priceInEuro) {
        this.priceInEuro = priceInEuro;
    }
}
