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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.html">VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM</a>
@ValueBasedCandidate
public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$perViewRenderAreaCount = ValueLayout.JAVA_INT.withName("perViewRenderAreaCount");
    public static final AddressLayout LAYOUT$pPerViewRenderAreas = ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pPerViewRenderAreas");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$perViewRenderAreaCount, LAYOUT$pPerViewRenderAreas);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM allocate(Arena arena) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] ret = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM clone(Arena arena, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) {
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] clone(Arena arena, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] src) {
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$perViewRenderAreaCount = PathElement.groupElement("PATH$perViewRenderAreaCount");
    public static final PathElement PATH$pPerViewRenderAreas = PathElement.groupElement("PATH$pPerViewRenderAreas");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perViewRenderAreaCount = LAYOUT$perViewRenderAreaCount.byteSize();
    public static final long SIZE$pPerViewRenderAreas = LAYOUT$pPerViewRenderAreas.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewRenderAreaCount = LAYOUT.byteOffset(PATH$perViewRenderAreaCount);
    public static final long OFFSET$pPerViewRenderAreas = LAYOUT.byteOffset(PATH$pPerViewRenderAreas);

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

    public @Nullable VkRect2D pPerViewRenderAreas() {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pPerViewRenderAreas(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPerViewRenderAreasRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pPerViewRenderAreas(int assumedCount) {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return ret;
    }

}
