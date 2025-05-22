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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileListInfoKHR.html"><code>VkVideoProfileListInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoProfileListInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t profileCount; // optional // @link substring="profileCount" target="#profileCount"
///     VkVideoProfileInfoKHR const* pProfiles; // @link substring="VkVideoProfileInfoKHR" target="VkVideoProfileInfoKHR" @link substring="pProfiles" target="#pProfiles"
/// } VkVideoProfileListInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoProfileListInfoKHR#allocate(Arena)}, {@link VkVideoProfileListInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoProfileListInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileListInfoKHR.html"><code>VkVideoProfileListInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoProfileListInfoKHR(@NotNull MemorySegment segment) implements IVkVideoProfileListInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileListInfoKHR.html"><code>VkVideoProfileListInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoProfileListInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoProfileListInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoProfileListInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoProfileListInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoProfileListInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoProfileListInfoKHR at(long index) {
            return new VkVideoProfileListInfoKHR(segment.asSlice(index * VkVideoProfileListInfoKHR.BYTES, VkVideoProfileListInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoProfileListInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoProfileListInfoKHR.BYTES, VkVideoProfileListInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoProfileListInfoKHR.BYTES, VkVideoProfileListInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoProfileListInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoProfileListInfoKHR.BYTES,
                (end - start) * VkVideoProfileListInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoProfileListInfoKHR.BYTES));
        }

        public VkVideoProfileListInfoKHR[] toArray() {
            VkVideoProfileListInfoKHR[] ret = new VkVideoProfileListInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoProfileListInfoKHR allocate(Arena arena) {
        VkVideoProfileListInfoKHR ret = new VkVideoProfileListInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_PROFILE_LIST_INFO_KHR);
        return ret;
    }

    public static VkVideoProfileListInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoProfileListInfoKHR.Ptr ret = new VkVideoProfileListInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_PROFILE_LIST_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoProfileListInfoKHR clone(Arena arena, VkVideoProfileListInfoKHR src) {
        VkVideoProfileListInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_PROFILE_LIST_INFO_KHR);
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

    public @unsigned int profileCount() {
        return segment.get(LAYOUT$profileCount, OFFSET$profileCount);
    }

    public void profileCount(@unsigned int value) {
        segment.set(LAYOUT$profileCount, OFFSET$profileCount, value);
    }

    public void pProfiles(@Nullable IVkVideoProfileInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pProfilesRaw(s);
    }

    @unsafe public @Nullable VkVideoProfileInfoKHR.Ptr pProfiles(int assumedCount) {
        MemorySegment s = pProfilesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoProfileInfoKHR.BYTES);
        return new VkVideoProfileInfoKHR.Ptr(s);
    }

    public @Nullable VkVideoProfileInfoKHR pProfiles() {
        MemorySegment s = pProfilesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoProfileInfoKHR(s);
    }

    public @pointer(target=VkVideoProfileInfoKHR.class) MemorySegment pProfilesRaw() {
        return segment.get(LAYOUT$pProfiles, OFFSET$pProfiles);
    }

    public void pProfilesRaw(@pointer(target=VkVideoProfileInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pProfiles, OFFSET$pProfiles, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("profileCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoProfileInfoKHR.LAYOUT).withName("pProfiles")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$profileCount = PathElement.groupElement("profileCount");
    public static final PathElement PATH$pProfiles = PathElement.groupElement("pProfiles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$profileCount = (OfInt) LAYOUT.select(PATH$profileCount);
    public static final AddressLayout LAYOUT$pProfiles = (AddressLayout) LAYOUT.select(PATH$pProfiles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$profileCount = LAYOUT$profileCount.byteSize();
    public static final long SIZE$pProfiles = LAYOUT$pProfiles.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$profileCount = LAYOUT.byteOffset(PATH$profileCount);
    public static final long OFFSET$pProfiles = LAYOUT.byteOffset(PATH$pProfiles);
}
