package domain;

public enum StockCurrency {
    EUR ("euro", '€'),
    USD ("dollar", '$'),
    GBP ("pound", '£');

    String currencyName;
    char currencySymbol;

    StockCurrency(String currencyName, char currencySymbol) {
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public char getCurrencySymbol() {
        return currencySymbol;
    }
}


