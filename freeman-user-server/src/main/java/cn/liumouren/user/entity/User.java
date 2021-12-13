package cn.liumouren.user.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;

/**
 *
 *
 * @author freeman
 * @date 2021/12/6 13:13
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity(name = "user")
public class User {

    @Id
    private String id;
    private String name;
    @Enumerated(STRING)
    private Sex sex;
    private String phone;

}
