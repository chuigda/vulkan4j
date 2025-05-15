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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceIDProperties.html"><code>VkPhysicalDeviceIDProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceIDProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint8_t deviceUUID;
///     uint8_t driverUUID;
///     uint8_t deviceLUID;
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
/// } VkPhysicalDeviceIDProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES`
///
/// The {@link VkPhysicalDeviceIDProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceIDProperties#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceIDProperties.html"><code>VkPhysicalDeviceIDProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceIDProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceIDProperties allocate(Arena arena) {
        VkPhysicalDeviceIDProperties ret = new VkPhysicalDeviceIDProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_ID_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceIDProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceIDProperties[] ret = new VkPhysicalDeviceIDProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceIDProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_ID_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceIDProperties clone(Arena arena, VkPhysicalDeviceIDProperties src) {
        VkPhysicalDeviceIDProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceIDProperties[] clone(Arena arena, VkPhysicalDeviceIDProperties[] src) {
        VkPhysicalDeviceIDProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_ID_PROPERTIES);
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

    public @unsigned byte deviceUUID() {
        return segment.get(LAYOUT$deviceUUID, OFFSET$deviceUUID);
    }

    public void deviceUUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceUUID, OFFSET$deviceUUID, value);
    }

    public @unsigned byte driverUUID() {
        return segment.get(LAYOUT$driverUUID, OFFSET$driverUUID);
    }

    public void driverUUID(@unsigned byte value) {
        segment.set(LAYOUT$driverUUID, OFFSET$driverUUID, value);
    }

    public @unsigned byte deviceLUID() {
        return segment.get(LAYOUT$deviceLUID, OFFSET$deviceLUID);
    }

    public void deviceLUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceLUID, OFFSET$deviceLUID, value);
    }

    public @unsigned int deviceNodeMask() {
        return segment.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);
    }

    public void deviceNodeMask(@unsigned int value) {
        segment.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);
    }

    public @unsigned int deviceLUIDValid() {
        return segment.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);
    }

    public void deviceLUIDValid(@unsigned int value) {
        segment.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("deviceUUID"),
        ValueLayout.JAVA_BYTE.withName("driverUUID"),
        ValueLayout.JAVA_BYTE.withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("PATH$deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("PATH$driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("PATH$deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("PATH$deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("PATH$deviceLUIDValid");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$deviceUUID = (OfByte) LAYOUT.select(PATH$deviceUUID);
    public static final OfByte LAYOUT$driverUUID = (OfByte) LAYOUT.select(PATH$driverUUID);
    public static final OfByte LAYOUT$deviceLUID = (OfByte) LAYOUT.select(PATH$deviceLUID);
    public static final OfInt LAYOUT$deviceNodeMask = (OfInt) LAYOUT.select(PATH$deviceNodeMask);
    public static final OfInt LAYOUT$deviceLUIDValid = (OfInt) LAYOUT.select(PATH$deviceLUIDValid);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceUUID = LAYOUT$deviceUUID.byteSize();
    public static final long SIZE$driverUUID = LAYOUT$driverUUID.byteSize();
    public static final long SIZE$deviceLUID = LAYOUT$deviceLUID.byteSize();
    public static final long SIZE$deviceNodeMask = LAYOUT$deviceNodeMask.byteSize();
    public static final long SIZE$deviceLUIDValid = LAYOUT$deviceLUIDValid.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);
}
