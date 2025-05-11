package cc.design7.babel.codegen.ast

data class MethodData(
  val owner: JavaType,
  val name: IdentifyName,
  val parameters: List<Parameter>,
  val returnType: JavaType,
  val invokeKind: InvokeKind
) {
  init {
    assert(invokeKind === InvokeKind.Virtual ||
            invokeKind === InvokeKind.Interface ||
            invokeKind === InvokeKind.Static)
  }
}

data class FieldData(
  val owner: JavaType,
  val name: IdentifyName,
  val type: JavaType,
  val isStatic: Boolean
)

enum class InvokeKind {
  Special,    // super call or constructor call
  Static,     // static method of class or interface
  Virtual,    // method of class
  Interface   // method of interface
}

data class Modifiers(val isPublic: Boolean, val isFinal: Boolean, val isStatic: Boolean) {
  fun final(): Modifiers {
    assert(! isFinal)
    return copy(isFinal = true)
  }
  
  fun static(): Modifiers {
    assert(! isStatic)
    return copy(isStatic = true)
  }
}

fun public(): Modifiers = Modifiers(true, false, false)
fun private(): Modifiers = Modifiers(false, false, false)