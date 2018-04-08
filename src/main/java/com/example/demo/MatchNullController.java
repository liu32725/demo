package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;


@Controller
public class MatchNullController {
    @RequestMapping("/match")
    @ResponseBody
    public String match(@RequestParam("code") String code){
        String str = code.trim();
        List<String> list1 = Arrays.asList("空", "没", "无");
        List<String> list2 = Arrays.asList("—", "-");
        if(str.isEmpty()) {
            return "输入不合法";
        }
        for (String s : list1) {
            if (s.equals(str)){
                return "输入不合法";
            }
        }
        for (String s : list2) {
            if(str.contains(s)){
                return "输入不合法";
            }
        }

        return "输入合法";
    }
}
