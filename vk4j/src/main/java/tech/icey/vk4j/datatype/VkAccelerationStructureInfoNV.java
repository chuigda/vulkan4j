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
/// typedef struct VkAccelerationStructureInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkAccelerationStructureTypeNV type;
///     VkBuildAccelerationStructureFlagsNV flags;
///     uint32_t instanceCount;
///     uint32_t geometryCount;
///     const VkGeometryNV* pGeometries;
/// } VkAccelerationStructureInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureInfoNV.html">VkAccelerationStructureInfoNV</a>
public record VkAccelerationStructureInfoNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV);
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

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int geometryCount() {
        return segment.get(LAYOUT$geometryCount, OFFSET$geometryCount);
    }

    public void geometryCount(@unsigned int value) {
        segment.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);
    }

    public @pointer(comment="VkGeometryNV*") MemorySegment pGeometriesRaw() {
        return segment.get(LAYOUT$pGeometries, OFFSET$pGeometries);
    }

    public void pGeometriesRaw(@pointer(comment="VkGeometryNV*") MemorySegment value) {
        segment.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);
    }

    public @nullable VkGeometryNV pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkGeometryNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkGeometryNV[] pGeometries(int assumedCount) {
        MemorySegment s = pGeometriesRaw().reinterpret(assumedCount * VkGeometryNV.SIZE);
        VkGeometryNV[] arr = new VkGeometryNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkGeometryNV(s.asSlice(i * VkGeometryNV.SIZE, VkGeometryNV.SIZE));
        }
        return arr;
    }

    public void pGeometries(@nullable VkGeometryNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGeometriesRaw(s);
    }

    public static VkAccelerationStructureInfoNV allocate(Arena arena) {
        return new VkAccelerationStructureInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureInfoNV[] ret = new VkAccelerationStructureInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGeometryNV.LAYOUT).withName("pGeometries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("instanceCount");
    public static final PathElement PATH$geometryCount = PathElement.groupElement("geometryCount");
    public static final PathElement PATH$pGeometries = PathElement.groupElement("pGeometries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$geometryCount = (OfInt) LAYOUT.select(PATH$geometryCount);
    public static final AddressLayout LAYOUT$pGeometries = (AddressLayout) LAYOUT.select(PATH$pGeometries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$geometryCount = LAYOUT.byteOffset(PATH$geometryCount);
    public static final long OFFSET$pGeometries = LAYOUT.byteOffset(PATH$pGeometries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$instanceCount = LAYOUT$instanceCount.byteSize();
    public static final long SIZE$geometryCount = LAYOUT$geometryCount.byteSize();
    public static final long SIZE$pGeometries = LAYOUT$pGeometries.byteSize();

}
