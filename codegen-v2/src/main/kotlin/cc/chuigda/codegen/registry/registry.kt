package cc.chuigda.codegen.registry

import cc.chuigda.codegen.Either
import java.math.BigInteger

interface IMergeable {
    fun mergeImpl(other: IMergeable): IMergeable

    fun merge(other: IMergeable?): IMergeable {
        if (other == null) {
            return this
        }

        if (this::class != other::class) {
            throw IllegalArgumentException("Cannot merge different types: ${this::class} and ${other::class}")
        }

        return mergeImpl(other)
    }
}

class EmptyMergeable : IMergeable {
    override fun mergeImpl(other: IMergeable) = this
}

data class Registry<E: IMergeable>(
    val aliases: Map<Identifier, Typedef>,
    val bitmasks: Map<Identifier, Bitmask>,
    val constants: Map<Identifier, Constant>,
    val commands: Map<Identifier, Command>,
    val enumerations: Map<Identifier, Enumeration>,
    val functionTypedefs: Map<Identifier, FunctionTypedef>,
    val opaqueHandleTypedefs: Map<Identifier, OpaqueHandleTypedef>,
    val structures: Map<Identifier, Structure>,
    val unions: Map<Identifier, Structure>,

    var extra: E? = null
) {
    fun merge(other: Registry<E>) = Registry(
        aliases = this.aliases + other.aliases,
        bitmasks = this.bitmasks + other.bitmasks,
        constants = this.constants + other.constants,
        commands = this.commands + other.commands,
        enumerations = this.enumerations + other.enumerations,
        functionTypedefs = this.functionTypedefs + other.functionTypedefs,
        opaqueHandleTypedefs = this.opaqueHandleTypedefs + other.opaqueHandleTypedefs,
        structures = this.structures + other.structures,
        unions = this.unions + other.unions,

        extra = (this.extra as? IMergeable)?.merge(other.extra as? IMergeable)
    )
}

abstract class Entity(name: String) {
    val name: Identifier = name.intern()
    private var _extra: Any? = null

    constructor(name: String, extra: Any): this(name) {
        this._extra = extra
    }

    fun <T> setExtra(extra: T) {
        this._extra = extra
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> extra(): T = this._extra as T

    abstract fun toStringImpl(): String

    final override fun toString() = toStringImpl() + if (this._extra != null) {
        ", extra=$_extra)"
    } else {
        ")"
    }
}

class Bitmask(
    name: String,
    val bitflags: List<Bitflag>
) : Entity(name) {
    override fun toStringImpl() = "Bitmask(name=$name, bitflags=$bitflags"
}

class Bitflag(
    name: String,
    val value: Either<BigInteger, List<String>>
) : Entity(name) {
    constructor(name: String, value: BigInteger) : this(name, Either.Left(value))

    constructor(name: String, value: List<String>) : this(name, Either.Right(value))

    override fun toStringImpl() = buildString {
        append("Bitflag(name=$name")
        when (value) {
            is Either.Left -> append(", value=${value.value}")
            is Either.Right -> append(", value=(${value.value.joinToString(" | ") { it }})")
        }
    }
}

class Command(
    name: String,
    val params: List<Param>,
    val result: Type,
    val successCodes: List<Identifier>?,
    val errorCodes: List<Identifier>?
) : Entity(name) {
    override fun toStringImpl() =
        "Command(name=$name, params=$params, result=$result, successCodes=$successCodes, errorCodes=$errorCodes"
}

class Param(
    name: String,
    val type: Type,
    val len: Identifier?,
    val argLen: List<Identifier>?,
    val optional: Boolean
) : Entity(name) {
    override fun toStringImpl() =
        "Param(name=$name, type=$type, len=$len, argLen=$argLen, optional=$optional"
}

class Constant(
    name: String,
    val type: IdentifierType,
    val expr: String
) : Entity(name) {
    override fun toStringImpl() = "Constant(name=$name, type=$type, expr=$expr"
}

class Enumeration(
    name: String,
    val variants: List<EnumVariant>
) : Entity(name) {
    override fun toStringImpl() = "Enumeration(name=$name, variants=$variants)"
}

class EnumVariant(
    name: String,
    val value: Either<BigInteger, List<String>>
) : Entity(name) {
    constructor(name: String, value: BigInteger) : this(name, Either.Left(value))

    constructor(name: String, value: List<String>) : this(name, Either.Right(value))

    override fun toStringImpl() = buildString {
        append("EnumVariant(name=$name")
        when (value) {
            is Either.Left -> append(", value=${value.value}")
            is Either.Right -> append(", value=(${value.value.joinToString(" | ") { it }})")
        }
    }
}

class FunctionTypedef(
    name: String,
    val params: List<Param>,
    val result: Type?
) : Entity(name) {
    override fun toStringImpl() = "FunctionTypedef(name=$name, params=$params, result=$result)"
}

class OpaqueHandleTypedef(
    name: String
) : Entity(name) {
    override fun toStringImpl() = "OpaqueHandleTypedef(name=$name)"
}

class Structure(
    name: String,
    val members: List<Member>
) : Entity(name) {
    override fun toStringImpl() = "Structure(name=$name, members=$members)"
}

class Member(
    name: String,
    val type: Type,
    val values: Identifier?,
    val len: List<Identifier>?,
    val altLen: String,
    val optional: Boolean,
    val bits: Int?
) : Entity(name) {
    override fun toStringImpl() = buildString {
        append("Member(name=$name, type=$type")
        if (values != null) {
            append(", values=$values")
        }
        if (len != null) {
            append(", len=$len")
        }
        if (altLen.isNotEmpty()) {
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
    override fun toStringImpl() = "Typedef(name=$name, type=$type)"
}
