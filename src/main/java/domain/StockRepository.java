package domain;

import java.util.Map;

public class StockRepository {
    private Map<String, Stock> fakeDatabase;

    public StockRepository() {
        fakeDatabase.put("AA", new Stock("AA", "Ambro AN"));
        fakeDatabase.put("BB", new Stock("BB", "Bank"));
        fakeDatabase.put("CC", new Stock("CC", "CityBank"));
        fakeDatabase.put("DD", new Stock("DD", "Dexia"));
        fakeDatabase.put("EE", new Stock("EE", "Expensive Bank"));
    }

    public Stock getStockInformation(String stockId) throws IllegalArgumentException{
        if (fakeDatabase.containsKey(stockId)) {
            return fakeDatabase.get(stockId);
        } else {
            throw new IllegalArgumentException("stockId not found.");
        }
    }
}
