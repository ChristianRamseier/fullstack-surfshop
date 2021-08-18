package com.surfshop.redis.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@Configuration
@PropertySources(
        PropertySource("redis-capability.properties"),
        PropertySource("redis-capability-\${spring.profiles.active}.properties", ignoreResourceNotFound = true),
        PropertySource("redis-capability-\${database.capability.profile}.properties", ignoreResourceNotFound = true)
)
class RedisPropertiesConfiguration {

}
