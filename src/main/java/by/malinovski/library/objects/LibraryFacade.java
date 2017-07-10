package by.malinovski.library.objects;

import by.malinovski.library.dao.interfaces.BookDAO;
import by.malinovski.library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibraryFacade {

    private BookDAO bookDAO;
    private List<Book> books;

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
        books = bookDAO.getBooks();
    }

    public List<Book> getBooks() {
        return books;
    }
}
