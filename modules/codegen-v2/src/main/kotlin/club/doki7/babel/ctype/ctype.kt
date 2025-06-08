package club.doki7.babel.ctype

import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.OpaqueTypedef
import club.doki7.babel.registry.PointerType
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.registry.Type
import kotlin.collections.contains

sealed interface CType {
    val jType: String
    val jLayout: String
    val jLayoutType: String
    val cType: String

    val jDescriptorParamLayout: String get() = jLayout
}

interface ICommentable<SELF: CType> {
    var comment: String?

    fun copyWithComment(comment: String?): SELF
}

data class CVoidType(override val cType: String = "void") : CType {
    override val jType: String = "void"
    override val jLayout: String get() = error("should not call `jLayout` on `void`")
    override val jLayoutType: String get() = error("should not call `jLayoutType` on `void`")
}

val voidType = CVoidType()

data class CPointerType(
    val pointee: CType,
    val const: Boolean,
    val pointerToOne: Boolean,
    override var comment: String?,
) : CType, ICommentable<CPointerType> {
    override val jType: String = if (comment != null) {
        """@Pointer(comment="$comment") MemorySegment"""
    }
    else {
        """@Pointer(comment="void*") MemorySegment"""
    }

    override val jLayout: String = if (pointee is CVoidType) {
        "ValueLayout.ADDRESS"
    }
    else {
        """ValueLayout.ADDRESS.withTargetLayout(${pointee.jLayout})"""
    }

    override val jLayoutType: String = "AddressLayout"

    override val cType: String = buildString {
        if (pointee is CFixedIntType && pointee.comment != null) {
            append(pointee.comment)
        } else {
            append(pointee.cType)
        }
        if (const) {
            append(" const")
        }
        append("*")
    }

    override fun copyWithComment(comment: String?): CPointerType {
        return this.copy(comment = comment)
    }
}

data class CHandleType(val name: String) : CType {
    override val jType: String = name
    override val jLayout: String = "ValueLayout.ADDRESS"
    override val jLayoutType: String = "AddressLayout"
    override val cType: String = name
}

data class CArrayType(val element: CType, val length: String) : CType {
    override val jType: String get() = error("should not call `jRawType` on `array`")
    override val jLayout: String = "MemoryLayout.sequenceLayout($length, ${element.jLayout})"
    override val jLayoutType: String = "SequenceLayout"
    override val cType: String = "${element.cType}[$length]"

    override val jDescriptorParamLayout: String = "ValueLayout.ADDRESS.withTargetLayout(${element.jLayout})"

    val flattened: CArrayType get() {
        if (element !is CArrayType) {
            return this
        }

        val newElement = element.flattened
        val newLength = "$length * ${element.length}"
        return CArrayType(newElement.element, newLength)
    }
}

sealed interface CNonRefType : CType {
    val jTypeNoAnnotation: String
    val jPtrType: String
    val jPtrTypeNoAnnotation: String
}

sealed interface CFixedSizeType : CNonRefType {
    val byteSize: Int
}

data class CBoolType(
    override val cType: String = "bool",
    override var comment: String? = null
) : CNonRefType, ICommentable<CBoolType> {
    override val jType: String get() = buildString {
        if (comment != null) {
            append("@NativeType(\"$comment\") ")
        }
        append("boolean")
    }
    override val jLayout: String = "ValueLayout.JAVA_BOOLEAN"
    override val jLayoutType: String = "OfBoolean"
    override val jTypeNoAnnotation: String = "boolean"
    override val jPtrType: String get() = buildString {
        if (comment != null) {
            append("@Pointer(comment=\"$comment\") ")
        }
        append("BytePtr")
    }
    override val jPtrTypeNoAnnotation: String = "BytePtr"

    override fun copyWithComment(comment: String?): CBoolType {
        return this.copy(comment = comment)
    }
}

data class CFixedIntType(
    override val cType: String,
    override val byteSize: Int,
    val unsigned: Boolean,
    override var comment: String? = null
) : CFixedSizeType, ICommentable<CFixedIntType> {
    override val jType: String get() = buildString {
        if (comment != null) {
            append("@NativeType(\"$comment\") ")
        }
        if (unsigned) {
            append("@Unsigned ")
        }
        append(jTypeNoAnnotation)
    }

    override val jLayout: String get() = when (byteSize) {
        1 -> "ValueLayout.JAVA_BYTE"
        2 -> "ValueLayout.JAVA_SHORT"
        4 -> "ValueLayout.JAVA_INT"
        8 -> "ValueLayout.JAVA_LONG"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jLayoutType: String get() = when (byteSize) {
        1 -> "OfByte"
        2 -> "OfShort"
        4 -> "OfInt"
        8 -> "OfLong"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jTypeNoAnnotation: String get() = when (byteSize) {
        1 -> "byte"
        2 -> "short"
        4 -> "int"
        8 -> "long"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jPtrType: String get() = buildString {
        if (comment != null) {
            append("@Pointer(comment=\"$comment\") ")
        }
        if (unsigned) {
            append("@Unsigned ")
        }
        append(jPtrTypeNoAnnotation)
    }

    override val jPtrTypeNoAnnotation: String get() = when (byteSize) {
        1 -> "BytePtr"
        2 -> "ShortPtr"
        4 -> "IntPtr"
        8 -> "LongPtr"
        else -> error("unsupported byte size: $byteSize")
    }

    override fun copyWithComment(comment: String?): CFixedIntType {
        return this.copy(comment = comment)
    }
}

data class CPlatformDependentIntType(
    override val cType: String,
    override val jTypeNoAnnotation: String,
    override val jLayout: String,
    override val jPtrTypeNoAnnotation: String,
    override var comment: String? = null
) : CNonRefType, ICommentable<CPlatformDependentIntType> {
    override val jLayoutType: String get() = error("should not call `jLayoutType` on `CPlatformDependentIntType`")

    override val jType: String get() = buildString {
        if (comment != null) {
            append("@NativeType(\"$comment\") ")
        }
        append(jTypeNoAnnotation)
    }

    override val jPtrType: String get() = buildString {
        if (comment != null) {
            append("@Pointer(comment=\"$comment\") ")
        }
        append(jPtrTypeNoAnnotation)
    }

    override fun copyWithComment(comment: String?): CPlatformDependentIntType {
        return this.copy(comment = comment)
    }
}

data class CFloatType(
    override val byteSize: Int,
    override var comment: String? = null
) : CFixedSizeType, ICommentable<CFloatType> {
    override val jType: String get() = buildString {
        if (comment != null) {
            append("@NativeType(\"$comment\") ")
        }
        append(jTypeNoAnnotation)
    }
    override val jLayout: String get() = when (byteSize) {
        4 -> "ValueLayout.JAVA_FLOAT"
        8 -> "ValueLayout.JAVA_DOUBLE"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jLayoutType: String = when (byteSize) {
        4 -> "OfFloat"
        8 -> "OfDouble"
        else -> error("unsupported byte size: $byteSize")
    }
    override val cType: String = comment
        ?: when (byteSize) {
            4 -> "float"
            8 -> "double"
            else -> error("unsupported byte size: $byteSize")
        }
    override val jTypeNoAnnotation: String get() = when (byteSize) {
        4 -> "float"
        8 -> "double"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jPtrType: String get() = buildString {
        if (comment != null) {
            append("@Pointer(comment=\"$comment\") ")
        }
        append(jPtrTypeNoAnnotation)
    }
    override val jPtrTypeNoAnnotation: String get() = when (byteSize) {
        4 -> "FloatPtr"
        8 -> "DoublePtr"
        else -> error("unsupported byte size: $byteSize")
    }

    override fun copyWithComment(comment: String?): CFloatType {
        return this.copy(comment = comment)
    }
}

data class CStructType(val name: String, val isUnion: Boolean): CType {
    override val jType: String = "I$name"
    override val jLayout: String = "$name.LAYOUT"
    override val jLayoutType: String = if (isUnion) "UnionLayout" else "StructLayout"
    override val cType: String = name
}

data class CEnumType(
    val name: String,
    val bitwidth: Int? = null
): CFixedSizeType {
    override val jType: String get() = when (bitwidth) {
        null, 32 -> "@EnumType($name.class) int"
        8 -> "@EnumType($name.class) byte"
        64 -> "@EnumType($name.class) long"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val byteSize: Int get() = when (bitwidth) {
        null, 32 -> 4
        64 -> 8
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jLayout: String get() = when (bitwidth) {
        null, 32 -> "ValueLayout.JAVA_INT"
        8 -> "ValueLayout.JAVA_BYTE"
        64 -> "ValueLayout.JAVA_LONG"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jLayoutType: String = when (bitwidth) {
        null, 32 -> "OfInt"
        8 -> "OfByte"
        64 -> "OfLong"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val cType: String = "enum $name"

    override val jTypeNoAnnotation: String get() = when (bitwidth) {
        null, 32 -> "int"
        8 -> "byte"
        64 -> "long"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jPtrType: String = when (bitwidth) {
        null, 32 -> "@EnumType($name.class) IntPtr"
        8 -> "@EnumType($name.class) BytePtr"
        64 -> "@EnumType($name.class) LongPtr"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jPtrTypeNoAnnotation: String = when (bitwidth) {
        null, 32 -> "IntPtr"
        8 -> "BytePtr"
        64 -> "LongPtr"
        else -> error("unsupported bitwidth: $bitwidth")
    }
}

private val boolType = CBoolType("bool", "boolean")
private val int8Type = CFixedIntType("int8_t", 1, false)
private val uint8Type = CFixedIntType("uint8_t", 1, true)
private val int16Type = CFixedIntType("int16_t", 2, false)
private val uint16Type = CFixedIntType("uint16_t", 2, true)
private val int32Type = CFixedIntType("int32_t", 4, false)
private val uint32Type = CFixedIntType("uint32_t", 4, true)
private val int64Type = CFixedIntType("int64_t", 8, false)
private val uint64Type = CFixedIntType("uint64_t", 8, true)
private val floatType = CFloatType(4)
private val doubleType = CFloatType(8)

private val cIntType = int32Type
private val cUIntType = uint32Type
private val cLongType = CPlatformDependentIntType(
    cType = "long",
    jTypeNoAnnotation = "long",
    jLayout = "NativeLayout.C_LONG",
    jPtrTypeNoAnnotation = "CLongPtr",
)
private val cSizeType = CPlatformDependentIntType(
    cType = "size_t",
    jTypeNoAnnotation = "long",
    jLayout = "NativeLayout.C_SIZE_T",
    jPtrTypeNoAnnotation = "PointerPtr",
)
private val cIntPtrType = CPlatformDependentIntType(
    cType = "intptr_t",
    jTypeNoAnnotation = "long",
    jLayout = "NativeLayout.C_SIZE_T",
    jPtrTypeNoAnnotation = "PointerPtr"
)

private fun pvoidType(comment: String) = CPointerType(voidType, const = false, pointerToOne = false, comment = comment)

private val knownTypes = mapOf(
    // Fundamental types
    "bool" to boolType,
    "void" to voidType,
    "int8_t" to int8Type,
    "uint8_t" to uint8Type,
    "int16_t" to int16Type,
    "uint16_t" to uint16Type,
    "int32_t" to int32Type,
    "uint32_t" to uint32Type,
    "int64_t" to int64Type,
    "uint64_t" to uint64Type,
    "float" to floatType,
    "double" to doubleType,
    "int" to cIntType,
    "unsigned" to cUIntType,
    "unsigned int" to cUIntType,
    "long long" to int64Type,

    "long" to cLongType,
    "size_t" to cSizeType,
    "intptr_t" to cIntPtrType,

    "char" to int8Type,
    "unsigned char" to uint8Type,
    "short" to int16Type,
    "unsigned short" to uint16Type,

    // OpenGL base types
    "GLbyte" to int8Type.copyWithComment(comment = "GLbyte"),
    "GLubyte" to uint8Type.copyWithComment(comment = "GLubyte"),
    "GLchar" to int8Type.copyWithComment(comment = "GLchar"),
    "GLuchar" to uint8Type.copyWithComment(comment = "GLuchar"),
    "GLclampf" to floatType.copy(comment = "GLclampf"),
    "GLclampd" to doubleType.copy(comment = "GLclampd"),
    "GLclampx" to int32Type.copyWithComment(comment = "GLclampx"),
    "GLfixed" to int32Type.copyWithComment(comment = "GLfixed"),
    "GLint" to int32Type.copyWithComment(comment = "GLint"),
    "GLint64" to int64Type.copyWithComment(comment = "GLint64"),
    "GLuint" to uint32Type.copyWithComment(comment = "GLuint"),
    "GLuint64" to uint64Type.copyWithComment(comment = "GLuint64"),
    "GLshort" to int16Type.copyWithComment(comment = "GLshort"),
    "GLushort" to uint16Type.copyWithComment(comment = "GLushort"),
    "GLfloat" to floatType.copy(comment = "GLfloat"),
    "GLdouble" to doubleType.copy(comment = "GLdouble"),
    "GLvoid" to voidType.copy(cType = "GLvoid"),
    "GLenum" to int32Type.copyWithComment(comment = "GLenum"),
    "GLsizei" to int32Type.copyWithComment(comment = "GLsizei"),
    "GLsizeiptr" to cSizeType.copy(comment = "GLsizeiptr"),
    "GLintptr" to cSizeType.copy(comment = "GLintptr"),
    "GLbitfield" to uint32Type.copyWithComment(comment = "GLbitfield"),
    "GLboolean" to uint8Type.copyWithComment(comment = "GLboolean"),

    // Vulkan base types
    "VkSampleMask" to uint32Type.copyWithComment(comment = "VkSampleMask"),
    "VkBool32" to uint32Type.copyWithComment(comment = "VkBool32"),
    "VkFlags" to uint32Type.copyWithComment(comment = "VkFlags"),
    "VkFlags64" to uint64Type.copyWithComment(comment = "VkFlags64"),
    "VkDeviceSize" to uint64Type.copyWithComment(comment = "VkDeviceSize"),
    "VkDeviceAddress" to uint64Type.copyWithComment(comment = "VkDeviceAddress"),
    "VkRemoteAddressNV" to pvoidType("VkRemoteAddressNV"),

    // Android
    "ANativeWindow" to pvoidType("ANativeWindow"),
    "AHardwareBuffer" to pvoidType("AHardwareBuffer"),

    // DirectFB
    "IDirectFB" to pvoidType("IDirectFB"),
    "IDirectFBSurface" to pvoidType("IDirectFBSurface"),

    // iOS or macOS
    "id" to pvoidType("id"),
    "CAMetalLayer" to pvoidType("CAMetalLayer"),
    "GgpFrameToken" to uint32Type.copyWithComment(comment = "GgpFrameToken"),
    "GgpStreamDescriptor" to uint32Type.copyWithComment(comment = "GgpStreamDescriptor"),
    "IOSurfaceRef" to pvoidType("IOSurfaceRef"),
    "MTLBuffer_id" to pvoidType("MTLBuffer_id"),
    "MTLCommandQueue_id" to pvoidType("MTLCommandQueue_id"),
    "MTLDevice_id" to pvoidType("MTLDevice_id"),
    "MTLSharedEvent_id" to pvoidType("MTLSharedEvent_id"),
    "MTLTexture_id" to pvoidType("MTLTexture_id"),
    "CGDirectDisplayID" to uint32Type.copyWithComment(comment = "CGDirectDisplayID"),

    // QNX
    "_screen_buffer" to pvoidType("_screen_buffer"),
    "_screen_context" to pvoidType("_screen_context"),
    "_screen_window" to pvoidType("_screen_window"),

    // Wayland
    "wl_display" to pvoidType("wl_display"),
    "wl_surface" to pvoidType("wl_surface"),
    "wl_output" to voidType.copy(cType = "wl_output"),

    // Windows
    "DWORD" to uint32Type.copyWithComment(comment = "DWORD"),
    "HANDLE" to pvoidType("HANDLE"),
    "HINSTANCE" to pvoidType("HINSTANCE"),
    "HMONITOR" to pvoidType("HMONITOR"),
    "HWND" to pvoidType("HWND"),
    "LPCWSTR" to CPointerType(uint16Type, const = true, pointerToOne = false, comment = "LPCWSTR"),
    "HGLRC" to pvoidType("HGLRC"),
    "SECURITY_ATTRIBUTES" to voidType.copy(cType = "SECURITY_ATTRIBUTES"),

    // X11
    "Display" to pvoidType("Display"),
    "RROutput" to cLongType.copy(comment = "RROutput"),
    "RRCrtc" to cLongType.copy(comment = "RRCrtc"),
    "VisualID" to cLongType.copy(comment = "VisualID"),
    "Window" to cLongType.copy(comment = "Window"),
    "GLXContext" to pvoidType("GLXContext"),
    "GLXWindow" to cLongType.copy(comment = "GLXWindow"),
    "XEvent" to voidType.copy(cType = "XEvent"),
    "xcb_connection_t" to voidType.copy(cType = "xcb_connection_t"),
    "xcb_visualid_t" to uint32Type.copyWithComment(comment = "xcb_visualid_t"),
    "xcb_window_t" to uint32Type.copyWithComment(comment = "xcb_window_t"),
    "xcb_handle_t" to uint32Type.copyWithComment(comment = "xcb_handle_t"),

    // EGL
    "EGLDisplay" to pvoidType("EGLDisplay"),
    "EGLContext" to pvoidType("EGLContext"),
    "EGLSurface" to pvoidType("EGLSurface"),

    // MESA
    "OSMesaContext" to pvoidType("OSMesaContext"),

    // NvSciBuf / NvSciSync
    "NvSciBufAttrList" to pvoidType("NvSciBufAttrList"),
    "NvSciBufObj" to pvoidType("NvSciBufObj"),
    "NvSciSyncAttrList" to pvoidType("NvSciSyncAttrList"),
    "NvSciSyncObj" to pvoidType("NvSciSyncObj"),

    // FUCHSIA
    "zx_handle_t" to uint32Type.copyWithComment(comment = "zx_handle_t"),
)

fun lowerType(registry: RegistryBase, refRegistries: List<RegistryBase>, type: Type): CType {
    return when(type) {
        is ArrayType -> {
            if (!type.length.value.isNumeric()) {
                if (!registry.constants.contains(type.length)
                    && !refRegistries.any { it.constants.contains(type.length) }) {
                    error("array type referred to an unknown constant ${type.length}")
                }
            }

            val elementType = lowerType(registry, refRegistries, type.element)
            CArrayType(elementType, type.length.value)
        }
        is PointerType -> {
            if (type.pointee is IdentifierType) {
                val opaqueTypedef = lookupOpaqueTypedef(registry, refRegistries, type.pointee)
                if (opaqueTypedef != null) {
                    return if (opaqueTypedef.isHandle) {
                        CHandleType(opaqueTypedef.name.value)
                    } else {
                        CPointerType(
                            pointee = CVoidType(),
                            const = true,
                            pointerToOne = true,
                            comment = "${type.pointee.ident.original}*"
                        )
                    }
                }
            }

            // TODO future `wchar_t` support?
            if (type.pointee is IdentifierType && type.pointee.ident.value == "wchar_t") {
                return pvoidType(comment="wchar_t*")
            }

            val pointee = lowerType(registry, refRegistries, type.pointee)
            CPointerType(pointee, type.const, type.pointerToOne, comment=null)
        }
        is IdentifierType -> lowerIdentifierType(registry, refRegistries, type)
    }
}

fun lookupOpaqueTypedef(
    registry: RegistryBase,
    refRegistries: List<RegistryBase>,
    type: IdentifierType
): OpaqueTypedef? {
    if (registry.opaqueTypedefs.contains(type.ident)) {
        return registry.opaqueTypedefs[type.ident]!!
    }

    for (refRegistry in refRegistries) {
        if (refRegistry.opaqueTypedefs.contains(type.ident)) {
            return refRegistry.opaqueTypedefs[type.ident]!!
        }
    }

    return null
}

fun lowerIdentifierType(
    registry: RegistryBase,
    refRegistries: List<RegistryBase>,
    type: IdentifierType
): CType {
    val lookupResult = identifierTypeLookup(registry, refRegistries, type)
    if (lookupResult != null) {
        return lookupResult
    }

    for (refRegistry in refRegistries) {
        val lookupResult = identifierTypeLookup(refRegistry, refRegistries, type)
        if (lookupResult != null) {
            return lookupResult
        }
    }

    return if (knownTypes.containsKey(type.ident.value)) {
        knownTypes[type.ident.value]!!
    } else {
        error("unknown type ${type.ident.value}")
    }
}

fun identifierTypeLookup(registry: RegistryBase, refRegistries: List<RegistryBase>, type: IdentifierType) =
    if (registry.structures.contains(type.ident)) {
        CStructType(type.ident.value, false)
    }
    else if (registry.unions.contains(type.ident)) {
        CStructType(type.ident.value, true)
    }
    else if (registry.enumerations.contains(type.ident)) {
        CEnumType(type.ident.value)
    }
    else if (registry.bitmasks.contains(type.ident)) {
        CEnumType(type.ident.value, bitwidth=registry.bitmasks[type.ident]!!.bitwidth)
    }
    else if (registry.opaqueHandleTypedefs.contains(type.ident)) {
        CHandleType(type.ident.value)
    }
    else if (registry.functionTypedefs.contains(type.ident)) {
        CPointerType(voidType, false, pointerToOne = true, comment=type.ident.value)
    }
    else if (registry.aliases.contains(type.ident)) {
        val alias = registry.aliases[type.ident]!!
        val ret = lowerType(registry, refRegistries, alias.type)
        if (ret is ICommentable<*>) {
            ret.copyWithComment(type.ident.original)
        } else {
            ret
        }
    }
    else if (knownTypes.containsKey(type.ident.value)) {
        knownTypes[type.ident.value]!!
    } else {
        null
    }

private fun String.isNumeric() = all { it.isDigit() }
