package com.example.firstMvc1101;

import com.example.data.AuthorRepository;
import com.example.data.ProductsRepository;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/products")
public class ProductController {

    private ProductsRepository repo;

    public ProductController() {
        repo = new ProductsRepository();
    }

    @GetMapping("")
    public String getProducts(Model model) {
        model.addAttribute("products", repo.getProducts());
        return "products";
    }

    @GetMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", repo.getBooks());

        return "books";
    }

    @GetMapping("/magazines")
    public String getMagazines(Model model) {

        model.addAttribute("magazines", repo.getMagazines());

        return "magazines";
    }
}
