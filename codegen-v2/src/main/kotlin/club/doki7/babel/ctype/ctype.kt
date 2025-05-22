package club.doki7.babel.ctype

import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
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

class CVoidType : CType {
    override val jType: String = "void"
    override val jLayout: String get() = error("should not call `jLayout` on `void`")
    override val jLayoutType: String get() = error("should not call `jLayoutType` on `void`")
    override val cType: String = "void"
}

val voidType = CVoidType()

data class CPointerType(
    val pointee: CType,
    val const: Boolean,
    val pointerToOne: Boolean,
    val comment: String?,
) : CType {
    override val jType: String = if (comment != null) {
        """@pointer(comment="$comment") MemorySegment"""
    }
    else {
        """@pointer(comment="void*") MemorySegment"""
    }

    override val jLayout: String = if (pointee == voidType) {
        "ValueLayout.ADDRESS"
    }
    else {
        """ValueLayout.ADDRESS.withTargetLayout(${pointee.jLayout})"""
    }

    override val jLayoutType: String = "AddressLayout"

    override val cType: String = """${pointee.cType}${if (const) " const" else ""}*"""
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
    val jTypeNoSign: String
    val jPtrType: String
    val jPtrTypeNoAnnotation: String
}

sealed interface CFixedSizeType : CNonRefType {
    val byteSize: Int
}

data class CFixedIntType(
    val cName: String,
    override val byteSize: Int,
    val unsigned: Boolean
) : CFixedSizeType {
    override val jType: String get() = """${if (unsigned) "@unsigned " else ""}$jTypeNoSign"""
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
    override val cType: String = cName
    override val jTypeNoSign: String get() = when (byteSize) {
        1 -> "byte"
        2 -> "short"
        4 -> "int"
        8 -> "long"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jPtrType: String get() = """${if (unsigned) "@unsigned " else ""}$jPtrTypeNoAnnotation"""
    override val jPtrTypeNoAnnotation: String get() = when (byteSize) {
        1 -> "BytePtr"
        2 -> "ShortPtr"
        4 -> "IntPtr"
        8 -> "LongPtr"
        else -> error("unsupported byte size: $byteSize")
    }
}

data class CPlatformDependentIntType(
    override val cType: String,
    override val jType: String,
    override val jLayout: String,
    override val jTypeNoSign: String,
    override val jPtrType: String,
    override val jPtrTypeNoAnnotation: String
) : CNonRefType {
    override val jLayoutType: String get() = error("should not call `jLayoutType` on `CPlatformDependentIntType`")
}

data class CFloatType(override val byteSize: Int) : CFixedSizeType {
    override val jType: String get() = when (byteSize) {
        4 -> "float"
        8 -> "double"
        else -> error("unsupported byte size: $byteSize")
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
    override val cType: String = when (byteSize) {
        4 -> "float"
        8 -> "double"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jTypeNoSign: String get() = jType
    override val jPtrType: String get() = when (byteSize) {
        4 -> "FloatPtr"
        8 -> "DoublePtr"
        else -> error("unsupported byte size: $byteSize")
    }
    override val jPtrTypeNoAnnotation: String get() = jPtrType
}

data class CStructType(val name: String): CType {
    override val jType: String = "I$name"
    override val jLayout: String = "$name.LAYOUT"
    override val jLayoutType: String = "StructLayout"
    override val cType: String = name
}

data class CEnumType(val name: String, val bitwidth: Int? = null): CFixedSizeType {
    override val jType: String get() = when (bitwidth) {
        null, 32 -> {
            "@enumtype($name.class) int"
        }
        64 -> {
            "@enumtype($name.class) long"
        }
        else -> {
            error("unsupported bitwidth: $bitwidth")
        }
    }

    override val byteSize: Int get() = when (bitwidth) {
        null, 32 -> 4
        64 -> 8
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jLayout: String get() = when (bitwidth) {
        null, 32 -> "ValueLayout.JAVA_INT"
        64 -> "ValueLayout.JAVA_LONG"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jLayoutType: String = when (bitwidth) {
        null, 32 -> "OfInt"
        64 -> "OfLong"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val cType: String = "enum $name"

    override val jTypeNoSign: String get() = when (bitwidth) {
        null, 32 -> "int"
        64 -> "long"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jPtrType: String = when (bitwidth) {
        null, 32 -> "@enumtype($name.class) IntPtr"
        64 -> "@enumtype($name.class) LongPtr"
        else -> error("unsupported bitwidth: $bitwidth")
    }

    override val jPtrTypeNoAnnotation: String = when (bitwidth) {
        null, 32 -> "IntPtr"
        64 -> "LongPtr"
        else -> error("unsupported bitwidth: $bitwidth")
    }
}

private val int8Type = CFixedIntType("byte", 1, false)
private val uint8Type = CFixedIntType("byte", 1, true)
private val int16Type = CFixedIntType("short", 2, false)
private val uint16Type = CFixedIntType("short", 2, true)
private val int32Type = CFixedIntType("int", 4, false)
private val uint32Type = CFixedIntType("int", 4, true)
private val int64Type = CFixedIntType("long", 8, false)
private val uint64Type = CFixedIntType("long", 8, true)
private val floatType = CFloatType(4)
private val doubleType = CFloatType(8)

private val cIntType = int32Type
private val cUIntType = uint32Type
private val cLongType = CPlatformDependentIntType(
    "long",
    "long",
    "NativeLayout.C_LONG",
    "long",
    "CLongPtr",
    "CLongPtr"
)
private val cSizeType = CPlatformDependentIntType(
    "size_t",
    "long",
    "NativeLayout.C_SIZE_T",
    "long",
    "PointerPtr",
    "PointerPtr"
)

private val pvoidType = CPointerType(voidType, const = false, pointerToOne = false, comment = null)

private val knownTypes = mapOf(
    // Fundamental types
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
    "long" to cLongType,
    "size_t" to cSizeType,

    "char" to int8Type,
    "unsigned char" to uint8Type,
    "short" to int16Type,
    "unsigned short" to uint16Type,

    // GLES2 base types
    "GLbyte" to int8Type,
    "GLubyte" to uint8Type,
    "GLchar" to int8Type,
    "GLuchar" to uint8Type,
    "GLclampf" to floatType,
    "GLfixed" to int32Type,
    "GLint" to int32Type,
    "GLuint" to uint32Type,
    "GLshort" to int16Type,
    "Glushort" to uint16Type,
    "GLfloat" to floatType,
    "GLvoid" to voidType,
    "GLenum" to int32Type,
    "GLsizei" to int32Type,
    "GLsizeiptr" to cSizeType,
    "GLintptr" to cSizeType,
    "GLbitfield" to uint32Type,
    "GLboolean" to uint8Type,

    // Vulkan base types
    "VkSampleMask" to uint32Type,
    "VkBool32" to uint32Type,
    "VkFlags" to uint32Type,
    "VkFlags64" to uint64Type,
    "VkDeviceSize" to uint64Type,
    "VkDeviceAddress" to uint64Type,
    "VkRemoteAddressNV" to pvoidType,

    // Android
    "ANativeWindow" to pvoidType,
    "AHardwareBuffer" to pvoidType,

    // DirectFB
    "IDirectFB" to pvoidType,
    "IDirectFBSurface" to pvoidType,

    // iOS or macOS
    "id" to pvoidType,
    "CAMetalLayer" to pvoidType,
    "GgpFrameToken" to uint32Type,
    "GgpStreamDescriptor" to uint32Type,
    "IOSurfaceRef" to pvoidType,
    "MTLBuffer_id" to pvoidType,
    "MTLCommandQueue_id" to pvoidType,
    "MTLDevice_id" to pvoidType,
    "MTLSharedEvent_id" to pvoidType,
    "MTLTexture_id" to pvoidType,
    "CGDirectDisplayID" to uint32Type,

    // QNX
    "_screen_buffer" to pvoidType,
    "_screen_context" to pvoidType,
    "_screen_window" to pvoidType,

    // Wayland
    "wl_display" to pvoidType,
    "wl_surface" to pvoidType,
    "wl_output" to voidType,

    // Windows
    "DWORD" to uint32Type,
    "HANDLE" to pvoidType,
    "HINSTANCE" to pvoidType,
    "HMONITOR" to pvoidType,
    "HWND" to pvoidType,
    "LPCWSTR" to CPointerType(uint16Type, const = true, pointerToOne = false, comment = null),
    "SECURITY_ATTRIBUTES" to voidType,
    "HGLRC" to pvoidType,

    // X11
    "Display" to pvoidType,
    "RROutput" to cLongType,
    "RRCrtc" to cLongType,
    "VisualID" to cLongType,
    "Window" to cLongType,
    "GLXContext" to pvoidType,
    "GLXWindow" to cLongType,
    "xcb_connection_t" to voidType,
    "xcb_visualid_t" to uint32Type,
    "xcb_window_t" to uint32Type,
    "xcb_handle_t" to uint32Type,

    // EGL
    "EGLDisplay" to pvoidType,
    "EGLContext" to pvoidType,
    "EGLSurface" to pvoidType,

    // MESA
    "OSMesaContext" to pvoidType,

    // NvSciBuf / NvSciSync
    "NvSciBufAttrList" to pvoidType,
    "NvSciBufObj" to pvoidType,
    "NvSciSyncAttrList" to pvoidType,
    "NvSciSyncObj" to pvoidType,
    "NvSciSyncFence" to CArrayType(uint64Type, "6"),

    // FUCHSIA
    "zx_handle_t" to uint32Type,
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
            if (type.pointee is IdentifierType &&
                (registry.opaqueTypedefs.contains(type.pointee.ident)
                 || refRegistries.any { it.opaqueTypedefs.contains(type.pointee.ident) })) {
                return CHandleType(type.pointee.ident.value)
            }

            val pointee = lowerType(registry, refRegistries, type.pointee)
            CPointerType(pointee, type.const, type.pointerToOne, comment=null)
        }
        is IdentifierType -> lowerIdentifierType(registry, refRegistries, type)
    }
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
        CStructType(type.ident.value)
    }
    else if (registry.unions.contains(type.ident)) {
        CStructType(type.ident.value)
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
        lowerType(registry, refRegistries, alias.type)
    }
    else if (knownTypes.containsKey(type.ident.value)) {
        knownTypes[type.ident.value]!!
    } else {
        null
    }

private fun String.isNumeric() = all { it.isDigit() }
