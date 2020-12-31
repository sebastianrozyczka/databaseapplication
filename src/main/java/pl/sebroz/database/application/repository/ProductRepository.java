package pl.sebroz.database.application.repository;

import org.springframework.stereotype.Repository;
import pl.sebroz.database.application.model.Category;
import pl.sebroz.database.application.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("Corona Export", "Mexican Beer, 330ml", 5.0, 4.5, true, Category.BEER));
        products.add(new Product("Belvedere", "Pure Vodka, 700ml", 98.0, 40.0, true, Category.VODKA));
        products.add(new Product("Proper Twelve", "Irish Whiskey, 700ml", 105.0, 40.0, true, Category.WHISKEY));
        products.add(new Product("Martini Asti", "Sparkling Wine, 750ml", 33.0, 8.5, false, Category.WINE));
        products.add(new Product("Coca cola", "Fizzy Drink, 330ml", 2.5, 0.0, false, Category.OTHER));
    }

    public List<Product> getAll() {
        return products;
    }

    public List<Product> getByCategory(String category) {
        return products.stream()
                .filter(product -> product.getCategory().getName().equals(category))
                .collect(Collectors.toList());
    }

    public void add(Product product) {
        products.add(product);
    }
}
