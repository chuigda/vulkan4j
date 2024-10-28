package codegen

import ArrayType
import IdentifierType
import PointerType
import Registry
import Type

sealed interface CType {
    val jType: String
    val jLayout: String
    val jLayoutType: String
    val cType: String

    val jDescriptorParamLayout: String get() = jLayout
}

class CVoidType : CType {
    override val jType: String = "void"
    override val jLayout: String get() = throw NotImplementedError("should not call `jLayout` on `void`")
    override val jLayoutType: String get() = throw NotImplementedError("should not call `jLayoutType` on `void`")
    override val cType: String = "void"
}

val voidType = CVoidType()

data class CPointerType(val pointee: CType, val const: Boolean, val comment: String?) : CType {
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
    override val jType: String get() = throw NotImplementedError("should not call `jRawType` on `array`")
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
    val jBufferType: String
    val jBufferTypeNoAnnotation: String
}

data class CFixedIntType(val cName: String, val byteSize: Int, val unsigned: Boolean) : CNonRefType {
    override val jType: String get() = """${if (unsigned) "@unsigned " else ""}$jTypeNoSign"""
    override val jLayout: String get() = when (byteSize) {
        1 -> "ValueLayout.JAVA_BYTE"
        2 -> "ValueLayout.JAVA_SHORT"
        4 -> "ValueLayout.JAVA_INT"
        8 -> "ValueLayout.JAVA_LONG"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jLayoutType: String get() = when (byteSize) {
        1 -> "OfByte"
        2 -> "OfShort"
        4 -> "OfInt"
        8 -> "OfLong"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val cType: String = cName
    override val jTypeNoSign: String get() = when (byteSize) {
        1 -> "byte"
        2 -> "short"
        4 -> "int"
        8 -> "long"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jBufferType: String get() = """${if (unsigned) "@unsigned " else ""}$jBufferTypeNoAnnotation"""
    override val jBufferTypeNoAnnotation: String get() = when (byteSize) {
        1 -> "ByteBuffer"
        2 -> "ShortBuffer"
        4 -> "IntBuffer"
        8 -> "LongBuffer"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
}

data class CPlatformDependentIntType(
    override val cType: String,
    override val jType: String,
    override val jLayout: String,
    override val jTypeNoSign: String,
    override val jBufferType: String,
    override val jBufferTypeNoAnnotation: String
) : CNonRefType {
    override val jLayoutType: String get() = throw NotImplementedError("should not call `jLayoutType` on `CPlatformDependentIntType`")
}

data class CFloatType(val byteSize: Int) : CNonRefType {
    override val jType: String get() = when (byteSize) {
        4 -> "float"
        8 -> "double"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jLayout: String get() = when (byteSize) {
        4 -> "ValueLayout.JAVA_FLOAT"
        8 -> "ValueLayout.JAVA_DOUBLE"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jLayoutType: String = when (byteSize) {
        4 -> "OfFloat"
        8 -> "OfDouble"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val cType: String = when (byteSize) {
        4 -> "float"
        8 -> "double"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jTypeNoSign: String get() = jType
    override val jBufferType: String get() = when (byteSize) {
        4 -> "FloatBuffer"
        8 -> "DoubleBuffer"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jBufferTypeNoAnnotation: String get() = jBufferType
}

data class CStructType(val name: String): CType {
    override val jType: String = name
    override val jLayout: String = "$name.LAYOUT"
    override val jLayoutType: String = "StructLayout"
    override val cType: String = name
}

data class CEnumType(val name: String, val bitwidth: Int? = null): CNonRefType {
    override val jType: String get() = when (bitwidth) {
        null, 32 -> {
            "@enumtype($name.class) int"
        }
        64 -> {
            "@enumtype($name.class) long"
        }
        else -> {
            throw NotImplementedError("unsupported bitwidth: $bitwidth")
        }
    }

    override val jLayout: String get() = when (bitwidth) {
        null, 32 -> "ValueLayout.JAVA_INT"
        64 -> "ValueLayout.JAVA_LONG"
        else -> throw NotImplementedError("unsupported bitwidth: $bitwidth")
    }

    override val jLayoutType: String = when (bitwidth) {
        null, 32 -> "OfInt"
        64 -> "OfLong"
        else -> throw NotImplementedError("unsupported bitwidth: $bitwidth")
    }

    override val cType: String = "enum $name"

    override val jTypeNoSign: String get() = when (bitwidth) {
        null, 32 -> "int"
        64 -> "long"
        else -> throw NotImplementedError("unsupported bitwidth: $bitwidth")
    }

    override val jBufferType: String = when (bitwidth) {
        null, 32 -> "@enumtype($name.class) IntBuffer"
        64 -> "@enumtype($name.class) LongBuffer"
        else -> throw NotImplementedError("unsupported bitwidth: $bitwidth")
    }

    override val jBufferTypeNoAnnotation: String = when (bitwidth) {
        null, 32 -> "IntBuffer"
        64 -> "LongBuffer"
        else -> throw NotImplementedError("unsupported bitwidth: $bitwidth")
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
    "CLongBuffer",
    "CLongBuffer"
)
private val cSizeType = CPlatformDependentIntType(
    "size_t",
    "long",
    "NativeLayout.C_SIZE_T",
    "long",
    "PointerBuffer",
    "PointerBuffer"
)

private val pvoidType = CPointerType(voidType, false, null)

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
    "VkBool32" to uint32Type,
    "VkFlags" to uint32Type,
    "VkFlags64" to uint64Type,
    "VkDeviceSize" to uint64Type,
    "VkDeviceAddress" to uint64Type,
    "VkRemoteAddressNV" to pvoidType,

    // For non-vulkan functions to properly interact with types when we're generating for GLFW or VMA or things like
    // such. In case of we're generating Vulkan API binding, these will be actually overrided by the entries provided
    // by vk.xml.
    "VkInstance" to CHandleType("VkInstance"),
    "VkPhysicalDevice" to CHandleType("VkPhysicalDevice"),
    "VkSurfaceKHR" to CHandleType("VkSurfaceKHR"),
    "VkAllocationCallbacks" to CStructType("VkAllocationCallbacks"),
    "VkPhysicalDeviceProperties" to CStructType("VkPhysicalDeviceProperties"),
    "VkPhysicalDeviceMemoryProperties" to CStructType("VkPhysicalDeviceMemoryProperties"),
    "VkMemoryPropertyFlags" to CEnumType("VkMemoryPropertyFlags"),
    "VkBufferCreateInfo" to CStructType("VkBufferCreateInfo"),
    "VkImageCreateInfo" to CStructType("VkImageCreateInfo"),
    "VkMemoryRequirements" to CStructType("VkMemoryRequirements"),
    "VkBuffer" to CHandleType("VkBuffer"),
    "VkImage" to CHandleType("VkImage"),
    "VkDevice" to CHandleType("VkDevice"),
    "VkDeviceMemory" to CHandleType("VkDeviceMemory"),
    "VkExternalMemoryHandleTypeFlagsKHR" to CEnumType("VkExternalMemoryHandleTypeFlags"),
    "VkResult" to int32Type,
    "PFN_vkGetInstanceProcAddr" to CPointerType(voidType, false, comment="PFN_vkGetInstanceProcAddr"),
    "PFN_vkGetDeviceProcAddr" to CPointerType(voidType, false, comment="PFN_vkGetDeviceProcAddr"),
    "PFN_vkGetPhysicalDeviceProperties" to CPointerType(voidType, false, comment="PFN_vkGetPhysicalDeviceProperties"),
    "PFN_vkGetPhysicalDeviceMemoryProperties" to CPointerType(voidType, false, comment="PFN_vkGetPhysicalDeviceMemoryProperties"),
    "PFN_vkAllocateMemory" to CPointerType(voidType, false, comment="PFN_vkAllocateMemory"),
    "PFN_vkFreeMemory" to CPointerType(voidType, false, comment="PFN_vkFreeMemory"),
    "PFN_vkMapMemory" to CPointerType(voidType, false, comment="PFN_vkMapMemory"),
    "PFN_vkUnmapMemory" to CPointerType(voidType, false, comment="PFN_vkUnmapMemory"),
    "PFN_vkFlushMappedMemoryRanges" to CPointerType(voidType, false, comment="PFN_vkFlushMappedMemoryRanges"),
    "PFN_vkInvalidateMappedMemoryRanges" to CPointerType(voidType, false, comment="PFN_vkInvalidateMappedMemoryRanges"),
    "PFN_vkBindBufferMemory" to CPointerType(voidType, false, comment="PFN_vkBindBufferMemory"),
    "PFN_vkBindImageMemory" to CPointerType(voidType, false, comment="PFN_vkBindImageMemory"),
    "PFN_vkGetBufferMemoryRequirements" to CPointerType(voidType, false, comment="PFN_vkGetBufferMemoryRequirements"),
    "PFN_vkGetImageMemoryRequirements" to CPointerType(voidType, false, comment="PFN_vkGetImageMemoryRequirements"),
    "PFN_vkCreateBuffer" to CPointerType(voidType, false, comment="PFN_vkCreateBuffer"),
    "PFN_vkDestroyBuffer" to CPointerType(voidType, false, comment="PFN_vkDestroyBuffer"),
    "PFN_vkCreateImage" to CPointerType(voidType, false, comment="PFN_vkCreateImage"),
    "PFN_vkDestroyImage" to CPointerType(voidType, false, comment="PFN_vkDestroyImage"),
    "PFN_vkCmdCopyBuffer" to CPointerType(voidType, false, comment="PFN_vkCmdCopyBuffer"),
    "PFN_vkGetBufferMemoryRequirements2KHR" to CPointerType(voidType, false, comment="PFN_vkGetBufferMemoryRequirements2KHR"),
    "PFN_vkGetImageMemoryRequirements2KHR" to CPointerType(voidType, false, comment="PFN_vkGetImageMemoryRequirements2KHR"),
    "PFN_vkBindBufferMemory2KHR" to CPointerType(voidType, false, comment="PFN_vkBindBufferMemory2KHR"),
    "PFN_vkBindImageMemory2KHR" to CPointerType(voidType, false, comment="PFN_vkBindImageMemory2KHR"),
    "PFN_vkGetPhysicalDeviceMemoryProperties2KHR" to CPointerType(voidType, false, comment="PFN_vkGetPhysicalDeviceMemoryProperties2KHR"),
    "PFN_vkGetDeviceBufferMemoryRequirementsKHR" to CPointerType(voidType, false, comment="PFN_vkGetDeviceBufferMemoryRequirementsKHR"),
    "PFN_vkGetDeviceImageMemoryRequirementsKHR" to CPointerType(voidType, false, comment="PFN_vkGetDeviceImageMemoryRequirementsKHR"),

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
    "LPCWSTR" to CPointerType(uint16Type, true, null),
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
)

fun lowerType(registry: Registry, type: Type): CType {
    return when(type) {
        is ArrayType -> {
            if (!type.length.isNumeric()) {
                if (!registry.constants.contains(type.length)) {
                    throw Exception("array type referred to an unknown constant ${type.length}")
                }
            }

            val elementType = lowerType(registry, type.element)
            CArrayType(elementType, type.length)
        }
        is PointerType -> {
            if (type.pointee is IdentifierType && registry.opaqueTypedefs.contains(type.pointee.ident)) {
                return CHandleType(type.pointee.ident)
            }

            val pointee = lowerType(registry, type.pointee)
            CPointerType(pointee, type.const, comment=null)
        }
        is IdentifierType -> lowerIdentifierType(registry, type)
    }
}

fun lowerIdentifierType(registry: Registry, type: IdentifierType): CType {
    return if (registry.structs.contains(type.ident)) {
        CStructType(type.ident)
    }
    else if (registry.enums.contains(type.ident)) {
        CEnumType(type.ident)
    }
    else if (registry.bitmasks.contains(type.ident)) {
        CEnumType(type.ident, bitwidth=registry.bitmasks[type.ident]!!.bitwidth)
    }
    else if (registry.handles.contains(type.ident)) {
        CHandleType(type.ident)
    }
    else if (registry.functionTypedefs.contains(type.ident)) {
        CPointerType(voidType, false, comment=type.ident)
    }
    else if (knownTypes.containsKey(type.ident)) {
        knownTypes[type.ident]!!
    }
    else {
        throw Exception("unknown type: ${type.ident}")
    }
}

private fun String.isNumeric() = all { it.isDigit() }
