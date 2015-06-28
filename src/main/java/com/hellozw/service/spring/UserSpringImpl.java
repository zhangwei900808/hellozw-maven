package com.hellozw.service.spring;

import com.hellozw.dao.IUserDAO;
import com.hellozw.model.User;
import com.hellozw.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhangwei on 2015/6/27.
 */
@Service("userService")
public class UserSpringImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<User> getUser(String name, String password) {
        return userDAO.getUser(name, password);
    }
}
