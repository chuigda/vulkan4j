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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceNV.html"><code>VkAccelerationStructureMotionInstanceNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMotionInstanceNV {
///     VkAccelerationStructureMotionInstanceTypeNV type; // @link substring="VkAccelerationStructureMotionInstanceTypeNV" target="VkAccelerationStructureMotionInstanceTypeNV" @link substring="type" target="#type"
///     VkAccelerationStructureMotionInstanceFlagsNV flags; // optional // @link substring="VkAccelerationStructureMotionInstanceFlagsNV" target="VkAccelerationStructureMotionInstanceFlagsNV" @link substring="flags" target="#flags"
///     VkAccelerationStructureMotionInstanceDataNV data; // @link substring="VkAccelerationStructureMotionInstanceDataNV" target="VkAccelerationStructureMotionInstanceDataNV" @link substring="data" target="#data"
/// } VkAccelerationStructureMotionInstanceNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceNV.html"><code>VkAccelerationStructureMotionInstanceNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMotionInstanceNV(@NotNull MemorySegment segment) implements IVkAccelerationStructureMotionInstanceNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceNV.html"><code>VkAccelerationStructureMotionInstanceNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureMotionInstanceNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureMotionInstanceNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureMotionInstanceNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureMotionInstanceNV {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureMotionInstanceNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureMotionInstanceNV at(long index) {
            return new VkAccelerationStructureMotionInstanceNV(segment.asSlice(index * VkAccelerationStructureMotionInstanceNV.BYTES, VkAccelerationStructureMotionInstanceNV.BYTES));
        }

        public void write(long index, @NotNull VkAccelerationStructureMotionInstanceNV value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureMotionInstanceNV.BYTES, VkAccelerationStructureMotionInstanceNV.BYTES);
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
            return new Ptr(segment.asSlice(index * VkAccelerationStructureMotionInstanceNV.BYTES, VkAccelerationStructureMotionInstanceNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkAccelerationStructureMotionInstanceNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkAccelerationStructureMotionInstanceNV.BYTES,
                (end - start) * VkAccelerationStructureMotionInstanceNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkAccelerationStructureMotionInstanceNV.BYTES));
        }

        public VkAccelerationStructureMotionInstanceNV[] toArray() {
            VkAccelerationStructureMotionInstanceNV[] ret = new VkAccelerationStructureMotionInstanceNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkAccelerationStructureMotionInstanceNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInstanceNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMotionInstanceNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkAccelerationStructureMotionInstanceNV.Ptr(segment);
    }

    public static VkAccelerationStructureMotionInstanceNV clone(Arena arena, VkAccelerationStructureMotionInstanceNV src) {
        VkAccelerationStructureMotionInstanceNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VkAccelerationStructureMotionInstanceTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@EnumType(VkAccelerationStructureMotionInstanceTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @EnumType(VkAccelerationStructureMotionInstanceFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@EnumType(VkAccelerationStructureMotionInstanceFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @NotNull VkAccelerationStructureMotionInstanceDataNV data() {
        return new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(@NotNull VkAccelerationStructureMotionInstanceDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final StructLayout LAYOUT$data = (StructLayout) LAYOUT.select(PATH$data);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
}
