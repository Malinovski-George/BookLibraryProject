package by.malinovski.library.interfaces;

import by.malinovski.library.objects.Author;
import by.malinovski.library.objects.Book;
import by.malinovski.library.objects.Genre;

import java.util.List;

public interface BookSearch {

    /*
    * весь список книг*/
    List<Book> getBooks();

    List<Book> getBooks(Author author);

    List<Book> getBooks(String bookName);

    /*
    * поиск по жанру*/
    List<Book> getBooks(Genre genre);

    /*
    * Поиск по первой букве*/
    List<Book> getBooks(Character letter);

}
