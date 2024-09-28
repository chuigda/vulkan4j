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

public record VkPhysicalDeviceExternalBufferInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();

    public VkPhysicalDeviceExternalBufferInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO);
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

    public @enumtype(VkBufferCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBufferCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkBufferUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VkBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public static VkPhysicalDeviceExternalBufferInfo allocate(Arena arena) {
        return new VkPhysicalDeviceExternalBufferInfo(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceExternalBufferInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalBufferInfo[] ret = new VkPhysicalDeviceExternalBufferInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExternalBufferInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
