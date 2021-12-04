package cn.liumouren.user;

import cn.liumouren.user.api.UserApi;
import cn.liumouren.user.vo.UserVo;
import feign.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * starter
 *
 * @author freeman
 * @date 2021/12/5 12:32 AM
 */
@SpringBootApplication
@EnableFeignClients
public class UserApp implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }

    @Autowired
    private UserApi controller;
    @Autowired
    @Qualifier("cn.liumouren.user.api.UserApi")
    private UserApi api;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UserVo userVo = controller.getUserById("001");
        System.out.println(userVo);
        UserVo vo = api.getUserById("002");
        System.out.println(vo);
        UserVo v = api.getUser("003");
        System.out.println(v);
    }

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
