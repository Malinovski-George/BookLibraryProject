package by.malinovski.library.interfaces;


import by.malinovski.library.entities.Book;

public interface EditBook {

    boolean save(Book book);  //? vs add

    boolean delete(Book book);

    boolean edit(Book book);

    boolean add(Book book);

}
