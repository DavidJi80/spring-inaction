package net.tongark.webmvc.config.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest")
public class HelloRestController {

    @GetMapping("/t?st.html")
    public String uriWithQuestionMark(){
        return "带?的，t?st.html";
    }

    @GetMapping(path = "hello")
    public String testGetStr() {
        return "Hello REST Controller!";
    }

    /**
     * map转json
     * spring mvc默认使用的事jackson来转换json，
     * 需要添加jackson依赖不然会报错
     *
     * @return
     */
    @GetMapping("/map")
    public Map testGetMap() {
        return new HashMap<String, String>() {{
            put("name", "springboot");
        }};
    }

}
