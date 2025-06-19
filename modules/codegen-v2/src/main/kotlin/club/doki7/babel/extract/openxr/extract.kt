package club.doki7.babel.extract.openxr

import club.doki7.babel.cdecl.RawFunctionType
import club.doki7.babel.cdecl.TypedefDecl
import club.doki7.babel.cdecl.parseFunctionDecl
import club.doki7.babel.cdecl.parseType
import club.doki7.babel.cdecl.parseTypedefDecl
import club.doki7.babel.cdecl.toType
import club.doki7.babel.registry.*
import club.doki7.babel.util.*
import org.w3c.dom.Element
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")

fun main() {
    val reg = extractOpenXRRegistry()
    return
}

fun extractOpenXRRegistry(): Registry<EmptyMergeable> {
    val registry = inputDir.resolve("xr.xml")
        .toFile()
        .readText()
        .parseXML()
        .extractEntities()

    return registry
}

private fun <T : Entity> Sequence<T>.associate(): MutableMap<Identifier, T> {
    return associateByTo(mutableMapOf(), Entity::name)
}

private fun Element.extractEntities(): Registry<EmptyMergeable> {
    val e = this

    // TODO: parse <type requires="...">
    val opaqueHandles: MutableMap<Identifier, OpaqueHandleTypedef> = mutableMapOf()
    val typedefs: MutableMap<Identifier, Typedef> = mutableMapOf()

    e.query("types/type[@category='basetype']")
        .map(::extractBasetype)
        .forEach {
            when (it) {
                is Either.Left<OpaqueHandleTypedef, Typedef> -> opaqueHandles.putEntityIfAbsent(it.value)
                is Either.Right<OpaqueHandleTypedef, Typedef> -> typedefs.putEntityIfAbsent(it.value)
            }
        }

    // TODO: do we need this? perhaps this is implied by [bitmasks]
//    val bitmaskTypes = e.query("types/type[@category=bitmask]")
//        .map(::extractBitmaskType)

    val handles = e.query("types/type[@category='handle']")
        .map(::extractHandle)

    liftLeft(handles).associateByTo(opaqueHandles, Entity::name)
    liftRight(handles).associateByTo(typedefs, Entity::name)

    val structs = e.query("types/type[@category='struct' and not(@alias)]")
        .map(::extractStruct)
        .associate()

    e.query("types/type[@category='struct' and @alias]")
        .map(::extractAlias)
        .forEach { (name, rawAlias) ->
            val aliasTo = rawAlias.intern()
            val origin = structs[aliasTo] ?: error("Missing aliased structure: $aliasTo")
            val alias = Structure(name, origin.members)
            structs.putEntityIfAbsent(alias)
        }

    val constants = e.query("enums[@name='API Constants']/enum")
        .map(::extractConstant)
        .associate()

    val enums = e.query("enums[@type='enum']")
        .map(::extractEnumeration)
        .associate()

    val bitmasks = e.query("enums[@type='bitmask']")
        .map(::extractBitmask)
        .associate()

    val commands = e.query("commands/command[not(@alias)]")
        .map(::extractCommand)
        .associate()

    val funcs = e.query("types/type[@category='funcpointer']")
        .map(::extractFunctionTypedef)
        .associate()

    e.query("commands/command[@alias]")
        .map(::extractAlias)
        .forEach { (name, rawAlias) ->
            val aliasTo = rawAlias.intern()
            val origin = commands[aliasTo] ?: error("Missing aliased command: $aliasTo")
            val alias = Command(
                name.intern(),
                origin.params,
                origin.result,
                origin.successCodes,
                origin.errorCodes,
                aliasTo
            )

            commands.putEntityIfAbsent(alias)
        }

    return Registry(
        aliases = typedefs,
        bitmasks = bitmasks,
        constants = constants,
        commands = commands,
        enumerations = enums,
        functionTypedefs = funcs,
        opaqueHandleTypedefs = opaqueHandles,
        structures = structs,
        ext = EmptyMergeable()
    )
}

private const val XR_DEFINE_ATOM = "XR_DEFINE_ATOM"
private const val XR_DEFINE_OPAQUE_64 = "XR_DEFINE_OPAQUE_64"

private typealias OpaqueDefine = Either<OpaqueHandleTypedef, Typedef>

private fun XR_DEFINE_ATOM(value: String): Typedef {
    return Typedef(value, IdentifierType("uint64_t"))
}

private fun XR_DEFINE_OPAQUE_64(value: String): OpaqueDefine = XR_DEFINE_HANDLE(value)

private const val XR_PTR_SIZE: Int = -1

private fun shouldOpaqueHandle(): Boolean = XR_PTR_SIZE == 8

private fun XR_DEFINE_HANDLE(name: String): OpaqueDefine {
    return if (shouldOpaqueHandle()) {
        Either.Left(OpaqueHandleTypedef("${name}#_T"))
    } else {
        Either.Right(Typedef(name, IdentifierType("uint64_t")))
    }
}

private fun liftLeft(es: Sequence<OpaqueDefine>): Sequence<OpaqueHandleTypedef> {
    return if (shouldOpaqueHandle()) {
        es.map { (it as Either.Left).value }
    } else emptySequence()
}

private fun liftRight(es: Sequence<OpaqueDefine>): Sequence<Typedef> {
    return if (!shouldOpaqueHandle()) {
        es.map { (it as Either.Right).value }
    } else emptySequence()
}

/**
 * @param e in form `<type>typedef <type>TYPE</type> <name>NAME</name></type>`
 */
private fun extractTrivialTypedef(e: Element): Typedef {
    val type = e.getFirstElement("type")!!.textContent
    val name = e.getFirstElement("name")!!.textContent
    return Typedef(name, parseType(type).toType())
}

/**
 * @param e in form `<type category="basetype">...<type>TYPE_OR_MACRO</type>...<name>NAME</name>...</type>`
 */
private fun extractBasetype(e: Element): OpaqueDefine {
    val typeOrMacro = e.getFirstElement("type")!!.textContent
    val name = getName(e)

    return when (typeOrMacro) {
        XR_DEFINE_ATOM -> Either.Right(XR_DEFINE_ATOM(name))
        XR_DEFINE_OPAQUE_64 -> XR_DEFINE_OPAQUE_64(name)
        else -> {
            Either.Right(extractTrivialTypedef(e))
        }
    }
}

/**
 * @param e in form `<type bitvalues="BIT_VALUES" category="bitmask">typedef <type>XrFlags64</type> <name>BIT_VALUES</name></type>`
 */
private fun extractBitmaskType(e: Element): Typedef {
    return extractTrivialTypedef(e)
}

/**
 * @param e in form `<type category="handle" parent="MAY_OR_MAY_NOT_SET"><type>XR_DEFINE_HANDLE</type>(<name>NAME</name>)</type>`
 * @return either [OpaqueHandleTypedef] or [Typedef], completely depends on the value of [XR_PTR_SIZE]
 */
private fun extractHandle(e: Element): Either<OpaqueHandleTypedef, Typedef> {
    val name = getName(e)
    return XR_DEFINE_HANDLE(name)
}

/**
 * TODO: few struct decl provide comments, should we extract them?
 *
 * @param e in form `<type category="struct" name="NAME" structextends="MAYBE_SET" parentstruct="MAYBE_SET" protect="MAYBE_SET" returnonly="MAYBE_SET" mayalias="MAYBE_SET">MEMBER+</type>`
 */
private fun extractStruct(e: Element): Structure {
    val name by e.attrs
    val structextends by e.attrs
    val parentstruct by e.attrs
    val protect by e.attrs
    val returnonly by e.attrs
    val mayalias by e.attrs
    val members = e.getElementSeq("member")
        .map(::extractMember)
        .toMutableList()

    return Structure(name!!, members).apply {
        setExt(
            XrStructMetadata(
                structextends,
                parentstruct,
                protect,
                returnonly == "true",
                mayalias == "true"
            )
        )
    }
}

/**
 * @param e in form `<type category="struct" name="NAME" alias="ALIAS"/>`
 */
private fun extractStructAlias(e: Element) {
    TODO()
}

/**
 * Extract the text of given element without `<name>` tag.
 */
private fun getElementTextWithoutName(e: Element): String {
    return e.childNodes.asSequence()
        .filter { !(it is Element && it.tagName == "name") }
        .joinToString(separator = " ") { it.textContent.trim() }
}

/**
 * Extract the name child of given element
 */
private fun getName(e: Element): String {
    return e.getFirstElement("name")!!.textContent.trim()
}

private fun commaList(s: String?): List<Identifier>? {
    return s?.split(',')?.map { it.intern() }
}

/**
 * @param e in form `<member values="..." optional="..." len="...">... <name>NAME</name></member>`
 */
private fun extractMember(e: Element): Member {
    val values by e.attrs
    val optional by e.attrs
    val len by e.attrs
    val name = getName(e)
    val type = parseType(getElementTextWithoutName(e)).toType()

    // len is a comma separated (identifier | "null-terminated") list
    val lenList = commaList(len)

    return Member(
        name,
        type,
        values?.intern(),
        lenList,
        null,
        optional == "true",
        null
    )
}

private data class EnumLike(val name: String, val value: String)

private fun extractEnumLike(e: Element): EnumLike {
    val value by e.attrs
    val name by e.attrs

    return EnumLike(name!!, value!!)
}

private fun extractConstant(e: Element): Constant {
    return extractEnumLike(e).run {
        Constant(
            name,
            IdentifierType("uint32_t"),     // FIXME: I am not sure
            value
        )
    }
}

/**
 * @param e in form `<enum value="INTEGER" name="NAME" comment-"..." />`
 */
private fun extractEnumVariant(e: Element): EnumVariant {
    return extractEnumLike(e).let {
        EnumVariant(it.name, it.value.parseDecOrHex())
    }
}

/**
 * @param e in form `<enums name="NAME" type="enum" comment="...">ENUM*</enums>`
 */
private fun extractEnumeration(e: Element): Enumeration {
    val name by e.attrs
    val enums = e.getElementSeq("enum")
        .map(::extractEnumVariant)
        .toMutableList()

    return Enumeration(name!!, enums)
}

/**
 * @param e in form `<enum bitpos="INTEGER" name="NAME" comment="..." />`
 */
private fun extractBitflag(e: Element): Bitflag {
    val bitpos by e.attrs
    val name by e.attrs
    return Bitflag(name!!, bitpos!!.toBigInteger())
}

/**
 * @param e in form `<enums name="NAME" type="bitmask" comment="...">BITFLAG*</enums>`
 */
private fun extractBitmask(e: Element): Bitmask {
    val name by e.attrs
    val flags = e.getElementSeq("enum")
        .map(::extractBitflag)
        .toMutableList()

    // TODO: i am not sure whether if bitwidth should be null
    return Bitmask(name!!, null, flags)
}

/**
 * @param e in form `<some_tag>TYPE <name>NAME</name></some_tag>`
 */
private fun extractTypeJudgement(e: Element): Pair<String, Type> {
    val rawType = getElementTextWithoutName(e)
    val type = parseType(rawType).toType()
    val name = getName(e)
    return name to type
}

/**
 * @param e in form `<param len="MAYBE_SET" externsync="MAYBE_SET" optional="MAYBE_SET">TYPE <name>NAME</name></param>`
 */
private fun extractParam(e: Element): Param {
    val (name, type) = extractTypeJudgement(e)
    val len by e.attrs
    val externsync by e.attrs
    val optional by e.attrs

    return Param(name, type, len?.intern(), null, optional == "true").apply {
        setExt(XrParamMetadata(externsync))
    }
}

/**
 * TODO: some command has `<implicitexternsyncparams>`
 * @param e in form `<command successcodes="SUCC_CODE*" errorcodes="ERROR_CODE*">PROTO PARAM*</command>`
 */
private fun extractCommand(e: Element): Command {
    val successcodes by e.attrs
    val errorcodes by e.attrs
    val (name, retType) = extractTypeJudgement(e.getFirstElement("proto")!!)

    val params = e.query("param")
        .map(::extractParam)
        .toList()

    return Command(
        name,
        params,
        retType,
        commaList(successcodes),
        commaList(errorcodes)
    )
}

private data class Aliasing(val name: String, val aliasTo: String)

/**
 * @param e in form `<some_tag name="NAME" alias="ALIAS"></some_tag>`
 */
private fun extractAlias(e: Element): Aliasing {
    val name by e.attrs
    val alias by e.attrs
    return Aliasing(name!!, alias!!)
}

private fun morphFunctionTypedef(typedef: TypedefDecl) = FunctionTypedef(
    name = typedef.name,
    params = (typedef.aliasedType as RawFunctionType).params.map { it.second.toType() },
    result = typedef.aliasedType.returnType.toType()
)

/**
 * @param e form `<type category="funcpointer" requires="MAYBE_SET">RAW_C_TYPEDEF+</type>`
 */
private fun extractFunctionTypedef(e: Element): FunctionTypedef {
    val requires by e.attrs
    val content = e.textContent.trim()
    val typedefs = content.split(';')
    val typedef = typedefs[typedefs.size - 2] + ';'
    val (rawTypedef, _) = parseTypedefDecl(typedef.lines(), 0)
    return morphFunctionTypedef(rawTypedef)
}