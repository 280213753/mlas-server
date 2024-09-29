package com.qcc.fuson.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class DistributedIdGenerator {

    private final StringRedisTemplate stringRedisTemplate;
    private final AtomicLong counter = new AtomicLong(0L);

    @Autowired
    public DistributedIdGenerator(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public long generateId() {
        String key = "distributed_id";
        String value = stringRedisTemplate.opsForValue().get(key);
        if (value == null) {
            stringRedisTemplate.opsForValue().set(key, "0");
            value = "0";
        }
        long id = Long.parseLong(value);
        id = counter.incrementAndGet();
        stringRedisTemplate.opsForValue().set(key, String.valueOf(id));
        return id;
    }
}