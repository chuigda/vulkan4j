package cc.design7.babel.registry

import cc.design7.babel.util.Either
import java.math.BigInteger

interface IMergeable<Self: IMergeable<Self>> {
    fun merge(other: Self): Self
}

class EmptyMergeable : IMergeable<EmptyMergeable> {
    override fun merge(other: EmptyMergeable) = this
}

abstract class RegistryBase {
    abstract val aliases: MutableMap<Identifier, Typedef>
    abstract val bitmasks: MutableMap<Identifier, Bitmask>
    abstract val constants: MutableMap<Identifier, Constant>
    abstract val commands: MutableMap<Identifier, Command>
    abstract val enumerations: MutableMap<Identifier, Enumeration>
    abstract val functionTypedefs: MutableMap<Identifier, FunctionTypedef>
    abstract val opaqueHandleTypedefs: MutableMap<Identifier, OpaqueHandleTypedef>
    abstract val opaqueTypedefs: MutableMap<Identifier, OpaqueTypedef>
    abstract val structures: MutableMap<Identifier, Structure>
    abstract val unions: MutableMap<Identifier, Structure>
}

data class Registry<E: IMergeable<E>>(
    override val aliases: MutableMap<Identifier, Typedef>,
    override val bitmasks: MutableMap<Identifier, Bitmask>,
    override val constants: MutableMap<Identifier, Constant>,
    override val commands: MutableMap<Identifier, Command>,
    override val enumerations: MutableMap<Identifier, Enumeration>,
    override val functionTypedefs: MutableMap<Identifier, FunctionTypedef>,
    override val opaqueHandleTypedefs: MutableMap<Identifier, OpaqueHandleTypedef>,
    override val opaqueTypedefs: MutableMap<Identifier, OpaqueTypedef>,
    override val structures: MutableMap<Identifier, Structure>,
    override val unions: MutableMap<Identifier, Structure>,

    var ext: E
) : RegistryBase() {
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
}

abstract class Entity(name: Identifier) {
    val name: Identifier = name
    private var _ext: Any? = null

    constructor(name: String) : this(name.intern())

    constructor(name: Identifier, extra: Any?) : this(name) {
        this._ext = extra
    }

    constructor(name: String, extra: Any?) : this(name) {
        this._ext = extra
    }

    fun rename(newName: String) = this.name.rename(newName)

    fun rename(renamer: String.() -> String) = this.rename(renamer(this.name.original))

    fun <T> setExt(extra: T) {
        this._ext = extra
    }

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
    val value: Either<BigInteger, List<String>>
) : Entity(name) {
    constructor(name: Identifier, value: BigInteger) : this(name, Either.Left(value))

    constructor(name: Identifier, value: List<String>) : this(name, Either.Right(value))

    constructor(name: String, value: BigInteger) : this(name.intern(), value)

    constructor(name: String, value: List<String>) : this(name.intern(), value)

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
    val errorCodes: List<Identifier>?
) : Entity(name) {
    constructor(
        name: String,
        params: List<Param>,
        result: Type,
        successCodes: List<Identifier>?,
        errorCodes: List<Identifier>?
    ) : this(name.intern(), params, result, successCodes, errorCodes)

    override fun toStringImpl() =
        "Command(name=\"$name\", params=$params, result=$result, successCodes=$successCodes, errorCodes=$errorCodes"
}

class Param(
    name: Identifier,
    val type: Type,
    val len: Identifier?,
    val argLen: List<Identifier>?,
    val optional: Boolean
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

    override fun toStringImpl() = "Enumeration(name=\"$name\", variants=$variants)"
}

class EnumVariant(
    name: Identifier,
    val value: Either<BigInteger, List<String>>
) : Entity(name) {
    constructor(name: String, value: BigInteger) : this(name.intern(), Either.Left(value))

    constructor(name: String, value: List<String>) : this(name.intern(), Either.Right(value))

    override fun toStringImpl() = buildString {
        append("EnumVariant(name=$name")
        when (value) {
            is Either.Left -> append(", value=${value.value}")
            is Either.Right -> append(", value=(${value.value.joinToString(" | ") { it }})")
        }
    }
}

class FunctionTypedef(
    name: Identifier,
    val params: List<Type>,
    val result: Type?
) : Entity(name) {
    constructor(name: String, params: List<Type>, result: Type?) : this(name.intern(), params, result)

    override fun toStringImpl() = "FunctionTypedef(name=\"$name\", params=$params, result=$result"
}

class OpaqueTypedef(
    name: Identifier
) : Entity(name) {
    constructor(name: String) : this(name.intern())

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
    val members: List<Member>
) : Entity(name) {
    constructor(name: String, members: List<Member>) : this(name.intern(), members)

    override fun toStringImpl() = "Structure(name=\"$name\", members=$members"
}

class Member(
    name: String,
    val type: Type,
    val values: Identifier?,
    val len: List<Identifier>?,
    val altLen: String?,
    val optional: Boolean,
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

class Typedef(
    name: String,
    val type: IdentifierType
) : Entity(name) {
    override fun toStringImpl() = "Typedef(name=\"$name\", type=$type"
}

fun <E: Entity> MutableMap<Identifier, E>.putEntityIfAbsent(e: E) = putIfAbsent(e.name, e)
