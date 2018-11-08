package com.sadhen.spring.boot.config

import org.springframework.context.annotation.{Configuration, PropertySource}

@Configuration
@PropertySource(value = Array("classpath:crontab.conf"), factory = classOf[TypesafePSFactory])
class PropertyLoader
