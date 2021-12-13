package cn.liumouren.user.controller;

import cn.liumouren.boot.common.anno.UserId;
import cn.liumouren.user.api.UserApi;
import cn.liumouren.user.dao.UserDao;
import cn.liumouren.user.entity.User;
import cn.liumouren.user.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * @author freeman
 * @date 2021/12/5 00:38
 */
@RestController
public class UserController implements UserApi {

    @Autowired
    private UserDao userDao;

    @Override
    @GetMapping("/from_header")
    public UserVo getUserById(@UserId String userId) {
        return new UserVo()
                .setId(userId)
                .setAge(21)
                .setName("freeman");
    }

    @Override
    @GetMapping("/")
    public UserVo getUser(@UserId String userId) {
        return new UserVo()
                .setId(userId)
                .setAge(21)
                .setName("freeman");
    }

    @PostMapping("/")
    public User save(@RequestBody User user) {
        return userDao.save(user);
    }

    @GetMapping("/{id}")
    public User get(@PathVariable String id) {
        return userDao.findById(id).orElse(null);
    }

}
