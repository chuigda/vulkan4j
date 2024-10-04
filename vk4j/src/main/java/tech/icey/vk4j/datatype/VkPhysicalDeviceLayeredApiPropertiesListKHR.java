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
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t layeredApiCount;
///     VkPhysicalDeviceLayeredApiPropertiesKHR* pLayeredApis;
/// } VkPhysicalDeviceLayeredApiPropertiesListKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceLayeredApiPropertiesListKHR.html">VkPhysicalDeviceLayeredApiPropertiesListKHR</a>
public record VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
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

    public @unsigned int layeredApiCount() {
        return segment.get(LAYOUT$layeredApiCount, OFFSET$layeredApiCount);
    }

    public void layeredApiCount(@unsigned int value) {
        segment.set(LAYOUT$layeredApiCount, OFFSET$layeredApiCount, value);
    }

    public @pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment pLayeredApisRaw() {
        return segment.get(LAYOUT$pLayeredApis, OFFSET$pLayeredApis);
    }

    public void pLayeredApisRaw(@pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLayeredApis, OFFSET$pLayeredApis, value);
    }

    public @nullable VkPhysicalDeviceLayeredApiPropertiesKHR pLayeredApis() {
        MemorySegment s = pLayeredApisRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPhysicalDeviceLayeredApiPropertiesKHR[] pLayeredApis(int assumedCount) {
        MemorySegment s = pLayeredApisRaw().reinterpret(assumedCount * VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] arr = new VkPhysicalDeviceLayeredApiPropertiesKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(s.asSlice(i * VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE, VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE));
        }
        return arr;
    }

    public void pLayeredApis(@nullable VkPhysicalDeviceLayeredApiPropertiesKHR value) {
        pLayeredApisRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR allocate(Arena arena) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesListKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR[] src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceLayeredApiPropertiesKHR.LAYOUT).withName("pLayeredApis")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$layeredApiCount = PathElement.groupElement("layeredApiCount");
    public static final PathElement PATH$pLayeredApis = PathElement.groupElement("pLayeredApis");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$layeredApiCount = (OfInt) LAYOUT.select(PATH$layeredApiCount);
    public static final AddressLayout LAYOUT$pLayeredApis = (AddressLayout) LAYOUT.select(PATH$pLayeredApis);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layeredApiCount = LAYOUT.byteOffset(PATH$layeredApiCount);
    public static final long OFFSET$pLayeredApis = LAYOUT.byteOffset(PATH$pLayeredApis);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$layeredApiCount = LAYOUT$layeredApiCount.byteSize();
    public static final long SIZE$pLayeredApis = LAYOUT$pLayeredApis.byteSize();
}
