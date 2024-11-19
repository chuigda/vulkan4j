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
/// typedef struct VkPipelineVertexInputStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineVertexInputStateCreateFlags flags;
///     uint32_t vertexBindingDescriptionCount;
///     const VkVertexInputBindingDescription* pVertexBindingDescriptions;
///     uint32_t vertexAttributeDescriptionCount;
///     const VkVertexInputAttributeDescription* pVertexAttributeDescriptions;
/// } VkPipelineVertexInputStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineVertexInputStateCreateInfo.html">VkPipelineVertexInputStateCreateInfo</a>
public record VkPipelineVertexInputStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineVertexInputStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineVertexInputStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int vertexBindingDescriptionCount() {
        return segment.get(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount);
    }

    public void vertexBindingDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDescriptionCount, OFFSET$vertexBindingDescriptionCount, value);
    }

    public @pointer(comment="VkVertexInputBindingDescription*") MemorySegment pVertexBindingDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions);
    }

    public void pVertexBindingDescriptionsRaw(@pointer(comment="VkVertexInputBindingDescription*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDescriptions, OFFSET$pVertexBindingDescriptions, value);
    }

    public @Nullable VkVertexInputBindingDescription pVertexBindingDescriptions() {
        MemorySegment s = pVertexBindingDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputBindingDescription(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkVertexInputBindingDescription[] pVertexBindingDescriptions(int assumedCount) {
        MemorySegment s = pVertexBindingDescriptionsRaw().reinterpret(assumedCount * VkVertexInputBindingDescription.SIZE);
        VkVertexInputBindingDescription[] arr = new VkVertexInputBindingDescription[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkVertexInputBindingDescription(s.asSlice(i * VkVertexInputBindingDescription.SIZE, VkVertexInputBindingDescription.SIZE));
        }
        return arr;
    }

    public void pVertexBindingDescriptions(@Nullable VkVertexInputBindingDescription value) {
        pVertexBindingDescriptionsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned int vertexAttributeDescriptionCount() {
        return segment.get(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount);
    }

    public void vertexAttributeDescriptionCount(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeDescriptionCount, OFFSET$vertexAttributeDescriptionCount, value);
    }

    public @pointer(comment="VkVertexInputAttributeDescription*") MemorySegment pVertexAttributeDescriptionsRaw() {
        return segment.get(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions);
    }

    public void pVertexAttributeDescriptionsRaw(@pointer(comment="VkVertexInputAttributeDescription*") MemorySegment value) {
        segment.set(LAYOUT$pVertexAttributeDescriptions, OFFSET$pVertexAttributeDescriptions, value);
    }

    public @Nullable VkVertexInputAttributeDescription pVertexAttributeDescriptions() {
        MemorySegment s = pVertexAttributeDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputAttributeDescription(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkVertexInputAttributeDescription[] pVertexAttributeDescriptions(int assumedCount) {
        MemorySegment s = pVertexAttributeDescriptionsRaw().reinterpret(assumedCount * VkVertexInputAttributeDescription.SIZE);
        VkVertexInputAttributeDescription[] arr = new VkVertexInputAttributeDescription[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkVertexInputAttributeDescription(s.asSlice(i * VkVertexInputAttributeDescription.SIZE, VkVertexInputAttributeDescription.SIZE));
        }
        return arr;
    }

    public void pVertexAttributeDescriptions(@Nullable VkVertexInputAttributeDescription value) {
        pVertexAttributeDescriptionsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineVertexInputStateCreateInfo allocate(Arena arena) {
        return new VkPipelineVertexInputStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineVertexInputStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputStateCreateInfo[] ret = new VkPipelineVertexInputStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineVertexInputStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineVertexInputStateCreateInfo clone(Arena arena, VkPipelineVertexInputStateCreateInfo src) {
        VkPipelineVertexInputStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineVertexInputStateCreateInfo[] clone(Arena arena, VkPipelineVertexInputStateCreateInfo[] src) {
        VkPipelineVertexInputStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription.LAYOUT).withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription.LAYOUT).withName("pVertexAttributeDescriptions")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$vertexBindingDescriptionCount = PathElement.groupElement("vertexBindingDescriptionCount");
    public static final PathElement PATH$pVertexBindingDescriptions = PathElement.groupElement("pVertexBindingDescriptions");
    public static final PathElement PATH$vertexAttributeDescriptionCount = PathElement.groupElement("vertexAttributeDescriptionCount");
    public static final PathElement PATH$pVertexAttributeDescriptions = PathElement.groupElement("pVertexAttributeDescriptions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$vertexBindingDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexBindingDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexBindingDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDescriptions);
    public static final OfInt LAYOUT$vertexAttributeDescriptionCount = (OfInt) LAYOUT.select(PATH$vertexAttributeDescriptionCount);
    public static final AddressLayout LAYOUT$pVertexAttributeDescriptions = (AddressLayout) LAYOUT.select(PATH$pVertexAttributeDescriptions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$vertexBindingDescriptionCount = LAYOUT.byteOffset(PATH$vertexBindingDescriptionCount);
    public static final long OFFSET$pVertexBindingDescriptions = LAYOUT.byteOffset(PATH$pVertexBindingDescriptions);
    public static final long OFFSET$vertexAttributeDescriptionCount = LAYOUT.byteOffset(PATH$vertexAttributeDescriptionCount);
    public static final long OFFSET$pVertexAttributeDescriptions = LAYOUT.byteOffset(PATH$pVertexAttributeDescriptions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$vertexBindingDescriptionCount = LAYOUT$vertexBindingDescriptionCount.byteSize();
    public static final long SIZE$pVertexBindingDescriptions = LAYOUT$pVertexBindingDescriptions.byteSize();
    public static final long SIZE$vertexAttributeDescriptionCount = LAYOUT$vertexAttributeDescriptionCount.byteSize();
    public static final long SIZE$pVertexAttributeDescriptions = LAYOUT$pVertexAttributeDescriptions.byteSize();
}
