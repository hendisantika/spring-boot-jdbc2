/**
 * 
 */
package com.hendisantika.controller;

import com.hendisantika.model.User;
import com.hendisantika.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hendisantika
 *
 */
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
    User home(User user) {
		user = userService.create(user);
        return user;
    }
	
	@RequestMapping("/users")
    List<User> findAllUsers() {
		List<User> users = userService.findAll();
        return users;
    }
}
