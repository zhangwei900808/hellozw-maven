package com.hellozw.service.spring;

import com.hellozw.dao.IUserDAO;
import com.hellozw.model.User;
import com.hellozw.service.IUserService;
import com.hellozw.util.EmailUtil;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<User> getUser(String activecode) {
        return userDAO.getUser(activecode);
    }

    @Override
    public boolean insertUser(User user) {
        return userDAO.insertUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userDAO.updateUser(user);
    }

    @Override
    public boolean validateEmail(String activecode) {
        List<User> user = userDAO.getUser(activecode);
        if (user.size() > 0) {
            for (User u : user) {
                if (u.getIsActivate() == 1) {
                    return false;
                } else {
                    u.setIsActivate(1);
                    userDAO.updateUser(u);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * todo:发送Email
     * @param username
     * @param email
     * @param password
     * @return
     * @throws Exception
     */
    @Override
    public boolean sendEmail(String username, String email, String password)  throws Exception {
        EmailUtil emailUtil = new EmailUtil("zhangwei900808@163.com", "@ZhangWei163");

        User user = new User();
        //设置激活码
        UUID id = UUID.randomUUID();
        user.setActiveCode(id.toString());
        user.setPassword(password);
        user.setIsActivate(0);
        user.setCreateDt(new Timestamp(System.currentTimeMillis()));
        user.setEmail(email);
        user.setName(username);
        user.setUpdateDt(new Timestamp(System.currentTimeMillis()));

        boolean data = emailUtil.sendEmail(email, "来自Awbeci的注册邮件",
                "<html><head></head><body><p>您好,<br>" +
                        "感谢您通过Awbeci注册.<br>" +
                        "点击以下链接验证您的邮箱地址：</p>" +
                        "<a href='http://localhost:8080/validate/validateEmail.html?activecode=" + id + "'>" +
                        "http://localhost:8080/validate/validateEmail.html?activecode=" + id + "</a>" +
                        "</body></html>");
        //邮件发送成功
        if (data) {
            userDAO.insertUser(user);
            return true;
        }
        else {
            return false;
        }
    }
}
