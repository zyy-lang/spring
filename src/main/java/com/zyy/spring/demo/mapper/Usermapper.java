package com.zyy.spring.demo.mapper;

import com.zyy.spring.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Usermapper {
    @Insert("INSERT INTO tab(name,password)  VALUES(#{name},#{password})")
    int saveUser(@Param("name") String name,@Param("password") String password);

    @Select("select id,name,password from tab where name=#{name}")
    User selectUser(@Param("name") String name);
}
