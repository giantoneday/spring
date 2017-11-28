package com.zhaoyh.service;
        import com.zhaoyh.model.User;
        import com.zhaoyh.model.UserExample;
        import com.zhaoyh.model.UserModel;
        import com.zhaoyh.storage.UserMapper;
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
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public List<User> getUserByPhone(String phone) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPhoneEqualTo(phone);
        return userMapper.selectByExample(userExample);
    }

}
