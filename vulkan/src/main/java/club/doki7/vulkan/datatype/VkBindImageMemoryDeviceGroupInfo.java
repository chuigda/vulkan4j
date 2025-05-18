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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindImageMemoryDeviceGroupInfo.html"><code>VkBindImageMemoryDeviceGroupInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindImageMemoryDeviceGroupInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t deviceIndexCount; // optional // @link substring="deviceIndexCount" target="#deviceIndexCount"
///     uint32_t const* pDeviceIndices; // @link substring="pDeviceIndices" target="#pDeviceIndices"
///     uint32_t splitInstanceBindRegionCount; // optional // @link substring="splitInstanceBindRegionCount" target="#splitInstanceBindRegionCount"
///     VkRect2D const* pSplitInstanceBindRegions; // @link substring="VkRect2D" target="VkRect2D" @link substring="pSplitInstanceBindRegions" target="#pSplitInstanceBindRegions"
/// } VkBindImageMemoryDeviceGroupInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO`
///
/// The {@code allocate} ({@link VkBindImageMemoryDeviceGroupInfo#allocate(Arena)}, {@link VkBindImageMemoryDeviceGroupInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkBindImageMemoryDeviceGroupInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindImageMemoryDeviceGroupInfo.html"><code>VkBindImageMemoryDeviceGroupInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindImageMemoryDeviceGroupInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindImageMemoryDeviceGroupInfo allocate(Arena arena) {
        VkBindImageMemoryDeviceGroupInfo ret = new VkBindImageMemoryDeviceGroupInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
        return ret;
    }

    public static VkBindImageMemoryDeviceGroupInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemoryDeviceGroupInfo[] ret = new VkBindImageMemoryDeviceGroupInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindImageMemoryDeviceGroupInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
        }
        return ret;
    }

    public static VkBindImageMemoryDeviceGroupInfo clone(Arena arena, VkBindImageMemoryDeviceGroupInfo src) {
        VkBindImageMemoryDeviceGroupInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindImageMemoryDeviceGroupInfo[] clone(Arena arena, VkBindImageMemoryDeviceGroupInfo[] src) {
        VkBindImageMemoryDeviceGroupInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
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

    public @unsigned int deviceIndexCount() {
        return segment.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);
    }

    public void deviceIndexCount(@unsigned int value) {
        segment.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDeviceIndices() {
        MemorySegment s = pDeviceIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDeviceIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceIndicesRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pDeviceIndicesRaw() {
        return segment.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);
    }

    public void pDeviceIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);
    }

    public @unsigned int splitInstanceBindRegionCount() {
        return segment.get(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount);
    }

    public void splitInstanceBindRegionCount(@unsigned int value) {
        segment.set(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount, value);
    }

    public @Nullable VkRect2D pSplitInstanceBindRegions() {
        MemorySegment s = pSplitInstanceBindRegionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pSplitInstanceBindRegions(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSplitInstanceBindRegionsRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pSplitInstanceBindRegions(int assumedCount) {
        MemorySegment s = pSplitInstanceBindRegionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.BYTES);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.BYTES, VkRect2D.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkRect2D.class) MemorySegment pSplitInstanceBindRegionsRaw() {
        return segment.get(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions);
    }

    public void pSplitInstanceBindRegionsRaw(@pointer(target=VkRect2D.class) MemorySegment value) {
        segment.set(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pSplitInstanceBindRegions")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceIndexCount = PathElement.groupElement("PATH$deviceIndexCount");
    public static final PathElement PATH$pDeviceIndices = PathElement.groupElement("PATH$pDeviceIndices");
    public static final PathElement PATH$splitInstanceBindRegionCount = PathElement.groupElement("PATH$splitInstanceBindRegionCount");
    public static final PathElement PATH$pSplitInstanceBindRegions = PathElement.groupElement("PATH$pSplitInstanceBindRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceIndexCount = (OfInt) LAYOUT.select(PATH$deviceIndexCount);
    public static final AddressLayout LAYOUT$pDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pDeviceIndices);
    public static final OfInt LAYOUT$splitInstanceBindRegionCount = (OfInt) LAYOUT.select(PATH$splitInstanceBindRegionCount);
    public static final AddressLayout LAYOUT$pSplitInstanceBindRegions = (AddressLayout) LAYOUT.select(PATH$pSplitInstanceBindRegions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceIndexCount = LAYOUT$deviceIndexCount.byteSize();
    public static final long SIZE$pDeviceIndices = LAYOUT$pDeviceIndices.byteSize();
    public static final long SIZE$splitInstanceBindRegionCount = LAYOUT$splitInstanceBindRegionCount.byteSize();
    public static final long SIZE$pSplitInstanceBindRegions = LAYOUT$pSplitInstanceBindRegions.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceIndexCount = LAYOUT.byteOffset(PATH$deviceIndexCount);
    public static final long OFFSET$pDeviceIndices = LAYOUT.byteOffset(PATH$pDeviceIndices);
    public static final long OFFSET$splitInstanceBindRegionCount = LAYOUT.byteOffset(PATH$splitInstanceBindRegionCount);
    public static final long OFFSET$pSplitInstanceBindRegions = LAYOUT.byteOffset(PATH$pSplitInstanceBindRegions);
}
