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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildRangeInfoKHR.html"><code>VkAccelerationStructureBuildRangeInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureBuildRangeInfoKHR {
///     uint32_t primitiveCount; // @link substring="primitiveCount" target="#primitiveCount"
///     uint32_t primitiveOffset; // @link substring="primitiveOffset" target="#primitiveOffset"
///     uint32_t firstVertex; // @link substring="firstVertex" target="#firstVertex"
///     uint32_t transformOffset; // @link substring="transformOffset" target="#transformOffset"
/// } VkAccelerationStructureBuildRangeInfoKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildRangeInfoKHR.html"><code>VkAccelerationStructureBuildRangeInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureBuildRangeInfoKHR(@NotNull MemorySegment segment) implements IVkAccelerationStructureBuildRangeInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildRangeInfoKHR.html"><code>VkAccelerationStructureBuildRangeInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureBuildRangeInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureBuildRangeInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureBuildRangeInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureBuildRangeInfoKHR {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureBuildRangeInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureBuildRangeInfoKHR at(long index) {
            return new VkAccelerationStructureBuildRangeInfoKHR(segment.asSlice(index * VkAccelerationStructureBuildRangeInfoKHR.BYTES, VkAccelerationStructureBuildRangeInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkAccelerationStructureBuildRangeInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureBuildRangeInfoKHR.BYTES, VkAccelerationStructureBuildRangeInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkAccelerationStructureBuildRangeInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildRangeInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureBuildRangeInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildRangeInfoKHR.Ptr ret = new VkAccelerationStructureBuildRangeInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkAccelerationStructureBuildRangeInfoKHR clone(Arena arena, VkAccelerationStructureBuildRangeInfoKHR src) {
        VkAccelerationStructureBuildRangeInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int primitiveCount() {
        return segment.get(LAYOUT$primitiveCount, OFFSET$primitiveCount);
    }

    public void primitiveCount(@unsigned int value) {
        segment.set(LAYOUT$primitiveCount, OFFSET$primitiveCount, value);
    }

    public @unsigned int primitiveOffset() {
        return segment.get(LAYOUT$primitiveOffset, OFFSET$primitiveOffset);
    }

    public void primitiveOffset(@unsigned int value) {
        segment.set(LAYOUT$primitiveOffset, OFFSET$primitiveOffset, value);
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned int value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("primitiveCount"),
        ValueLayout.JAVA_INT.withName("primitiveOffset"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("transformOffset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$primitiveCount = PathElement.groupElement("primitiveCount");
    public static final PathElement PATH$primitiveOffset = PathElement.groupElement("primitiveOffset");
    public static final PathElement PATH$firstVertex = PathElement.groupElement("firstVertex");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("transformOffset");

    public static final OfInt LAYOUT$primitiveCount = (OfInt) LAYOUT.select(PATH$primitiveCount);
    public static final OfInt LAYOUT$primitiveOffset = (OfInt) LAYOUT.select(PATH$primitiveOffset);
    public static final OfInt LAYOUT$firstVertex = (OfInt) LAYOUT.select(PATH$firstVertex);
    public static final OfInt LAYOUT$transformOffset = (OfInt) LAYOUT.select(PATH$transformOffset);

    public static final long SIZE$primitiveCount = LAYOUT$primitiveCount.byteSize();
    public static final long SIZE$primitiveOffset = LAYOUT$primitiveOffset.byteSize();
    public static final long SIZE$firstVertex = LAYOUT$firstVertex.byteSize();
    public static final long SIZE$transformOffset = LAYOUT$transformOffset.byteSize();

    public static final long OFFSET$primitiveCount = LAYOUT.byteOffset(PATH$primitiveCount);
    public static final long OFFSET$primitiveOffset = LAYOUT.byteOffset(PATH$primitiveOffset);
    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$transformOffset = LAYOUT.byteOffset(PATH$transformOffset);
}
