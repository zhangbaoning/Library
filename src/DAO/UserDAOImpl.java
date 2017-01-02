package DAO;

import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class UserDAOImpl implements UserDAO {
    Session session;
    Transaction transaction;
    public UserDAOImpl() {
         session = new Factory().getFactory().openSession();
        transaction = session.beginTransaction();
    }

    @Override
    public void save(User user) {
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void del(User user) {
        session.delete(user);
        transaction.commit();
    }

    @Override
    public User get(int id) {
        return session.get(User.class,id);
    }

    @Override
    public void update(User user) {
        session.update(user);
        transaction.commit();
    }

}
