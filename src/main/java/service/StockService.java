package service;

import domain.Stock;
import domain.StockRepository;
import interfaces.ExternalStockInformationService;

public class StockService {

    StockRepository stockRepository;

    public StockService() {
        this.stockRepository = new StockRepository();
    }

    public Stock getStock(String stockId) throws IllegalArgumentException {
        Stock stock = stockRepository.getStockInformation(stockId);
        stock.setPriceInEuro(ExternalStockInformationService.getPriceInEuroForStock(stockId));
        return stock;
        }
}
