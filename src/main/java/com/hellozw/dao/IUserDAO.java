package com.hellozw.dao;

import com.hellozw.model.User;

import java.util.List;

/**
 * Created by zhangwei on 2015/6/27.
 */
public interface IUserDAO {
    List<User> getUser(String name, String password);

    List<User> getUser(String activecode);

    boolean insertUser(User user);

    boolean updateUser(User user);
}
