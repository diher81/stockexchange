package api;

import domain.Stock;

public class StockMapper {

    public static StockDto stockMapper(Stock stock) {
        return new StockDto(stock.getId(), stock.getName(), stock.getPrice().getPrice().intValue());
    }
}
