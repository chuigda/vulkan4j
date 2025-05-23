data class Registry(
    val aliases: Map<String, TypeAlias>,
    val constants: Map<String, Constant>,
    val commands: Map<String, Command>,
    val commandAliases: Map<String, String>,
    val opaqueTypedefs: Map<String, OpaqueTypedef>,
    val handles: Map<String, Handle>,
    val structures: Map<String, Structure>,
    val functionTypedefs: Map<String, FunctionTypedef>,
    val bitmasks: Map<String, Bitmask>,
    val enumerations: Map<String, Enumeration>,

    var constantClassName: String = "Constants"
)

fun mergeRegistry(vararg registries: Registry): Registry {
    val aliases = mutableMapOf<String, TypeAlias>()
    val constants = mutableMapOf<String, Constant>()
    val commands = mutableMapOf<String, Command>()
    val commandAliases = mutableMapOf<String, String>()
    val opaqueTypedefs = mutableMapOf<String, OpaqueTypedef>()
    val handles = mutableMapOf<String, Handle>()
    val structures = mutableMapOf<String, Structure>()
    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()
    val bitmasks = mutableMapOf<String, Bitmask>()
    val enumerations = mutableMapOf<String, Enumeration>()

    for (registry in registries) {
        aliases.putAll(registry.aliases)
        constants.putAll(registry.constants)
        commands.putAll(registry.commands)
        commandAliases.putAll(registry.commandAliases)
        opaqueTypedefs.putAll(registry.opaqueTypedefs)
        handles.putAll(registry.handles)
        structures.putAll(registry.structures)
        functionTypedefs.putAll(registry.functionTypedefs)
        bitmasks.putAll(registry.bitmasks)
        enumerations.putAll(registry.enumerations)
    }

    return Registry(
        aliases,
        constants,
        commands,
        commandAliases,
        opaqueTypedefs,
        handles,
        structures,
        functionTypedefs,
        bitmasks,
        enumerations
    )
}

abstract class Entity {
    abstract val name: String
    abstract val api: String?

    fun isVulkanAPI(): Boolean = api == null || api!!.split('\n').contains("vulkan")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Entity

        return name == other.name
    }

    override fun hashCode(): Int = name.hashCode()
}

data class TypeAlias(
    override val name: String,
    override val api: String? = null,
    val target: IdentifierType
) : Entity()

data class Constant(
    override val name: String,
    override val api: String? = null,
    val expr: String,
    val type: IdentifierType? = null
) : Entity()

data class Command(
    override val name: String,
    override val api: String? = null,
    val params: List<Param>,
    val result: Type?,
    val successResult: List<String>? = null,
    val errorResult: List<String>? = null
) : Entity()

data class OpaqueTypedef(
    override val name: String,
    override val api: String? = null
) : Entity()

data class Handle(
    override val name: String,
    override val api: String? = null,
    val dispatchable: Boolean
) : Entity()

data class Structure(
    override val name: String,
    override val api: String? = null,
    val isUnion: Boolean = false,
    val members: List<Member>,
    val verbatim: MutableList<String> = mutableListOf(),
    val structExtends: List<String> = listOf(),
    var hasInit: Boolean = false,
) : Entity()

data class Member(
    override val name: String,
    override val api: String? = null,
    val type: Type,
    val values: String? = null,
    val length: List<String>? = null,
    val optional: Boolean = false,
    val bits: Int? = null
) : Entity()

data class FunctionTypedef(
    override val name: String,
    override val api: String? = null,
    val params: List<Param>,
    val result: Type?
) : Entity()

data class Param(
    override val name: String,
    override val api: String? = null,
    val type: Type,
    val len: String? = null,
    var optional: Boolean = false
) : Entity()

data class Bitmask(
    override val name: String,
    override val api: String? = null,
    val bitflags: List<Bitflag>,
    val bitwidth: Int? = null,
    val requireFlagBits: String? = null
) : Entity()

data class Bitflag(
    override val name: String,
    override val api: String? = null,
    val value: String
) : Entity()

data class Enumeration(
    override val name: String,
    override val api: String? = null,
    val variants: List<Variant>
) : Entity()

data class Variant(
    override val name: String,
    override val api: String? = null,
    val value: String
) : Entity()
