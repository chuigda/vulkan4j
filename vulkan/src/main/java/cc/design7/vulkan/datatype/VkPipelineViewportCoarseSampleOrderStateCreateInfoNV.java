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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.html">VkPipelineViewportCoarseSampleOrderStateCreateInfoNV</a>
@ValueBasedCandidate
public record VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$sampleOrderType = ValueLayout.JAVA_INT.withName("sampleOrderType");
    public static final OfInt LAYOUT$customSampleOrderCount = ValueLayout.JAVA_INT.withName("customSampleOrderCount");
    public static final AddressLayout LAYOUT$pCustomSampleOrders = ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleOrderCustomNV.LAYOUT).withName("pCustomSampleOrders");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$sampleOrderType, LAYOUT$customSampleOrderCount, LAYOUT$pCustomSampleOrders);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] ret = new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV clone(Arena arena, VkPipelineViewportCoarseSampleOrderStateCreateInfoNV src) {
        VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] src) {
        VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sampleOrderType = PathElement.groupElement("PATH$sampleOrderType");
    public static final PathElement PATH$customSampleOrderCount = PathElement.groupElement("PATH$customSampleOrderCount");
    public static final PathElement PATH$pCustomSampleOrders = PathElement.groupElement("PATH$pCustomSampleOrders");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleOrderType = LAYOUT$sampleOrderType.byteSize();
    public static final long SIZE$customSampleOrderCount = LAYOUT$customSampleOrderCount.byteSize();
    public static final long SIZE$pCustomSampleOrders = LAYOUT$pCustomSampleOrders.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleOrderType = LAYOUT.byteOffset(PATH$sampleOrderType);
    public static final long OFFSET$customSampleOrderCount = LAYOUT.byteOffset(PATH$customSampleOrderCount);
    public static final long OFFSET$pCustomSampleOrders = LAYOUT.byteOffset(PATH$pCustomSampleOrders);

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

    public @enumtype(VkCoarseSampleOrderTypeNV.class) int sampleOrderType() {
        return segment.get(LAYOUT$sampleOrderType, OFFSET$sampleOrderType);
    }

    public void sampleOrderType(@enumtype(VkCoarseSampleOrderTypeNV.class) int value) {
        segment.set(LAYOUT$sampleOrderType, OFFSET$sampleOrderType, value);
    }

    public @unsigned int customSampleOrderCount() {
        return segment.get(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount);
    }

    public void customSampleOrderCount(@unsigned int value) {
        segment.set(LAYOUT$customSampleOrderCount, OFFSET$customSampleOrderCount, value);
    }

    public @pointer(comment="VkCoarseSampleOrderCustomNV*") MemorySegment pCustomSampleOrdersRaw() {
        return segment.get(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders);
    }

    public void pCustomSampleOrdersRaw(@pointer(comment="VkCoarseSampleOrderCustomNV*") MemorySegment value) {
        segment.set(LAYOUT$pCustomSampleOrders, OFFSET$pCustomSampleOrders, value);
    }

    public @Nullable VkCoarseSampleOrderCustomNV pCustomSampleOrders() {
        MemorySegment s = pCustomSampleOrdersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCoarseSampleOrderCustomNV(s);
    }

    public void pCustomSampleOrders(@Nullable VkCoarseSampleOrderCustomNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCustomSampleOrdersRaw(s);
    }

    @unsafe public @Nullable VkCoarseSampleOrderCustomNV[] pCustomSampleOrders(int assumedCount) {
        MemorySegment s = pCustomSampleOrdersRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCoarseSampleOrderCustomNV.SIZE);
        VkCoarseSampleOrderCustomNV[] ret = new VkCoarseSampleOrderCustomNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCoarseSampleOrderCustomNV(s.asSlice(i * VkCoarseSampleOrderCustomNV.SIZE, VkCoarseSampleOrderCustomNV.SIZE));
        }
        return ret;
    }

}
