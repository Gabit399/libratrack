package kz.libratrack.dto;

import kz.libratrack.entity.Book;

public record BookDto(Long id, String title, String author, String isbn,
                      int availableCopies, int totalCopies, String shelfLocation) {

    public static BookDto from(Book book) {
        return new BookDto(book.getId(), book.getTitle(), book.getAuthor(), book.getIsbn(),
                book.getAvailableCopies(), book.getTotalCopies(), book.getShelfLocation());
    }
}
