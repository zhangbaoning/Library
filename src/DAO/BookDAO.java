package DAO;

import entity.Book;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public interface BookDAO {
    void save(Book book);
    void del(Book book);
    void update(Book book);
    Book get(int id);
}
