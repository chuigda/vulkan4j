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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInfoNV.html"><code>VkAccelerationStructureInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkAccelerationStructureTypeNV type;
///     VkBuildAccelerationStructureFlagsNV flags; // optional
///     uint32_t instanceCount; // optional
///     uint32_t geometryCount; // optional
///     VkGeometryNV const* pGeometries;
/// } VkAccelerationStructureInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV`
///
/// The {@link VkAccelerationStructureInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAccelerationStructureInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInfoNV.html"><code>VkAccelerationStructureInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureInfoNV allocate(Arena arena) {
        VkAccelerationStructureInfoNV ret = new VkAccelerationStructureInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_INFO_NV);
        return ret;
    }

    public static VkAccelerationStructureInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureInfoNV[] ret = new VkAccelerationStructureInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_INFO_NV);
        }
        return ret;
    }

    public static VkAccelerationStructureInfoNV clone(Arena arena, VkAccelerationStructureInfoNV src) {
        VkAccelerationStructureInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureInfoNV[] clone(Arena arena, VkAccelerationStructureInfoNV[] src) {
        VkAccelerationStructureInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_INFO_NV);
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

    public @Nullable VkGeometryNV pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkGeometryNV(s);
    }

    public void pGeometries(@Nullable VkGeometryNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGeometriesRaw(s);
    }

    @unsafe public @Nullable VkGeometryNV[] pGeometries(int assumedCount) {
        MemorySegment s = pGeometriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkGeometryNV.BYTES);
        VkGeometryNV[] ret = new VkGeometryNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkGeometryNV(s.asSlice(i * VkGeometryNV.BYTES, VkGeometryNV.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGeometryNV.LAYOUT).withName("pGeometries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("PATH$instanceCount");
    public static final PathElement PATH$geometryCount = PathElement.groupElement("PATH$geometryCount");
    public static final PathElement PATH$pGeometries = PathElement.groupElement("PATH$pGeometries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$geometryCount = (OfInt) LAYOUT.select(PATH$geometryCount);
    public static final AddressLayout LAYOUT$pGeometries = (AddressLayout) LAYOUT.select(PATH$pGeometries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$instanceCount = LAYOUT$instanceCount.byteSize();
    public static final long SIZE$geometryCount = LAYOUT$geometryCount.byteSize();
    public static final long SIZE$pGeometries = LAYOUT$pGeometries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$geometryCount = LAYOUT.byteOffset(PATH$geometryCount);
    public static final long OFFSET$pGeometries = LAYOUT.byteOffset(PATH$pGeometries);
}
