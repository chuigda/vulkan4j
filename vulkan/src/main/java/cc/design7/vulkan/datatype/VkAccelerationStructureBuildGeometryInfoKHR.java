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

public record VkAccelerationStructureBuildGeometryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$mode = ValueLayout.JAVA_INT.withName("mode");
    public static final AddressLayout LAYOUT$srcAccelerationStructure = ValueLayout.ADDRESS.withName("srcAccelerationStructure");
    public static final AddressLayout LAYOUT$dstAccelerationStructure = ValueLayout.ADDRESS.withName("dstAccelerationStructure");
    public static final OfInt LAYOUT$geometryCount = ValueLayout.JAVA_INT.withName("geometryCount");
    public static final AddressLayout LAYOUT$pGeometries = ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT).withName("pGeometries");
    public static final AddressLayout LAYOUT$ppGeometries = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT)).withName("ppGeometries");
    public static final StructLayout LAYOUT$scratchData = VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$flags, LAYOUT$mode, LAYOUT$srcAccelerationStructure, LAYOUT$dstAccelerationStructure, LAYOUT$geometryCount, LAYOUT$pGeometries, LAYOUT$ppGeometries, LAYOUT$scratchData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureBuildGeometryInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildGeometryInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildGeometryInfoKHR[] ret = new VkAccelerationStructureBuildGeometryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureBuildGeometryInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR clone(Arena arena, VkAccelerationStructureBuildGeometryInfoKHR src) {
        VkAccelerationStructureBuildGeometryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR[] clone(Arena arena, VkAccelerationStructureBuildGeometryInfoKHR[] src) {
        VkAccelerationStructureBuildGeometryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$srcAccelerationStructure = PathElement.groupElement("PATH$srcAccelerationStructure");
    public static final PathElement PATH$dstAccelerationStructure = PathElement.groupElement("PATH$dstAccelerationStructure");
    public static final PathElement PATH$geometryCount = PathElement.groupElement("PATH$geometryCount");
    public static final PathElement PATH$pGeometries = PathElement.groupElement("PATH$pGeometries");
    public static final PathElement PATH$ppGeometries = PathElement.groupElement("PATH$ppGeometries");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$srcAccelerationStructure = LAYOUT$srcAccelerationStructure.byteSize();
    public static final long SIZE$dstAccelerationStructure = LAYOUT$dstAccelerationStructure.byteSize();
    public static final long SIZE$geometryCount = LAYOUT$geometryCount.byteSize();
    public static final long SIZE$pGeometries = LAYOUT$pGeometries.byteSize();
    public static final long SIZE$ppGeometries = LAYOUT$ppGeometries.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$srcAccelerationStructure = LAYOUT.byteOffset(PATH$srcAccelerationStructure);
    public static final long OFFSET$dstAccelerationStructure = LAYOUT.byteOffset(PATH$dstAccelerationStructure);
    public static final long OFFSET$geometryCount = LAYOUT.byteOffset(PATH$geometryCount);
    public static final long OFFSET$pGeometries = LAYOUT.byteOffset(PATH$pGeometries);
    public static final long OFFSET$ppGeometries = LAYOUT.byteOffset(PATH$ppGeometries);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);

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

    public @enumtype(VkAccelerationStructureTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkBuildAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @Nullable VkAccelerationStructureKHR srcAccelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$srcAccelerationStructure, SIZE$srcAccelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void srcAccelerationStructure() {
        segment.set(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkAccelerationStructureKHR dstAccelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$dstAccelerationStructure, SIZE$dstAccelerationStructure);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void dstAccelerationStructure() {
        segment.set(LAYOUT$dstAccelerationStructure, OFFSET$dstAccelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int geometryCount() {
        return segment.get(LAYOUT$geometryCount, OFFSET$geometryCount);
    }

    public void geometryCount(@unsigned int value) {
        segment.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);
    }

    public @pointer(comment="VkAccelerationStructureGeometryKHR*") MemorySegment pGeometriesRaw() {
        return segment.get(LAYOUT$pGeometries, OFFSET$pGeometries);
    }

    public void pGeometriesRaw(@pointer(comment="VkAccelerationStructureGeometryKHR*") MemorySegment value) {
        segment.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);
    }

    public @Nullable VkAccelerationStructureGeometryKHR pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryKHR(s);
    }

    public void pGeometries(@Nullable VkAccelerationStructureGeometryKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGeometriesRaw(s);
    }

    @unsafe public @Nullable VkAccelerationStructureGeometryKHR[] pGeometries(int assumedCount) {
        MemorySegment s = pGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAccelerationStructureGeometryKHR.SIZE);
        VkAccelerationStructureGeometryKHR[] ret = new VkAccelerationStructureGeometryKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAccelerationStructureGeometryKHR(s.asSlice(i * VkAccelerationStructureGeometryKHR.SIZE, VkAccelerationStructureGeometryKHR.SIZE));
        }
        return ret;
    }

    public @pointer(comment="void**") MemorySegment ppGeometriesRaw() {
        return segment.get(LAYOUT$ppGeometries, OFFSET$ppGeometries);
    }

    public void ppGeometriesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppGeometries, OFFSET$ppGeometries, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer ppGeometries() {
        MemorySegment s = ppGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void ppGeometries(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppGeometriesRaw(s);
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, SIZE$scratchData);
    }

}
/// dummy, not implemented yet
