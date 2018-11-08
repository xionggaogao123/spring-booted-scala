package com.sadhen.spring.boot.config


import java.io.IOException

import org.springframework.core.env.PropertySource
import org.springframework.core.io.support.{EncodedResource, PropertySourceFactory}
import com.typesafe.config.ConfigFactory
import com.typesafe.config.ConfigParseOptions
import com.typesafe.config.ConfigResolveOptions

class TypesafePSFactory extends PropertySourceFactory {

  @throws[IOException]
  override def createPropertySource(name: String, resource: EncodedResource): PropertySource[_] = {
    val config = ConfigFactory
      .load(
        resource.getResource.getFilename,
        ConfigParseOptions.defaults.setAllowMissing(false),
        ConfigResolveOptions.noSystem
      ).resolve()
    val safeName = Option(name).getOrElse("typeSafe")
    new TypesafePS(safeName, config)
  }
}
