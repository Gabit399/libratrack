package kz.libratrack.config;

import kz.libratrack.entity.Book;
import kz.libratrack.entity.Genre;
import kz.libratrack.repository.BookRepository;
import kz.libratrack.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** Fills an empty database with a few demo books. */
@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final GenreRepository genreRepository;

    @Override
    public void run(String... args) {
        if (bookRepository.count() > 0) {
            return;
        }
        Genre cs = genreRepository.save(Genre.builder().name("Computer Science").build());
        Genre fiction = genreRepository.save(Genre.builder().name("Fiction").build());

        bookRepository.save(book("Clean Code", "Robert C. Martin", "978-0132350884", 3, "Hall B · Shelf 12", cs));
        bookRepository.save(book("Spring in Action", "Craig Walls", "978-1617297571", 4, "Hall B · Shelf 14", cs));
        bookRepository.save(book("Effective Java", "Joshua Bloch", "978-0134685991", 2, "Hall B · Shelf 13", cs));
        bookRepository.save(book("Abai Joly", "Mukhtar Auezov", "978-6010321837", 2, "Hall A · Shelf 3", fiction));
    }

    private Book book(String title, String author, String isbn, int copies, String shelf, Genre genre) {
        return Book.builder()
                .title(title).author(author).isbn(isbn)
                .totalCopies(copies).availableCopies(copies)
                .shelfLocation(shelf).genre(genre)
                .build();
    }
}
