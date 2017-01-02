package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangbaoning on 2016/12/20.
 */
public class Book {
    int bid;
    String bname;
    String publish; //出版社
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book() {
    }

    public Book(int bid, String bname, String publish) {
        this.bid = bid;
        this.bname = bname;
        this.publish = publish;
       // this.set = set;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

}
