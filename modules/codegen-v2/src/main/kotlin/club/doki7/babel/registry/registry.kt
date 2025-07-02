package club.doki7.babel.registry

import club.doki7.babel.util.Either
import java.math.BigInteger
interface IMergeable<Self: IMergeable<Self>> {
    fun merge(other: Self): Self
}

class EmptyMergeable : IMergeable<EmptyMergeable> {
    override fun merge(other: EmptyMergeable) = this
}

interface RegistryBase {
    val aliases: MutableMap<Identifier, Typedef>
    val bitmasks: MutableMap<Identifier, Bitmask>
    val constants: MutableMap<Identifier, Constant>
    val commands: MutableMap<Identifier, Command>
    val enumerations: MutableMap<Identifier, Enumeration>
    val functionTypedefs: MutableMap<Identifier, FunctionTypedef>
    val opaqueHandleTypedefs: MutableMap<Identifier, OpaqueHandleTypedef>
    val opaqueTypedefs: MutableMap<Identifier, OpaqueTypedef>
    val structures: MutableMap<Identifier, Structure>
    val unions: MutableMap<Identifier, Structure>

    val enumConstantToEnumerationLookupAccel: MutableMap<String, Identifier>
}

data class Registry<E: IMergeable<E>>(
    override val aliases: MutableMap<Identifier, Typedef> = mutableMapOf(),
    override val bitmasks: MutableMap<Identifier, Bitmask> = mutableMapOf(),
    override val constants: MutableMap<Identifier, Constant> = mutableMapOf(),
    override val commands: MutableMap<Identifier, Command> = mutableMapOf(),
    override val enumerations: MutableMap<Identifier, Enumeration> = mutableMapOf(),
    override val functionTypedefs: MutableMap<Identifier, FunctionTypedef> = mutableMapOf(),
    override val opaqueHandleTypedefs: MutableMap<Identifier, OpaqueHandleTypedef> = mutableMapOf(),
    override val opaqueTypedefs: MutableMap<Identifier, OpaqueTypedef> = mutableMapOf(),
    override val structures: MutableMap<Identifier, Structure> = mutableMapOf(),
    override val unions: MutableMap<Identifier, Structure> = mutableMapOf(),
    override val enumConstantToEnumerationLookupAccel: MutableMap<String, Identifier> = mutableMapOf(),

    var ext: E
) : RegistryBase {
    infix operator fun plus(other: Registry<E>): Registry<E> = Registry(
        aliases = (this.aliases + other.aliases).toMutableMap(),
        bitmasks = (this.bitmasks + other.bitmasks).toMutableMap(),
        constants = (this.constants + other.constants).toMutableMap(),
        commands = (this.commands + other.commands).toMutableMap(),
        enumerations = (this.enumerations + other.enumerations).toMutableMap(),
        functionTypedefs = (this.functionTypedefs + other.functionTypedefs).toMutableMap(),
        opaqueHandleTypedefs = (this.opaqueHandleTypedefs + other.opaqueHandleTypedefs).toMutableMap(),
        opaqueTypedefs = (this.opaqueTypedefs + other.opaqueTypedefs).toMutableMap(),
        structures = (this.structures + other.structures).toMutableMap(),
        unions = (this.unions + other.unions).toMutableMap(),
        ext = this.ext.merge(other.ext)
    )

    infix operator fun plusAssign(other: Registry<E>) {
        this.aliases.putAll(other.aliases)
        this.bitmasks.putAll(other.bitmasks)
        this.constants.putAll(other.constants)
        this.commands.putAll(other.commands)
        this.enumerations.putAll(other.enumerations)
        this.functionTypedefs.putAll(other.functionTypedefs)
        this.opaqueHandleTypedefs.putAll(other.opaqueHandleTypedefs)
        this.opaqueTypedefs.putAll(other.opaqueTypedefs)
        this.structures.putAll(other.structures)
        this.unions.putAll(other.unions)

        this.ext = this.ext.merge(other.ext)
    }

    fun buildLookupAccel() {
        this.enumConstantToEnumerationLookupAccel.clear()
        for ((_, enumeration) in this.enumerations) {
            for (variant in enumeration.variants) {
                this.enumConstantToEnumerationLookupAccel.put(
                    variant.name.original,
                    enumeration.name
                )
            }
        }
    }
}

abstract class Entity(val name: Identifier, var doc: List<String>? = null) {
    private var _ext: Any? = null

    constructor(name: String) : this(name.intern())

    constructor(name: Identifier, extra: Any?) : this(name) {
        this._ext = extra
    }

    constructor(name: String, extra: Any?) : this(name) {
        this._ext = extra
    }

    fun rename(newName: String) = this.name.rename(newName)

    inline fun rename(renamer: String.() -> String) = this.rename(renamer(this.name.original))

    inline fun rename2(renamer: (String) -> String) = this.rename(renamer(this.name.original))

    fun <T> setExt(extra: T) {
        this._ext = extra
    }

    fun hasExt(): Boolean = this._ext != null

    @Suppress("UNCHECKED_CAST")
    fun <T> ext(): T = this._ext as T

    abstract fun toStringImpl(): String

    final override fun toString() = toStringImpl() + if (this._ext != null) {
        ", extra=$_ext)"
    } else {
        ")"
    }

    final override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entity) return false

        return name == other.name
    }

    final override fun hashCode(): Int {
        return name.hashCode()
    }
}

class Bitmask(
    name: Identifier,
    val bitwidth: Int?,
    val bitflags: MutableList<Bitflag>
) : Entity(name) {
    constructor(
        name: String,
        bitwidth: Int?,
        bitflags: MutableList<Bitflag>
    ) : this(name.intern(), bitwidth, bitflags)

    override fun toStringImpl() = buildString {
        append("Bitmask(name=\"$name\", bitflags=$bitflags")
        if (bitwidth != null) {
            append(", bitwidth=$bitwidth")
        }
    }
}

class Bitflag(
    name: Identifier,
    val value: Either<BigInteger, MutableList<String>>
) : Entity(name) {
    constructor(name: Identifier, value: BigInteger) : this(name, Either.Left(value))

    constructor(name: Identifier, value: MutableList<String>) : this(name, Either.Right(value))

    constructor(name: String, value: BigInteger) : this(name.intern(), value)

    constructor(name: String, value: MutableList<String>) : this(name.intern(), value)

    override fun toStringImpl() = buildString {
        append("Bitflag(name=$name")
        when (value) {
            is Either.Left -> append(", value=${value.value}")
            is Either.Right -> append(", value=(${value.value.joinToString(" | ") { it }})")
        }
    }
}

class Command(
    name: Identifier,
    val params: List<Param>,
    val result: Type,
    val successCodes: List<Identifier>?,
    val errorCodes: List<Identifier>?,
    var aliasTo: Identifier? = null
) : Entity(name) {
    constructor(
        name: String,
        params: List<Param>,
        result: Type,
        successCodes: List<Identifier>?,
        errorCodes: List<Identifier>?
    ) : this(name.intern(), params, result, successCodes, errorCodes)

    fun aliasBy(name: Identifier): Command {
        return Command(
            name, params, result, successCodes, errorCodes, this.name
        ).also { it.setExt(this.ext<Any?>()) }
    }

    override fun toStringImpl() =
        "Command(name=\"$name\", params=$params, result=$result, successCodes=$successCodes, errorCodes=$errorCodes"
}

class Param(
    name: Identifier,
    val type: Type,
    val len: Identifier?,
    val argLen: List<Identifier>?,
    var optional: Boolean
) : Entity(name) {
    constructor(
        name: String,
        type: Type,
        len: Identifier?,
        argLen: List<Identifier>?,
        optional: Boolean
    ) : this(name.intern(), type, len, argLen, optional)

    override fun toStringImpl() =
        "Param(name=\"$name\", type=$type, len=$len, argLen=$argLen, optional=$optional"
}

class Constant(
    name: Identifier,
    val type: IdentifierType,
    val expr: String
) : Entity(name) {
    constructor(name: String, type: IdentifierType, expr: String) : this(name.intern(), type, expr)

    override fun toStringImpl() = "Constant(name=\"$name\", type=$type, expr=\"$expr\""
}

class Enumeration(
    name: Identifier,
    val variants: MutableList<EnumVariant>
) : Entity(name) {
    constructor(name: String, variants: MutableList<EnumVariant>) : this(name.intern(), variants)

    override fun toStringImpl() = "Enumeration(name=\"$name\", variants=$variants"
}

class EnumVariant(
    name: Identifier,
    var value: Either<Long, List<String>>
) : Entity(name) {
    constructor(name: String, value: Long) : this(name.intern(), Either.Left(value))

    constructor(name: String, value: List<String>) : this(name.intern(), Either.Right(value))

    override fun toStringImpl() = buildString {
        append("EnumVariant(name=$name")
        when (value) {
            is Either.Left -> append(", value=${(value as Either.Left<Long, List<String>>).value}")
            is Either.Right -> append(", value=(${(value as Either.Right<Long, List<String>>).value.joinToString(" | ") { it }}")
        }
    }
}


/**
 * @param pfnNativeApi whether instances of this function type should only point to native API
 * functions. For example, functions in `VmaVulkanFunctions` should be all pointers to Vulkan
 * functions, not user-defined functions, so their types (`PFN_vkCreateInstance`, etc.) should have
 * this set to `true`. On the contrary, function pointers of type
 * `PFN_vkDebugUtilsMessengerCallbackEXT` are meant to be provided by users, so they should have
 * this field set to `false`.
 */
class FunctionTypedef(
    name: Identifier,
    val params: List<Type>,
    val result: Type,
    val isPointer: Boolean = true,
    val pfnNativeApi: Boolean = false
) : Entity(name) {
    constructor(name: String, params: List<Type>, result: Type) : this(name.intern(), params, result)

    constructor(name: String, params: List<Type>, result: Type, isPointer: Boolean) : this(name.intern(), params, result, isPointer)

    override fun toStringImpl() = "FunctionTypedef(name=\"$name\", params=$params, result=$result"
}

class OpaqueTypedef(
    name: Identifier,
    var isHandle: Boolean = false
) : Entity(name) {
    constructor(name: String) : this(name.intern())

    constructor(name: String, isHandle: Boolean) : this(name.intern(), isHandle)

    override fun toStringImpl() = "OpaqueTypedef(name=\"$name\""
}

class OpaqueHandleTypedef(
    name: Identifier
) : Entity(name) {
    constructor(name: String) : this(name.intern())

    override fun toStringImpl() = "OpaqueHandleTypedef(name=\"$name\""
}

class Structure(
    name: Identifier,
    val members: MutableList<Member>
) : Entity(name) {
    constructor(name: String, members: MutableList<Member>) : this(name.intern(), members)

    override fun toStringImpl() = "Structure(name=\"$name\", members=$members"
}

class Member(
    name: String,
    val type: Type,
    val values: Identifier?,
    val len: List<Identifier>?,
    val altLen: String?,
    var optional: Boolean,
    val bits: Int?
) : Entity(name) {
    override fun toStringImpl() = buildString {
        append("Member(\"name=$name\", type=$type")
        if (values != null) {
            append(", values=$values")
        }
        if (len != null) {
            append(", len=$len")
        }
        if (altLen != null) {
            append(", altLen=$altLen")
        }
        if (optional) {
            append(", optional=true")
        }
        if (bits != null) {
            append(", bits=$bits")
        }
    }
}

class Typedef(name: String, val type: Type) : Entity(name) {
    constructor(name: String, aliasTo: String) : this(name, IdentifierType(aliasTo))

    override fun toStringImpl() = "Typedef(name=\"$name\", type=$type"
}

fun <E: Entity> MutableMap<Identifier, E>.putEntityIfAbsent(e: E) = putIfAbsent(e.name, e)
