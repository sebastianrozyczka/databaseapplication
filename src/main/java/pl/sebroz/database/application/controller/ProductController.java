package pl.sebroz.database.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sebroz.database.application.model.Product;
import pl.sebroz.database.application.repository.ProductRepository;

import java.util.List;

@Controller
public class ProductController {
    ProductRepository productRepository;
    List<Product> products;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public String products(Model model) {
        products = productRepository.getAll();
        model.addAttribute("products", products);
        return "products";
    }
}
