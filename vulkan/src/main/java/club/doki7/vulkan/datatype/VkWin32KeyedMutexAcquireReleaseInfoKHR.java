package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t acquireCount; // optional // @link substring="acquireCount" target="#acquireCount"
///     VkDeviceMemory const* pAcquireSyncs; // @link substring="VkDeviceMemory" target="VkDeviceMemory" @link substring="pAcquireSyncs" target="#pAcquireSyncs"
///     uint64_t const* pAcquireKeys; // @link substring="pAcquireKeys" target="#pAcquireKeys"
///     uint32_t const* pAcquireTimeouts; // @link substring="pAcquireTimeouts" target="#pAcquireTimeouts"
///     uint32_t releaseCount; // optional // @link substring="releaseCount" target="#releaseCount"
///     VkDeviceMemory const* pReleaseSyncs; // @link substring="VkDeviceMemory" target="VkDeviceMemory" @link substring="pReleaseSyncs" target="#pReleaseSyncs"
///     uint64_t const* pReleaseKeys; // @link substring="pReleaseKeys" target="#pReleaseKeys"
/// } VkWin32KeyedMutexAcquireReleaseInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR`
///
/// The {@code allocate} ({@link VkWin32KeyedMutexAcquireReleaseInfoKHR#allocate(Arena)}, {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkWin32KeyedMutexAcquireReleaseInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html"><code>VkWin32KeyedMutexAcquireReleaseInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkWin32KeyedMutexAcquireReleaseInfoKHR(@NotNull MemorySegment segment) implements IVkWin32KeyedMutexAcquireReleaseInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html"><code>VkWin32KeyedMutexAcquireReleaseInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkWin32KeyedMutexAcquireReleaseInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkWin32KeyedMutexAcquireReleaseInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkWin32KeyedMutexAcquireReleaseInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkWin32KeyedMutexAcquireReleaseInfoKHR {
        public long size() {
            return segment.byteSize() / VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkWin32KeyedMutexAcquireReleaseInfoKHR at(long index) {
            return new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.asSlice(index * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES, VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkWin32KeyedMutexAcquireReleaseInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES, VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES, VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES,
                (end - start) * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkWin32KeyedMutexAcquireReleaseInfoKHR.BYTES));
        }

        public VkWin32KeyedMutexAcquireReleaseInfoKHR[] toArray() {
            VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocate(Arena arena) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoKHR.Ptr ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
        }
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoKHR src) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Unsigned int acquireCount() {
        return segment.get(LAYOUT$acquireCount, OFFSET$acquireCount);
    }

    public void acquireCount(@Unsigned int value) {
        segment.set(LAYOUT$acquireCount, OFFSET$acquireCount, value);
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

    public @Pointer(target=VkDeviceMemory.class) MemorySegment pAcquireSyncsRaw() {
        return segment.get(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs);
    }

    public void pAcquireSyncsRaw(@Pointer(target=VkDeviceMemory.class) MemorySegment value) {
        segment.set(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned LongPtr pAcquireKeys() {
        MemorySegment s = pAcquireKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pAcquireKeys(@Nullable @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireKeysRaw(s);
    }

    public @Pointer(comment="long*") MemorySegment pAcquireKeysRaw() {
        return segment.get(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys);
    }

    public void pAcquireKeysRaw(@Pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr pAcquireTimeouts() {
        MemorySegment s = pAcquireTimeoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pAcquireTimeouts(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireTimeoutsRaw(s);
    }

    public @Pointer(comment="int*") MemorySegment pAcquireTimeoutsRaw() {
        return segment.get(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts);
    }

    public void pAcquireTimeoutsRaw(@Pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts, value);
    }

    public @Unsigned int releaseCount() {
        return segment.get(LAYOUT$releaseCount, OFFSET$releaseCount);
    }

    public void releaseCount(@Unsigned int value) {
        segment.set(LAYOUT$releaseCount, OFFSET$releaseCount, value);
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

    public @Pointer(target=VkDeviceMemory.class) MemorySegment pReleaseSyncsRaw() {
        return segment.get(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs);
    }

    public void pReleaseSyncsRaw(@Pointer(target=VkDeviceMemory.class) MemorySegment value) {
        segment.set(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned LongPtr pReleaseKeys() {
        MemorySegment s = pReleaseKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pReleaseKeys(@Nullable @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseKeysRaw(s);
    }

    public @Pointer(comment="long*") MemorySegment pReleaseKeysRaw() {
        return segment.get(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys);
    }

    public void pReleaseKeysRaw(@Pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys, value);
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

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$acquireCount = PathElement.groupElement("acquireCount");
    public static final PathElement PATH$pAcquireSyncs = PathElement.groupElement("pAcquireSyncs");
    public static final PathElement PATH$pAcquireKeys = PathElement.groupElement("pAcquireKeys");
    public static final PathElement PATH$pAcquireTimeouts = PathElement.groupElement("pAcquireTimeouts");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("pReleaseKeys");

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
