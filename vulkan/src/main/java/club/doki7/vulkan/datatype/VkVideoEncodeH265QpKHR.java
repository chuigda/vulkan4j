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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265QpKHR.html"><code>VkVideoEncodeH265QpKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265QpKHR {
///     int32_t qpI; // @link substring="qpI" target="#qpI"
///     int32_t qpP; // @link substring="qpP" target="#qpP"
///     int32_t qpB; // @link substring="qpB" target="#qpB"
/// } VkVideoEncodeH265QpKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265QpKHR.html"><code>VkVideoEncodeH265QpKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265QpKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH265QpKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265QpKHR.html"><code>VkVideoEncodeH265QpKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH265QpKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH265QpKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH265QpKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH265QpKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH265QpKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH265QpKHR at(long index) {
            return new VkVideoEncodeH265QpKHR(segment.asSlice(index * VkVideoEncodeH265QpKHR.BYTES, VkVideoEncodeH265QpKHR.BYTES));
        }
        public void write(long index, @NotNull VkVideoEncodeH265QpKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH265QpKHR.BYTES, VkVideoEncodeH265QpKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkVideoEncodeH265QpKHR allocate(Arena arena) {
        return new VkVideoEncodeH265QpKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH265QpKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265QpKHR.Ptr ret = new VkVideoEncodeH265QpKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkVideoEncodeH265QpKHR clone(Arena arena, VkVideoEncodeH265QpKHR src) {
        VkVideoEncodeH265QpKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int qpI() {
        return segment.get(LAYOUT$qpI, OFFSET$qpI);
    }

    public void qpI(int value) {
        segment.set(LAYOUT$qpI, OFFSET$qpI, value);
    }

    public int qpP() {
        return segment.get(LAYOUT$qpP, OFFSET$qpP);
    }

    public void qpP(int value) {
        segment.set(LAYOUT$qpP, OFFSET$qpP, value);
    }

    public int qpB() {
        return segment.get(LAYOUT$qpB, OFFSET$qpB);
    }

    public void qpB(int value) {
        segment.set(LAYOUT$qpB, OFFSET$qpB, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("qpI"),
        ValueLayout.JAVA_INT.withName("qpP"),
        ValueLayout.JAVA_INT.withName("qpB")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$qpI = PathElement.groupElement("qpI");
    public static final PathElement PATH$qpP = PathElement.groupElement("qpP");
    public static final PathElement PATH$qpB = PathElement.groupElement("qpB");

    public static final OfInt LAYOUT$qpI = (OfInt) LAYOUT.select(PATH$qpI);
    public static final OfInt LAYOUT$qpP = (OfInt) LAYOUT.select(PATH$qpP);
    public static final OfInt LAYOUT$qpB = (OfInt) LAYOUT.select(PATH$qpB);

    public static final long SIZE$qpI = LAYOUT$qpI.byteSize();
    public static final long SIZE$qpP = LAYOUT$qpP.byteSize();
    public static final long SIZE$qpB = LAYOUT$qpB.byteSize();

    public static final long OFFSET$qpI = LAYOUT.byteOffset(PATH$qpI);
    public static final long OFFSET$qpP = LAYOUT.byteOffset(PATH$qpP);
    public static final long OFFSET$qpB = LAYOUT.byteOffset(PATH$qpB);
}
