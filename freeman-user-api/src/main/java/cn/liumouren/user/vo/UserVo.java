package cn.liumouren.user.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 *
 * @author freeman
 * @date 2021/12/5 00:34
 */
@Data
@Accessors(chain = true)
public class UserVo {
    private String id;
    private String name;
    private Integer age;
}
