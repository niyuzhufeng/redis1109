package com.atguigu.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author layne
 * @create 2021-03-29 14:45
 */
public class JedisTest {
    public static void main(String[] args) {
        //1 创建客户端
        Jedis jedis = new Jedis("hadoop102",6379);

        //2 测试
        String ping = jedis.ping();

        System.out.println(ping);



        String s = jedis.set("jedistest", "1109nb");
        String jedistest = jedis.get("jedistest");

        System.out.println(jedistest);

        Set<String> keys = jedis.keys("*");

        System.out.println(keys);


        //3 关闭资源
        jedis.close();
    }
}
