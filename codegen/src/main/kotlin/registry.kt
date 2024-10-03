data class Registry(
    val functions: List<Function>,
    val opaqueTypedefs: List<OpaqueTypedef>,
    val handles: List<Handle>,
    val structures: List<Structure>,
    val functionTypedefs: List<FunctionTypedef>
)

fun mergeRegistry(vararg registries: Registry): Registry {
    return Registry(
        functions = registries.flatMap { it.functions },
        opaqueTypedefs = registries.flatMap { it.opaqueTypedefs },
        handles = registries.flatMap { it.handles },
        structures = registries.flatMap { it.structures },
        functionTypedefs = registries.flatMap { it.functionTypedefs }
    )
}

interface Entity {
    val name: String
    val api: String?

    fun isVulkanAPI(): Boolean = api == null || api!!.split('\n').contains("vulkan")
}

data class Constant(
    override val name: String,
    override val api: String? = null,
    val expr: String,
    val type: IdentifierType? = null
) : Entity

data class Function(
    override val name: String,
    override val api: String? = null,
    val params: List<Param>,
    val result: Type?,
    val successResult: List<String>? = null,
    val errorResult: List<String>? = null
) : Entity

data class OpaqueTypedef(
    override val name: String,
    override val api: String? = null
) : Entity;

data class Handle(
    override val name: String,
    override val api: String? = null,
    val dispatchable: Boolean
) : Entity

data class Structure(
    override val name: String,
    override val api: String? = null,
    val isUnion: Boolean = false,
    val members: List<Member>,
    val verbatim: List<String> = listOf(),
    val structExtends: List<String> = listOf(),
    var hasInit: Boolean = false
) : Entity

data class Member(
    override val name: String,
    override val api: String? = null,
    val type: Type,
    val values: String? = null,
    val length: List<String>? = null,
    val optional: Boolean = false,
    val bits: Int? = null
) : Entity

data class FunctionTypedef(
    override val name: String,
    override val api: String? = null,
    val params: List<Param>,
    val result: Type?
) : Entity

data class Param(
    override val name: String,
    override val api: String? = null,
    val type: Type,
    val len: String? = null,
    val arglen: List<String>? = null,
    val optional: Boolean = false
) : Entity
