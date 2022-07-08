package com.poc.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class RedisApplication

fun main(args: Array<String>) {
	runApplication<RedisApplication>(*args)
}
