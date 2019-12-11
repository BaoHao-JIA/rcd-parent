package com.rcd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rcd.entity.User;

public interface UserMapper extends BaseMapper<User> {

    /*@Select("selectUserList")
    List<User> selectUserList(Pagination page,String state);*/
}
