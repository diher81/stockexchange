package domain;

import java.math.BigDecimal;

public class StockPrice {
    private BigDecimal price;
    private StockCurrency currency;

    public BigDecimal getPrice() {
        return price;
    }

    public StockCurrency getCurrency() {
        return currency;
    }
}
