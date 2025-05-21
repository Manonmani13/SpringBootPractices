package com.example.sb_redis_cache;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiice {
    HashOperations<String,Object,Object> opForHash=null;

    public UserServiice(RedisTemplate<String,User> redisTemplate){
        this.opForHash=redisTemplate.opsForHash();
    }

    public String addUser(User user){
        opForHash.put("USERS", user.getId(), user);
        return "User Added";
    }

    public User getUser(Integer userId){
        return  (User) opForHash.get("USERS", userId);
    }

    public Collection<User> getAllUSers(){
        Map<Integer,User> entries=opForHash.entries("USERS");
        return entries.values();
    }
    
}
