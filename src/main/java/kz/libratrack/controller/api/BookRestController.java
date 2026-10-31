package kz.libratrack.controller.api;

import kz.libratrack.dto.BookDto;
import kz.libratrack.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookRestController {

    private final BookService bookService;

    @GetMapping
    public List<BookDto> search(@RequestParam(required = false) String q) {
        return bookService.search(q).stream().map(BookDto::from).toList();
    }

    @GetMapping("/{id}")
    public BookDto getById(@PathVariable Long id) {
        return BookDto.from(bookService.getById(id));
    }
}
