package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineInputAssemblyStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineInputAssemblyStateCreateFlags flags;
///     VkPrimitiveTopology topology;
///     VkBool32 primitiveRestartEnable;
/// } VkPipelineInputAssemblyStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineInputAssemblyStateCreateInfo.html">VkPipelineInputAssemblyStateCreateInfo</a>
public record VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkPipelineInputAssemblyStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineInputAssemblyStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkPrimitiveTopology.class) int topology() {
        return segment.get(LAYOUT$topology, OFFSET$topology);
    }

    public void topology(@enumtype(VkPrimitiveTopology.class) int value) {
        segment.set(LAYOUT$topology, OFFSET$topology, value);
    }

    public @unsigned int primitiveRestartEnable() {
        return segment.get(LAYOUT$primitiveRestartEnable, OFFSET$primitiveRestartEnable);
    }

    public void primitiveRestartEnable(@unsigned int value) {
        segment.set(LAYOUT$primitiveRestartEnable, OFFSET$primitiveRestartEnable, value);
    }

    public static VkPipelineInputAssemblyStateCreateInfo allocate(Arena arena) {
        return new VkPipelineInputAssemblyStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineInputAssemblyStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineInputAssemblyStateCreateInfo[] ret = new VkPipelineInputAssemblyStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineInputAssemblyStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineInputAssemblyStateCreateInfo clone(Arena arena, VkPipelineInputAssemblyStateCreateInfo src) {
        VkPipelineInputAssemblyStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineInputAssemblyStateCreateInfo[] clone(Arena arena, VkPipelineInputAssemblyStateCreateInfo[] src) {
        VkPipelineInputAssemblyStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("primitiveRestartEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$topology = PathElement.groupElement("topology");
    public static final PathElement PATH$primitiveRestartEnable = PathElement.groupElement("primitiveRestartEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$topology = (OfInt) LAYOUT.select(PATH$topology);
    public static final OfInt LAYOUT$primitiveRestartEnable = (OfInt) LAYOUT.select(PATH$primitiveRestartEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$topology = LAYOUT.byteOffset(PATH$topology);
    public static final long OFFSET$primitiveRestartEnable = LAYOUT.byteOffset(PATH$primitiveRestartEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$topology = LAYOUT$topology.byteSize();
    public static final long SIZE$primitiveRestartEnable = LAYOUT$primitiveRestartEnable.byteSize();
}
