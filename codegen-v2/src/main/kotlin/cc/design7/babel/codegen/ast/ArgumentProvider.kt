package cc.design7.babel.codegen.ast

interface ArgumentProvider<V : JavaVariable> {
  operator fun get(index: Int): V
}