package kr.hs.study.redirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectForwardController {
    @GetMapping("/redirect")
    public String redirect(){
        return "redirect:result";
    }
    // redirect로 요청 했을 때 result로 주소를 변경해라

    @GetMapping("/result")
    public String result(){
        return "result";
    }

    @GetMapping("/forward")
    public String forward(){
        return "forward:result";
    }
}
