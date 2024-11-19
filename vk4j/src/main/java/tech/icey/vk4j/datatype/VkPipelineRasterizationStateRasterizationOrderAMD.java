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
/// typedef struct VkPipelineRasterizationStateRasterizationOrderAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkRasterizationOrderAMD rasterizationOrder;
/// } VkPipelineRasterizationStateRasterizationOrderAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineRasterizationStateRasterizationOrderAMD.html">VkPipelineRasterizationStateRasterizationOrderAMD</a>
public record VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment) implements IPointer {
    public VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD);
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

    public @enumtype(VkRasterizationOrderAMD.class) int rasterizationOrder() {
        return segment.get(LAYOUT$rasterizationOrder, OFFSET$rasterizationOrder);
    }

    public void rasterizationOrder(@enumtype(VkRasterizationOrderAMD.class) int value) {
        segment.set(LAYOUT$rasterizationOrder, OFFSET$rasterizationOrder, value);
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD allocate(Arena arena) {
        return new VkPipelineRasterizationStateRasterizationOrderAMD(arena.allocate(LAYOUT));
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationStateRasterizationOrderAMD[] ret = new VkPipelineRasterizationStateRasterizationOrderAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineRasterizationStateRasterizationOrderAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD clone(Arena arena, VkPipelineRasterizationStateRasterizationOrderAMD src) {
        VkPipelineRasterizationStateRasterizationOrderAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRasterizationStateRasterizationOrderAMD[] clone(Arena arena, VkPipelineRasterizationStateRasterizationOrderAMD[] src) {
        VkPipelineRasterizationStateRasterizationOrderAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrder")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rasterizationOrder = PathElement.groupElement("rasterizationOrder");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rasterizationOrder = (OfInt) LAYOUT.select(PATH$rasterizationOrder);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rasterizationOrder = LAYOUT.byteOffset(PATH$rasterizationOrder);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rasterizationOrder = LAYOUT$rasterizationOrder.byteSize();
}
