package com.linmr.springboot.controller;

import com.linmr.springboot.entity.User;
import com.linmr.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-18  16:42
 */
@Controller
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path = "/{page}")
    public String execute(@PathVariable String page){
        return page;
    }

    /**
     * id查找用户
     * @param id 用户id
     * @param model 用户信息模板
     * @return 展示单用户信息
     */
    @GetMapping(path = "/show")
    public String findUserById(Integer id, Model model){
        User user = this.userService.find(id);
        log.info("当前查找到用户信息：" + user.toString());
        model.addAttribute("user",user);
        return "show";
    }

    @GetMapping(path = "/show/list")
    public String getUserList(Model model){
        List<User> users = this.userService.getUserList();
        model.addAttribute("user",users.get(0));
        return "show";
    }
}
