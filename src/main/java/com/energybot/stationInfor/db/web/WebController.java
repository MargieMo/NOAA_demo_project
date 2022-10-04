package com.energybot.stationInfor.db.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/home")
    public String successTest(){
        return "home";
    }
}
