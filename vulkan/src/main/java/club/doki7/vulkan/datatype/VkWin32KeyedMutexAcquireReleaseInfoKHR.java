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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html"><code>VkWin32KeyedMutexAcquireReleaseInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t acquireCount; // optional
///     VkDeviceMemory const* pAcquireSyncs;
///     uint64_t const* pAcquireKeys;
///     uint32_t const* pAcquireTimeouts;
///     uint32_t releaseCount; // optional
///     VkDeviceMemory const* pReleaseSyncs;
///     uint64_t const* pReleaseKeys;
/// } VkWin32KeyedMutexAcquireReleaseInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR`
///
/// The {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html"><code>VkWin32KeyedMutexAcquireReleaseInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWin32KeyedMutexAcquireReleaseInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocate(Arena arena) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
        }
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoKHR src) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR[] clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoKHR[] src) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
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

    public @unsigned int acquireCount() {
        return segment.get(LAYOUT$acquireCount, OFFSET$acquireCount);
    }

    public void acquireCount(@unsigned int value) {
        segment.set(LAYOUT$acquireCount, OFFSET$acquireCount, value);
    }

    public @pointer(target=VkDeviceMemory.class) MemorySegment pAcquireSyncsRaw() {
        return segment.get(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs);
    }

    public void pAcquireSyncsRaw(@pointer(target=VkDeviceMemory.class) MemorySegment value) {
        segment.set(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Ptr} does not have correct {@link VkDeviceMemory.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Ptr pAcquireSyncs() {
        MemorySegment s = pAcquireSyncsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory.Ptr(s);
    }

    public void pAcquireSyncs(@Nullable VkDeviceMemory.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireSyncsRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pAcquireKeysRaw() {
        return segment.get(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys);
    }

    public void pAcquireKeysRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pAcquireKeys() {
        MemorySegment s = pAcquireKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pAcquireKeys(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireKeysRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pAcquireTimeoutsRaw() {
        return segment.get(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts);
    }

    public void pAcquireTimeoutsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pAcquireTimeouts() {
        MemorySegment s = pAcquireTimeoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pAcquireTimeouts(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireTimeoutsRaw(s);
    }

    public @unsigned int releaseCount() {
        return segment.get(LAYOUT$releaseCount, OFFSET$releaseCount);
    }

    public void releaseCount(@unsigned int value) {
        segment.set(LAYOUT$releaseCount, OFFSET$releaseCount, value);
    }

    public @pointer(target=VkDeviceMemory.class) MemorySegment pReleaseSyncsRaw() {
        return segment.get(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs);
    }

    public void pReleaseSyncsRaw(@pointer(target=VkDeviceMemory.class) MemorySegment value) {
        segment.set(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Ptr} does not have correct {@link VkDeviceMemory.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Ptr pReleaseSyncs() {
        MemorySegment s = pReleaseSyncsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory.Ptr(s);
    }

    public void pReleaseSyncs(@Nullable VkDeviceMemory.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseSyncsRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pReleaseKeysRaw() {
        return segment.get(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys);
    }

    public void pReleaseKeysRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pReleaseKeys() {
        MemorySegment s = pReleaseKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pReleaseKeys(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseKeysRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pAcquireTimeouts"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pReleaseKeys")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$acquireCount = PathElement.groupElement("PATH$acquireCount");
    public static final PathElement PATH$pAcquireSyncs = PathElement.groupElement("PATH$pAcquireSyncs");
    public static final PathElement PATH$pAcquireKeys = PathElement.groupElement("PATH$pAcquireKeys");
    public static final PathElement PATH$pAcquireTimeouts = PathElement.groupElement("PATH$pAcquireTimeouts");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("PATH$releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("PATH$pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("PATH$pReleaseKeys");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$acquireCount = (OfInt) LAYOUT.select(PATH$acquireCount);
    public static final AddressLayout LAYOUT$pAcquireSyncs = (AddressLayout) LAYOUT.select(PATH$pAcquireSyncs);
    public static final AddressLayout LAYOUT$pAcquireKeys = (AddressLayout) LAYOUT.select(PATH$pAcquireKeys);
    public static final AddressLayout LAYOUT$pAcquireTimeouts = (AddressLayout) LAYOUT.select(PATH$pAcquireTimeouts);
    public static final OfInt LAYOUT$releaseCount = (OfInt) LAYOUT.select(PATH$releaseCount);
    public static final AddressLayout LAYOUT$pReleaseSyncs = (AddressLayout) LAYOUT.select(PATH$pReleaseSyncs);
    public static final AddressLayout LAYOUT$pReleaseKeys = (AddressLayout) LAYOUT.select(PATH$pReleaseKeys);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$acquireCount = LAYOUT$acquireCount.byteSize();
    public static final long SIZE$pAcquireSyncs = LAYOUT$pAcquireSyncs.byteSize();
    public static final long SIZE$pAcquireKeys = LAYOUT$pAcquireKeys.byteSize();
    public static final long SIZE$pAcquireTimeouts = LAYOUT$pAcquireTimeouts.byteSize();
    public static final long SIZE$releaseCount = LAYOUT$releaseCount.byteSize();
    public static final long SIZE$pReleaseSyncs = LAYOUT$pReleaseSyncs.byteSize();
    public static final long SIZE$pReleaseKeys = LAYOUT$pReleaseKeys.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$acquireCount = LAYOUT.byteOffset(PATH$acquireCount);
    public static final long OFFSET$pAcquireSyncs = LAYOUT.byteOffset(PATH$pAcquireSyncs);
    public static final long OFFSET$pAcquireKeys = LAYOUT.byteOffset(PATH$pAcquireKeys);
    public static final long OFFSET$pAcquireTimeouts = LAYOUT.byteOffset(PATH$pAcquireTimeouts);
    public static final long OFFSET$releaseCount = LAYOUT.byteOffset(PATH$releaseCount);
    public static final long OFFSET$pReleaseSyncs = LAYOUT.byteOffset(PATH$pReleaseSyncs);
    public static final long OFFSET$pReleaseKeys = LAYOUT.byteOffset(PATH$pReleaseKeys);
}
