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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildGeometryInfoKHR.html"><code>VkAccelerationStructureBuildGeometryInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureBuildGeometryInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkAccelerationStructureTypeKHR type; // @link substring="VkAccelerationStructureTypeKHR" target="VkAccelerationStructureTypeKHR" @link substring="type" target="#type"
///     VkBuildAccelerationStructureFlagsKHR flags; // optional // @link substring="VkBuildAccelerationStructureFlagsKHR" target="VkBuildAccelerationStructureFlagsKHR" @link substring="flags" target="#flags"
///     VkBuildAccelerationStructureModeKHR mode; // @link substring="VkBuildAccelerationStructureModeKHR" target="VkBuildAccelerationStructureModeKHR" @link substring="mode" target="#mode"
///     VkAccelerationStructureKHR srcAccelerationStructure; // optional // @link substring="VkAccelerationStructureKHR" target="VkAccelerationStructureKHR" @link substring="srcAccelerationStructure" target="#srcAccelerationStructure"
///     VkAccelerationStructureKHR dstAccelerationStructure; // optional // @link substring="VkAccelerationStructureKHR" target="VkAccelerationStructureKHR" @link substring="dstAccelerationStructure" target="#dstAccelerationStructure"
///     uint32_t geometryCount; // optional // @link substring="geometryCount" target="#geometryCount"
///     VkAccelerationStructureGeometryKHR const* pGeometries; // optional // @link substring="VkAccelerationStructureGeometryKHR" target="VkAccelerationStructureGeometryKHR" @link substring="pGeometries" target="#pGeometries"
///     VkAccelerationStructureGeometryKHR const* const* ppGeometries; // @link substring="VkAccelerationStructureGeometryKHR" target="VkAccelerationStructureGeometryKHR" @link substring="ppGeometries" target="#ppGeometries"
///     VkDeviceOrHostAddressKHR scratchData; // @link substring="VkDeviceOrHostAddressKHR" target="VkDeviceOrHostAddressKHR" @link substring="scratchData" target="#scratchData"
/// } VkAccelerationStructureBuildGeometryInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR`
///
/// The {@code allocate} ({@link VkAccelerationStructureBuildGeometryInfoKHR#allocate(Arena)}, {@link VkAccelerationStructureBuildGeometryInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAccelerationStructureBuildGeometryInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildGeometryInfoKHR.html"><code>VkAccelerationStructureBuildGeometryInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureBuildGeometryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureBuildGeometryInfoKHR allocate(Arena arena) {
        VkAccelerationStructureBuildGeometryInfoKHR ret = new VkAccelerationStructureBuildGeometryInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR);
        return ret;
    }

    public static VkAccelerationStructureBuildGeometryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildGeometryInfoKHR[] ret = new VkAccelerationStructureBuildGeometryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureBuildGeometryInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR);
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

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO_KHR);
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

    public @enumtype(VkBuildAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @Nullable VkAccelerationStructureKHR srcAccelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$srcAccelerationStructure, SIZE$srcAccelerationStructure);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void srcAccelerationStructure(@Nullable VkAccelerationStructureKHR value) {
        segment.set(LAYOUT$srcAccelerationStructure, OFFSET$srcAccelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkAccelerationStructureKHR dstAccelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$dstAccelerationStructure, SIZE$dstAccelerationStructure);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void dstAccelerationStructure(@Nullable VkAccelerationStructureKHR value) {
        segment.set(LAYOUT$dstAccelerationStructure, OFFSET$dstAccelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int geometryCount() {
        return segment.get(LAYOUT$geometryCount, OFFSET$geometryCount);
    }

    public void geometryCount(@unsigned int value) {
        segment.set(LAYOUT$geometryCount, OFFSET$geometryCount, value);
    }

    public @Nullable VkAccelerationStructureGeometryKHR pGeometries() {
        MemorySegment s = pGeometriesRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAccelerationStructureGeometryKHR.BYTES);
        VkAccelerationStructureGeometryKHR[] ret = new VkAccelerationStructureGeometryKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAccelerationStructureGeometryKHR(s.asSlice(i * VkAccelerationStructureGeometryKHR.BYTES, VkAccelerationStructureGeometryKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkAccelerationStructureGeometryKHR.class) MemorySegment pGeometriesRaw() {
        return segment.get(LAYOUT$pGeometries, OFFSET$pGeometries);
    }

    public void pGeometriesRaw(@pointer(target=VkAccelerationStructureGeometryKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pGeometries, OFFSET$pGeometries, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppGeometries() {
        MemorySegment s = ppGeometriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void ppGeometries(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppGeometriesRaw(s);
    }

    public @pointer(comment="void**") MemorySegment ppGeometriesRaw() {
        return segment.get(LAYOUT$ppGeometries, OFFSET$ppGeometries);
    }

    public void ppGeometriesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppGeometries, OFFSET$ppGeometries, value);
    }

    public @NotNull VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(@NotNull VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, SIZE$scratchData);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("srcAccelerationStructure"),
        ValueLayout.ADDRESS.withName("dstAccelerationStructure"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT).withName("pGeometries"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkAccelerationStructureGeometryKHR.LAYOUT)).withName("ppGeometries"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$srcAccelerationStructure = PathElement.groupElement("srcAccelerationStructure");
    public static final PathElement PATH$dstAccelerationStructure = PathElement.groupElement("dstAccelerationStructure");
    public static final PathElement PATH$geometryCount = PathElement.groupElement("geometryCount");
    public static final PathElement PATH$pGeometries = PathElement.groupElement("pGeometries");
    public static final PathElement PATH$ppGeometries = PathElement.groupElement("ppGeometries");
    public static final PathElement PATH$scratchData = PathElement.groupElement("scratchData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final AddressLayout LAYOUT$srcAccelerationStructure = (AddressLayout) LAYOUT.select(PATH$srcAccelerationStructure);
    public static final AddressLayout LAYOUT$dstAccelerationStructure = (AddressLayout) LAYOUT.select(PATH$dstAccelerationStructure);
    public static final OfInt LAYOUT$geometryCount = (OfInt) LAYOUT.select(PATH$geometryCount);
    public static final AddressLayout LAYOUT$pGeometries = (AddressLayout) LAYOUT.select(PATH$pGeometries);
    public static final AddressLayout LAYOUT$ppGeometries = (AddressLayout) LAYOUT.select(PATH$ppGeometries);
    public static final StructLayout LAYOUT$scratchData = (StructLayout) LAYOUT.select(PATH$scratchData);

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
}
