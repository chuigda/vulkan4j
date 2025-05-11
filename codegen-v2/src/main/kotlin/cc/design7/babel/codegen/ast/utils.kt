package cc.design7.babel.codegen.ast

typealias JavaType = String
typealias IdentifyName = String

data class Parameter(val name: IdentifyName, val type: JavaType) {
  override fun toString(): String {
    return "$type $name"
  }
}