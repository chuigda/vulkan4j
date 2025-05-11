package cc.design7.babel.codegen.ast

/**
 * A [JavaClassBuilder] is a stateful Java class builder
 */
interface JavaClassBuilder<E : JavaExpr, V : JavaVariable, AP : ArgumentProvider<V>, CB : JavaCodeBuilder<E, V, CB>, EB : JavaExprBuilder<E, V>, Self: JavaClassBuilder<E, V, AP, CB, EB, Self>> {
  fun Modifiers.methods(
    returnType: JavaType,
    methodName: IdentifyName,
    vararg parameters: Parameter,
    builder: CB.(AP) -> Unit,
  ): MethodData
  
  fun Modifiers.method(
    returnType: JavaType,
    methodName: IdentifyName,
    param0: Parameter,
    builder: CB.(V) -> Unit,
  ): MethodData {
    return methods(returnType, methodName, param0) { ap ->
      builder(ap[0])
    }
  }
  
  fun Modifiers.method(
    returnType: JavaType,
    methodName: IdentifyName,
    param0: Parameter,
    param1: Parameter,
    builder: CB.(V, V) -> Unit,
  ): MethodData {
    return methods(returnType, methodName, param0, param1) { ap ->
      builder(ap[0], ap[1])
    }
  }
  
  /**
   * Create a `public static final` field.
   */
  fun Modifiers.field(type: JavaType, fieldName: IdentifyName, initialValue: EB.() -> E)
}