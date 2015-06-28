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
}
