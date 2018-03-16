package interfaces;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    public static BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(Math.random() * 90).add(BigDecimal.TEN);
    }
}
