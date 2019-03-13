package com.example.mosu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/greeting")
    public Map<Object, Object> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Map<Object, Object> resMap = new HashMap<>();
        resMap.put("hello", "mosu");
        return resMap;
    }

}
