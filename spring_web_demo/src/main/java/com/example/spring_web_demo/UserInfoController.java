package com.example.spring_web_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody UserInfo user) {
        if (user.isEnabled()) {
            return String.format("Hello! %s. Your account is enabled.", user.getName());

        } else {
            return String.format(
                    "Hello! Nice to see you, %s! Your account is disabled",
                    user.getName()
            );
        }
    }


    @PostMapping("/users")
    public String userStatus(@RequestBody List<UserInfo> userList) {
        return String.format("Added %d users", userList.size());
    }
}