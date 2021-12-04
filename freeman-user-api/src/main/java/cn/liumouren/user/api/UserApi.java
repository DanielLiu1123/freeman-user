package cn.liumouren.user.api;

import cn.liumouren.boot.common.anno.UserId;
import cn.liumouren.user.vo.UserVo;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 * @author freeman
 * @date 2021/12/5 00:32
 */
@FeignClient(value = "user", url = "http://localhost:8080")
public interface UserApi {

    /**
     * 根据 id 查找用户
     *
     * @param userId userId
     * @return UserVo
     */
    @GetMapping("/from_header")
    UserVo getUserById(@UserId String userId);

    /**
     * 根据 id 查找用户
     *
     * @param userId userId
     * @return UserVo
     */
    @RequestLine("GET /")
    UserVo getUser(@UserId String userId);
}
