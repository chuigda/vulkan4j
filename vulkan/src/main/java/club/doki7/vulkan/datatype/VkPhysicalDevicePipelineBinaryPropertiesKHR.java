package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineBinaryPropertiesKHR.html"><code>VkPhysicalDevicePipelineBinaryPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePipelineBinaryPropertiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 pipelineBinaryInternalCache; // @link substring="pipelineBinaryInternalCache" target="#pipelineBinaryInternalCache"
///     VkBool32 pipelineBinaryInternalCacheControl; // @link substring="pipelineBinaryInternalCacheControl" target="#pipelineBinaryInternalCacheControl"
///     VkBool32 pipelineBinaryPrefersInternalCache; // @link substring="pipelineBinaryPrefersInternalCache" target="#pipelineBinaryPrefersInternalCache"
///     VkBool32 pipelineBinaryPrecompiledInternalCache; // @link substring="pipelineBinaryPrecompiledInternalCache" target="#pipelineBinaryPrecompiledInternalCache"
///     VkBool32 pipelineBinaryCompressedData; // @link substring="pipelineBinaryCompressedData" target="#pipelineBinaryCompressedData"
/// } VkPhysicalDevicePipelineBinaryPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR`
///
/// The {@code allocate} ({@link VkPhysicalDevicePipelineBinaryPropertiesKHR#allocate(Arena)}, {@link VkPhysicalDevicePipelineBinaryPropertiesKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDevicePipelineBinaryPropertiesKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineBinaryPropertiesKHR.html"><code>VkPhysicalDevicePipelineBinaryPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePipelineBinaryPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR allocate(Arena arena) {
        VkPhysicalDevicePipelineBinaryPropertiesKHR ret = new VkPhysicalDevicePipelineBinaryPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineBinaryPropertiesKHR[] ret = new VkPhysicalDevicePipelineBinaryPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR clone(Arena arena, VkPhysicalDevicePipelineBinaryPropertiesKHR src) {
        VkPhysicalDevicePipelineBinaryPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryPropertiesKHR[] clone(Arena arena, VkPhysicalDevicePipelineBinaryPropertiesKHR[] src) {
        VkPhysicalDevicePipelineBinaryPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int pipelineBinaryInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryInternalCache, OFFSET$pipelineBinaryInternalCache);
    }

    public void pipelineBinaryInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryInternalCache, OFFSET$pipelineBinaryInternalCache, value);
    }

    public @unsigned int pipelineBinaryInternalCacheControl() {
        return segment.get(LAYOUT$pipelineBinaryInternalCacheControl, OFFSET$pipelineBinaryInternalCacheControl);
    }

    public void pipelineBinaryInternalCacheControl(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryInternalCacheControl, OFFSET$pipelineBinaryInternalCacheControl, value);
    }

    public @unsigned int pipelineBinaryPrefersInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryPrefersInternalCache, OFFSET$pipelineBinaryPrefersInternalCache);
    }

    public void pipelineBinaryPrefersInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryPrefersInternalCache, OFFSET$pipelineBinaryPrefersInternalCache, value);
    }

    public @unsigned int pipelineBinaryPrecompiledInternalCache() {
        return segment.get(LAYOUT$pipelineBinaryPrecompiledInternalCache, OFFSET$pipelineBinaryPrecompiledInternalCache);
    }

    public void pipelineBinaryPrecompiledInternalCache(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryPrecompiledInternalCache, OFFSET$pipelineBinaryPrecompiledInternalCache, value);
    }

    public @unsigned int pipelineBinaryCompressedData() {
        return segment.get(LAYOUT$pipelineBinaryCompressedData, OFFSET$pipelineBinaryCompressedData);
    }

    public void pipelineBinaryCompressedData(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryCompressedData, OFFSET$pipelineBinaryCompressedData, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinaryInternalCache = PathElement.groupElement("pipelineBinaryInternalCache");
    public static final PathElement PATH$pipelineBinaryInternalCacheControl = PathElement.groupElement("pipelineBinaryInternalCacheControl");
    public static final PathElement PATH$pipelineBinaryPrefersInternalCache = PathElement.groupElement("pipelineBinaryPrefersInternalCache");
    public static final PathElement PATH$pipelineBinaryPrecompiledInternalCache = PathElement.groupElement("pipelineBinaryPrecompiledInternalCache");
    public static final PathElement PATH$pipelineBinaryCompressedData = PathElement.groupElement("pipelineBinaryCompressedData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBinaryInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryInternalCacheControl = (OfInt) LAYOUT.select(PATH$pipelineBinaryInternalCacheControl);
    public static final OfInt LAYOUT$pipelineBinaryPrefersInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryPrefersInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryPrecompiledInternalCache = (OfInt) LAYOUT.select(PATH$pipelineBinaryPrecompiledInternalCache);
    public static final OfInt LAYOUT$pipelineBinaryCompressedData = (OfInt) LAYOUT.select(PATH$pipelineBinaryCompressedData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaryInternalCache = LAYOUT$pipelineBinaryInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryInternalCacheControl = LAYOUT$pipelineBinaryInternalCacheControl.byteSize();
    public static final long SIZE$pipelineBinaryPrefersInternalCache = LAYOUT$pipelineBinaryPrefersInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryPrecompiledInternalCache = LAYOUT$pipelineBinaryPrecompiledInternalCache.byteSize();
    public static final long SIZE$pipelineBinaryCompressedData = LAYOUT$pipelineBinaryCompressedData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCache);
    public static final long OFFSET$pipelineBinaryInternalCacheControl = LAYOUT.byteOffset(PATH$pipelineBinaryInternalCacheControl);
    public static final long OFFSET$pipelineBinaryPrefersInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrefersInternalCache);
    public static final long OFFSET$pipelineBinaryPrecompiledInternalCache = LAYOUT.byteOffset(PATH$pipelineBinaryPrecompiledInternalCache);
    public static final long OFFSET$pipelineBinaryCompressedData = LAYOUT.byteOffset(PATH$pipelineBinaryCompressedData);
}
