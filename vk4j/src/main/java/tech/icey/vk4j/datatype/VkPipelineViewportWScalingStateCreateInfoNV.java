package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkPipelineViewportWScalingStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 viewportWScalingEnable;
///     uint32_t viewportCount;
///     const VkViewportWScalingNV* pViewportWScalings;
/// } VkPipelineViewportWScalingStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportWScalingStateCreateInfoNV.html">VkPipelineViewportWScalingStateCreateInfoNV</a>
public record VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
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

    public @unsigned int viewportWScalingEnable() {
        return segment.get(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable);
    }

    public void viewportWScalingEnable(@unsigned int value) {
        segment.set(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewportWScalingNV*") MemorySegment pViewportWScalingsRaw() {
        return segment.get(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings);
    }

    public void pViewportWScalingsRaw(@pointer(comment="VkViewportWScalingNV*") MemorySegment value) {
        segment.set(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings, value);
    }

    public @nullable VkViewportWScalingNV pViewportWScalings() {
        MemorySegment s = pViewportWScalingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewportWScalingNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkViewportWScalingNV[] pViewportWScalings(int assumedCount) {
        MemorySegment s = pViewportWScalingsRaw().reinterpret(assumedCount * VkViewportWScalingNV.SIZE);
        VkViewportWScalingNV[] arr = new VkViewportWScalingNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkViewportWScalingNV(s.asSlice(i * VkViewportWScalingNV.SIZE, VkViewportWScalingNV.SIZE));
        }
        return arr;
    }

    public void pViewportWScalings(@nullable VkViewportWScalingNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportWScalingsRaw(s);
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportWScalingStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportWScalingStateCreateInfoNV[] ret = new VkPipelineViewportWScalingStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineViewportWScalingStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV clone(Arena arena, VkPipelineViewportWScalingStateCreateInfoNV src) {
        VkPipelineViewportWScalingStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportWScalingStateCreateInfoNV[] src) {
        VkPipelineViewportWScalingStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewportWScalingNV.LAYOUT).withName("pViewportWScalings")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewportWScalingEnable = PathElement.groupElement("viewportWScalingEnable");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("viewportCount");
    public static final PathElement PATH$pViewportWScalings = PathElement.groupElement("pViewportWScalings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportWScalingEnable = (OfInt) LAYOUT.select(PATH$viewportWScalingEnable);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewportWScalings = (AddressLayout) LAYOUT.select(PATH$pViewportWScalings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportWScalingEnable = LAYOUT.byteOffset(PATH$viewportWScalingEnable);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportWScalings = LAYOUT.byteOffset(PATH$pViewportWScalings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewportWScalingEnable = LAYOUT$viewportWScalingEnable.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewportWScalings = LAYOUT$pViewportWScalings.byteSize();
}
