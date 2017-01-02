package DAO;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class BookDAOImpl implements BookDAO {
    Session session;
    Transaction transaction;
    public BookDAOImpl() {
        session = new Factory().getFactory().openSession();
        transaction = session.beginTransaction();
    }

    @Override
    public void save(Book book) {
        session.save(book);
        transaction.commit();
    }

    @Override
    public void del(Book book) {
        session.delete(book);
        transaction.commit();
    }

    @Override
    public void update(Book book) {
        session.update(book);
        transaction.commit();
    }

    @Override
    public Book get(int id) {
        Book book = session.get(Book.class,id);
        transaction.commit();
        return book;
    }
}
