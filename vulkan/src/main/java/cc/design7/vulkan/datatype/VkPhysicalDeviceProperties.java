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

/// Represents a pointer to a {@code VkPhysicalDeviceProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceProperties.html">VkPhysicalDeviceProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceProperties allocate(Arena arena) {
        return new VkPhysicalDeviceProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceProperties[] ret = new VkPhysicalDeviceProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceProperties clone(Arena arena, VkPhysicalDeviceProperties src) {
        VkPhysicalDeviceProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceProperties[] clone(Arena arena, VkPhysicalDeviceProperties[] src) {
        VkPhysicalDeviceProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("apiVersion"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("deviceType"),
        ValueLayout.JAVA_BYTE.withName("deviceName"),
        ValueLayout.JAVA_BYTE.withName("pipelineCacheUUID"),
        VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
        VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$apiVersion = PathElement.groupElement("PATH$apiVersion");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("PATH$driverVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("PATH$vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("PATH$deviceID");
    public static final PathElement PATH$deviceType = PathElement.groupElement("PATH$deviceType");
    public static final PathElement PATH$deviceName = PathElement.groupElement("PATH$deviceName");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("PATH$pipelineCacheUUID");
    public static final PathElement PATH$limits = PathElement.groupElement("PATH$limits");
    public static final PathElement PATH$sparseProperties = PathElement.groupElement("PATH$sparseProperties");

    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);
    public static final OfInt LAYOUT$driverVersion = (OfInt) LAYOUT.select(PATH$driverVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$deviceType = (OfInt) LAYOUT.select(PATH$deviceType);
    public static final OfByte LAYOUT$deviceName = (OfByte) LAYOUT.select(PATH$deviceName);
    public static final OfByte LAYOUT$pipelineCacheUUID = (OfByte) LAYOUT.select(PATH$pipelineCacheUUID);
    public static final StructLayout LAYOUT$limits = (StructLayout) LAYOUT.select(PATH$limits);
    public static final StructLayout LAYOUT$sparseProperties = (StructLayout) LAYOUT.select(PATH$sparseProperties);

    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();
    public static final long SIZE$driverVersion = LAYOUT$driverVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$deviceType = LAYOUT$deviceType.byteSize();
    public static final long SIZE$deviceName = LAYOUT$deviceName.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();
    public static final long SIZE$limits = LAYOUT$limits.byteSize();
    public static final long SIZE$sparseProperties = LAYOUT$sparseProperties.byteSize();

    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);
    public static final long OFFSET$driverVersion = LAYOUT.byteOffset(PATH$driverVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$deviceType = LAYOUT.byteOffset(PATH$deviceType);
    public static final long OFFSET$deviceName = LAYOUT.byteOffset(PATH$deviceName);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
    public static final long OFFSET$limits = LAYOUT.byteOffset(PATH$limits);
    public static final long OFFSET$sparseProperties = LAYOUT.byteOffset(PATH$sparseProperties);

    public @unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }

    public @unsigned int driverVersion() {
        return segment.get(LAYOUT$driverVersion, OFFSET$driverVersion);
    }

    public void driverVersion(@unsigned int value) {
        segment.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);
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

    public @enumtype(VkPhysicalDeviceType.class) int deviceType() {
        return segment.get(LAYOUT$deviceType, OFFSET$deviceType);
    }

    public void deviceType(@enumtype(VkPhysicalDeviceType.class) int value) {
        segment.set(LAYOUT$deviceType, OFFSET$deviceType, value);
    }

    public byte deviceName() {
        return segment.get(LAYOUT$deviceName, OFFSET$deviceName);
    }

    public void deviceName(byte value) {
        segment.set(LAYOUT$deviceName, OFFSET$deviceName, value);
    }

    public @unsigned byte pipelineCacheUUID() {
        return segment.get(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID);
    }

    public void pipelineCacheUUID(@unsigned byte value) {
        segment.set(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID, value);
    }

    public VkPhysicalDeviceLimits limits() {
        return new VkPhysicalDeviceLimits(segment.asSlice(OFFSET$limits, LAYOUT$limits));
    }

    public void limits(VkPhysicalDeviceLimits value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$limits, SIZE$limits);
    }

    public VkPhysicalDeviceSparseProperties sparseProperties() {
        return new VkPhysicalDeviceSparseProperties(segment.asSlice(OFFSET$sparseProperties, LAYOUT$sparseProperties));
    }

    public void sparseProperties(VkPhysicalDeviceSparseProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sparseProperties, SIZE$sparseProperties);
    }

}
