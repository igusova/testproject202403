package shop;

public class LiquidProduct extends Product {
    public LiquidProduct(String name, int price) {
        super(name, price);
        type = ProductType.DRINK;
    }

    @Override
    public void setType(ProductType type) {}
}
