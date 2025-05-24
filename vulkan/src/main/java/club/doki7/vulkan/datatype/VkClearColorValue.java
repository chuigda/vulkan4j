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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearColorValue.html"><code>VkClearColorValue</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClearColorValue {
///     float float32; // @link substring="float32" target="#float32"
///     int32_t int32; // @link substring="int32" target="#int32"
///     uint32_t uint32; // @link substring="uint32" target="#uint32"
/// } VkClearColorValue;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearColorValue.html"><code>VkClearColorValue</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClearColorValue(@NotNull MemorySegment segment) implements IVkClearColorValue {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearColorValue.html"><code>VkClearColorValue</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkClearColorValue}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkClearColorValue to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkClearColorValue.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkClearColorValue {
        public long size() {
            return segment.byteSize() / VkClearColorValue.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkClearColorValue at(long index) {
            return new VkClearColorValue(segment.asSlice(index * VkClearColorValue.BYTES, VkClearColorValue.BYTES));
        }

        public void write(long index, @NotNull VkClearColorValue value) {
            MemorySegment s = segment.asSlice(index * VkClearColorValue.BYTES, VkClearColorValue.BYTES);
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
            return new Ptr(segment.asSlice(index * VkClearColorValue.BYTES, VkClearColorValue.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkClearColorValue.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkClearColorValue.BYTES,
                (end - start) * VkClearColorValue.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkClearColorValue.BYTES));
        }

        public VkClearColorValue[] toArray() {
            VkClearColorValue[] ret = new VkClearColorValue[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkClearColorValue allocate(Arena arena) {
        return new VkClearColorValue(arena.allocate(LAYOUT));
    }

    public static VkClearColorValue.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkClearColorValue.Ptr(segment);
    }

    public static VkClearColorValue clone(Arena arena, VkClearColorValue src) {
        VkClearColorValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float float32() {
        return segment.get(LAYOUT$float32, OFFSET$float32);
    }

    public void float32(float value) {
        segment.set(LAYOUT$float32, OFFSET$float32, value);
    }

    public int int32() {
        return segment.get(LAYOUT$int32, OFFSET$int32);
    }

    public void int32(int value) {
        segment.set(LAYOUT$int32, OFFSET$int32, value);
    }

    public @Unsigned int uint32() {
        return segment.get(LAYOUT$uint32, OFFSET$uint32);
    }

    public void uint32(@Unsigned int value) {
        segment.set(LAYOUT$uint32, OFFSET$uint32, value);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_INT.withName("uint32")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$float32 = PathElement.groupElement("float32");
    public static final PathElement PATH$int32 = PathElement.groupElement("int32");
    public static final PathElement PATH$uint32 = PathElement.groupElement("uint32");

    public static final OfFloat LAYOUT$float32 = (OfFloat) LAYOUT.select(PATH$float32);
    public static final OfInt LAYOUT$int32 = (OfInt) LAYOUT.select(PATH$int32);
    public static final OfInt LAYOUT$uint32 = (OfInt) LAYOUT.select(PATH$uint32);

    public static final long SIZE$float32 = LAYOUT$float32.byteSize();
    public static final long SIZE$int32 = LAYOUT$int32.byteSize();
    public static final long SIZE$uint32 = LAYOUT$uint32.byteSize();

    public static final long OFFSET$float32 = LAYOUT.byteOffset(PATH$float32);
    public static final long OFFSET$int32 = LAYOUT.byteOffset(PATH$int32);
    public static final long OFFSET$uint32 = LAYOUT.byteOffset(PATH$uint32);
}
