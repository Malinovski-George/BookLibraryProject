package by.malinovski.library.dao.impl;

import by.malinovski.library.dao.interfaces.BookDAO;
import by.malinovski.library.entities.Author;
import by.malinovski.library.entities.Book;
import by.malinovski.library.entities.Genre;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<Book> books;


    @Transactional
    @Override
    public List<Book> getBooks() {

        books = (List<Book>) sessionFactory.getCurrentSession()
                .createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        System.out.println(books);
        return books;
    }

    @Override
    public List<Book> getBooks(Author author) {
        return null;
    }

    @Override
    public List<Book> getBooks(String bookName) {
        return null;
    }

    @Override
    public List<Book> getBooks(Genre genre) {
        return null;
    }

    @Override
    public List<Book> getBooks(Character letter) {
        return null;
    }

}
