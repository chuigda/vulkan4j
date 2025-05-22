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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html"><code>VkRefreshCycleDurationGOOGLE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration; // @link substring="refreshDuration" target="#refreshDuration"
/// } VkRefreshCycleDurationGOOGLE;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html"><code>VkRefreshCycleDurationGOOGLE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRefreshCycleDurationGOOGLE(@NotNull MemorySegment segment) implements IVkRefreshCycleDurationGOOGLE {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html"><code>VkRefreshCycleDurationGOOGLE</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkRefreshCycleDurationGOOGLE}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkRefreshCycleDurationGOOGLE to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkRefreshCycleDurationGOOGLE.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkRefreshCycleDurationGOOGLE {
        public long size() {
            return segment.byteSize() / VkRefreshCycleDurationGOOGLE.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkRefreshCycleDurationGOOGLE at(long index) {
            return new VkRefreshCycleDurationGOOGLE(segment.asSlice(index * VkRefreshCycleDurationGOOGLE.BYTES, VkRefreshCycleDurationGOOGLE.BYTES));
        }
        public void write(long index, @NotNull VkRefreshCycleDurationGOOGLE value) {
            MemorySegment s = segment.asSlice(index * VkRefreshCycleDurationGOOGLE.BYTES, VkRefreshCycleDurationGOOGLE.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkRefreshCycleDurationGOOGLE allocate(Arena arena) {
        return new VkRefreshCycleDurationGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkRefreshCycleDurationGOOGLE.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshCycleDurationGOOGLE.Ptr ret = new VkRefreshCycleDurationGOOGLE.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkRefreshCycleDurationGOOGLE clone(Arena arena, VkRefreshCycleDurationGOOGLE src) {
        VkRefreshCycleDurationGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned long refreshDuration() {
        return segment.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);
    }

    public void refreshDuration(@unsigned long value) {
        segment.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("refreshDuration");

    public static final OfLong LAYOUT$refreshDuration = (OfLong) LAYOUT.select(PATH$refreshDuration);

    public static final long SIZE$refreshDuration = LAYOUT$refreshDuration.byteSize();

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);
}
