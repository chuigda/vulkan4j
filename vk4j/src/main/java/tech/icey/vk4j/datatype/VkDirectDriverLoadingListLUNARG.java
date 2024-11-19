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
/// typedef struct VkDirectDriverLoadingListLUNARG {
///     VkStructureType sType;
///     const void* pNext;
///     VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     const VkDirectDriverLoadingInfoLUNARG* pDrivers;
/// } VkDirectDriverLoadingListLUNARG;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDirectDriverLoadingListLUNARG.html">VkDirectDriverLoadingListLUNARG</a>
public record VkDirectDriverLoadingListLUNARG(MemorySegment segment) implements IPointer {
    public VkDirectDriverLoadingListLUNARG(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG);
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

    public @enumtype(VkDirectDriverLoadingModeLUNARG.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkDirectDriverLoadingModeLUNARG.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @unsigned int driverCount() {
        return segment.get(LAYOUT$driverCount, OFFSET$driverCount);
    }

    public void driverCount(@unsigned int value) {
        segment.set(LAYOUT$driverCount, OFFSET$driverCount, value);
    }

    public @pointer(comment="VkDirectDriverLoadingInfoLUNARG*") MemorySegment pDriversRaw() {
        return segment.get(LAYOUT$pDrivers, OFFSET$pDrivers);
    }

    public void pDriversRaw(@pointer(comment="VkDirectDriverLoadingInfoLUNARG*") MemorySegment value) {
        segment.set(LAYOUT$pDrivers, OFFSET$pDrivers, value);
    }

    public @Nullable VkDirectDriverLoadingInfoLUNARG pDrivers() {
        MemorySegment s = pDriversRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDirectDriverLoadingInfoLUNARG(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDirectDriverLoadingInfoLUNARG[] pDrivers(int assumedCount) {
        MemorySegment s = pDriversRaw().reinterpret(assumedCount * VkDirectDriverLoadingInfoLUNARG.SIZE);
        VkDirectDriverLoadingInfoLUNARG[] arr = new VkDirectDriverLoadingInfoLUNARG[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDirectDriverLoadingInfoLUNARG(s.asSlice(i * VkDirectDriverLoadingInfoLUNARG.SIZE, VkDirectDriverLoadingInfoLUNARG.SIZE));
        }
        return arr;
    }

    public void pDrivers(@Nullable VkDirectDriverLoadingInfoLUNARG value) {
        pDriversRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDirectDriverLoadingListLUNARG allocate(Arena arena) {
        return new VkDirectDriverLoadingListLUNARG(arena.allocate(LAYOUT));
    }

    public static VkDirectDriverLoadingListLUNARG[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectDriverLoadingListLUNARG[] ret = new VkDirectDriverLoadingListLUNARG[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDirectDriverLoadingListLUNARG(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDirectDriverLoadingListLUNARG clone(Arena arena, VkDirectDriverLoadingListLUNARG src) {
        VkDirectDriverLoadingListLUNARG ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDirectDriverLoadingListLUNARG[] clone(Arena arena, VkDirectDriverLoadingListLUNARG[] src) {
        VkDirectDriverLoadingListLUNARG[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDirectDriverLoadingInfoLUNARG.LAYOUT).withName("pDrivers")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$driverCount = PathElement.groupElement("driverCount");
    public static final PathElement PATH$pDrivers = PathElement.groupElement("pDrivers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$driverCount = (OfInt) LAYOUT.select(PATH$driverCount);
    public static final AddressLayout LAYOUT$pDrivers = (AddressLayout) LAYOUT.select(PATH$pDrivers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$driverCount = LAYOUT.byteOffset(PATH$driverCount);
    public static final long OFFSET$pDrivers = LAYOUT.byteOffset(PATH$pDrivers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$driverCount = LAYOUT$driverCount.byteSize();
    public static final long SIZE$pDrivers = LAYOUT$pDrivers.byteSize();
}
