package by.malinovski.library.dao.interfaces;


import by.malinovski.library.entities.Author;
import by.malinovski.library.entities.Book;
import by.malinovski.library.entities.Genre;

import java.util.List;


public interface BookDAO {

    List<Book> getBooks();

    List<Book> getBooks(Author author);

    List<Book> getBooks(String bookName);

    List<Book> getBooks(Genre genre);

    List<Book> getBooks(Character letter);

}
