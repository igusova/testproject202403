package shop;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<Product, Integer> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    //TODO: create method, calculating
    // total cost of products in the cart
    public Integer totalCost() {
        int totalCost = 0;
        for(Product product : products.keySet()) {
             totalCost += product.getPrice() * products.get(product);
        }
        return totalCost;
    }

    //TODO: make this method really adding products,
    //  not replacing
    public void addProduct(Product product, int count) {
        if (count <= 0) {
            return;
        }
        if (products.containsKey(product)) {
            int currentCount = products.get(product) + count;
            products.put(product, currentCount);
            return;
        }
        products.put(product, count);
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }

    @Override
    public String toString() {
        String info = "";
        for(Product product : products.keySet()) {
            info += product + " - " + products.get(product) + "\n";
        }
        return info;
    }
}
