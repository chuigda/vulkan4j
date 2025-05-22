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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndirectCountIndirectCommandEXT.html"><code>VkDrawIndirectCountIndirectCommandEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrawIndirectCountIndirectCommandEXT {
///     VkDeviceAddress bufferAddress; // @link substring="bufferAddress" target="#bufferAddress"
///     uint32_t stride; // @link substring="stride" target="#stride"
///     uint32_t commandCount; // @link substring="commandCount" target="#commandCount"
/// } VkDrawIndirectCountIndirectCommandEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndirectCountIndirectCommandEXT.html"><code>VkDrawIndirectCountIndirectCommandEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrawIndirectCountIndirectCommandEXT(@NotNull MemorySegment segment) implements IVkDrawIndirectCountIndirectCommandEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrawIndirectCountIndirectCommandEXT.html"><code>VkDrawIndirectCountIndirectCommandEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDrawIndirectCountIndirectCommandEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDrawIndirectCountIndirectCommandEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDrawIndirectCountIndirectCommandEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDrawIndirectCountIndirectCommandEXT {
        public long size() {
            return segment.byteSize() / VkDrawIndirectCountIndirectCommandEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDrawIndirectCountIndirectCommandEXT at(long index) {
            return new VkDrawIndirectCountIndirectCommandEXT(segment.asSlice(index * VkDrawIndirectCountIndirectCommandEXT.BYTES, VkDrawIndirectCountIndirectCommandEXT.BYTES));
        }
        public void write(long index, @NotNull VkDrawIndirectCountIndirectCommandEXT value) {
            MemorySegment s = segment.asSlice(index * VkDrawIndirectCountIndirectCommandEXT.BYTES, VkDrawIndirectCountIndirectCommandEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDrawIndirectCountIndirectCommandEXT allocate(Arena arena) {
        return new VkDrawIndirectCountIndirectCommandEXT(arena.allocate(LAYOUT));
    }

    public static VkDrawIndirectCountIndirectCommandEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawIndirectCountIndirectCommandEXT.Ptr ret = new VkDrawIndirectCountIndirectCommandEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT clone(Arena arena, VkDrawIndirectCountIndirectCommandEXT src) {
        VkDrawIndirectCountIndirectCommandEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned int commandCount() {
        return segment.get(LAYOUT$commandCount, OFFSET$commandCount);
    }

    public void commandCount(@unsigned int value) {
        segment.set(LAYOUT$commandCount, OFFSET$commandCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("commandCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("bufferAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$commandCount = PathElement.groupElement("commandCount");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$commandCount = (OfInt) LAYOUT.select(PATH$commandCount);

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$commandCount = LAYOUT$commandCount.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$commandCount = LAYOUT.byteOffset(PATH$commandCount);
}
