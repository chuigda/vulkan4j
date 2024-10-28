package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDeviceAddressBindingCallbackDataEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceAddressBindingFlagsEXT flags;
///     VkDeviceAddress baseAddress;
///     VkDeviceSize size;
///     VkDeviceAddressBindingTypeEXT bindingType;
/// } VkDeviceAddressBindingCallbackDataEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceAddressBindingCallbackDataEXT.html">VkDeviceAddressBindingCallbackDataEXT</a>
public record VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment) implements IPointer {
    public VkDeviceAddressBindingCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkDeviceAddressBindingCallbackDataEXT allocate(Arena arena) {
        return new VkDeviceAddressBindingCallbackDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceAddressBindingCallbackDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceAddressBindingCallbackDataEXT[] ret = new VkDeviceAddressBindingCallbackDataEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("baseAddress"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("bindingType")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$baseAddress = PathElement.groupElement("baseAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$bindingType = PathElement.groupElement("bindingType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$baseAddress = (OfLong) LAYOUT.select(PATH$baseAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$bindingType = (OfInt) LAYOUT.select(PATH$bindingType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$baseAddress = LAYOUT.byteOffset(PATH$baseAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$bindingType = LAYOUT.byteOffset(PATH$bindingType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$baseAddress = LAYOUT$baseAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$bindingType = LAYOUT$bindingType.byteSize();
}
