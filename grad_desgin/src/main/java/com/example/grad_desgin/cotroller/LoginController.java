package com.example.grad_desgin.cotroller;
import com.example.grad_desgin.mapper.UserMapper;
import com.example.grad_desgin.pojo.User;
import com.example.grad_desgin.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;
@Controller
public class  LoginController {
    @Autowired
    UserMapper userMapper;
    @CrossOrigin
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user = userMapper.getTest(username, requestUser.getPassword());

        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}