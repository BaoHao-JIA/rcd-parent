package com.rcd.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
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
     * 用户主键
     */
    private String id;

    /**
     * 登陆账户
     */
    @TableId("login_name")
    private String loginName;

    /**
     * 登陆密码
     */
    @TableId("login_pwd")
    private String loginPwd;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户类型
     */
    @TableId("user_type")
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
