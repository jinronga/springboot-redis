package cn.jinronga.redisdemo;


import cn.jinronga.redisdemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("mykey","java--redis");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @Test
    void contextLoads1(){
        User user = new User("jinronga", 20);
        redisTemplate.opsForValue().set("user",user);

        System.out.println(redisTemplate.opsForValue().get("user"));

    }


}
