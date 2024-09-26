package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceImageMemoryRequirements(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT).withName("pCreateInfo"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("pCreateInfo");
    public static final PathElement PATH$planeAspect = PathElement.groupElement("planeAspect");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);
    public static final OfInt LAYOUT$planeAspect = (OfInt) LAYOUT.select(PATH$planeAspect);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
    public static final long OFFSET$planeAspect = LAYOUT.byteOffset(PATH$planeAspect);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();
    public static final long SIZE$planeAspect = LAYOUT$planeAspect.byteSize();

    public VkDeviceImageMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS);
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

    public @pointer(comment="VkImageCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkImageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }
    
    public @nullable VkImageCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageCreateInfo(s);
    }

    @unsafe
    public @nullable VkImageCreateInfo[] pCreateInfo(int assumedCount) {
        MemorySegment s = pCreateInfoRaw().reinterpret(assumedCount * VkImageCreateInfo.SIZE);
        VkImageCreateInfo[] arr = new VkImageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageCreateInfo(s.asSlice(i * VkImageCreateInfo.SIZE, VkImageCreateInfo.SIZE));
        }
        return arr;
    }

    public void pCreateInfo(@nullable VkImageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCreateInfoRaw(s);
    }

    public @enumtype(VkImageAspectFlags.class) int planeAspect() {
        return segment.get(LAYOUT$planeAspect, OFFSET$planeAspect);
    }

    public void planeAspect(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$planeAspect, OFFSET$planeAspect, value);
    }

    public static VkDeviceImageMemoryRequirements allocate(Arena arena) {
        return new VkDeviceImageMemoryRequirements(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceImageMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceImageMemoryRequirements[] ret = new VkDeviceImageMemoryRequirements[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceImageMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
