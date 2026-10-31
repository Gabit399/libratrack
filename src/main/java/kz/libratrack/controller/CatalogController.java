package kz.libratrack.controller;

import kz.libratrack.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CatalogController {

    private final BookService bookService;

    @GetMapping({"/", "/books"})
    public String catalog(@RequestParam(required = false) String q, Model model) {
        model.addAttribute("books", bookService.search(q));
        model.addAttribute("q", q);
        return "catalog";
    }

    @GetMapping("/books/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.getById(id));
        return "book-details";
    }
}
