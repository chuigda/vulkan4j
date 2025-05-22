package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreationFeedback.html"><code>VkPipelineCreationFeedback</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineCreationFeedback {
///     VkPipelineCreationFeedbackFlags flags; // @link substring="VkPipelineCreationFeedbackFlags" target="VkPipelineCreationFeedbackFlags" @link substring="flags" target="#flags"
///     uint64_t duration; // @link substring="duration" target="#duration"
/// } VkPipelineCreationFeedback;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreationFeedback.html"><code>VkPipelineCreationFeedback</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineCreationFeedback(@NotNull MemorySegment segment) implements IVkPipelineCreationFeedback {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreationFeedback.html"><code>VkPipelineCreationFeedback</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineCreationFeedback}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineCreationFeedback to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineCreationFeedback.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineCreationFeedback {
        public long size() {
            return segment.byteSize() / VkPipelineCreationFeedback.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineCreationFeedback at(long index) {
            return new VkPipelineCreationFeedback(segment.asSlice(index * VkPipelineCreationFeedback.BYTES, VkPipelineCreationFeedback.BYTES));
        }
        public void write(long index, @NotNull VkPipelineCreationFeedback value) {
            MemorySegment s = segment.asSlice(index * VkPipelineCreationFeedback.BYTES, VkPipelineCreationFeedback.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPipelineCreationFeedback allocate(Arena arena) {
        return new VkPipelineCreationFeedback(arena.allocate(LAYOUT));
    }

    public static VkPipelineCreationFeedback.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCreationFeedback.Ptr ret = new VkPipelineCreationFeedback.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkPipelineCreationFeedback clone(Arena arena, VkPipelineCreationFeedback src) {
        VkPipelineCreationFeedback ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkPipelineCreationFeedbackFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCreationFeedbackFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long duration() {
        return segment.get(LAYOUT$duration, OFFSET$duration);
    }

    public void duration(@unsigned long value) {
        segment.set(LAYOUT$duration, OFFSET$duration, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$duration = PathElement.groupElement("duration");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$duration = (OfLong) LAYOUT.select(PATH$duration);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$duration = LAYOUT$duration.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$duration = LAYOUT.byteOffset(PATH$duration);
}
