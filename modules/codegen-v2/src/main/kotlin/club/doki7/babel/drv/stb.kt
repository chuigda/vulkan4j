package club.doki7.babel.drv

import club.doki7.babel.extract.stb.extractStbImageHeader

private const val packageDirI = "stb-image/src/main/java/club/doki7/stb/image"
private const val packageDirTT = "stb-truetype/src/main/java/club/doki7/stb/truetype"

fun stbImageMain() {
    val registry = extractStbImageHeader()

    val codegenOptions = club.doki7.babel.codegen.CodegenOptions(
        packageName = "club.doki7.stb.image",
        extraImport = emptyList(),
        constantClassName = "StbImageConstants",
        functionTypeClassName = "StbImageFunctionTypes",
        refRegistries = emptyList(),
    )
}
