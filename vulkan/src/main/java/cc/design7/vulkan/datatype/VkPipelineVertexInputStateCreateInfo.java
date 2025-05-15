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

public record VkPipelineVertexInputStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$vertexBindingDescriptionCount = ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount");
    public static final AddressLayout LAYOUT$pVertexBindingDescriptions = ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDescription.LAYOUT).withName("pVertexBindingDescriptions");
    public static final OfInt LAYOUT$vertexAttributeDescriptionCount = ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount");
    public static final AddressLayout LAYOUT$pVertexAttributeDescriptions = ValueLayout.ADDRESS.withTargetLayout(VkVertexInputAttributeDescription.LAYOUT).withName("pVertexAttributeDescriptions");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$vertexBindingDescriptionCount, LAYOUT$pVertexBindingDescriptions, LAYOUT$vertexAttributeDescriptionCount, LAYOUT$pVertexAttributeDescriptions);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineVertexInputStateCreateInfo allocate(Arena arena) {
        return new VkPipelineVertexInputStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineVertexInputStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputStateCreateInfo[] ret = new VkPipelineVertexInputStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$vertexBindingDescriptionCount = PathElement.groupElement("PATH$vertexBindingDescriptionCount");
    public static final PathElement PATH$pVertexBindingDescriptions = PathElement.groupElement("PATH$pVertexBindingDescriptions");
    public static final PathElement PATH$vertexAttributeDescriptionCount = PathElement.groupElement("PATH$vertexAttributeDescriptionCount");
    public static final PathElement PATH$pVertexAttributeDescriptions = PathElement.groupElement("PATH$pVertexAttributeDescriptions");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$vertexBindingDescriptionCount = LAYOUT$vertexBindingDescriptionCount.byteSize();
    public static final long SIZE$pVertexBindingDescriptions = LAYOUT$pVertexBindingDescriptions.byteSize();
    public static final long SIZE$vertexAttributeDescriptionCount = LAYOUT$vertexAttributeDescriptionCount.byteSize();
    public static final long SIZE$pVertexAttributeDescriptions = LAYOUT$pVertexAttributeDescriptions.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$vertexBindingDescriptionCount = LAYOUT.byteOffset(PATH$vertexBindingDescriptionCount);
    public static final long OFFSET$pVertexBindingDescriptions = LAYOUT.byteOffset(PATH$pVertexBindingDescriptions);
    public static final long OFFSET$vertexAttributeDescriptionCount = LAYOUT.byteOffset(PATH$vertexAttributeDescriptionCount);
    public static final long OFFSET$pVertexAttributeDescriptions = LAYOUT.byteOffset(PATH$pVertexAttributeDescriptions);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public void pVertexBindingDescriptions(@Nullable VkVertexInputBindingDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDescriptionsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputBindingDescription[] pVertexBindingDescriptions(int assumedCount) {
        MemorySegment s = pVertexBindingDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputBindingDescription.SIZE);
        VkVertexInputBindingDescription[] ret = new VkVertexInputBindingDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputBindingDescription(s.asSlice(i * VkVertexInputBindingDescription.SIZE, VkVertexInputBindingDescription.SIZE));
        }
        return ret;
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

    public void pVertexAttributeDescriptions(@Nullable VkVertexInputAttributeDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexAttributeDescriptionsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputAttributeDescription[] pVertexAttributeDescriptions(int assumedCount) {
        MemorySegment s = pVertexAttributeDescriptionsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputAttributeDescription.SIZE);
        VkVertexInputAttributeDescription[] ret = new VkVertexInputAttributeDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputAttributeDescription(s.asSlice(i * VkVertexInputAttributeDescription.SIZE, VkVertexInputAttributeDescription.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
