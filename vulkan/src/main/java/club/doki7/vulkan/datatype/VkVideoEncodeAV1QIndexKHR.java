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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html"><code>VkVideoEncodeAV1QIndexKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1QIndexKHR {
///     uint32_t intraQIndex; // @link substring="intraQIndex" target="#intraQIndex"
///     uint32_t predictiveQIndex; // @link substring="predictiveQIndex" target="#predictiveQIndex"
///     uint32_t bipredictiveQIndex; // @link substring="bipredictiveQIndex" target="#bipredictiveQIndex"
/// } VkVideoEncodeAV1QIndexKHR;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html"><code>VkVideoEncodeAV1QIndexKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1QIndexKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1QIndexKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html"><code>VkVideoEncodeAV1QIndexKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeAV1QIndexKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeAV1QIndexKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeAV1QIndexKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1QIndexKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeAV1QIndexKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeAV1QIndexKHR at(long index) {
            return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(index * VkVideoEncodeAV1QIndexKHR.BYTES, VkVideoEncodeAV1QIndexKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeAV1QIndexKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeAV1QIndexKHR.BYTES, VkVideoEncodeAV1QIndexKHR.BYTES);
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
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoEncodeAV1QIndexKHR.BYTES, VkVideoEncodeAV1QIndexKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeAV1QIndexKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeAV1QIndexKHR.BYTES,
                (end - start) * VkVideoEncodeAV1QIndexKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeAV1QIndexKHR.BYTES));
        }

        public VkVideoEncodeAV1QIndexKHR[] toArray() {
            VkVideoEncodeAV1QIndexKHR[] ret = new VkVideoEncodeAV1QIndexKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoEncodeAV1QIndexKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1QIndexKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1QIndexKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkVideoEncodeAV1QIndexKHR.Ptr(segment);
    }

    public static VkVideoEncodeAV1QIndexKHR clone(Arena arena, VkVideoEncodeAV1QIndexKHR src) {
        VkVideoEncodeAV1QIndexKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int intraQIndex() {
        return segment.get(LAYOUT$intraQIndex, OFFSET$intraQIndex);
    }

    public void intraQIndex(@unsigned int value) {
        segment.set(LAYOUT$intraQIndex, OFFSET$intraQIndex, value);
    }

    public @unsigned int predictiveQIndex() {
        return segment.get(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex);
    }

    public void predictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex, value);
    }

    public @unsigned int bipredictiveQIndex() {
        return segment.get(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex);
    }

    public void bipredictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("intraQIndex"),
        ValueLayout.JAVA_INT.withName("predictiveQIndex"),
        ValueLayout.JAVA_INT.withName("bipredictiveQIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$intraQIndex = PathElement.groupElement("intraQIndex");
    public static final PathElement PATH$predictiveQIndex = PathElement.groupElement("predictiveQIndex");
    public static final PathElement PATH$bipredictiveQIndex = PathElement.groupElement("bipredictiveQIndex");

    public static final OfInt LAYOUT$intraQIndex = (OfInt) LAYOUT.select(PATH$intraQIndex);
    public static final OfInt LAYOUT$predictiveQIndex = (OfInt) LAYOUT.select(PATH$predictiveQIndex);
    public static final OfInt LAYOUT$bipredictiveQIndex = (OfInt) LAYOUT.select(PATH$bipredictiveQIndex);

    public static final long SIZE$intraQIndex = LAYOUT$intraQIndex.byteSize();
    public static final long SIZE$predictiveQIndex = LAYOUT$predictiveQIndex.byteSize();
    public static final long SIZE$bipredictiveQIndex = LAYOUT$bipredictiveQIndex.byteSize();

    public static final long OFFSET$intraQIndex = LAYOUT.byteOffset(PATH$intraQIndex);
    public static final long OFFSET$predictiveQIndex = LAYOUT.byteOffset(PATH$predictiveQIndex);
    public static final long OFFSET$bipredictiveQIndex = LAYOUT.byteOffset(PATH$bipredictiveQIndex);
}
