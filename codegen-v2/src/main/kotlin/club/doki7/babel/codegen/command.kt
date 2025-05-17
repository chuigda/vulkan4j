package club.doki7.babel.codegen

import club.doki7.babel.ctype.CType
import club.doki7.babel.ctype.lowerType
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.buildDoc

fun generateCommandFile(
    registry: RegistryBase,
    codegenOptions: CodegenOptions
) = buildDoc {
    val packageName = codegenOptions.packageName
    val className = codegenOptions.functionClassName

    // region imports
    +"package $packageName"
    +""
    imports("java.lang.foreign.*")
    imports("java.lang.invoke.MethodHandle")
    +""
    imports("org.jetbrains.annotations.Nullable")
    imports("club.doki7.ffm.NativeLayout")
    imports("club.doki7.ffm.annotation.*")
    imports("club.doki7.ffm.ptr.*")
    if (registry.structures.isNotEmpty()) {
        imports("$packageName.datatype.*")
    }
    if (registry.opaqueHandleTypedefs.isNotEmpty()) {
        imports("$packageName.handle.*")
    }

    codegenOptions.extraImport.forEach {
        imports(it)
    }
    +""
    // endregion

    +"public final class $className {"
    indent {
        val loweredCommand = registry.commands.values
            .sortedBy { it.name }
            .map { lowerCommand(it, registry, codegenOptions) }
            .toList()

        loweredCommand.forEach {
            +generateCommandWrapper(it)
        }
    }
    +"}"
}

data class LoweredCommand(
    val params: List<CType>,
    val result: CType,
    val command: Command
)

private fun lowerCommand(
    command: Command,
    registry: RegistryBase,
    codegenOptions: CodegenOptions
) = LoweredCommand(
    params = command.params.map { lowerType(registry, codegenOptions.refRegistries, it.type) }.toList(),
    result = lowerType(registry, codegenOptions.refRegistries, command.result),
    command = command
)

private fun generateCommandWrapper(command: LoweredCommand) = buildDoc {

}
