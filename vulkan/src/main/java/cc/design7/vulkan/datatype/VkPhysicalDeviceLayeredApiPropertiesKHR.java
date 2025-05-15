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

/// Represents a pointer to a {@code VkPhysicalDeviceLayeredApiPropertiesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiPropertiesKHR.html">VkPhysicalDeviceLayeredApiPropertiesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceLayeredApiPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceLayeredApiPropertiesKHR {
        sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesKHR src) {
        VkPhysicalDeviceLayeredApiPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR[] clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesKHR[] src) {
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("layeredAPI"),
        ValueLayout.JAVA_BYTE.withName("deviceName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vendorID = PathElement.groupElement("PATH$vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("PATH$deviceID");
    public static final PathElement PATH$layeredAPI = PathElement.groupElement("PATH$layeredAPI");
    public static final PathElement PATH$deviceName = PathElement.groupElement("PATH$deviceName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$layeredAPI = (OfInt) LAYOUT.select(PATH$layeredAPI);
    public static final OfByte LAYOUT$deviceName = (OfByte) LAYOUT.select(PATH$deviceName);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$layeredAPI = LAYOUT$layeredAPI.byteSize();
    public static final long SIZE$deviceName = LAYOUT$deviceName.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$layeredAPI = LAYOUT.byteOffset(PATH$layeredAPI);
    public static final long OFFSET$deviceName = LAYOUT.byteOffset(PATH$deviceName);

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

    public byte deviceName() {
        return segment.get(LAYOUT$deviceName, OFFSET$deviceName);
    }

    public void deviceName(byte value) {
        segment.set(LAYOUT$deviceName, OFFSET$deviceName, value);
    }

}
