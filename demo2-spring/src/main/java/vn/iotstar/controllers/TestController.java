package vn.iotstar.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vn.iotstar.entity.UserInfo;
import vn.iotstar.service.UserService;

@RestController
public class TestController {
	private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/add")
    public ResponseEntity<String> addUser(@RequestBody UserInfo userInfo) {
        return ResponseEntity.ok(userService.addUser(userInfo));
    }
}
