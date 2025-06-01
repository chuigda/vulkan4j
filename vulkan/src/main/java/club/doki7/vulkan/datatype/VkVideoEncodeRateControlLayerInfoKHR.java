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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlLayerInfoKHR.html"><code>VkVideoEncodeRateControlLayerInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeRateControlLayerInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint64_t averageBitrate; // @link substring="averageBitrate" target="#averageBitrate"
///     uint64_t maxBitrate; // @link substring="maxBitrate" target="#maxBitrate"
///     uint32_t frameRateNumerator; // @link substring="frameRateNumerator" target="#frameRateNumerator"
///     uint32_t frameRateDenominator; // @link substring="frameRateDenominator" target="#frameRateDenominator"
/// } VkVideoEncodeRateControlLayerInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeRateControlLayerInfoKHR#allocate(Arena)}, {@link VkVideoEncodeRateControlLayerInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeRateControlLayerInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlLayerInfoKHR.html"><code>VkVideoEncodeRateControlLayerInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeRateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeRateControlLayerInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlLayerInfoKHR.html"><code>VkVideoEncodeRateControlLayerInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeRateControlLayerInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeRateControlLayerInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeRateControlLayerInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeRateControlLayerInfoKHR, Iterable<VkVideoEncodeRateControlLayerInfoKHR> {
        public long size() {
            return segment.byteSize() / VkVideoEncodeRateControlLayerInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeRateControlLayerInfoKHR at(long index) {
            return new VkVideoEncodeRateControlLayerInfoKHR(segment.asSlice(index * VkVideoEncodeRateControlLayerInfoKHR.BYTES, VkVideoEncodeRateControlLayerInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeRateControlLayerInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeRateControlLayerInfoKHR.BYTES, VkVideoEncodeRateControlLayerInfoKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkVideoEncodeRateControlLayerInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeRateControlLayerInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeRateControlLayerInfoKHR.BYTES,
                (end - start) * VkVideoEncodeRateControlLayerInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeRateControlLayerInfoKHR.BYTES));
        }

        public VkVideoEncodeRateControlLayerInfoKHR[] toArray() {
            VkVideoEncodeRateControlLayerInfoKHR[] ret = new VkVideoEncodeRateControlLayerInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkVideoEncodeRateControlLayerInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkVideoEncodeRateControlLayerInfoKHR.BYTES;
            }

            @Override
            public VkVideoEncodeRateControlLayerInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkVideoEncodeRateControlLayerInfoKHR ret = new VkVideoEncodeRateControlLayerInfoKHR(segment.asSlice(0, VkVideoEncodeRateControlLayerInfoKHR.BYTES));
                segment = segment.asSlice(VkVideoEncodeRateControlLayerInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkVideoEncodeRateControlLayerInfoKHR allocate(Arena arena) {
        VkVideoEncodeRateControlLayerInfoKHR ret = new VkVideoEncodeRateControlLayerInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeRateControlLayerInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeRateControlLayerInfoKHR.Ptr ret = new VkVideoEncodeRateControlLayerInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeRateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeRateControlLayerInfoKHR src) {
        VkVideoEncodeRateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkVideoEncodeRateControlLayerInfoKHR sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkVideoEncodeRateControlLayerInfoKHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long averageBitrate() {
        return segment.get(LAYOUT$averageBitrate, OFFSET$averageBitrate);
    }

    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(@Unsigned long value) {
        segment.set(LAYOUT$averageBitrate, OFFSET$averageBitrate, value);
        return this;
    }

    public @Unsigned long maxBitrate() {
        return segment.get(LAYOUT$maxBitrate, OFFSET$maxBitrate);
    }

    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(@Unsigned long value) {
        segment.set(LAYOUT$maxBitrate, OFFSET$maxBitrate, value);
        return this;
    }

    public @Unsigned int frameRateNumerator() {
        return segment.get(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator);
    }

    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(@Unsigned int value) {
        segment.set(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator, value);
        return this;
    }

    public @Unsigned int frameRateDenominator() {
        return segment.get(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator);
    }

    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(@Unsigned int value) {
        segment.set(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("averageBitrate"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("frameRateNumerator"),
        ValueLayout.JAVA_INT.withName("frameRateDenominator")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$averageBitrate = PathElement.groupElement("averageBitrate");
    public static final PathElement PATH$maxBitrate = PathElement.groupElement("maxBitrate");
    public static final PathElement PATH$frameRateNumerator = PathElement.groupElement("frameRateNumerator");
    public static final PathElement PATH$frameRateDenominator = PathElement.groupElement("frameRateDenominator");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$averageBitrate = (OfLong) LAYOUT.select(PATH$averageBitrate);
    public static final OfLong LAYOUT$maxBitrate = (OfLong) LAYOUT.select(PATH$maxBitrate);
    public static final OfInt LAYOUT$frameRateNumerator = (OfInt) LAYOUT.select(PATH$frameRateNumerator);
    public static final OfInt LAYOUT$frameRateDenominator = (OfInt) LAYOUT.select(PATH$frameRateDenominator);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$averageBitrate = LAYOUT$averageBitrate.byteSize();
    public static final long SIZE$maxBitrate = LAYOUT$maxBitrate.byteSize();
    public static final long SIZE$frameRateNumerator = LAYOUT$frameRateNumerator.byteSize();
    public static final long SIZE$frameRateDenominator = LAYOUT$frameRateDenominator.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$averageBitrate = LAYOUT.byteOffset(PATH$averageBitrate);
    public static final long OFFSET$maxBitrate = LAYOUT.byteOffset(PATH$maxBitrate);
    public static final long OFFSET$frameRateNumerator = LAYOUT.byteOffset(PATH$frameRateNumerator);
    public static final long OFFSET$frameRateDenominator = LAYOUT.byteOffset(PATH$frameRateDenominator);
}
