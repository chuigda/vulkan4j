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

public record VkDeviceAddressBindingCallbackDataEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfLong LAYOUT$baseAddress = ValueLayout.JAVA_LONG.withName("baseAddress");
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");
    public static final OfInt LAYOUT$bindingType = ValueLayout.JAVA_INT.withName("bindingType");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$baseAddress, LAYOUT$size, LAYOUT$bindingType);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceAddressBindingCallbackDataEXT allocate(Arena arena) {
        return new VkDeviceAddressBindingCallbackDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceAddressBindingCallbackDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceAddressBindingCallbackDataEXT[] ret = new VkDeviceAddressBindingCallbackDataEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceAddressBindingCallbackDataEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceAddressBindingCallbackDataEXT clone(Arena arena, VkDeviceAddressBindingCallbackDataEXT src) {
        VkDeviceAddressBindingCallbackDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceAddressBindingCallbackDataEXT[] clone(Arena arena, VkDeviceAddressBindingCallbackDataEXT[] src) {
        VkDeviceAddressBindingCallbackDataEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$baseAddress = PathElement.groupElement("PATH$baseAddress");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$bindingType = PathElement.groupElement("PATH$bindingType");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$baseAddress = LAYOUT$baseAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$bindingType = LAYOUT$bindingType.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$baseAddress = LAYOUT.byteOffset(PATH$baseAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$bindingType = LAYOUT.byteOffset(PATH$bindingType);

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

    public @enumtype(VkDeviceAddressBindingFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceAddressBindingFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long baseAddress() {
        return segment.get(LAYOUT$baseAddress, OFFSET$baseAddress);
    }

    public void baseAddress(@unsigned long value) {
        segment.set(LAYOUT$baseAddress, OFFSET$baseAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkDeviceAddressBindingTypeEXT.class) int bindingType() {
        return segment.get(LAYOUT$bindingType, OFFSET$bindingType);
    }

    public void bindingType(@enumtype(VkDeviceAddressBindingTypeEXT.class) int value) {
        segment.set(LAYOUT$bindingType, OFFSET$bindingType, value);
    }

}
/// dummy, not implemented yet
