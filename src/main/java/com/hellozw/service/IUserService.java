package com.hellozw.service;

import com.hellozw.model.User;

import java.util.List;

/**
 * Created by zhangwei on 2015/6/27.
 */
public interface IUserService {
    List<User> getUser(String name, String password);
}
