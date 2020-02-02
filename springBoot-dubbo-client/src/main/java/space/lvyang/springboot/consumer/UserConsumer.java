package space.lvyang.springboot.consumer;

import org.apache.dubbo.config.annotation.Reference;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import space.lvyang.springboot.service.UserInfo;

@Controller("/")
public class UserConsumer {

    @Reference(version="1.0.0")
    private UserInfo userInfo;

    @RequestMapping(value = "t")
    @ResponseBody
    public String dubboTest(){
        return "sim"+userInfo.ping();
    }
}
