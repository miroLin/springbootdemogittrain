package com.linmr.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @author linmr
 * @version 1.0
 * @date 2020-3-18  15:48
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //这个是类注解,表示该类实例化的对象里，值为null的字段不参与序列化
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -5004138112563714345L;
    private Integer id;
    private String username;
    private String password;
    @JsonIgnore //JsonIgnore注解 表示 每次json处理都忽略createTime属性
    private String optTime;
}
