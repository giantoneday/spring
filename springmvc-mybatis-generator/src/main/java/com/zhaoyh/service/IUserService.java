package com.zhaoyh.service;

import com.zhaoyh.model.User;
import com.zhaoyh.model.UserModel;

import java.util.List;

/**
 * Created by zhaoyh on 2017/5/26.
 */
public interface IUserService {

    void addUser(User user);

    List<User> getUserByPhone(String phone);
}
