package demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author tuananh 2/28/2018
 * api_demo
 * demo.controller
 */
@Controller
public class WelcomeController {
    @Value("${welcome.message:test}")
    private String message = "Hello World";
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }
}
