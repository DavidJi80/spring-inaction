package net.tongark.spring.webmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworldController {
    /**
     * 1. 使用RequestMapping注解来映射请求的URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图,
     * 对于InternalResourceViewResolver视图解析器，会做如下解析 通过prefix+returnValue+suffix
     * 这样的方式得到实际的物理视图，既组成"/WEB-INF/result.jsp"  然后会返回给dispatchservlet
     */

    @RequestMapping("/click")
    public String hello() {
        System.out.println("hello world");
        return "result";
    }

}
