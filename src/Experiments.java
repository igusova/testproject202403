import shop.LiquidProduct;
import shop.Product;
import shop.ProductType;
import shop.ShoppingCart;

public class Experiments {
    public static void main(String[] args) {

        Container container = new Container(100, true);

        Product snickers = new Product("Сникерс", 89);
        snickers.setType(ProductType.SNACK);

        Product bounty = new Product("Баунти", 95);
        bounty.setType(ProductType.SNACK);

        Product lemonTea = new LiquidProduct("Лимонный чай", 45);
        lemonTea.setType(ProductType.ALCOHOL);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(snickers, 2);
        cart.addProduct(bounty);
        cart.addProduct(snickers, 5);
        cart.addProduct(lemonTea, 3);

        System.out.println(cart);
        System.out.println("Created products: " + Product.getCount());
        System.out.println(cart.totalCost());

        cart.addProduct(snickers, 10);
        System.out.println(cart);
        System.out.println("Created products: " + Product.getCount());
        System.out.println(cart.totalCost());
    }
}
