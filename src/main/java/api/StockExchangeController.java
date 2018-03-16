package api;

import service.StockService;

public class StockExchangeController {

    StockService stockService;

    public StockExchangeController() {
        this.stockService = new StockService();
    }

    public StockDto getStock(String stockId) {
        return StockMapper.stockMapper(stockService.getStock(stockId));
    }
}
