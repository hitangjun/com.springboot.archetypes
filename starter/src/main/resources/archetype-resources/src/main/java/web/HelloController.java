package ${package}.web;

import ${package}.common.Manifest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "服务启动ok");
        return "index";
    }

    @RequestMapping("/manifest")
    public Object manifest(Model model) {
        return new Manifest();
    }
    
}
