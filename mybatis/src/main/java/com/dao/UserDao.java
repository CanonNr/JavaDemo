package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from users")
    List<User> getAll();
}
