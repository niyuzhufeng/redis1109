package com.atguigu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

/**
 * @author layne
 * @create 2021-03-29 14:49
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        //1 创建一个连接池
        JedisPool jedisPool = new JedisPool("hadoop102", 6379);

        //2 利用连接池获得一个客户端
        Jedis jedis = jedisPool.getResource();

        //3 测试
        System.out.println(jedis.ping());

        String s = jedis.set("jedistest", "1109znb");
        String jedistest = jedis.get("jedistest");

        System.out.println(jedistest);

        Set<String> keys = jedis.keys("*");

        System.out.println(keys);

        //4 关闭资源
        jedis.close();
        jedisPool.close();
    }
}
