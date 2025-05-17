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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDependencyInfo.html"><code>VkDependencyInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDependencyInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDependencyFlags dependencyFlags; // optional
///     uint32_t memoryBarrierCount; // optional
///     VkMemoryBarrier2 const* pMemoryBarriers;
///     uint32_t bufferMemoryBarrierCount; // optional
///     VkBufferMemoryBarrier2 const* pBufferMemoryBarriers;
///     uint32_t imageMemoryBarrierCount; // optional
///     VkImageMemoryBarrier2 const* pImageMemoryBarriers;
/// } VkDependencyInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEPENDENCY_INFO`
///
/// The {@link VkDependencyInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDependencyInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDependencyInfo.html"><code>VkDependencyInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDependencyInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDependencyInfo allocate(Arena arena) {
        VkDependencyInfo ret = new VkDependencyInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEPENDENCY_INFO);
        return ret;
    }

    public static VkDependencyInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDependencyInfo[] ret = new VkDependencyInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDependencyInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEPENDENCY_INFO);
        }
        return ret;
    }

    public static VkDependencyInfo clone(Arena arena, VkDependencyInfo src) {
        VkDependencyInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDependencyInfo[] clone(Arena arena, VkDependencyInfo[] src) {
        VkDependencyInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEPENDENCY_INFO);
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

    public @enumtype(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@enumtype(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public @unsigned int memoryBarrierCount() {
        return segment.get(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount);
    }

    public void memoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount, value);
    }

    public @pointer(comment="VkMemoryBarrier2*") MemorySegment pMemoryBarriersRaw() {
        return segment.get(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers);
    }

    public void pMemoryBarriersRaw(@pointer(comment="VkMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers, value);
    }

    public @Nullable VkMemoryBarrier2 pMemoryBarriers() {
        MemorySegment s = pMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMemoryBarrier2(s);
    }

    public void pMemoryBarriers(@Nullable VkMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkMemoryBarrier2[] pMemoryBarriers(int assumedCount) {
        MemorySegment s = pMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMemoryBarrier2.BYTES);
        VkMemoryBarrier2[] ret = new VkMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMemoryBarrier2(s.asSlice(i * VkMemoryBarrier2.BYTES, VkMemoryBarrier2.BYTES));
        }
        return ret;
    }

    public @unsigned int bufferMemoryBarrierCount() {
        return segment.get(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount);
    }

    public void bufferMemoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount, value);
    }

    public @pointer(comment="VkBufferMemoryBarrier2*") MemorySegment pBufferMemoryBarriersRaw() {
        return segment.get(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers);
    }

    public void pBufferMemoryBarriersRaw(@pointer(comment="VkBufferMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers, value);
    }

    public @Nullable VkBufferMemoryBarrier2 pBufferMemoryBarriers() {
        MemorySegment s = pBufferMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferMemoryBarrier2(s);
    }

    public void pBufferMemoryBarriers(@Nullable VkBufferMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkBufferMemoryBarrier2[] pBufferMemoryBarriers(int assumedCount) {
        MemorySegment s = pBufferMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBufferMemoryBarrier2.BYTES);
        VkBufferMemoryBarrier2[] ret = new VkBufferMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBufferMemoryBarrier2(s.asSlice(i * VkBufferMemoryBarrier2.BYTES, VkBufferMemoryBarrier2.BYTES));
        }
        return ret;
    }

    public @unsigned int imageMemoryBarrierCount() {
        return segment.get(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount);
    }

    public void imageMemoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount, value);
    }

    public @pointer(comment="VkImageMemoryBarrier2*") MemorySegment pImageMemoryBarriersRaw() {
        return segment.get(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers);
    }

    public void pImageMemoryBarriersRaw(@pointer(comment="VkImageMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers, value);
    }

    public @Nullable VkImageMemoryBarrier2 pImageMemoryBarriers() {
        MemorySegment s = pImageMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageMemoryBarrier2(s);
    }

    public void pImageMemoryBarriers(@Nullable VkImageMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkImageMemoryBarrier2[] pImageMemoryBarriers(int assumedCount) {
        MemorySegment s = pImageMemoryBarriersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageMemoryBarrier2.BYTES);
        VkImageMemoryBarrier2[] ret = new VkImageMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageMemoryBarrier2(s.asSlice(i * VkImageMemoryBarrier2.BYTES, VkImageMemoryBarrier2.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("memoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMemoryBarrier2.LAYOUT).withName("pMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("bufferMemoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryBarrier2.LAYOUT).withName("pBufferMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("imageMemoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryBarrier2.LAYOUT).withName("pImageMemoryBarriers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("PATH$dependencyFlags");
    public static final PathElement PATH$memoryBarrierCount = PathElement.groupElement("PATH$memoryBarrierCount");
    public static final PathElement PATH$pMemoryBarriers = PathElement.groupElement("PATH$pMemoryBarriers");
    public static final PathElement PATH$bufferMemoryBarrierCount = PathElement.groupElement("PATH$bufferMemoryBarrierCount");
    public static final PathElement PATH$pBufferMemoryBarriers = PathElement.groupElement("PATH$pBufferMemoryBarriers");
    public static final PathElement PATH$imageMemoryBarrierCount = PathElement.groupElement("PATH$imageMemoryBarrierCount");
    public static final PathElement PATH$pImageMemoryBarriers = PathElement.groupElement("PATH$pImageMemoryBarriers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);
    public static final OfInt LAYOUT$memoryBarrierCount = (OfInt) LAYOUT.select(PATH$memoryBarrierCount);
    public static final AddressLayout LAYOUT$pMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pMemoryBarriers);
    public static final OfInt LAYOUT$bufferMemoryBarrierCount = (OfInt) LAYOUT.select(PATH$bufferMemoryBarrierCount);
    public static final AddressLayout LAYOUT$pBufferMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pBufferMemoryBarriers);
    public static final OfInt LAYOUT$imageMemoryBarrierCount = (OfInt) LAYOUT.select(PATH$imageMemoryBarrierCount);
    public static final AddressLayout LAYOUT$pImageMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pImageMemoryBarriers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dependencyFlags = LAYOUT$dependencyFlags.byteSize();
    public static final long SIZE$memoryBarrierCount = LAYOUT$memoryBarrierCount.byteSize();
    public static final long SIZE$pMemoryBarriers = LAYOUT$pMemoryBarriers.byteSize();
    public static final long SIZE$bufferMemoryBarrierCount = LAYOUT$bufferMemoryBarrierCount.byteSize();
    public static final long SIZE$pBufferMemoryBarriers = LAYOUT$pBufferMemoryBarriers.byteSize();
    public static final long SIZE$imageMemoryBarrierCount = LAYOUT$imageMemoryBarrierCount.byteSize();
    public static final long SIZE$pImageMemoryBarriers = LAYOUT$pImageMemoryBarriers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
    public static final long OFFSET$memoryBarrierCount = LAYOUT.byteOffset(PATH$memoryBarrierCount);
    public static final long OFFSET$pMemoryBarriers = LAYOUT.byteOffset(PATH$pMemoryBarriers);
    public static final long OFFSET$bufferMemoryBarrierCount = LAYOUT.byteOffset(PATH$bufferMemoryBarrierCount);
    public static final long OFFSET$pBufferMemoryBarriers = LAYOUT.byteOffset(PATH$pBufferMemoryBarriers);
    public static final long OFFSET$imageMemoryBarrierCount = LAYOUT.byteOffset(PATH$imageMemoryBarrierCount);
    public static final long OFFSET$pImageMemoryBarriers = LAYOUT.byteOffset(PATH$pImageMemoryBarriers);
}
