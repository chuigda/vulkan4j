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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDirectDriverLoadingListLUNARG.html"><code>VkDirectDriverLoadingListLUNARG</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDirectDriverLoadingListLUNARG {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     VkDirectDriverLoadingInfoLUNARG const* pDrivers;
/// } VkDirectDriverLoadingListLUNARG;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG`
///
/// The {@link VkDirectDriverLoadingListLUNARG#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDirectDriverLoadingListLUNARG#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDirectDriverLoadingListLUNARG.html"><code>VkDirectDriverLoadingListLUNARG</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDirectDriverLoadingListLUNARG(@NotNull MemorySegment segment) implements IPointer {
    public static VkDirectDriverLoadingListLUNARG allocate(Arena arena) {
        VkDirectDriverLoadingListLUNARG ret = new VkDirectDriverLoadingListLUNARG(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DIRECT_DRIVER_LOADING_LIST_LUNARG);
        return ret;
    }

    public static VkDirectDriverLoadingListLUNARG[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectDriverLoadingListLUNARG[] ret = new VkDirectDriverLoadingListLUNARG[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDirectDriverLoadingListLUNARG(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DIRECT_DRIVER_LOADING_LIST_LUNARG);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DIRECT_DRIVER_LOADING_LIST_LUNARG);
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDirectDriverLoadingInfoLUNARG(s);
    }

    public void pDrivers(@Nullable VkDirectDriverLoadingInfoLUNARG value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDriversRaw(s);
    }

    @unsafe public @Nullable VkDirectDriverLoadingInfoLUNARG[] pDrivers(int assumedCount) {
        MemorySegment s = pDriversRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDirectDriverLoadingInfoLUNARG.BYTES);
        VkDirectDriverLoadingInfoLUNARG[] ret = new VkDirectDriverLoadingInfoLUNARG[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDirectDriverLoadingInfoLUNARG(s.asSlice(i * VkDirectDriverLoadingInfoLUNARG.BYTES, VkDirectDriverLoadingInfoLUNARG.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDirectDriverLoadingInfoLUNARG.LAYOUT).withName("pDrivers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$driverCount = PathElement.groupElement("PATH$driverCount");
    public static final PathElement PATH$pDrivers = PathElement.groupElement("PATH$pDrivers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$driverCount = (OfInt) LAYOUT.select(PATH$driverCount);
    public static final AddressLayout LAYOUT$pDrivers = (AddressLayout) LAYOUT.select(PATH$pDrivers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$driverCount = LAYOUT$driverCount.byteSize();
    public static final long SIZE$pDrivers = LAYOUT$pDrivers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$driverCount = LAYOUT.byteOffset(PATH$driverCount);
    public static final long OFFSET$pDrivers = LAYOUT.byteOffset(PATH$pDrivers);
}
