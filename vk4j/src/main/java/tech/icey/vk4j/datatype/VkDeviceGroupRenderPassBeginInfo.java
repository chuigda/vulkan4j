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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceGroupRenderPassBeginInfo.html">VkDeviceGroupRenderPassBeginInfo</a>
public record VkDeviceGroupRenderPassBeginInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pDeviceRenderAreas")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("deviceMask");
    public static final PathElement PATH$deviceRenderAreaCount = PathElement.groupElement("deviceRenderAreaCount");
    public static final PathElement PATH$pDeviceRenderAreas = PathElement.groupElement("pDeviceRenderAreas");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);
    public static final OfInt LAYOUT$deviceRenderAreaCount = (OfInt) LAYOUT.select(PATH$deviceRenderAreaCount);
    public static final AddressLayout LAYOUT$pDeviceRenderAreas = (AddressLayout) LAYOUT.select(PATH$pDeviceRenderAreas);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);
    public static final long OFFSET$deviceRenderAreaCount = LAYOUT.byteOffset(PATH$deviceRenderAreaCount);
    public static final long OFFSET$pDeviceRenderAreas = LAYOUT.byteOffset(PATH$pDeviceRenderAreas);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();
    public static final long SIZE$deviceRenderAreaCount = LAYOUT$deviceRenderAreaCount.byteSize();
    public static final long SIZE$pDeviceRenderAreas = LAYOUT$pDeviceRenderAreas.byteSize();

    public VkDeviceGroupRenderPassBeginInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO);
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
    
    public @nullable VkRect2D pDeviceRenderAreas() {
        MemorySegment s = pDeviceRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRect2D[] pDeviceRenderAreas(int assumedCount) {
        MemorySegment s = pDeviceRenderAreasRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pDeviceRenderAreas(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceRenderAreasRaw(s);
    }

    public static VkDeviceGroupRenderPassBeginInfo allocate(Arena arena) {
        return new VkDeviceGroupRenderPassBeginInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceGroupRenderPassBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupRenderPassBeginInfo[] ret = new VkDeviceGroupRenderPassBeginInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceGroupRenderPassBeginInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
