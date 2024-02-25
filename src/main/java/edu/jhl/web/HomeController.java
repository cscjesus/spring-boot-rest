package edu.jhl.web;

import edu.jhl.model.Home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class HomeController {
    @GetMapping()
    public Home hello(){
        Home home = new Home("Hello World!!");
        return home;
    }
}
