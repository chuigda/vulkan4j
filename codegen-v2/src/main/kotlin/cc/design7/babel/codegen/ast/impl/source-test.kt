package cc.design7.babel.codegen.ast.impl

import cc.design7.babel.codegen.ast.FieldData
import cc.design7.babel.codegen.ast.InvokeKind
import cc.design7.babel.codegen.ast.MethodData
import cc.design7.babel.codegen.ast.Parameter
import cc.design7.babel.codegen.ast.public
import cc.design7.babel.util.render

fun main() {
  val StructureName = "StructureName"
  val Arena = "Arena"
  val IPointer = "IPointer"
  
  val copyFrom = MethodData("MemorySegment", "copyFrom", listOf(Parameter("src", "MemorySegment")), "void", InvokeKind.Interface)
  
  val output = SourceFileBuilder().apply {
    import("java.lang.foreign.*")
    
    public().record("Foo", IPointer, Parameter("segment", "MemorySegment")) {
      val segment = FieldData("Foo", "segment", "MemorySegment", false)
      
      public().static().final().field("int", "wtf") {
        iconst(1)
      }
      
      val allocate = public().static().method("$StructureName[]", "allocate",
        Parameter("arena", Arena),
        Parameter("count", "int")
      ) { arena, count ->
        ret()
      }
      
      public().static().method("$StructureName[]", "clone",
        Parameter("arena", Arena),
        Parameter("src", StructureName)
      ) { arena, src ->
        var ret by variable("ret", "$StructureName[]")
        ret = self.invoke(allocate, arena.ref(), src.length())
        forLoop("i", iconst(0), { i -> i.le(src.length()) }) { i ->
          +ret[i.ref()].field(segment).invoke(copyFrom, src[i.ref()].field(segment))
        }
        
        ret(ret)
      }
    }
  }.build()
  
  println(render(output))
}