package com.yhy.demo.mapper;

import com.yhy.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user_t")
    List<User> getAll();

    @Select("Select * from user_t where name = #{name}")
    List<User> getOne(String name);

    @Insert("Insert into user_t(name,password) VALUES(#{name},#{password})")
    void insert(User user);
}
