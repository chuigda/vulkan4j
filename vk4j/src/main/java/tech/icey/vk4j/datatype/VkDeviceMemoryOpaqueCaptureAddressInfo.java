package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkDeviceMemory;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO;

/// {@snippet lang=c :
/// typedef struct VkDeviceMemoryOpaqueCaptureAddressInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
/// } VkDeviceMemoryOpaqueCaptureAddressInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceMemoryOpaqueCaptureAddressInfo.html">VkDeviceMemoryOpaqueCaptureAddressInfo</a>
public record VkDeviceMemoryOpaqueCaptureAddressInfo(MemorySegment segment) implements IPointer {
    public VkDeviceMemoryOpaqueCaptureAddressInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO);
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

    public @nullable VkDeviceMemory memory() {
        MemorySegment s = segment.get(LAYOUT$memory, OFFSET$memory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@nullable VkDeviceMemory value) {
        segment.set(
            LAYOUT$memory,
            OFFSET$memory,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo allocate(Arena arena) {
        return new VkDeviceMemoryOpaqueCaptureAddressInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceMemoryOpaqueCaptureAddressInfo[] ret = new VkDeviceMemoryOpaqueCaptureAddressInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceMemoryOpaqueCaptureAddressInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo clone(Arena arena, VkDeviceMemoryOpaqueCaptureAddressInfo src) {
        VkDeviceMemoryOpaqueCaptureAddressInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceMemoryOpaqueCaptureAddressInfo[] clone(Arena arena, VkDeviceMemoryOpaqueCaptureAddressInfo[] src) {
        VkDeviceMemoryOpaqueCaptureAddressInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("memory")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
}
