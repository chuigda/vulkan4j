package cc.design7.babel.codegen.ast

interface JavaFileBuilder<
        E : JavaExpr,
        V : JavaVariable,
        AP : ArgumentProvider<V>,
        CB : JavaCodeBuilder<E, V, CB>,
        EB : JavaExprBuilder<E, V>,
        CLB: JavaClassBuilder<E, V, AP, CB, EB, CLB>,
        Output> {
  fun Modifiers.record(name: JavaType, impl: JavaType, vararg fields: Parameter, builder: CLB.() -> Unit)
  fun build(): Output
}