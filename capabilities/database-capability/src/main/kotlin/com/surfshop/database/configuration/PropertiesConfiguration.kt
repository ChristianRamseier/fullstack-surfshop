package com.surfshop.database.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources
import javax.annotation.PostConstruct

@Configuration
@PropertySources(
        PropertySource("database-capability.properties"),
        PropertySource("database-capability-\${spring.profiles.active}.properties", ignoreResourceNotFound = true),
        PropertySource("database-capability-\${database.capability.profile}.properties", ignoreResourceNotFound = true)
)
class PropertiesConfiguration {

}
