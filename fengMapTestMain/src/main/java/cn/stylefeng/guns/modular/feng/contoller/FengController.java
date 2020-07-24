package cn.stylefeng.guns.modular.feng.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feng")
@Slf4j
public class FengController {

    @RequestMapping("/ztFengMap")
    public String importIndex() {
        return "/feng/ztFengMap.html";
    }
}
