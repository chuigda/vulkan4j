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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html">VkDeviceFaultVendorBinaryHeaderVersionOneEXT</a>
@ValueBasedCandidate
public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$headerSize = ValueLayout.JAVA_INT.withName("headerSize");
    public static final OfInt LAYOUT$headerVersion = ValueLayout.JAVA_INT.withName("headerVersion");
    public static final OfInt LAYOUT$vendorID = ValueLayout.JAVA_INT.withName("vendorID");
    public static final OfInt LAYOUT$deviceID = ValueLayout.JAVA_INT.withName("deviceID");
    public static final OfInt LAYOUT$driverVersion = ValueLayout.JAVA_INT.withName("driverVersion");
    public static final OfByte LAYOUT$pipelineCacheUUID = ValueLayout.JAVA_BYTE.withName("pipelineCacheUUID");
    public static final OfInt LAYOUT$applicationNameOffset = ValueLayout.JAVA_INT.withName("applicationNameOffset");
    public static final OfInt LAYOUT$applicationVersion = ValueLayout.JAVA_INT.withName("applicationVersion");
    public static final OfInt LAYOUT$engineNameOffset = ValueLayout.JAVA_INT.withName("engineNameOffset");
    public static final OfInt LAYOUT$engineVersion = ValueLayout.JAVA_INT.withName("engineVersion");
    public static final OfInt LAYOUT$apiVersion = ValueLayout.JAVA_INT.withName("apiVersion");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$headerSize, LAYOUT$headerVersion, LAYOUT$vendorID, LAYOUT$deviceID, LAYOUT$driverVersion, LAYOUT$pipelineCacheUUID, LAYOUT$applicationNameOffset, LAYOUT$applicationVersion, LAYOUT$engineNameOffset, LAYOUT$engineVersion, LAYOUT$apiVersion);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT allocate(Arena arena) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] ret = new VkDeviceFaultVendorBinaryHeaderVersionOneEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$headerSize = PathElement.groupElement("PATH$headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("PATH$headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("PATH$vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("PATH$deviceID");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("PATH$driverVersion");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("PATH$pipelineCacheUUID");
    public static final PathElement PATH$applicationNameOffset = PathElement.groupElement("PATH$applicationNameOffset");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("PATH$applicationVersion");
    public static final PathElement PATH$engineNameOffset = PathElement.groupElement("PATH$engineNameOffset");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("PATH$engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("PATH$apiVersion");

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

}
