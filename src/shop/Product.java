package shop;

import java.util.Objects;

/**
 * POJO - plain old java object
 */
public class Product {
    public final static ProductType DEFAULT_TYPE = ProductType.COMMON;

    private final String name;
    private final int price;

    //TODO: learn access modifiers package and protected
    protected ProductType type;

    private static int count;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        type = DEFAULT_TYPE;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "shop.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type + '}';
    }
}
