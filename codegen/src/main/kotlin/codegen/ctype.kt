package codegen

sealed interface CType {
    val jRawType: String
    val jLayout: String
    val jLayoutType: String
    val cType: String

    val jDescriptorParamLayout: String get() = jLayout
}

class CVoidType : CType {
    override val jRawType: String = "void"
    override val jLayout: String get() = throw NotImplementedError("should not call `jLayout` on `void`")
    override val jLayoutType: String get() = throw NotImplementedError("should not call `jLayoutType` on `void`")
    override val cType: String = "void"
}

val voidType = CVoidType()

data class CPointerType(val pointee: CType, val const: Boolean, val comment: String?) : CType {
    override val jRawType: String = if (comment != null) {
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
    override val jRawType: String = name
    override val jLayout: String = "ValueLayout.ADDRESS"
    override val jLayoutType: String = "AddressLayout"
    override val cType: String = name
}

sealed class IntOrString {
    class Int(val value: kotlin.Int) : IntOrString()
    class String(val value: kotlin.String) : IntOrString()
}

data class CArrayType(val element: CType, val length: IntOrString) : CType {
    override val jRawType: String get() = throw NotImplementedError("should not call `jRawType` on `array`")
    override val jLayout: String = "ValueLayout.sequenceLayout($length, ${element.jLayout})"
    override val jLayoutType: String = "SequenceLayout"
    override val cType: String = "${element.cType}[$length]"

    override val jDescriptorParamLayout: String = "ValueLayout.ADDRESS.withElementLayout(${element.jLayout})"
}

sealed interface CNonRefType : CType {
    val jTypeNoSign: String
    val jBufferType: String
    val jBufferTypeNoSign: String
}

data class CFixedIntType(val cName: String, val byteSize: Int, val unsigned: Boolean) : CNonRefType {
    override val jRawType: String get() = """${if (unsigned) "@unsigned " else ""}$jTypeNoSign"""
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
    override val jBufferType: String get() = """${if (unsigned) "Unsigned" else ""}$jBufferTypeNoSign"""
    override val jBufferTypeNoSign: String get() = when (byteSize) {
        1 -> "ByteBuffer"
        2 -> "ShortBuffer"
        4 -> "IntBuffer"
        8 -> "LongBuffer"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
}

data class CPlatformDependentIntType(
    override val cType: String,
    override val jRawType: String,
    override val jLayout: String,
    override val jTypeNoSign: String,
    override val jBufferType: String,
    override val jBufferTypeNoSign: String
) : CNonRefType {
    override val jLayoutType: String get() = throw NotImplementedError("should not call `jLayoutType` on `CPlatformDependentIntType`")
}

data class CFloatType(val byteSize: Int) : CNonRefType {
    override val jRawType: String get() = when (byteSize) {
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
    override val jTypeNoSign: String get() = jRawType
    override val jBufferType: String get() = when (byteSize) {
        4 -> "FloatBuffer"
        8 -> "DoubleBuffer"
        else -> throw NotImplementedError("unsupported byte size: $byteSize")
    }
    override val jBufferTypeNoSign: String get() = jBufferType
}

data class CStructType(val name: String): CType {
    override val jRawType: String = name
    override val jLayout: String = "$name.LAYOUT"
    override val jLayoutType: String = "StructLayout"
    override val cType: String = name
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

    // Vulkan base types
    "VkBool32" to uint32Type,
    "VkFlags" to uint32Type,
    "VkFlags64" to uint64Type,
    "VkDeviceSize" to uint64Type,
    "VkDeviceAddress" to uint64Type,
    "VkRemoteAddressNV" to pvoidType,

    // For non-vulkan functions to properly interact with types
    "VkInstance" to CHandleType("VkInstance"),

    // Android
    "ANativeWindow" to pvoidType,
    "AHardwareBuffer" to pvoidType,

    // DirectFB
    "IDirectFB" to pvoidType,
    "IDirectFBSurface" to pvoidType,

    // iOS or MacOS
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

    // QNX
    "_screen_buffer" to pvoidType,
    "_screen_context" to pvoidType,
    "_screen_window" to pvoidType,

    // Wayland
    "wl_display" to pvoidType,
    "wl_surface" to pvoidType,

    // Windows
    "DWORD" to uint32Type,
    "HANDLE" to pvoidType,
    "HINSTANCE" to pvoidType,
    "HMONITOR" to pvoidType,
    "HWND" to pvoidType,
    "LPCWSTR" to CPointerType(uint16Type, true, null),
    "SECURITY_ATTRIBUTES" to voidType,

    // X11
    "Display" to pvoidType,
    "RROutput" to cLongType,
    "VisualID" to cLongType,
    "Window" to cLongType,
    "xcb_connection_t" to voidType,
    "xcb_visualid_t" to uint32Type,
    "xcb_window_t" to uint32Type,
    "xcb_handle_t" to uint32Type,

    // NvSciBuf / NvSciSync
    "NvSciBufAttrList" to pvoidType,
    "NvSciBufObj" to pvoidType,
    "NvSciSyncAttrList" to pvoidType,
    "NvSciSyncObj" to pvoidType,
    "NvSciSyncFence" to CArrayType(uint64Type, IntOrString.Int(6)),
)
