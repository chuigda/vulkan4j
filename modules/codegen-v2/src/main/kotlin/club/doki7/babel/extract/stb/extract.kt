package club.doki7.babel.extract.stb

import club.doki7.babel.cdecl.*
import club.doki7.babel.extract.openal.tweakedSkipBlockComment
import club.doki7.babel.hparse.*
import club.doki7.babel.registry.*
import java.util.logging.Logger
import kotlin.io.path.Path
import kotlin.io.path.useLines

private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.stb")

fun extractStbImageHeader(): Registry<EmptyMergeable> {
    val header = inputDir.resolve("stb_image.h")
        .useLines { it.map(String::trim).toList() }

    val registry = Registry(ext = EmptyMergeable())

    hparse(
        headerParseConfig,
        registry,
        mutableMapOf(),
        header,
        0
    )

    return registry
}

private val headerParseConfig = ParseConfig<EmptyMergeable>().apply {
    addRule(10, ::detectBlockComment, ::nextLine)
    addRule(10, ::detectLineComment, ::tweakedSkipBlockComment)

    addRule(20, ::detectFunTyDecl, ::parseFunTyDecl)
    addRule(20, ::detectTypeAlias, ::parseTypeAlias)
}

private fun detectTypeAlias(line: String): ControlFlow =
    if (line.startsWith("typedef") && "struct" !in line && line matches Regex("""^typedef\s+([_a-zA-Z][_a-zA-Z0-9]*\*?\s+)+\w+;$""")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun detectFunTyDecl(line: String): ControlFlow =
    if (line.startsWith("STBIDEF")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun <E : IMergeable<E>> parseFunTyDecl(
    registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (typedef, nextIndex) = parseFunctionDecl(lines, index)
    registry.commands.putEntityIfAbsent(morphFunctionDecl(typedef))
    return nextIndex
}

private fun morphFunctionDecl(functionDecl: FunctionDecl) = Command(
    name = functionDecl.name,
    params = functionDecl.params.map {
        Param(
            name = it.name,
            type = it.type.toType(),
            len = null,
            argLen = null,
            optional = true,
        )
    },
    result = functionDecl.returnType.toType(),
    successCodes = null,
    errorCodes = null
)

private fun <E : IMergeable<E>> parseTypeAlias(
    registry: Registry<E>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseTypedefDecl(lines, index)
    val (typedef, nextIndex) = parseResult
    val alias = morphTypedefAlias(typedef)
    registry.aliases.putEntityIfAbsent(alias)

    return nextIndex
}

private fun morphTypedefAlias(typedef: TypedefDecl) = Typedef(
    name = typedef.name,
    type = (typedef.aliasedType.toType() as IdentifierType),
)
