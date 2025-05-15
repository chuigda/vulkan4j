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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineVertexInputDivisorStateCreateInfo.html">VkPipelineVertexInputDivisorStateCreateInfo</a>
@ValueBasedCandidate
public record VkPipelineVertexInputDivisorStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$vertexBindingDivisorCount = ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount");
    public static final AddressLayout LAYOUT$pVertexBindingDivisors = ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDivisorDescription.LAYOUT).withName("pVertexBindingDivisors");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$vertexBindingDivisorCount, LAYOUT$pVertexBindingDivisors);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineVertexInputDivisorStateCreateInfo allocate(Arena arena) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputDivisorStateCreateInfo[] ret = new VkPipelineVertexInputDivisorStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineVertexInputDivisorStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo clone(Arena arena, VkPipelineVertexInputDivisorStateCreateInfo src) {
        VkPipelineVertexInputDivisorStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo[] clone(Arena arena, VkPipelineVertexInputDivisorStateCreateInfo[] src) {
        VkPipelineVertexInputDivisorStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexBindingDivisorCount = PathElement.groupElement("PATH$vertexBindingDivisorCount");
    public static final PathElement PATH$pVertexBindingDivisors = PathElement.groupElement("PATH$pVertexBindingDivisors");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexBindingDivisorCount = LAYOUT$vertexBindingDivisorCount.byteSize();
    public static final long SIZE$pVertexBindingDivisors = LAYOUT$pVertexBindingDivisors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexBindingDivisorCount = LAYOUT.byteOffset(PATH$vertexBindingDivisorCount);
    public static final long OFFSET$pVertexBindingDivisors = LAYOUT.byteOffset(PATH$pVertexBindingDivisors);

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

    public @unsigned int vertexBindingDivisorCount() {
        return segment.get(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount);
    }

    public void vertexBindingDivisorCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount, value);
    }

    public @pointer(comment="VkVertexInputBindingDivisorDescription*") MemorySegment pVertexBindingDivisorsRaw() {
        return segment.get(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors);
    }

    public void pVertexBindingDivisorsRaw(@pointer(comment="VkVertexInputBindingDivisorDescription*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors, value);
    }

    public @Nullable VkVertexInputBindingDivisorDescription pVertexBindingDivisors() {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescription(s);
    }

    public void pVertexBindingDivisors(@Nullable VkVertexInputBindingDivisorDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDivisorsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputBindingDivisorDescription[] pVertexBindingDivisors(int assumedCount) {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputBindingDivisorDescription.SIZE);
        VkVertexInputBindingDivisorDescription[] ret = new VkVertexInputBindingDivisorDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputBindingDivisorDescription(s.asSlice(i * VkVertexInputBindingDivisorDescription.SIZE, VkVertexInputBindingDivisorDescription.SIZE));
        }
        return ret;
    }

}
