package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t perViewRenderAreaCount;
///     const VkRect2D* pPerViewRenderAreas;
/// } VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.html">VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM</a>
public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) implements IPointer {
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
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

    public @unsigned int perViewRenderAreaCount() {
        return segment.get(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount);
    }

    public void perViewRenderAreaCount(@unsigned int value) {
        segment.set(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pPerViewRenderAreasRaw() {
        return segment.get(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas);
    }

    public void pPerViewRenderAreasRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas, value);
    }

    public @nullable VkRect2D pPerViewRenderAreas() {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRect2D[] pPerViewRenderAreas(int assumedCount) {
        MemorySegment s = pPerViewRenderAreasRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pPerViewRenderAreas(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPerViewRenderAreasRaw(s);
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM allocate(Arena arena) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] ret = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewRenderAreaCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pPerViewRenderAreas")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$perViewRenderAreaCount = PathElement.groupElement("perViewRenderAreaCount");
    public static final PathElement PATH$pPerViewRenderAreas = PathElement.groupElement("pPerViewRenderAreas");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewRenderAreaCount = (OfInt) LAYOUT.select(PATH$perViewRenderAreaCount);
    public static final AddressLayout LAYOUT$pPerViewRenderAreas = (AddressLayout) LAYOUT.select(PATH$pPerViewRenderAreas);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewRenderAreaCount = LAYOUT.byteOffset(PATH$perViewRenderAreaCount);
    public static final long OFFSET$pPerViewRenderAreas = LAYOUT.byteOffset(PATH$pPerViewRenderAreas);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perViewRenderAreaCount = LAYOUT$perViewRenderAreaCount.byteSize();
    public static final long SIZE$pPerViewRenderAreas = LAYOUT$pPerViewRenderAreas.byteSize();
}
