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

public record VkDescriptorAddressInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$address = ValueLayout.JAVA_LONG.withName("address");
    public static final OfLong LAYOUT$range = ValueLayout.JAVA_LONG.withName("range");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$address, LAYOUT$range, LAYOUT$format);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorAddressInfoEXT allocate(Arena arena) {
        return new VkDescriptorAddressInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDescriptorAddressInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorAddressInfoEXT clone(Arena arena, VkDescriptorAddressInfoEXT src) {
        VkDescriptorAddressInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorAddressInfoEXT[] clone(Arena arena, VkDescriptorAddressInfoEXT[] src) {
        VkDescriptorAddressInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$address = PathElement.groupElement("PATH$address");
    public static final PathElement PATH$range = PathElement.groupElement("PATH$range");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$address = LAYOUT$address.byteSize();
    public static final long SIZE$range = LAYOUT$range.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$address = LAYOUT.byteOffset(PATH$address);
    public static final long OFFSET$range = LAYOUT.byteOffset(PATH$range);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

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

    public @unsigned long address() {
        return segment.get(LAYOUT$address, OFFSET$address);
    }

    public void address(@unsigned long value) {
        segment.set(LAYOUT$address, OFFSET$address, value);
    }

    public @unsigned long range() {
        return segment.get(LAYOUT$range, OFFSET$range);
    }

    public void range(@unsigned long value) {
        segment.set(LAYOUT$range, OFFSET$range, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

}
/// dummy, not implemented yet
