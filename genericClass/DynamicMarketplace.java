abstract class Category {}
class BookCategory extends Category {}
class ClothingCategory extends Category {}
class GadgetCategory extends Category {}
class Product<T extends Category> {
    double price; Product(double price){this.price=price;} double getPrice(){return price;}
}
public class DynamicMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        double discounted = product.getPrice() - product.getPrice()*percent/100;
        System.out.println("Discounted price: " + discounted);
    }
    public static void main(String[] args){
        Product<BookCategory> book = new Product<>(500);
        applyDiscount(book,10);
    }
}