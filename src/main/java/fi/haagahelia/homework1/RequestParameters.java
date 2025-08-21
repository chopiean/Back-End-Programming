package fi.haagahelia.homework1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParameters {
    @GetMapping("/hello")
    public String sayHello (@RequestParam String location, @RequestParam String name){
        return "Welcome to the " + location + " " + name + "!";
    }
}