package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineRobustnessProperties.html"><code>VkPhysicalDevicePipelineRobustnessProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePipelineRobustnessProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
/// } VkPhysicalDevicePipelineRobustnessProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES`
///
/// The {@link VkPhysicalDevicePipelineRobustnessProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDevicePipelineRobustnessProperties#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePipelineRobustnessProperties.html"><code>VkPhysicalDevicePipelineRobustnessProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevicePipelineRobustnessProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDevicePipelineRobustnessProperties allocate(Arena arena) {
        VkPhysicalDevicePipelineRobustnessProperties ret = new VkPhysicalDevicePipelineRobustnessProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineRobustnessProperties[] ret = new VkPhysicalDevicePipelineRobustnessProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePipelineRobustnessProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties clone(Arena arena, VkPhysicalDevicePipelineRobustnessProperties src) {
        VkPhysicalDevicePipelineRobustnessProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineRobustnessProperties[] clone(Arena arena, VkPhysicalDevicePipelineRobustnessProperties[] src) {
        VkPhysicalDevicePipelineRobustnessProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES);
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

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessStorageBuffers() {
        return segment.get(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers);
    }

    public void defaultRobustnessStorageBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessStorageBuffers, OFFSET$defaultRobustnessStorageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessUniformBuffers() {
        return segment.get(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers);
    }

    public void defaultRobustnessUniformBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessUniformBuffers, OFFSET$defaultRobustnessUniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int defaultRobustnessVertexInputs() {
        return segment.get(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs);
    }

    public void defaultRobustnessVertexInputs(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessVertexInputs, OFFSET$defaultRobustnessVertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehavior.class) int defaultRobustnessImages() {
        return segment.get(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages);
    }

    public void defaultRobustnessImages(@enumtype(VkPipelineRobustnessImageBehavior.class) int value) {
        segment.set(LAYOUT$defaultRobustnessImages, OFFSET$defaultRobustnessImages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$defaultRobustnessStorageBuffers = PathElement.groupElement("PATH$defaultRobustnessStorageBuffers");
    public static final PathElement PATH$defaultRobustnessUniformBuffers = PathElement.groupElement("PATH$defaultRobustnessUniformBuffers");
    public static final PathElement PATH$defaultRobustnessVertexInputs = PathElement.groupElement("PATH$defaultRobustnessVertexInputs");
    public static final PathElement PATH$defaultRobustnessImages = PathElement.groupElement("PATH$defaultRobustnessImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$defaultRobustnessStorageBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessStorageBuffers);
    public static final OfInt LAYOUT$defaultRobustnessUniformBuffers = (OfInt) LAYOUT.select(PATH$defaultRobustnessUniformBuffers);
    public static final OfInt LAYOUT$defaultRobustnessVertexInputs = (OfInt) LAYOUT.select(PATH$defaultRobustnessVertexInputs);
    public static final OfInt LAYOUT$defaultRobustnessImages = (OfInt) LAYOUT.select(PATH$defaultRobustnessImages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$defaultRobustnessStorageBuffers = LAYOUT$defaultRobustnessStorageBuffers.byteSize();
    public static final long SIZE$defaultRobustnessUniformBuffers = LAYOUT$defaultRobustnessUniformBuffers.byteSize();
    public static final long SIZE$defaultRobustnessVertexInputs = LAYOUT$defaultRobustnessVertexInputs.byteSize();
    public static final long SIZE$defaultRobustnessImages = LAYOUT$defaultRobustnessImages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessStorageBuffers);
    public static final long OFFSET$defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PATH$defaultRobustnessUniformBuffers);
    public static final long OFFSET$defaultRobustnessVertexInputs = LAYOUT.byteOffset(PATH$defaultRobustnessVertexInputs);
    public static final long OFFSET$defaultRobustnessImages = LAYOUT.byteOffset(PATH$defaultRobustnessImages);
}
