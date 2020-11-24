package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String IndexPage(ModelMap modelMap){
        List<String> message = new ArrayList<>();
        message.add("Hello");
        modelMap.addAttribute("message", message);

        return "index";
    }

}
