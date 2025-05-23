package com.example.sb_redis_cache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory jcf=new JedisConnectionFactory();
        return jcf;
    }

    @Bean
    RedisTemplate<String,User> redisTemplate(){
        RedisTemplate<String,User> redisTemplate=new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    
}
