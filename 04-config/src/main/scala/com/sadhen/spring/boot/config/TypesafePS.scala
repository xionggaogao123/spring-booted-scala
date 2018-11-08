package com.sadhen.spring.boot.config

import org.springframework.core.env.PropertySource
import com.typesafe.config.Config

class TypesafePS(name: String, source: Config)
  extends PropertySource[Config](name, source) {

  override def getProperty(path: String): AnyRef = {
    if (path.contains(":") || path.contains("[")) null
    else if (source.hasPath(path)) source.getAnyRef(path)
    else null
  }
}

