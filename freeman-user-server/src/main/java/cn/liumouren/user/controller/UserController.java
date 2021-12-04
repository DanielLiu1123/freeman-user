package cn.liumouren.user.controller;

import cn.liumouren.boot.common.anno.UserId;
import cn.liumouren.user.api.UserApi;
import cn.liumouren.user.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author freeman
 * @date 2021/12/5 00:38
 */
@RestController
public class UserController implements UserApi {

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

}
