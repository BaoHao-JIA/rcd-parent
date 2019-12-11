package com.rcd.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("sys_user")
public class User extends Model<User> {
    private static final long serialVersionUID = 1L;

    /**
     * 用户主键id
     */
    @TableId("id")
    private String id;

    /**
     * 登陆账户
     */
    @TableField("login_name")
    private String loginName;

    /**
     * 登陆密码
     */
    @TableField("login_pwd")
    private String loginPwd;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户类型
     */
    @TableField("user_type")
    private String userType;

    /**
     * 备注
     */
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
