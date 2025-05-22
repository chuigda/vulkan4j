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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTransformMatrixKHR.html"><code>VkTransformMatrixKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkTransformMatrixKHR {
///     float matrix; // @link substring="matrix" target="#matrix"
/// } VkTransformMatrixKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTransformMatrixKHR.html"><code>VkTransformMatrixKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkTransformMatrixKHR(@NotNull MemorySegment segment) implements IVkTransformMatrixKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTransformMatrixKHR.html"><code>VkTransformMatrixKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkTransformMatrixKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkTransformMatrixKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkTransformMatrixKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkTransformMatrixKHR {
        public long size() {
            return segment.byteSize() / VkTransformMatrixKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkTransformMatrixKHR at(long index) {
            return new VkTransformMatrixKHR(segment.asSlice(index * VkTransformMatrixKHR.BYTES, VkTransformMatrixKHR.BYTES));
        }
        public void write(long index, @NotNull VkTransformMatrixKHR value) {
            MemorySegment s = segment.asSlice(index * VkTransformMatrixKHR.BYTES, VkTransformMatrixKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkTransformMatrixKHR allocate(Arena arena) {
        return new VkTransformMatrixKHR(arena.allocate(LAYOUT));
    }

    public static VkTransformMatrixKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTransformMatrixKHR.Ptr ret = new VkTransformMatrixKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkTransformMatrixKHR clone(Arena arena, VkTransformMatrixKHR src) {
        VkTransformMatrixKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float matrix() {
        return segment.get(LAYOUT$matrix, OFFSET$matrix);
    }

    public void matrix(float value) {
        segment.set(LAYOUT$matrix, OFFSET$matrix, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("matrix")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$matrix = PathElement.groupElement("matrix");

    public static final OfFloat LAYOUT$matrix = (OfFloat) LAYOUT.select(PATH$matrix);

    public static final long SIZE$matrix = LAYOUT$matrix.byteSize();

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);
}
