package cc.design7.babel.extract.gles2

import cc.design7.babel.registry.Command
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.IMergeable
import cc.design7.babel.registry.Identifier

data class GLESRegistryExt(
  val constantRequirements: Map<Identifier, Entity>,
  val commandRequirements: Map<Identifier, Command>,
) : IMergeable<GLESRegistryExt> {
  override fun merge(other: GLESRegistryExt): GLESRegistryExt {
    return GLESRegistryExt(
      constantRequirements + other.constantRequirements,
      commandRequirements + other.commandRequirements
    )
  }
}