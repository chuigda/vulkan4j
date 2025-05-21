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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionOneEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
///     uint32_t headerSize; // @link substring="headerSize" target="#headerSize"
///     VkDeviceFaultVendorBinaryHeaderVersionEXT headerVersion; // @link substring="VkDeviceFaultVendorBinaryHeaderVersionEXT" target="VkDeviceFaultVendorBinaryHeaderVersionEXT" @link substring="headerVersion" target="#headerVersion"
///     uint32_t vendorID; // @link substring="vendorID" target="#vendorID"
///     uint32_t deviceID; // @link substring="deviceID" target="#deviceID"
///     uint32_t driverVersion; // @link substring="driverVersion" target="#driverVersion"
///     uint8_t pipelineCacheUUID; // @link substring="pipelineCacheUUID" target="#pipelineCacheUUID"
///     uint32_t applicationNameOffset; // @link substring="applicationNameOffset" target="#applicationNameOffset"
///     uint32_t applicationVersion; // @link substring="applicationVersion" target="#applicationVersion"
///     uint32_t engineNameOffset; // @link substring="engineNameOffset" target="#engineNameOffset"
///     uint32_t engineVersion; // @link substring="engineVersion" target="#engineVersion"
///     uint32_t apiVersion; // @link substring="apiVersion" target="#apiVersion"
/// } VkDeviceFaultVendorBinaryHeaderVersionOneEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionOneEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT allocate(Arena arena) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] ret = new VkDeviceFaultVendorBinaryHeaderVersionOneEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT clone(Arena arena, VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) {
        VkDeviceFaultVendorBinaryHeaderVersionOneEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] clone(Arena arena, VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] src) {
        VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public void headerSize(@unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
    }

    public @enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public void headerVersion(@enumtype(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
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

    public @unsigned int driverVersion() {
        return segment.get(LAYOUT$driverVersion, OFFSET$driverVersion);
    }

    public void driverVersion(@unsigned int value) {
        segment.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);
    }

    public @unsigned byte pipelineCacheUUID() {
        return segment.get(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID);
    }

    public void pipelineCacheUUID(@unsigned byte value) {
        segment.set(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID, value);
    }

    public @unsigned int applicationNameOffset() {
        return segment.get(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset);
    }

    public void applicationNameOffset(@unsigned int value) {
        segment.set(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset, value);
    }

    public @unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public void applicationVersion(@unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
    }

    public @unsigned int engineNameOffset() {
        return segment.get(LAYOUT$engineNameOffset, OFFSET$engineNameOffset);
    }

    public void engineNameOffset(@unsigned int value) {
        segment.set(LAYOUT$engineNameOffset, OFFSET$engineNameOffset, value);
    }

    public @unsigned int engineVersion() {
        return segment.get(LAYOUT$engineVersion, OFFSET$engineVersion);
    }

    public void engineVersion(@unsigned int value) {
        segment.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);
    }

    public @unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_BYTE.withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$headerSize = PathElement.groupElement("headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("driverVersion");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");
    public static final PathElement PATH$applicationNameOffset = PathElement.groupElement("applicationNameOffset");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("applicationVersion");
    public static final PathElement PATH$engineNameOffset = PathElement.groupElement("engineNameOffset");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$driverVersion = (OfInt) LAYOUT.select(PATH$driverVersion);
    public static final OfByte LAYOUT$pipelineCacheUUID = (OfByte) LAYOUT.select(PATH$pipelineCacheUUID);
    public static final OfInt LAYOUT$applicationNameOffset = (OfInt) LAYOUT.select(PATH$applicationNameOffset);
    public static final OfInt LAYOUT$applicationVersion = (OfInt) LAYOUT.select(PATH$applicationVersion);
    public static final OfInt LAYOUT$engineNameOffset = (OfInt) LAYOUT.select(PATH$engineNameOffset);
    public static final OfInt LAYOUT$engineVersion = (OfInt) LAYOUT.select(PATH$engineVersion);
    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);

    public static final long SIZE$headerSize = LAYOUT$headerSize.byteSize();
    public static final long SIZE$headerVersion = LAYOUT$headerVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$driverVersion = LAYOUT$driverVersion.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();
    public static final long SIZE$applicationNameOffset = LAYOUT$applicationNameOffset.byteSize();
    public static final long SIZE$applicationVersion = LAYOUT$applicationVersion.byteSize();
    public static final long SIZE$engineNameOffset = LAYOUT$engineNameOffset.byteSize();
    public static final long SIZE$engineVersion = LAYOUT$engineVersion.byteSize();
    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$driverVersion = LAYOUT.byteOffset(PATH$driverVersion);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
    public static final long OFFSET$applicationNameOffset = LAYOUT.byteOffset(PATH$applicationNameOffset);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$engineNameOffset = LAYOUT.byteOffset(PATH$engineNameOffset);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);
}
