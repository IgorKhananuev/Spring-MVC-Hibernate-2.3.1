package web.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.User;
import web.userService.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUser(ModelMap modelMap){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "1", "1", "1", "1"));
        modelMap.addAttribute("users", users);
      return "users";
    };

}
