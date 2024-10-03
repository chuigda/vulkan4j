package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize compactedSize;
///     VkAccelerationStructureInfoNV info;
/// } VkAccelerationStructureCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureCreateInfoNV.html">VkAccelerationStructureCreateInfoNV</a>
public record VkAccelerationStructureCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
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

    public @unsigned long compactedSize() {
        return segment.get(LAYOUT$compactedSize, OFFSET$compactedSize);
    }

    public void compactedSize(@unsigned long value) {
        segment.set(LAYOUT$compactedSize, OFFSET$compactedSize, value);
    }

    public VkAccelerationStructureInfoNV info() {
        return new VkAccelerationStructureInfoNV(segment.asSlice(OFFSET$info, LAYOUT$info));
    }

    public void info(VkAccelerationStructureInfoNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$info, SIZE$info);
    }

    public static VkAccelerationStructureCreateInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCreateInfoNV[] ret = new VkAccelerationStructureCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV clone(Arena arena, VkAccelerationStructureCreateInfoNV src) {
        VkAccelerationStructureCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV[] clone(Arena arena, VkAccelerationStructureCreateInfoNV[] src) {
        VkAccelerationStructureCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        VkAccelerationStructureInfoNV.LAYOUT.withName("info")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$compactedSize = PathElement.groupElement("compactedSize");
    public static final PathElement PATH$info = PathElement.groupElement("info");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$compactedSize = (OfLong) LAYOUT.select(PATH$compactedSize);
    public static final StructLayout LAYOUT$info = (StructLayout) LAYOUT.select(PATH$info);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compactedSize = LAYOUT.byteOffset(PATH$compactedSize);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$compactedSize = LAYOUT$compactedSize.byteSize();
    public static final long SIZE$info = LAYOUT$info.byteSize();
}
