package com.example.firstMvc1101;

import com.example.data.Author;
import com.example.data.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.StreamSupport;

@Controller
@RequestMapping(value = "/authors")
public class AuthorController {
    @GetMapping("")
    public String getAuthors(Model model) {

        var ar = new AuthorRepository();

        model.addAttribute("authors", ar.getAuthors());

        return "authors";
    }

    @GetMapping("/{id}")
    public String getAuthor(Model model, @PathVariable int id) {

        var ar = new AuthorRepository();

        var author = StreamSupport
                .stream(ar.getAuthors().spliterator(), false)
                .filter(a -> a.getId() == id).findFirst();

        if(author.isPresent()) {
            model.addAttribute("author", author.get());
        } else {
            model.addAttribute("author", new Author());
        }

        return "author-details";
    }
}
