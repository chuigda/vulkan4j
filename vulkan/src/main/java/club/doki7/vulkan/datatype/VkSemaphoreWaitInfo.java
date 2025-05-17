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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreWaitInfo.html"><code>VkSemaphoreWaitInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSemaphoreWaitInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSemaphoreWaitFlags flags; // optional
///     uint32_t semaphoreCount;
///     VkSemaphore const* pSemaphores;
///     uint64_t const* pValues;
/// } VkSemaphoreWaitInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO`
///
/// The {@link VkSemaphoreWaitInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSemaphoreWaitInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreWaitInfo.html"><code>VkSemaphoreWaitInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSemaphoreWaitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkSemaphoreWaitInfo allocate(Arena arena) {
        VkSemaphoreWaitInfo ret = new VkSemaphoreWaitInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SEMAPHORE_WAIT_INFO);
        return ret;
    }

    public static VkSemaphoreWaitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreWaitInfo[] ret = new VkSemaphoreWaitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSemaphoreWaitInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SEMAPHORE_WAIT_INFO);
        }
        return ret;
    }

    public static VkSemaphoreWaitInfo clone(Arena arena, VkSemaphoreWaitInfo src) {
        VkSemaphoreWaitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSemaphoreWaitInfo[] clone(Arena arena, VkSemaphoreWaitInfo[] src) {
        VkSemaphoreWaitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SEMAPHORE_WAIT_INFO);
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

    public @enumtype(VkSemaphoreWaitFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSemaphoreWaitFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int semaphoreCount() {
        return segment.get(LAYOUT$semaphoreCount, OFFSET$semaphoreCount);
    }

    public void semaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$semaphoreCount, OFFSET$semaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSemaphoresRaw() {
        return segment.get(LAYOUT$pSemaphores, OFFSET$pSemaphores);
    }

    public void pSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSemaphores, OFFSET$pSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Ptr} does not have correct {@link VkSemaphore.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Ptr pSemaphores() {
        MemorySegment s = pSemaphoresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore.Ptr(s);
    }

    public void pSemaphores(@Nullable VkSemaphore.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSemaphoresRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pValuesRaw() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pValues() {
        MemorySegment s = pValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pValuesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSemaphores"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pValues")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$semaphoreCount = PathElement.groupElement("PATH$semaphoreCount");
    public static final PathElement PATH$pSemaphores = PathElement.groupElement("PATH$pSemaphores");
    public static final PathElement PATH$pValues = PathElement.groupElement("PATH$pValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$semaphoreCount = (OfInt) LAYOUT.select(PATH$semaphoreCount);
    public static final AddressLayout LAYOUT$pSemaphores = (AddressLayout) LAYOUT.select(PATH$pSemaphores);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$semaphoreCount = LAYOUT$semaphoreCount.byteSize();
    public static final long SIZE$pSemaphores = LAYOUT$pSemaphores.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$semaphoreCount = LAYOUT.byteOffset(PATH$semaphoreCount);
    public static final long OFFSET$pSemaphores = LAYOUT.byteOffset(PATH$pSemaphores);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);
}
