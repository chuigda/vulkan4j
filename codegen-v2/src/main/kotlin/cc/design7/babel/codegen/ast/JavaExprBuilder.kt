package cc.design7.babel.codegen.ast

/**
 * A [JavaExprBuilder] is a stateless (or almost stateless, if we support lambda expression) Java expression factory.
 */
interface JavaExprBuilder<E : JavaExpr, V : JavaVariable> {
  operator fun E?.invoke(methodData: MethodData, vararg arguments: E): E
  
  fun invoke(methodData: MethodData, vararg arguments: E): E {
    return null.invoke(methodData, *arguments)
  }
  
  fun V.ref(): E
  
  val self: E
  
  fun makeArray(type: JavaType, length: E): E
  // array length
  fun E.length(): E
  operator fun E.get(index: E): E
  operator fun E.get(index: Int): E {
    return get(iconst(index))
  }
  
  fun iconst(i: Int): E
  
  fun checkcast(expr: E, targetType: JavaType): E
  
  fun E.field(fieldData: FieldData): E
  
  fun E.le(than: E): E
}