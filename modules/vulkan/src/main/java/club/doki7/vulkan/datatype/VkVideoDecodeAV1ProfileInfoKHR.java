package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1ProfileInfoKHR.html"><code>VkVideoDecodeAV1ProfileInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeAV1ProfileInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     StdVideoAV1Profile stdProfile; // @link substring="StdVideoAV1Profile" target="StdVideoAV1Profile" @link substring="stdProfile" target="#stdProfile"
///     VkBool32 filmGrainSupport; // @link substring="filmGrainSupport" target="#filmGrainSupport"
/// } VkVideoDecodeAV1ProfileInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoDecodeAV1ProfileInfoKHR#allocate(Arena)}, {@link VkVideoDecodeAV1ProfileInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoDecodeAV1ProfileInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1ProfileInfoKHR.html"><code>VkVideoDecodeAV1ProfileInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeAV1ProfileInfoKHR(@NotNull MemorySegment segment) implements IVkVideoDecodeAV1ProfileInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1ProfileInfoKHR.html"><code>VkVideoDecodeAV1ProfileInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoDecodeAV1ProfileInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoDecodeAV1ProfileInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoDecodeAV1ProfileInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoDecodeAV1ProfileInfoKHR, Iterable<VkVideoDecodeAV1ProfileInfoKHR> {
        public long size() {
            return segment.byteSize() / VkVideoDecodeAV1ProfileInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoDecodeAV1ProfileInfoKHR at(long index) {
            return new VkVideoDecodeAV1ProfileInfoKHR(segment.asSlice(index * VkVideoDecodeAV1ProfileInfoKHR.BYTES, VkVideoDecodeAV1ProfileInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoDecodeAV1ProfileInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoDecodeAV1ProfileInfoKHR.BYTES, VkVideoDecodeAV1ProfileInfoKHR.BYTES);
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkVideoDecodeAV1ProfileInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoDecodeAV1ProfileInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoDecodeAV1ProfileInfoKHR.BYTES,
                (end - start) * VkVideoDecodeAV1ProfileInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoDecodeAV1ProfileInfoKHR.BYTES));
        }

        public VkVideoDecodeAV1ProfileInfoKHR[] toArray() {
            VkVideoDecodeAV1ProfileInfoKHR[] ret = new VkVideoDecodeAV1ProfileInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkVideoDecodeAV1ProfileInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkVideoDecodeAV1ProfileInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkVideoDecodeAV1ProfileInfoKHR.BYTES;
            }

            @Override
            public VkVideoDecodeAV1ProfileInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkVideoDecodeAV1ProfileInfoKHR ret = new VkVideoDecodeAV1ProfileInfoKHR(segment.asSlice(0, VkVideoDecodeAV1ProfileInfoKHR.BYTES));
                segment = segment.asSlice(VkVideoDecodeAV1ProfileInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkVideoDecodeAV1ProfileInfoKHR allocate(Arena arena) {
        VkVideoDecodeAV1ProfileInfoKHR ret = new VkVideoDecodeAV1ProfileInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_AV1_PROFILE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeAV1ProfileInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1ProfileInfoKHR.Ptr ret = new VkVideoDecodeAV1ProfileInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_DECODE_AV1_PROFILE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeAV1ProfileInfoKHR clone(Arena arena, VkVideoDecodeAV1ProfileInfoKHR src) {
        VkVideoDecodeAV1ProfileInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_AV1_PROFILE_INFO_KHR);
    }

    public @MagicConstant(valuesFromClass = VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkVideoDecodeAV1ProfileInfoKHR sType(@MagicConstant(valuesFromClass = VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkVideoDecodeAV1ProfileInfoKHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @MagicConstant(valuesFromClass = StdVideoAV1Profile.class) int stdProfile() {
        return segment.get(LAYOUT$stdProfile, OFFSET$stdProfile);
    }

    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(@MagicConstant(valuesFromClass = StdVideoAV1Profile.class) int value) {
        segment.set(LAYOUT$stdProfile, OFFSET$stdProfile, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int filmGrainSupport() {
        return segment.get(LAYOUT$filmGrainSupport, OFFSET$filmGrainSupport);
    }

    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$filmGrainSupport, OFFSET$filmGrainSupport, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfile"),
        ValueLayout.JAVA_INT.withName("filmGrainSupport")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stdProfile = PathElement.groupElement("stdProfile");
    public static final PathElement PATH$filmGrainSupport = PathElement.groupElement("filmGrainSupport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stdProfile = (OfInt) LAYOUT.select(PATH$stdProfile);
    public static final OfInt LAYOUT$filmGrainSupport = (OfInt) LAYOUT.select(PATH$filmGrainSupport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdProfile = LAYOUT$stdProfile.byteSize();
    public static final long SIZE$filmGrainSupport = LAYOUT$filmGrainSupport.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdProfile = LAYOUT.byteOffset(PATH$stdProfile);
    public static final long OFFSET$filmGrainSupport = LAYOUT.byteOffset(PATH$filmGrainSupport);
}
