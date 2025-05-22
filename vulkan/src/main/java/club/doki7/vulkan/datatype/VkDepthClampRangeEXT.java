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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthClampRangeEXT.html"><code>VkDepthClampRangeEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDepthClampRangeEXT {
///     float minDepthClamp; // @link substring="minDepthClamp" target="#minDepthClamp"
///     float maxDepthClamp; // @link substring="maxDepthClamp" target="#maxDepthClamp"
/// } VkDepthClampRangeEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthClampRangeEXT.html"><code>VkDepthClampRangeEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDepthClampRangeEXT(@NotNull MemorySegment segment) implements IVkDepthClampRangeEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthClampRangeEXT.html"><code>VkDepthClampRangeEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDepthClampRangeEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDepthClampRangeEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDepthClampRangeEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDepthClampRangeEXT {
        public long size() {
            return segment.byteSize() / VkDepthClampRangeEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDepthClampRangeEXT at(long index) {
            return new VkDepthClampRangeEXT(segment.asSlice(index * VkDepthClampRangeEXT.BYTES, VkDepthClampRangeEXT.BYTES));
        }
        public void write(long index, @NotNull VkDepthClampRangeEXT value) {
            MemorySegment s = segment.asSlice(index * VkDepthClampRangeEXT.BYTES, VkDepthClampRangeEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDepthClampRangeEXT allocate(Arena arena) {
        return new VkDepthClampRangeEXT(arena.allocate(LAYOUT));
    }

    public static VkDepthClampRangeEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDepthClampRangeEXT.Ptr ret = new VkDepthClampRangeEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDepthClampRangeEXT clone(Arena arena, VkDepthClampRangeEXT src) {
        VkDepthClampRangeEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float minDepthClamp() {
        return segment.get(LAYOUT$minDepthClamp, OFFSET$minDepthClamp);
    }

    public void minDepthClamp(float value) {
        segment.set(LAYOUT$minDepthClamp, OFFSET$minDepthClamp, value);
    }

    public float maxDepthClamp() {
        return segment.get(LAYOUT$maxDepthClamp, OFFSET$maxDepthClamp);
    }

    public void maxDepthClamp(float value) {
        segment.set(LAYOUT$maxDepthClamp, OFFSET$maxDepthClamp, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("minDepthClamp"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthClamp")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$minDepthClamp = PathElement.groupElement("minDepthClamp");
    public static final PathElement PATH$maxDepthClamp = PathElement.groupElement("maxDepthClamp");

    public static final OfFloat LAYOUT$minDepthClamp = (OfFloat) LAYOUT.select(PATH$minDepthClamp);
    public static final OfFloat LAYOUT$maxDepthClamp = (OfFloat) LAYOUT.select(PATH$maxDepthClamp);

    public static final long SIZE$minDepthClamp = LAYOUT$minDepthClamp.byteSize();
    public static final long SIZE$maxDepthClamp = LAYOUT$maxDepthClamp.byteSize();

    public static final long OFFSET$minDepthClamp = LAYOUT.byteOffset(PATH$minDepthClamp);
    public static final long OFFSET$maxDepthClamp = LAYOUT.byteOffset(PATH$maxDepthClamp);
}
