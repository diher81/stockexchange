package api;

public class StockDto {

    private String id;
    private String name;
    private int price;

    public StockDto(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
