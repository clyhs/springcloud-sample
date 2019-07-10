package com.springcloud.ribbon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 
 * @author abigfish
 *
 * @date 2019年7月10日
 * 实现session共享，存在redis中，通过zuul访问，自动生成session到redis中
 */

@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}