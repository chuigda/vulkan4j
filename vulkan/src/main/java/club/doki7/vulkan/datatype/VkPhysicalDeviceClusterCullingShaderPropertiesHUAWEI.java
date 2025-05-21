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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.html"><code>VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxWorkGroupCount; // @link substring="maxWorkGroupCount" target="#maxWorkGroupCount"
///     uint32_t maxWorkGroupSize; // @link substring="maxWorkGroupSize" target="#maxWorkGroupSize"
///     uint32_t maxOutputClusterCount; // @link substring="maxOutputClusterCount" target="#maxOutputClusterCount"
///     VkDeviceSize indirectBufferOffsetAlignment; // @link substring="indirectBufferOffsetAlignment" target="#indirectBufferOffsetAlignment"
/// } VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI`
///
/// The {@code allocate} ({@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#allocate(Arena)}, {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.html"><code>VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocate(Arena arena) {
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ret = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] ret = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
        }
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI clone(Arena arena, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) {
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] clone(Arena arena, VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] src) {
        VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
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

    public @unsigned int maxWorkGroupCount() {
        return segment.get(LAYOUT$maxWorkGroupCount, OFFSET$maxWorkGroupCount);
    }

    public void maxWorkGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxWorkGroupCount, OFFSET$maxWorkGroupCount, value);
    }

    public @unsigned int maxWorkGroupSize() {
        return segment.get(LAYOUT$maxWorkGroupSize, OFFSET$maxWorkGroupSize);
    }

    public void maxWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxWorkGroupSize, OFFSET$maxWorkGroupSize, value);
    }

    public @unsigned int maxOutputClusterCount() {
        return segment.get(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount);
    }

    public void maxOutputClusterCount(@unsigned int value) {
        segment.set(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount, value);
    }

    public @unsigned long indirectBufferOffsetAlignment() {
        return segment.get(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment);
    }

    public void indirectBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxWorkGroupCount = PathElement.groupElement("maxWorkGroupCount");
    public static final PathElement PATH$maxWorkGroupSize = PathElement.groupElement("maxWorkGroupSize");
    public static final PathElement PATH$maxOutputClusterCount = PathElement.groupElement("maxOutputClusterCount");
    public static final PathElement PATH$indirectBufferOffsetAlignment = PathElement.groupElement("indirectBufferOffsetAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxWorkGroupCount = (OfInt) LAYOUT.select(PATH$maxWorkGroupCount);
    public static final OfInt LAYOUT$maxWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxWorkGroupSize);
    public static final OfInt LAYOUT$maxOutputClusterCount = (OfInt) LAYOUT.select(PATH$maxOutputClusterCount);
    public static final OfLong LAYOUT$indirectBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$indirectBufferOffsetAlignment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxWorkGroupCount = LAYOUT$maxWorkGroupCount.byteSize();
    public static final long SIZE$maxWorkGroupSize = LAYOUT$maxWorkGroupSize.byteSize();
    public static final long SIZE$maxOutputClusterCount = LAYOUT$maxOutputClusterCount.byteSize();
    public static final long SIZE$indirectBufferOffsetAlignment = LAYOUT$indirectBufferOffsetAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWorkGroupCount = LAYOUT.byteOffset(PATH$maxWorkGroupCount);
    public static final long OFFSET$maxWorkGroupSize = LAYOUT.byteOffset(PATH$maxWorkGroupSize);
    public static final long OFFSET$maxOutputClusterCount = LAYOUT.byteOffset(PATH$maxOutputClusterCount);
    public static final long OFFSET$indirectBufferOffsetAlignment = LAYOUT.byteOffset(PATH$indirectBufferOffsetAlignment);
}
