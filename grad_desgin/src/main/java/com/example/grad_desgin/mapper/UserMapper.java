package com.example.grad_desgin.mapper;
import com.example.grad_desgin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User findByUsername(String username);
    User getTest(String username,String password);
    @Select("select *from person")
    public List<User> getAllUser();
}
