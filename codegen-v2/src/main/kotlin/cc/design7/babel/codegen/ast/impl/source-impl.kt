package cc.design7.babel.codegen.ast.impl

import cc.design7.babel.codegen.ast.ArgumentProvider
import cc.design7.babel.codegen.ast.FieldData
import cc.design7.babel.codegen.ast.IdentifyName
import cc.design7.babel.codegen.ast.InvokeKind
import cc.design7.babel.codegen.ast.JavaClassBuilder
import cc.design7.babel.codegen.ast.JavaCodeBuilder
import cc.design7.babel.codegen.ast.JavaExpr
import cc.design7.babel.codegen.ast.JavaExprBuilder
import cc.design7.babel.codegen.ast.JavaFileBuilder
import cc.design7.babel.codegen.ast.JavaType
import cc.design7.babel.codegen.ast.JavaVariable
import cc.design7.babel.codegen.ast.MethodData
import cc.design7.babel.codegen.ast.Modifiers
import cc.design7.babel.codegen.ast.Parameter
import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocIndent
import cc.design7.babel.util.DocList
import cc.design7.babel.util.DocText

private fun StringBuilder.build(modifiers: Modifiers) {
  with(modifiers) {
    append(if (isPublic) "public" else "private")
    if (isStatic) append(" static")
    if (isFinal) append(" final")
  }
}

/**
 * A [SourceExpr] is a single line text segment
 */
data class SourceExpr(val source: String) : JavaExpr, JavaVariable      // WTF this actually work

class SourceFileBuilder(val sourceBuilder: MutableList<Doc> = mutableListOf()) : JavaFileBuilder<
        SourceExpr,
        SourceExpr,
        SourceArgumentProvider,
        SourceCodeBuilder,
        SourceExprBuilder,
        SourceClassBuilder,
        Doc> {
  fun import(i: String, static: Boolean = true) {
    sourceBuilder.add(DocText("import ${if (static) "static " else ""}$i;"))
  }
        
  override fun Modifiers.record(
    name: JavaType,
    impl: JavaType,
    vararg fields: Parameter,
    builder: SourceClassBuilder.() -> Unit
  ) {
    assert(!isStatic && !isFinal)
    
    val cb = SourceClassBuilder(name, mutableListOf())
      .apply(builder)
    
    val declLine = DocText(buildString {
      build(this@record)
      append(" record $name")
      fields.joinTo(this, prefix = "(", postfix = ")") { it.toString() }
      append(" implements $impl {")
    })
    
    val body = DocIndent(DocList(cb.sourceBuilder))
    val endLine = DocText("}")        // TODO: unify DocText("}")
    
    sourceBuilder.add(declLine)
    sourceBuilder.add(body)
    sourceBuilder.add(endLine)
  }
  
  override fun build(): Doc {
    return DocList(sourceBuilder)
  }
}

class SourceClassBuilder(val owner: JavaType, val sourceBuilder: MutableList<Doc>) :
  JavaClassBuilder<SourceExpr, SourceExpr, SourceArgumentProvider, SourceCodeBuilder, SourceExprBuilder, SourceClassBuilder> {
  override fun Modifiers.methods(
    returnType: JavaType,
    methodName: IdentifyName,
    vararg parameters: Parameter,
    builder: SourceCodeBuilder.(SourceArgumentProvider) -> Unit,
  ): MethodData {
    val kind = if (isStatic) InvokeKind.Static else InvokeKind.Virtual
    return MethodData(owner, methodName, parameters.toList(), returnType, kind).also {
      val ap = SourceArgumentProvider(parameters.map { SourceExpr(it.name) })
      val cb = SourceCodeBuilder(mutableListOf())
      cb.builder(ap)
      
      val signatureLine = DocText(buildString {
        build(this@methods)
        append(' ')
        append("$returnType $methodName")
        parameters.joinTo(this, prefix = "(", postfix = ")") { it.toString() }
        append(' ')
        append('{')
      })
      
      val body = DocIndent(DocList(cb.sourceBuilder))
      val endLine = DocText("}")
      
      sourceBuilder.add(signatureLine)
      sourceBuilder.add(body)
      sourceBuilder.add(endLine)
    }
  }
  
  override fun Modifiers.field(
    type: JavaType,
    fieldName: IdentifyName,
    initialValue: SourceExprBuilder.() -> SourceExpr,
  ) {
    val doc = DocText(buildString {
      build(this@field)
      append(' ')
      append("$type $fieldName = ${SourceExprBuilder.initialValue().source};")
    })
    
    sourceBuilder.add(doc)
  }
}

data object SourceExprBuilder : JavaExprBuilder<SourceExpr, SourceExpr> {
  override fun SourceExpr?.invoke(methodData: MethodData, vararg arguments: SourceExpr): SourceExpr {
    val self = this
    assert(self == null || (methodData.invokeKind === InvokeKind.Virtual || methodData.invokeKind === InvokeKind.Interface))
    val callDoc = buildString {
      if (self != null) {
        append(self.source)
        append('.')
      } else if (methodData.invokeKind === InvokeKind.Special) {
        append("new ")
      }
      
      append(methodData.name)
      append('(')
      arguments.joinTo(this) { it.source }
      append(')')
    }
    
    return SourceExpr(callDoc)
  }
  
  override fun SourceExpr.ref(): SourceExpr {
    return this
  }
  
  override val self: SourceExpr = SourceExpr("this")
  
  override fun makeArray(
    type: JavaType,
    length: SourceExpr,
  ): SourceExpr {
    return SourceExpr("new $type[${length.source}]")
  }
  
  override fun SourceExpr.length(): SourceExpr {
    return SourceExpr("$source.length")
  }
  
  override fun SourceExpr.get(index: SourceExpr): SourceExpr {
    return SourceExpr("$source[${index.source}]")
  }
  
  override fun iconst(i: Int): SourceExpr {
    return SourceExpr(i.toString())
  }
  
  override fun checkcast(expr: SourceExpr, targetType: JavaType): SourceExpr {
    return SourceExpr("($targetType) ${expr.source}")
  }
  
  override fun SourceExpr.field(fieldData: FieldData): SourceExpr {
    return SourceExpr("${this.source}.${fieldData.name}")
  }
  
  override fun SourceExpr.le(than: SourceExpr): SourceExpr {
    return SourceExpr("$source < ${than.source}")
  }
}

class SourceCodeBuilder(val sourceBuilder: MutableList<Doc> = mutableListOf()) :
  JavaCodeBuilder<SourceExpr, SourceExpr, SourceCodeBuilder>,
  JavaExprBuilder<SourceExpr, SourceExpr> by SourceExprBuilder {
  override fun makeLocalVariable(
    type: JavaType,
    name: IdentifyName,
    initialValue: SourceExpr?,
  ): SourceExpr {
    val declDoc = "$type $name${if (initialValue != null) " = ${initialValue.source}" else ""};"
    
    sourceBuilder.add(DocText(declDoc))
    return SourceExpr(name)
  }
  
  override fun updateLocalVariable(
    variable: SourceExpr,
    value: SourceExpr,
  ) {
    val doc = "${variable.source} = ${value.source};"
    sourceBuilder.add(DocText(doc))
  }
  
  override fun updateArray(
    array: SourceExpr,
    index: SourceExpr,
    value: SourceExpr,
  ) {
    val doc = "${array.source}[${index.source}] = ${value.source};"
    sourceBuilder.add(DocText(doc))
  }
  
  override fun forLoop(
    name: IdentifyName,
    initialValue: SourceExpr,
    condition: (SourceExpr) -> SourceExpr,
    block: SourceCodeBuilder.(SourceExpr) -> Unit,
  ) {
    val iter = SourceExpr(name)
    val forLine = DocText("for(int $name = ${initialValue.source}; ${condition(iter).source}; $name ++) {")
    
    val forBlock = SourceCodeBuilder(mutableListOf()).apply {
      block(iter)
    }.let {
      DocIndent(DocList(it.sourceBuilder))
    }
    
    val endLine = DocText("}")
    
    sourceBuilder.add(forLine)
    sourceBuilder.add(forBlock)
    sourceBuilder.add(endLine)
  }
  
  override fun ret(value: SourceExpr?) {
    val doc = DocText(buildString {
      append("return")
      
      if (value != null) {
        append(' ')
        append(value.source)
      }
      
      append(';')
    })
    
    sourceBuilder.add(doc)
  }
  
  override fun exec(value: SourceExpr) {
    sourceBuilder.add(DocText(value.source + ';'))
  }
}

data class SourceArgumentProvider(val args: List<SourceExpr>) : ArgumentProvider<SourceExpr> {
  override fun get(index: Int): SourceExpr {
    return args[index]
  }
}