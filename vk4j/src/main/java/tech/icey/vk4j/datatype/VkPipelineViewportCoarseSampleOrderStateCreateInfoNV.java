package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.vk4j.enumtype.VkCoarseSampleOrderTypeNV;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkCoarseSampleOrderTypeNV sampleOrderType;
///     uint32_t customSampleOrderCount;
///     const VkCoarseSampleOrderCustomNV* pCustomSampleOrders;
/// } VkPipelineViewportCoarseSampleOrderStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.html">VkPipelineViewportCoarseSampleOrderStateCreateInfoNV</a>
public record VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
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

    public @nullable VkCoarseSampleOrderCustomNV pCustomSampleOrders() {
        MemorySegment s = pCustomSampleOrdersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCoarseSampleOrderCustomNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkCoarseSampleOrderCustomNV[] pCustomSampleOrders(int assumedCount) {
        MemorySegment s = pCustomSampleOrdersRaw().reinterpret(assumedCount * VkCoarseSampleOrderCustomNV.SIZE);
        VkCoarseSampleOrderCustomNV[] arr = new VkCoarseSampleOrderCustomNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkCoarseSampleOrderCustomNV(s.asSlice(i * VkCoarseSampleOrderCustomNV.SIZE, VkCoarseSampleOrderCustomNV.SIZE));
        }
        return arr;
    }

    public void pCustomSampleOrders(@nullable VkCoarseSampleOrderCustomNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCustomSampleOrdersRaw(s);
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[] ret = new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleOrderType"),
        ValueLayout.JAVA_INT.withName("customSampleOrderCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleOrderCustomNV.LAYOUT).withName("pCustomSampleOrders")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sampleOrderType = PathElement.groupElement("sampleOrderType");
    public static final PathElement PATH$customSampleOrderCount = PathElement.groupElement("customSampleOrderCount");
    public static final PathElement PATH$pCustomSampleOrders = PathElement.groupElement("pCustomSampleOrders");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleOrderType = (OfInt) LAYOUT.select(PATH$sampleOrderType);
    public static final OfInt LAYOUT$customSampleOrderCount = (OfInt) LAYOUT.select(PATH$customSampleOrderCount);
    public static final AddressLayout LAYOUT$pCustomSampleOrders = (AddressLayout) LAYOUT.select(PATH$pCustomSampleOrders);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleOrderType = LAYOUT.byteOffset(PATH$sampleOrderType);
    public static final long OFFSET$customSampleOrderCount = LAYOUT.byteOffset(PATH$customSampleOrderCount);
    public static final long OFFSET$pCustomSampleOrders = LAYOUT.byteOffset(PATH$pCustomSampleOrders);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleOrderType = LAYOUT$sampleOrderType.byteSize();
    public static final long SIZE$customSampleOrderCount = LAYOUT$customSampleOrderCount.byteSize();
    public static final long SIZE$pCustomSampleOrders = LAYOUT$pCustomSampleOrders.byteSize();
}
