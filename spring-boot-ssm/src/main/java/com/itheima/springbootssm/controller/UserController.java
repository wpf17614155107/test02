package com.itheima.springbootssm.controller;



import com.itheima.springbootssm.entity.User;
import com.itheima.springbootssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author mcm
 * 2020/7/5 11:59
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // 注入UserService
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        User user = userService.getById(id);
        if (user == null) {
            return new User();
        }
        return user;
    }

    @PostMapping
    public Integer save(@RequestBody User user) {
        user.setUpdateTime(new Date());
        userService.save(user);
        return user.getId();
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable int id) {
        boolean boo = userService.removeById(id);
        return boo;
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id ,@RequestBody User user) {
        user.setId(id);
        user.setUpdateTime(new Date());
        boolean boo = userService.updateById(user);
        return boo;
    }
}
