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
/// typedef struct VkPhysicalDeviceLayeredDriverPropertiesMSFT {
///     VkStructureType sType;
///     void* pNext;
///     VkLayeredDriverUnderlyingApiMSFT underlyingAPI;
/// } VkPhysicalDeviceLayeredDriverPropertiesMSFT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceLayeredDriverPropertiesMSFT.html">VkPhysicalDeviceLayeredDriverPropertiesMSFT</a>
public record VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT);
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

    public @enumtype(VkLayeredDriverUnderlyingApiMSFT.class) int underlyingAPI() {
        return segment.get(LAYOUT$underlyingAPI, OFFSET$underlyingAPI);
    }

    public void underlyingAPI(@enumtype(VkLayeredDriverUnderlyingApiMSFT.class) int value) {
        segment.set(LAYOUT$underlyingAPI, OFFSET$underlyingAPI, value);
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT allocate(Arena arena) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredDriverPropertiesMSFT[] ret = new VkPhysicalDeviceLayeredDriverPropertiesMSFT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT clone(Arena arena, VkPhysicalDeviceLayeredDriverPropertiesMSFT src) {
        VkPhysicalDeviceLayeredDriverPropertiesMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT[] clone(Arena arena, VkPhysicalDeviceLayeredDriverPropertiesMSFT[] src) {
        VkPhysicalDeviceLayeredDriverPropertiesMSFT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("underlyingAPI")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$underlyingAPI = PathElement.groupElement("underlyingAPI");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$underlyingAPI = (OfInt) LAYOUT.select(PATH$underlyingAPI);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$underlyingAPI = LAYOUT.byteOffset(PATH$underlyingAPI);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$underlyingAPI = LAYOUT$underlyingAPI.byteSize();
}
