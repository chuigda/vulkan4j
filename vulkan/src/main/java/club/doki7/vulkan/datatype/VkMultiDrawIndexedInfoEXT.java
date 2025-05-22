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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawIndexedInfoEXT.html"><code>VkMultiDrawIndexedInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMultiDrawIndexedInfoEXT {
///     uint32_t firstIndex; // @link substring="firstIndex" target="#firstIndex"
///     uint32_t indexCount; // @link substring="indexCount" target="#indexCount"
///     int32_t vertexOffset; // @link substring="vertexOffset" target="#vertexOffset"
/// } VkMultiDrawIndexedInfoEXT;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawIndexedInfoEXT.html"><code>VkMultiDrawIndexedInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMultiDrawIndexedInfoEXT(@NotNull MemorySegment segment) implements IVkMultiDrawIndexedInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiDrawIndexedInfoEXT.html"><code>VkMultiDrawIndexedInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkMultiDrawIndexedInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkMultiDrawIndexedInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkMultiDrawIndexedInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkMultiDrawIndexedInfoEXT {
        public long size() {
            return segment.byteSize() / VkMultiDrawIndexedInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkMultiDrawIndexedInfoEXT at(long index) {
            return new VkMultiDrawIndexedInfoEXT(segment.asSlice(index * VkMultiDrawIndexedInfoEXT.BYTES, VkMultiDrawIndexedInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkMultiDrawIndexedInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkMultiDrawIndexedInfoEXT.BYTES, VkMultiDrawIndexedInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkMultiDrawIndexedInfoEXT.BYTES, VkMultiDrawIndexedInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkMultiDrawIndexedInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkMultiDrawIndexedInfoEXT.BYTES,
                (end - start) * VkMultiDrawIndexedInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkMultiDrawIndexedInfoEXT.BYTES));
        }
    }

    public static VkMultiDrawIndexedInfoEXT allocate(Arena arena) {
        return new VkMultiDrawIndexedInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMultiDrawIndexedInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkMultiDrawIndexedInfoEXT.Ptr(segment);
    }

    public static VkMultiDrawIndexedInfoEXT clone(Arena arena, VkMultiDrawIndexedInfoEXT src) {
        VkMultiDrawIndexedInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$firstIndex = PathElement.groupElement("firstIndex");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");

    public static final OfInt LAYOUT$firstIndex = (OfInt) LAYOUT.select(PATH$firstIndex);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$vertexOffset = (OfInt) LAYOUT.select(PATH$vertexOffset);

    public static final long SIZE$firstIndex = LAYOUT$firstIndex.byteSize();
    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$vertexOffset = LAYOUT$vertexOffset.byteSize();

    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
}
