package cc.design7.babel.codegen.ast

import kotlin.reflect.KProperty

/**
 * A [JavaCodeBuilder] is a stateful, scopeful code builder, its target is statement (in function body or anything similar).
 */
interface JavaCodeBuilder<E : JavaExpr, V : JavaVariable, Self : JavaCodeBuilder<E, V, Self>> : JavaExprBuilder<E, V> {
  class VariableDelegate<E : JavaExpr, V: JavaVariable, CB : JavaCodeBuilder<E, V, CB>>(
    val name: IdentifyName,
    val type: JavaType,
    val builder: CB
  ) {
    private val variable: V = builder.makeLocalVariable(type, name)
    
    operator fun getValue(thisRef: Any?, property: KProperty<*>): V {
      return variable
    }
    
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: E) {
      builder.updateLocalVariable(variable, value)
    }
  }
  
  /**
   * Create a local variable declaration
   * @param initialValue the initial value of the local variable, null if do not initialize.
   */
  fun makeLocalVariable(type: JavaType, name: IdentifyName, initialValue: E? = null) : V
  fun updateLocalVariable(variable: V, value: E)
  
  @Suppress("UNCHECKED_CAST")
  fun variable(name: IdentifyName, type: JavaType): VariableDelegate<E, V, Self> {
    return VariableDelegate(name, type, this as Self)
  }
  
  fun updateArray(array: E, index: E, value: E)
  
  /**
   * Create a for loop on an `int` variable, the post action is always `[name] ++`
   */
  fun forLoop(name: IdentifyName, initialValue: E, condition: (V) -> E, block: Self.(V) -> Unit)
  
  fun ret(value: E? = null)
  
  /**
   * Execute a Java expression, this is used to ignore the result value.
   */
  fun exec(value: E)
  
  operator fun E.unaryPlus() {
    exec(this)
  }
}