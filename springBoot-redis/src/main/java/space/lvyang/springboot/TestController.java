package space.lvyang.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TestController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("test")

    public String tets(){
         stringRedisTemplate.opsForValue().set("test:hello","world",60*3, TimeUnit.SECONDS);
         return "hello word";
    }
}
