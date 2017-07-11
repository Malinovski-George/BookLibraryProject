package by.malinovski.library.objects;

import by.malinovski.library.dao.interfaces.BookDAO;
import by.malinovski.library.entities.Author;
import by.malinovski.library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("libraryFacade")
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

    public void searchBooksByGenre() {
        books = bookDAO.getBooks(searchCriteria.getGenre());
    }

    public void searchBooksByText() {

        switch (searchCriteria.getSearchType()){
            case TITLE:
                books = bookDAO.getBooks(searchCriteria.getText());
                break;
            case AUTHOR:
                books = bookDAO.getBooks(new Author(searchCriteria.getText()));
                break;
        }

    }

}
