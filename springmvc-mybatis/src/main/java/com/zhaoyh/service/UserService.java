package com.zhaoyh.service;
        import com.zhaoyh.model.User;
        import com.zhaoyh.storage.UserStorage;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

/**
 * Created by zhaoyh on 2017/5/26.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserStorage userStorage;

    public void addUser(User user) {
        userStorage.addUser(user.getName(), user.getPhone());
    }

    public List<User> getUserByPhone(String phone) {
        return userStorage.queryUserByPhone(phone);
    }

}
