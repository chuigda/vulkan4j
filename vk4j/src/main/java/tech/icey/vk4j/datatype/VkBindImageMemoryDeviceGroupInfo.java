package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkBindImageMemoryDeviceGroupInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
///     uint32_t splitInstanceBindRegionCount;
///     const VkRect2D* pSplitInstanceBindRegions;
/// } VkBindImageMemoryDeviceGroupInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindImageMemoryDeviceGroupInfo.html">VkBindImageMemoryDeviceGroupInfo</a>
public record VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) implements IPointer {
    public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int deviceIndexCount() {
        return segment.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);
    }

    public void deviceIndexCount(@unsigned int value) {
        segment.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDeviceIndicesRaw() {
        return segment.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);
    }

    public void pDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @Nullable @unsigned IntBuffer pDeviceIndices() {
        MemorySegment s = pDeviceIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pDeviceIndices(@Nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceIndicesRaw(s);
    }

    public @unsigned int splitInstanceBindRegionCount() {
        return segment.get(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount);
    }

    public void splitInstanceBindRegionCount(@unsigned int value) {
        segment.set(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pSplitInstanceBindRegionsRaw() {
        return segment.get(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions);
    }

    public void pSplitInstanceBindRegionsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions, value);
    }

    public @Nullable VkRect2D pSplitInstanceBindRegions() {
        MemorySegment s = pSplitInstanceBindRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkRect2D[] pSplitInstanceBindRegions(int assumedCount) {
        MemorySegment s = pSplitInstanceBindRegionsRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pSplitInstanceBindRegions(@Nullable VkRect2D value) {
        pSplitInstanceBindRegionsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkBindImageMemoryDeviceGroupInfo allocate(Arena arena) {
        return new VkBindImageMemoryDeviceGroupInfo(arena.allocate(LAYOUT));
    }

    public static VkBindImageMemoryDeviceGroupInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemoryDeviceGroupInfo[] ret = new VkBindImageMemoryDeviceGroupInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindImageMemoryDeviceGroupInfo(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pSplitInstanceBindRegions")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceIndexCount = PathElement.groupElement("deviceIndexCount");
    public static final PathElement PATH$pDeviceIndices = PathElement.groupElement("pDeviceIndices");
    public static final PathElement PATH$splitInstanceBindRegionCount = PathElement.groupElement("splitInstanceBindRegionCount");
    public static final PathElement PATH$pSplitInstanceBindRegions = PathElement.groupElement("pSplitInstanceBindRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceIndexCount = (OfInt) LAYOUT.select(PATH$deviceIndexCount);
    public static final AddressLayout LAYOUT$pDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pDeviceIndices);
    public static final OfInt LAYOUT$splitInstanceBindRegionCount = (OfInt) LAYOUT.select(PATH$splitInstanceBindRegionCount);
    public static final AddressLayout LAYOUT$pSplitInstanceBindRegions = (AddressLayout) LAYOUT.select(PATH$pSplitInstanceBindRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceIndexCount = LAYOUT.byteOffset(PATH$deviceIndexCount);
    public static final long OFFSET$pDeviceIndices = LAYOUT.byteOffset(PATH$pDeviceIndices);
    public static final long OFFSET$splitInstanceBindRegionCount = LAYOUT.byteOffset(PATH$splitInstanceBindRegionCount);
    public static final long OFFSET$pSplitInstanceBindRegions = LAYOUT.byteOffset(PATH$pSplitInstanceBindRegions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceIndexCount = LAYOUT$deviceIndexCount.byteSize();
    public static final long SIZE$pDeviceIndices = LAYOUT$pDeviceIndices.byteSize();
    public static final long SIZE$splitInstanceBindRegionCount = LAYOUT$splitInstanceBindRegionCount.byteSize();
    public static final long SIZE$pSplitInstanceBindRegions = LAYOUT$pSplitInstanceBindRegions.byteSize();
}
