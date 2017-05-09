package com.example.hwm;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
@Component
@RestController
@RequestMapping("/hwm")
public class AddServer {
    @RequestMapping("/add")
    public String add()
    {
        System.out.println("add call");
        return "server added";
    }

    @RequestMapping("/show")
    public String show()
    {
        return "server added";
    }

    @RequestMapping("/del")
    public String del()
    {
        return "server added";
    }

    @RequestMapping("/update")
    public String update()
    {
        return "server added";
    }
}
