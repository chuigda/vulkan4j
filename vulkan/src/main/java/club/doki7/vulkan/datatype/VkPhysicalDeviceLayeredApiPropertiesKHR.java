package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiPropertiesKHR.html"><code>VkPhysicalDeviceLayeredApiPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceLayeredApiKHR layeredAPI;
///     char deviceName;
/// } VkPhysicalDeviceLayeredApiPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR`
///
/// The {@link VkPhysicalDeviceLayeredApiPropertiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceLayeredApiPropertiesKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiPropertiesKHR.html"><code>VkPhysicalDeviceLayeredApiPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceLayeredApiPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceLayeredApiPropertiesKHR allocate(Arena arena) {
        VkPhysicalDeviceLayeredApiPropertiesKHR ret = new VkPhysicalDeviceLayeredApiPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
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

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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
}
