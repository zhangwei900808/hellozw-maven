package com.hellozw.dao;

import com.hellozw.model.User;

import java.util.List;

/**
 * Created by zhangwei on 2015/6/27.
 */
public interface IUserDAO {
    List<User> getUser(String name, String password);
}
