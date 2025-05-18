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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapBuildInfoEXT.html"><code>VkMicromapBuildInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMicromapBuildInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkMicromapTypeEXT type; // @link substring="VkMicromapTypeEXT" target="VkMicromapTypeEXT" @link substring="type" target="#type"
///     VkBuildMicromapFlagsEXT flags; // optional // @link substring="VkBuildMicromapFlagsEXT" target="VkBuildMicromapFlagsEXT" @link substring="flags" target="#flags"
///     VkBuildMicromapModeEXT mode; // @link substring="VkBuildMicromapModeEXT" target="VkBuildMicromapModeEXT" @link substring="mode" target="#mode"
///     VkMicromapEXT dstMicromap; // optional // @link substring="VkMicromapEXT" target="VkMicromapEXT" @link substring="dstMicromap" target="#dstMicromap"
///     uint32_t usageCountsCount; // optional // @link substring="usageCountsCount" target="#usageCountsCount"
///     VkMicromapUsageEXT const* pUsageCounts; // optional // @link substring="VkMicromapUsageEXT" target="VkMicromapUsageEXT" @link substring="pUsageCounts" target="#pUsageCounts"
///     VkMicromapUsageEXT const* const* ppUsageCounts; // @link substring="VkMicromapUsageEXT" target="VkMicromapUsageEXT" @link substring="ppUsageCounts" target="#ppUsageCounts"
///     VkDeviceOrHostAddressConstKHR data; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="data" target="#data"
///     VkDeviceOrHostAddressKHR scratchData; // @link substring="VkDeviceOrHostAddressKHR" target="VkDeviceOrHostAddressKHR" @link substring="scratchData" target="#scratchData"
///     VkDeviceOrHostAddressConstKHR triangleArray; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="triangleArray" target="#triangleArray"
///     VkDeviceSize triangleArrayStride; // @link substring="triangleArrayStride" target="#triangleArrayStride"
/// } VkMicromapBuildInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT`
///
/// The {@code allocate} ({@link VkMicromapBuildInfoEXT#allocate(Arena)}, {@link VkMicromapBuildInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkMicromapBuildInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapBuildInfoEXT.html"><code>VkMicromapBuildInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMicromapBuildInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkMicromapBuildInfoEXT allocate(Arena arena) {
        VkMicromapBuildInfoEXT ret = new VkMicromapBuildInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MICROMAP_BUILD_INFO_EXT);
        return ret;
    }

    public static VkMicromapBuildInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapBuildInfoEXT[] ret = new VkMicromapBuildInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapBuildInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MICROMAP_BUILD_INFO_EXT);
        }
        return ret;
    }

    public static VkMicromapBuildInfoEXT clone(Arena arena, VkMicromapBuildInfoEXT src) {
        VkMicromapBuildInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapBuildInfoEXT[] clone(Arena arena, VkMicromapBuildInfoEXT[] src) {
        VkMicromapBuildInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MICROMAP_BUILD_INFO_EXT);
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

    public @enumtype(VkMicromapTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkMicromapTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkBuildMicromapFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildMicromapFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkBuildMicromapModeEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildMicromapModeEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @Nullable VkMicromapEXT dstMicromap() {
        MemorySegment s = segment.asSlice(OFFSET$dstMicromap, SIZE$dstMicromap);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void dstMicromap(@Nullable VkMicromapEXT value) {
        segment.set(LAYOUT$dstMicromap, OFFSET$dstMicromap, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int usageCountsCount() {
        return segment.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);
    }

    public void usageCountsCount(@unsigned int value) {
        segment.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);
    }

    public @Nullable VkMicromapUsageEXT pUsageCounts() {
        MemorySegment s = pUsageCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMicromapUsageEXT(s);
    }

    public void pUsageCounts(@Nullable VkMicromapUsageEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUsageCountsRaw(s);
    }

    @unsafe public @Nullable VkMicromapUsageEXT[] pUsageCounts(int assumedCount) {
        MemorySegment s = pUsageCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMicromapUsageEXT.BYTES);
        VkMicromapUsageEXT[] ret = new VkMicromapUsageEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMicromapUsageEXT(s.asSlice(i * VkMicromapUsageEXT.BYTES, VkMicromapUsageEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkMicromapUsageEXT.class) MemorySegment pUsageCountsRaw() {
        return segment.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);
    }

    public void pUsageCountsRaw(@pointer(target=VkMicromapUsageEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppUsageCounts() {
        MemorySegment s = ppUsageCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void ppUsageCounts(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppUsageCountsRaw(s);
    }

    public @pointer(comment="void**") MemorySegment ppUsageCountsRaw() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCountsRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR data() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public @NotNull VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(@NotNull VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, SIZE$scratchData);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR triangleArray() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$triangleArray, LAYOUT$triangleArray));
    }

    public void triangleArray(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangleArray, SIZE$triangleArray);
    }

    public @unsigned long triangleArrayStride() {
        return segment.get(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride);
    }

    public void triangleArrayStride(@unsigned long value) {
        segment.set(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("dstMicromap"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray"),
        ValueLayout.JAVA_LONG.withName("triangleArrayStride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$dstMicromap = PathElement.groupElement("PATH$dstMicromap");
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement("PATH$usageCountsCount");
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement("PATH$pUsageCounts");
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement("PATH$ppUsageCounts");
    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");
    public static final PathElement PATH$triangleArray = PathElement.groupElement("PATH$triangleArray");
    public static final PathElement PATH$triangleArrayStride = PathElement.groupElement("PATH$triangleArrayStride");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final AddressLayout LAYOUT$dstMicromap = (AddressLayout) LAYOUT.select(PATH$dstMicromap);
    public static final OfInt LAYOUT$usageCountsCount = (OfInt) LAYOUT.select(PATH$usageCountsCount);
    public static final AddressLayout LAYOUT$pUsageCounts = (AddressLayout) LAYOUT.select(PATH$pUsageCounts);
    public static final AddressLayout LAYOUT$ppUsageCounts = (AddressLayout) LAYOUT.select(PATH$ppUsageCounts);
    public static final StructLayout LAYOUT$data = (StructLayout) LAYOUT.select(PATH$data);
    public static final StructLayout LAYOUT$scratchData = (StructLayout) LAYOUT.select(PATH$scratchData);
    public static final StructLayout LAYOUT$triangleArray = (StructLayout) LAYOUT.select(PATH$triangleArray);
    public static final OfLong LAYOUT$triangleArrayStride = (OfLong) LAYOUT.select(PATH$triangleArrayStride);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$dstMicromap = LAYOUT$dstMicromap.byteSize();
    public static final long SIZE$usageCountsCount = LAYOUT$usageCountsCount.byteSize();
    public static final long SIZE$pUsageCounts = LAYOUT$pUsageCounts.byteSize();
    public static final long SIZE$ppUsageCounts = LAYOUT$ppUsageCounts.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();
    public static final long SIZE$triangleArray = LAYOUT$triangleArray.byteSize();
    public static final long SIZE$triangleArrayStride = LAYOUT$triangleArrayStride.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$dstMicromap = LAYOUT.byteOffset(PATH$dstMicromap);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$triangleArray = LAYOUT.byteOffset(PATH$triangleArray);
    public static final long OFFSET$triangleArrayStride = LAYOUT.byteOffset(PATH$triangleArrayStride);
}
