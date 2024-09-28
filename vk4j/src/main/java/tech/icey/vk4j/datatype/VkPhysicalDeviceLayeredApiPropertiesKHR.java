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

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceLayeredApiKHR layeredAPI;
///     char deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
/// } VkPhysicalDeviceLayeredApiPropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceLayeredApiPropertiesKHR.html">VkPhysicalDeviceLayeredApiPropertiesKHR</a>
public record VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
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

    public @unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public @enumtype(VkPhysicalDeviceLayeredApiKHR.class) int layeredAPI() {
        return segment.get(LAYOUT$layeredAPI, OFFSET$layeredAPI);
    }

    public void layeredAPI(@enumtype(VkPhysicalDeviceLayeredApiKHR.class) int value) {
        segment.set(LAYOUT$layeredAPI, OFFSET$layeredAPI, value);
    }

    public MemorySegment deviceNameRaw() {
        return segment.asSlice(OFFSET$deviceName, SIZE$deviceName);
    }

    public ByteBuffer deviceName() {
        return new ByteBuffer(deviceNameRaw());
    }

    public void deviceName(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceName, SIZE$deviceName);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceLayeredApiPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        MemoryLayout.sequenceLayout(VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$layeredAPI = PathElement.groupElement("layeredAPI");
    public static final PathElement PATH$deviceName = PathElement.groupElement("deviceName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$layeredAPI = (OfInt) LAYOUT.select(PATH$layeredAPI);
    public static final SequenceLayout LAYOUT$deviceName = (SequenceLayout) LAYOUT.select(PATH$deviceName);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$layeredAPI = LAYOUT.byteOffset(PATH$layeredAPI);
    public static final long OFFSET$deviceName = LAYOUT.byteOffset(PATH$deviceName);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$layeredAPI = LAYOUT$layeredAPI.byteSize();
    public static final long SIZE$deviceName = LAYOUT$deviceName.byteSize();
}
