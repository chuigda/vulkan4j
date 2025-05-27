package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeH265GopRemainingFrameInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265GopRemainingFrameInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 useGopRemainingFrames; // @link substring="useGopRemainingFrames" target="#useGopRemainingFrames"
///     uint32_t gopRemainingI; // @link substring="gopRemainingI" target="#gopRemainingI"
///     uint32_t gopRemainingP; // @link substring="gopRemainingP" target="#gopRemainingP"
///     uint32_t gopRemainingB; // @link substring="gopRemainingB" target="#gopRemainingB"
/// } VkVideoEncodeH265GopRemainingFrameInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH265GopRemainingFrameInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH265GopRemainingFrameInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH265GopRemainingFrameInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeH265GopRemainingFrameInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265GopRemainingFrameInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH265GopRemainingFrameInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeH265GopRemainingFrameInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH265GopRemainingFrameInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH265GopRemainingFrameInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH265GopRemainingFrameInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH265GopRemainingFrameInfoKHR, Iterable<VkVideoEncodeH265GopRemainingFrameInfoKHR> {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH265GopRemainingFrameInfoKHR at(long index) {
            return new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.asSlice(index * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES, VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeH265GopRemainingFrameInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES, VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES);
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
            return new Ptr(segment.asSlice(index * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES, VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES,
                (end - start) * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES));
        }

        public VkVideoEncodeH265GopRemainingFrameInfoKHR[] toArray() {
            VkVideoEncodeH265GopRemainingFrameInfoKHR[] ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures in this pointer.
        public static final class Iter implements Iterator<VkVideoEncodeH265GopRemainingFrameInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return (segment.byteSize() / VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES) > 0;
            }

            @Override
            public VkVideoEncodeH265GopRemainingFrameInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkVideoEncodeH265GopRemainingFrameInfoKHR ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR(segment.asSlice(0, VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES));
                segment = segment.asSlice(VkVideoEncodeH265GopRemainingFrameInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265GopRemainingFrameInfoKHR.Ptr ret = new VkVideoEncodeH265GopRemainingFrameInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR clone(Arena arena, VkVideoEncodeH265GopRemainingFrameInfoKHR src) {
        VkVideoEncodeH265GopRemainingFrameInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR);
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

    public @NativeType("VkBool32") @Unsigned int useGopRemainingFrames() {
        return segment.get(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames);
    }

    public void useGopRemainingFrames(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames, value);
    }

    public @Unsigned int gopRemainingI() {
        return segment.get(LAYOUT$gopRemainingI, OFFSET$gopRemainingI);
    }

    public void gopRemainingI(@Unsigned int value) {
        segment.set(LAYOUT$gopRemainingI, OFFSET$gopRemainingI, value);
    }

    public @Unsigned int gopRemainingP() {
        return segment.get(LAYOUT$gopRemainingP, OFFSET$gopRemainingP);
    }

    public void gopRemainingP(@Unsigned int value) {
        segment.set(LAYOUT$gopRemainingP, OFFSET$gopRemainingP, value);
    }

    public @Unsigned int gopRemainingB() {
        return segment.get(LAYOUT$gopRemainingB, OFFSET$gopRemainingB);
    }

    public void gopRemainingB(@Unsigned int value) {
        segment.set(LAYOUT$gopRemainingB, OFFSET$gopRemainingB, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingI"),
        ValueLayout.JAVA_INT.withName("gopRemainingP"),
        ValueLayout.JAVA_INT.withName("gopRemainingB")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$useGopRemainingFrames = PathElement.groupElement("useGopRemainingFrames");
    public static final PathElement PATH$gopRemainingI = PathElement.groupElement("gopRemainingI");
    public static final PathElement PATH$gopRemainingP = PathElement.groupElement("gopRemainingP");
    public static final PathElement PATH$gopRemainingB = PathElement.groupElement("gopRemainingB");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useGopRemainingFrames = (OfInt) LAYOUT.select(PATH$useGopRemainingFrames);
    public static final OfInt LAYOUT$gopRemainingI = (OfInt) LAYOUT.select(PATH$gopRemainingI);
    public static final OfInt LAYOUT$gopRemainingP = (OfInt) LAYOUT.select(PATH$gopRemainingP);
    public static final OfInt LAYOUT$gopRemainingB = (OfInt) LAYOUT.select(PATH$gopRemainingB);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useGopRemainingFrames = LAYOUT$useGopRemainingFrames.byteSize();
    public static final long SIZE$gopRemainingI = LAYOUT$gopRemainingI.byteSize();
    public static final long SIZE$gopRemainingP = LAYOUT$gopRemainingP.byteSize();
    public static final long SIZE$gopRemainingB = LAYOUT$gopRemainingB.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useGopRemainingFrames = LAYOUT.byteOffset(PATH$useGopRemainingFrames);
    public static final long OFFSET$gopRemainingI = LAYOUT.byteOffset(PATH$gopRemainingI);
    public static final long OFFSET$gopRemainingP = LAYOUT.byteOffset(PATH$gopRemainingP);
    public static final long OFFSET$gopRemainingB = LAYOUT.byteOffset(PATH$gopRemainingB);
}
