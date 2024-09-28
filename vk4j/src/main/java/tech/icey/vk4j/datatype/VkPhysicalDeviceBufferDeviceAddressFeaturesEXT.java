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
/// typedef struct VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 bufferDeviceAddress;
///     VkBool32 bufferDeviceAddressCaptureReplay;
///     VkBool32 bufferDeviceAddressMultiDevice;
/// } VkPhysicalDeviceBufferDeviceAddressFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.html">VkPhysicalDeviceBufferDeviceAddressFeaturesEXT</a>
public record VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$bufferDeviceAddress = PathElement.groupElement("bufferDeviceAddress");
    public static final PathElement PATH$bufferDeviceAddressCaptureReplay = PathElement.groupElement("bufferDeviceAddressCaptureReplay");
    public static final PathElement PATH$bufferDeviceAddressMultiDevice = PathElement.groupElement("bufferDeviceAddressMultiDevice");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$bufferDeviceAddress = (OfInt) LAYOUT.select(PATH$bufferDeviceAddress);
    public static final OfInt LAYOUT$bufferDeviceAddressCaptureReplay = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressCaptureReplay);
    public static final OfInt LAYOUT$bufferDeviceAddressMultiDevice = (OfInt) LAYOUT.select(PATH$bufferDeviceAddressMultiDevice);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bufferDeviceAddress = LAYOUT.byteOffset(PATH$bufferDeviceAddress);
    public static final long OFFSET$bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PATH$bufferDeviceAddressCaptureReplay);
    public static final long OFFSET$bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PATH$bufferDeviceAddressMultiDevice);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$bufferDeviceAddress = LAYOUT$bufferDeviceAddress.byteSize();
    public static final long SIZE$bufferDeviceAddressCaptureReplay = LAYOUT$bufferDeviceAddressCaptureReplay.byteSize();
    public static final long SIZE$bufferDeviceAddressMultiDevice = LAYOUT$bufferDeviceAddressMultiDevice.byteSize();

    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT);
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

    public @unsigned int bufferDeviceAddress() {
        return segment.get(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress);
    }

    public void bufferDeviceAddress(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddress, OFFSET$bufferDeviceAddress, value);
    }

    public @unsigned int bufferDeviceAddressCaptureReplay() {
        return segment.get(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay);
    }

    public void bufferDeviceAddressCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressCaptureReplay, OFFSET$bufferDeviceAddressCaptureReplay, value);
    }

    public @unsigned int bufferDeviceAddressMultiDevice() {
        return segment.get(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice);
    }

    public void bufferDeviceAddressMultiDevice(@unsigned int value) {
        segment.set(LAYOUT$bufferDeviceAddressMultiDevice, OFFSET$bufferDeviceAddressMultiDevice, value);
    }

    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[] ret = new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
