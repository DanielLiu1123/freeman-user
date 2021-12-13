package cn.liumouren.user.dao;

import cn.liumouren.user.entity.User;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

/**
 *
 *
 * @author freeman
 * @date 2021/12/6 13:15
 */
public interface UserDao extends JpaRepositoryImplementation<User, String> {

}
