package com.zhaoyh.controller;

import com.zhaoyh.model.User;
import com.zhaoyh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zhaoyh on 2017/5/26.
 */
@Controller
public class MainController extends BaseController {

    @Autowired
    private IUserService userService;

    public static final String INDEX = "index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {

        User user = new User();
        user.setName("zhaoyh");
        user.setPhone("18811721028");
        userService.addUser(user);

        List<User> userList = userService.getUserByPhone("18811721028");
        System.out.println("......" + userList.size());

        return innerCreateModelAndView(INDEX, "userList", userList);
    }


}
