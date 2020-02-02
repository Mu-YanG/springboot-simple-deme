package space.lvyang.springboot.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import space.lvyang.springboot.service.UserInfo;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserInfo.class)
public class UserService implements UserInfo{
    @Override
    public String ping() {
        return "ping sucess";
    }
}
