package club.doki7.babel.extract.llvm

import kotlin.io.path.Path
import kotlin.io.path.exists

internal const val inputDir = "codegen-v2/input"

internal const val libDir = "$inputDir/llvm-20.1.6.src/lib"

internal const val includeDir = "$inputDir/llvm-20.1.6.src/include/llvm-c"

internal const val targetDir = "$libDir/Target"

internal val headerFilesToParse = listOf(
    "Transforms/PassBuilder.h",
    "Analysis.h",
    "BitReader.h",
    "BitWriter.h",
    "Core.h",
    "DataTypes.h",
    "DebugInfo.h",
    "Disassembler.h",
    "DisassemblerTypes.h",
    "Error.h",
    "ErrorHandling.h",
    "ExecutionEngine.h",
    "IRReader.h",
    "Linker.h",
    "LLJIT.h",
    "LLJITUtils.h",
    "lto.h",
    "Object.h",
    "Orc.h",
    "OrcEE.h",
    "Remarks.h",
    "Support.h",
    "Target.h",
    "TargetMachine.h",
    "Types.h"
)

internal val llvmAllTargets = listOf(
    "AArch64",
    "AMDGPU",
    "ARM",
    "AVR",
    "BPF",
    "Hexagon",
    "Lanai",
    "LoongArch",
    "Mips",
    "MSP430",
    "NVPTX",
    "PowerPC",
    "RISCV",
    "Sparc",
    "SPIRV",
    "SystemZ",
    "VE",
    "WebAssembly",
    "X86",
    "XCore"
)

internal data class LLVMEnumLists(
    val targets: List<String>,
    val asmPrinters: List<String>,
    val asmParsers: List<String>,
    val disassemblers: List<String>
)

internal val llvmEnumLists = generateLLVMEnumLists()

private fun generateLLVMEnumLists(): LLVMEnumLists {
    val targets = mutableListOf<String>()
    val asmPrinters = mutableListOf<String>()
    val asmParsers = mutableListOf<String>()
    val disassemblers = mutableListOf<String>()

    for (target in llvmAllTargets) {
        targets.add(target)

        if (Path("$targetDir/${target}AsmPrinter.cpp").exists()) {
            asmPrinters.add(target)
        }

        if (Path("$targetDir/${target}/AsmParser/CMakeLists.txt").exists()) {
            asmParsers.add(target)
        }

        if (Path("$targetDir/${target}/Disassembler/CMakeLists.txt").exists()) {
            disassemblers.add(target)
        }
    }

    return LLVMEnumLists(
        targets = targets,
        asmPrinters = asmPrinters,
        asmParsers = asmParsers,
        disassemblers = disassemblers
    )
}
