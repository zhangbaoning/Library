package DAO;

import entity.User;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public interface UserDAO {
    void save(User user);
    void del(User user);
    User get(int id);
    void update(User user);
}
