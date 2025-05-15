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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoNV.html"><code>VkWin32KeyedMutexAcquireReleaseInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkWin32KeyedMutexAcquireReleaseInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t acquireCount; // optional
///     VkDeviceMemory const* pAcquireSyncs;
///     uint64_t const* pAcquireKeys;
///     uint32_t const* pAcquireTimeoutMilliseconds;
///     uint32_t releaseCount; // optional
///     VkDeviceMemory const* pReleaseSyncs;
///     uint64_t const* pReleaseKeys;
/// } VkWin32KeyedMutexAcquireReleaseInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV`
///
/// The {@link VkWin32KeyedMutexAcquireReleaseInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkWin32KeyedMutexAcquireReleaseInfoNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoNV.html"><code>VkWin32KeyedMutexAcquireReleaseInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWin32KeyedMutexAcquireReleaseInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocate(Arena arena) {
        VkWin32KeyedMutexAcquireReleaseInfoNV ret = new VkWin32KeyedMutexAcquireReleaseInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoNV[] ret = new VkWin32KeyedMutexAcquireReleaseInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
        }
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoNV src) {
        VkWin32KeyedMutexAcquireReleaseInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV[] clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoNV[] src) {
        VkWin32KeyedMutexAcquireReleaseInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int acquireCount() {
        return segment.get(LAYOUT$acquireCount, OFFSET$acquireCount);
    }

    public void acquireCount(@unsigned int value) {
        segment.set(LAYOUT$acquireCount, OFFSET$acquireCount, value);
    }

    public @pointer(comment="VkDeviceMemory*") MemorySegment pAcquireSyncsRaw() {
        return segment.get(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs);
    }

    public void pAcquireSyncsRaw(@pointer(comment="VkDeviceMemory*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct {@link VkDeviceMemory.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Buffer pAcquireSyncs() {
        MemorySegment s = pAcquireSyncsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
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

    public @pointer(comment="int*") MemorySegment pAcquireTimeoutMillisecondsRaw() {
        return segment.get(LAYOUT$pAcquireTimeoutMilliseconds, OFFSET$pAcquireTimeoutMilliseconds);
    }

    public void pAcquireTimeoutMillisecondsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeoutMilliseconds, OFFSET$pAcquireTimeoutMilliseconds, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pAcquireTimeoutMilliseconds() {
        MemorySegment s = pAcquireTimeoutMillisecondsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pAcquireTimeoutMilliseconds(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireTimeoutMillisecondsRaw(s);
    }

    public @unsigned int releaseCount() {
        return segment.get(LAYOUT$releaseCount, OFFSET$releaseCount);
    }

    public void releaseCount(@unsigned int value) {
        segment.set(LAYOUT$releaseCount, OFFSET$releaseCount, value);
    }

    public @pointer(comment="VkDeviceMemory*") MemorySegment pReleaseSyncsRaw() {
        return segment.get(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs);
    }

    public void pReleaseSyncsRaw(@pointer(comment="VkDeviceMemory*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct {@link VkDeviceMemory.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Buffer pReleaseSyncs() {
        MemorySegment s = pReleaseSyncsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
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
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pAcquireTimeoutMilliseconds"),
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
    public static final PathElement PATH$pAcquireTimeoutMilliseconds = PathElement.groupElement("PATH$pAcquireTimeoutMilliseconds");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("PATH$releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("PATH$pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("PATH$pReleaseKeys");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$acquireCount = (OfInt) LAYOUT.select(PATH$acquireCount);
    public static final AddressLayout LAYOUT$pAcquireSyncs = (AddressLayout) LAYOUT.select(PATH$pAcquireSyncs);
    public static final AddressLayout LAYOUT$pAcquireKeys = (AddressLayout) LAYOUT.select(PATH$pAcquireKeys);
    public static final AddressLayout LAYOUT$pAcquireTimeoutMilliseconds = (AddressLayout) LAYOUT.select(PATH$pAcquireTimeoutMilliseconds);
    public static final OfInt LAYOUT$releaseCount = (OfInt) LAYOUT.select(PATH$releaseCount);
    public static final AddressLayout LAYOUT$pReleaseSyncs = (AddressLayout) LAYOUT.select(PATH$pReleaseSyncs);
    public static final AddressLayout LAYOUT$pReleaseKeys = (AddressLayout) LAYOUT.select(PATH$pReleaseKeys);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$acquireCount = LAYOUT$acquireCount.byteSize();
    public static final long SIZE$pAcquireSyncs = LAYOUT$pAcquireSyncs.byteSize();
    public static final long SIZE$pAcquireKeys = LAYOUT$pAcquireKeys.byteSize();
    public static final long SIZE$pAcquireTimeoutMilliseconds = LAYOUT$pAcquireTimeoutMilliseconds.byteSize();
    public static final long SIZE$releaseCount = LAYOUT$releaseCount.byteSize();
    public static final long SIZE$pReleaseSyncs = LAYOUT$pReleaseSyncs.byteSize();
    public static final long SIZE$pReleaseKeys = LAYOUT$pReleaseKeys.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$acquireCount = LAYOUT.byteOffset(PATH$acquireCount);
    public static final long OFFSET$pAcquireSyncs = LAYOUT.byteOffset(PATH$pAcquireSyncs);
    public static final long OFFSET$pAcquireKeys = LAYOUT.byteOffset(PATH$pAcquireKeys);
    public static final long OFFSET$pAcquireTimeoutMilliseconds = LAYOUT.byteOffset(PATH$pAcquireTimeoutMilliseconds);
    public static final long OFFSET$releaseCount = LAYOUT.byteOffset(PATH$releaseCount);
    public static final long OFFSET$pReleaseSyncs = LAYOUT.byteOffset(PATH$pReleaseSyncs);
    public static final long OFFSET$pReleaseKeys = LAYOUT.byteOffset(PATH$pReleaseKeys);
}
