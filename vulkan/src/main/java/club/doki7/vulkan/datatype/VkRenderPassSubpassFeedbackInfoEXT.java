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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html"><code>VkRenderPassSubpassFeedbackInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassSubpassFeedbackInfoEXT {
///     VkSubpassMergeStatusEXT subpassMergeStatus; // @link substring="VkSubpassMergeStatusEXT" target="VkSubpassMergeStatusEXT" @link substring="subpassMergeStatus" target="#subpassMergeStatus"
///     char description; // @link substring="description" target="#description"
///     uint32_t postMergeIndex; // @link substring="postMergeIndex" target="#postMergeIndex"
/// } VkRenderPassSubpassFeedbackInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html"><code>VkRenderPassSubpassFeedbackInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassSubpassFeedbackInfoEXT(@NotNull MemorySegment segment) implements IVkRenderPassSubpassFeedbackInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html"><code>VkRenderPassSubpassFeedbackInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkRenderPassSubpassFeedbackInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkRenderPassSubpassFeedbackInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkRenderPassSubpassFeedbackInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkRenderPassSubpassFeedbackInfoEXT {
        public long size() {
            return segment.byteSize() / VkRenderPassSubpassFeedbackInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkRenderPassSubpassFeedbackInfoEXT at(long index) {
            return new VkRenderPassSubpassFeedbackInfoEXT(segment.asSlice(index * VkRenderPassSubpassFeedbackInfoEXT.BYTES, VkRenderPassSubpassFeedbackInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkRenderPassSubpassFeedbackInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkRenderPassSubpassFeedbackInfoEXT.BYTES, VkRenderPassSubpassFeedbackInfoEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkRenderPassSubpassFeedbackInfoEXT.BYTES, VkRenderPassSubpassFeedbackInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkRenderPassSubpassFeedbackInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkRenderPassSubpassFeedbackInfoEXT.BYTES,
                (end - start) * VkRenderPassSubpassFeedbackInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkRenderPassSubpassFeedbackInfoEXT.BYTES));
        }

        public VkRenderPassSubpassFeedbackInfoEXT[] toArray() {
            VkRenderPassSubpassFeedbackInfoEXT[] ret = new VkRenderPassSubpassFeedbackInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkRenderPassSubpassFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassSubpassFeedbackInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassSubpassFeedbackInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkRenderPassSubpassFeedbackInfoEXT.Ptr(segment);
    }

    public static VkRenderPassSubpassFeedbackInfoEXT clone(Arena arena, VkRenderPassSubpassFeedbackInfoEXT src) {
        VkRenderPassSubpassFeedbackInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VkSubpassMergeStatusEXT.class) int subpassMergeStatus() {
        return segment.get(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus);
    }

    public void subpassMergeStatus(@EnumType(VkSubpassMergeStatusEXT.class) int value) {
        segment.set(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @Unsigned int postMergeIndex() {
        return segment.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);
    }

    public void postMergeIndex(@Unsigned int value) {
        segment.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$subpassMergeStatus = PathElement.groupElement("subpassMergeStatus");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$postMergeIndex = PathElement.groupElement("postMergeIndex");

    public static final OfInt LAYOUT$subpassMergeStatus = (OfInt) LAYOUT.select(PATH$subpassMergeStatus);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$postMergeIndex = (OfInt) LAYOUT.select(PATH$postMergeIndex);

    public static final long SIZE$subpassMergeStatus = LAYOUT$subpassMergeStatus.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$postMergeIndex = LAYOUT$postMergeIndex.byteSize();

    public static final long OFFSET$subpassMergeStatus = LAYOUT.byteOffset(PATH$subpassMergeStatus);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$postMergeIndex = LAYOUT.byteOffset(PATH$postMergeIndex);
}
