package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.User;
import web.userService.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping(value = "/")
    public String IndexPage(ModelMap modelMap){
        List<String> message = new ArrayList<>();
        message.add("Start page");
        modelMap.addAttribute("message", message);
        return "index";
    }
}
