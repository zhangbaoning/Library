package DAO;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class Factory {
    public SessionFactory getFactory(){
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
        return  factory;
    }
}
