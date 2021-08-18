package com.surfshop.database.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources

@Configuration
@PropertySources(
        PropertySource("database-capability.properties"),
        PropertySource("database-capability-\${spring.profiles.active}.properties", ignoreResourceNotFound = true),
        PropertySource("database-capability-\${database.capability.profile}.properties", ignoreResourceNotFound = true)
)
class DatabasePropertiesConfiguration {

}
