package com.hellozw.dao.hibernate;

import com.hellozw.dao.IUserDAO;
import com.hellozw.model.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangwei on 2015/6/27.
 */
@Repository("userDAO")
public class UserHibernateDAO extends HibernateDaoSupport implements IUserDAO {
    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public List<User> getUser(String name, String password) {
        try {
            String sql = "";
            if (name.indexOf('@') != -1) {
                sql = "from User u where u.email=? and u.password=?";
            } else {
                sql = "from User u where u.name=? and u.password=?";
            }
            return (List<User>) getHibernateTemplate().find(sql,
                    new String[]{name, password});
        } catch (Exception e) {
            System.out.println("getUser：" + e.getMessage());
            return null;
        }
    }

    public List<User> getUser(String activecode) {
        try {
            String sql = "from User u where u.activeCode=?";
            return (List<User>) getHibernateTemplate().find(sql, activecode);
        } catch (Exception e) {
            System.out.println("getUser：" + e.getMessage());
            return null;
        }
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public boolean insertUser(User user) {
        try {
            getHibernateTemplate().save(user);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        try {
            getHibernateTemplate().update(user);
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }
}

