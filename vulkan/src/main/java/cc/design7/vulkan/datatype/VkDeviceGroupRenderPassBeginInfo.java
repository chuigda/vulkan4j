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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupRenderPassBeginInfo.html">VkDeviceGroupRenderPassBeginInfo</a>
@ValueBasedCandidate
public record VkDeviceGroupRenderPassBeginInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$deviceMask = ValueLayout.JAVA_INT.withName("deviceMask");
    public static final OfInt LAYOUT$deviceRenderAreaCount = ValueLayout.JAVA_INT.withName("deviceRenderAreaCount");
    public static final AddressLayout LAYOUT$pDeviceRenderAreas = ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pDeviceRenderAreas");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$deviceMask, LAYOUT$deviceRenderAreaCount, LAYOUT$pDeviceRenderAreas);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupRenderPassBeginInfo allocate(Arena arena) {
        return new VkDeviceGroupRenderPassBeginInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupRenderPassBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupRenderPassBeginInfo[] ret = new VkDeviceGroupRenderPassBeginInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupRenderPassBeginInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupRenderPassBeginInfo clone(Arena arena, VkDeviceGroupRenderPassBeginInfo src) {
        VkDeviceGroupRenderPassBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupRenderPassBeginInfo[] clone(Arena arena, VkDeviceGroupRenderPassBeginInfo[] src) {
        VkDeviceGroupRenderPassBeginInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("PATH$deviceMask");
    public static final PathElement PATH$deviceRenderAreaCount = PathElement.groupElement("PATH$deviceRenderAreaCount");
    public static final PathElement PATH$pDeviceRenderAreas = PathElement.groupElement("PATH$pDeviceRenderAreas");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();
    public static final long SIZE$deviceRenderAreaCount = LAYOUT$deviceRenderAreaCount.byteSize();
    public static final long SIZE$pDeviceRenderAreas = LAYOUT$pDeviceRenderAreas.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);
    public static final long OFFSET$deviceRenderAreaCount = LAYOUT.byteOffset(PATH$deviceRenderAreaCount);
    public static final long OFFSET$pDeviceRenderAreas = LAYOUT.byteOffset(PATH$pDeviceRenderAreas);

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

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

    public @unsigned int deviceRenderAreaCount() {
        return segment.get(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount);
    }

    public void deviceRenderAreaCount(@unsigned int value) {
        segment.set(LAYOUT$deviceRenderAreaCount, OFFSET$deviceRenderAreaCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pDeviceRenderAreasRaw() {
        return segment.get(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas);
    }

    public void pDeviceRenderAreasRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceRenderAreas, OFFSET$pDeviceRenderAreas, value);
    }

    public @Nullable VkRect2D pDeviceRenderAreas() {
        MemorySegment s = pDeviceRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pDeviceRenderAreas(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceRenderAreasRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pDeviceRenderAreas(int assumedCount) {
        MemorySegment s = pDeviceRenderAreasRaw();
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
