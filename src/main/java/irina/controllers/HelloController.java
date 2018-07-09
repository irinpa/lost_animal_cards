package irina.controllers;

import irina.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public List<String> getHello(@PathVariable(name = "name") String foo, @RequestParam(required = false) Boolean caps) {
        String name = foo;
        if (caps != null && caps) {
            name = name.toUpperCase();
        }

        helloService.greet(name);

        return Collections.singletonList("hello " + name);
    }

    @PostMapping("/hello")
    public String createHello(@PathVariable(name = "name") String foo, @RequestParam(required = false) Boolean caps) {
        String name = foo;
        if (caps != null && caps) {
            name = name.toUpperCase();
        }

        helloService.greet(name);

        return "hello " + name;
    }
}
