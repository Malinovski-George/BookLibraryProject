package by.malinovski.library.objects;

import by.malinovski.library.dao.interfaces.BookDAO;
import by.malinovski.library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("singleton")
public class LibraryFacade {

    private List<Book> books;
    @Autowired
    private BookDAO bookDAO;
    @Autowired
    private SearchCriteria searchCriteria;


    public List<Book> getBooks() {
        if (books == null){
            books = bookDAO.getBooks();
        }
        return books;
    }

    public void searchBooksByLetter() {
        books = bookDAO.getBooks(searchCriteria.getLetter());
    }
}
