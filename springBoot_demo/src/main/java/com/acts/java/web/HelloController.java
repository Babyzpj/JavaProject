package com.acts.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 科帮网  小柒 
 * http://www.52itstyle.com
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
    public String   greeting(ModelMap map) {
		map.addAttribute("host", "http://blog.52itstyle.com");   //host为前端页面hello.html的中"科帮网"的超链接
        map.addAttribute("name", "其实我是个演员");
        map.addAttribute("sex","搞笑，我只是个页面，那有什么性别");
        return "hello";
    }
}
