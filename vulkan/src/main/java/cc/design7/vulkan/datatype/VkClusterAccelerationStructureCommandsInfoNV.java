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

/// Represents a pointer to a {@code VkClusterAccelerationStructureCommandsInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureCommandsInfoNV.html">VkClusterAccelerationStructureCommandsInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureCommandsInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public VkClusterAccelerationStructureCommandsInfoNV {
        sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV);
    }

    public static VkClusterAccelerationStructureCommandsInfoNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureCommandsInfoNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureCommandsInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureCommandsInfoNV[] ret = new VkClusterAccelerationStructureCommandsInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureCommandsInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureCommandsInfoNV clone(Arena arena, VkClusterAccelerationStructureCommandsInfoNV src) {
        VkClusterAccelerationStructureCommandsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureCommandsInfoNV[] clone(Arena arena, VkClusterAccelerationStructureCommandsInfoNV[] src) {
        VkClusterAccelerationStructureCommandsInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkClusterAccelerationStructureInputInfoNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("dstImplicitData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstAddressesArray"),
        VkStridedDeviceAddressRegionKHR.LAYOUT.withName("dstSizesArray"),
        VkStridedDeviceAddressRegionKHR.LAYOUT.withName("srcInfosArray"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount"),
        ValueLayout.JAVA_INT.withName("addressResolutionFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$input = PathElement.groupElement("PATH$input");
    public static final PathElement PATH$dstImplicitData = PathElement.groupElement("PATH$dstImplicitData");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");
    public static final PathElement PATH$dstAddressesArray = PathElement.groupElement("PATH$dstAddressesArray");
    public static final PathElement PATH$dstSizesArray = PathElement.groupElement("PATH$dstSizesArray");
    public static final PathElement PATH$srcInfosArray = PathElement.groupElement("PATH$srcInfosArray");
    public static final PathElement PATH$srcInfosCount = PathElement.groupElement("PATH$srcInfosCount");
    public static final PathElement PATH$addressResolutionFlags = PathElement.groupElement("PATH$addressResolutionFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$input = (StructLayout) LAYOUT.select(PATH$input);
    public static final OfLong LAYOUT$dstImplicitData = (OfLong) LAYOUT.select(PATH$dstImplicitData);
    public static final OfLong LAYOUT$scratchData = (OfLong) LAYOUT.select(PATH$scratchData);
    public static final StructLayout LAYOUT$dstAddressesArray = (StructLayout) LAYOUT.select(PATH$dstAddressesArray);
    public static final StructLayout LAYOUT$dstSizesArray = (StructLayout) LAYOUT.select(PATH$dstSizesArray);
    public static final StructLayout LAYOUT$srcInfosArray = (StructLayout) LAYOUT.select(PATH$srcInfosArray);
    public static final OfLong LAYOUT$srcInfosCount = (OfLong) LAYOUT.select(PATH$srcInfosCount);
    public static final OfInt LAYOUT$addressResolutionFlags = (OfInt) LAYOUT.select(PATH$addressResolutionFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$input = LAYOUT$input.byteSize();
    public static final long SIZE$dstImplicitData = LAYOUT$dstImplicitData.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();
    public static final long SIZE$dstAddressesArray = LAYOUT$dstAddressesArray.byteSize();
    public static final long SIZE$dstSizesArray = LAYOUT$dstSizesArray.byteSize();
    public static final long SIZE$srcInfosArray = LAYOUT$srcInfosArray.byteSize();
    public static final long SIZE$srcInfosCount = LAYOUT$srcInfosCount.byteSize();
    public static final long SIZE$addressResolutionFlags = LAYOUT$addressResolutionFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$input = LAYOUT.byteOffset(PATH$input);
    public static final long OFFSET$dstImplicitData = LAYOUT.byteOffset(PATH$dstImplicitData);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$dstAddressesArray = LAYOUT.byteOffset(PATH$dstAddressesArray);
    public static final long OFFSET$dstSizesArray = LAYOUT.byteOffset(PATH$dstSizesArray);
    public static final long OFFSET$srcInfosArray = LAYOUT.byteOffset(PATH$srcInfosArray);
    public static final long OFFSET$srcInfosCount = LAYOUT.byteOffset(PATH$srcInfosCount);
    public static final long OFFSET$addressResolutionFlags = LAYOUT.byteOffset(PATH$addressResolutionFlags);

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

    public VkClusterAccelerationStructureInputInfoNV input() {
        return new VkClusterAccelerationStructureInputInfoNV(segment.asSlice(OFFSET$input, LAYOUT$input));
    }

    public void input(VkClusterAccelerationStructureInputInfoNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$input, SIZE$input);
    }

    public @unsigned long dstImplicitData() {
        return segment.get(LAYOUT$dstImplicitData, OFFSET$dstImplicitData);
    }

    public void dstImplicitData(@unsigned long value) {
        segment.set(LAYOUT$dstImplicitData, OFFSET$dstImplicitData, value);
    }

    public @unsigned long scratchData() {
        return segment.get(LAYOUT$scratchData, OFFSET$scratchData);
    }

    public void scratchData(@unsigned long value) {
        segment.set(LAYOUT$scratchData, OFFSET$scratchData, value);
    }

    public VkStridedDeviceAddressRegionKHR dstAddressesArray() {
        return new VkStridedDeviceAddressRegionKHR(segment.asSlice(OFFSET$dstAddressesArray, LAYOUT$dstAddressesArray));
    }

    public void dstAddressesArray(VkStridedDeviceAddressRegionKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstAddressesArray, SIZE$dstAddressesArray);
    }

    public VkStridedDeviceAddressRegionKHR dstSizesArray() {
        return new VkStridedDeviceAddressRegionKHR(segment.asSlice(OFFSET$dstSizesArray, LAYOUT$dstSizesArray));
    }

    public void dstSizesArray(VkStridedDeviceAddressRegionKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSizesArray, SIZE$dstSizesArray);
    }

    public VkStridedDeviceAddressRegionKHR srcInfosArray() {
        return new VkStridedDeviceAddressRegionKHR(segment.asSlice(OFFSET$srcInfosArray, LAYOUT$srcInfosArray));
    }

    public void srcInfosArray(VkStridedDeviceAddressRegionKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcInfosArray, SIZE$srcInfosArray);
    }

    public @unsigned long srcInfosCount() {
        return segment.get(LAYOUT$srcInfosCount, OFFSET$srcInfosCount);
    }

    public void srcInfosCount(@unsigned long value) {
        segment.set(LAYOUT$srcInfosCount, OFFSET$srcInfosCount, value);
    }

    public @enumtype(VkClusterAccelerationStructureAddressResolutionFlagsNV.class) int addressResolutionFlags() {
        return segment.get(LAYOUT$addressResolutionFlags, OFFSET$addressResolutionFlags);
    }

    public void addressResolutionFlags(@enumtype(VkClusterAccelerationStructureAddressResolutionFlagsNV.class) int value) {
        segment.set(LAYOUT$addressResolutionFlags, OFFSET$addressResolutionFlags, value);
    }

}
