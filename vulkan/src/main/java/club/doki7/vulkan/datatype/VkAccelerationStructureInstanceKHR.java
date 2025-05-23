package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInstanceKHR.html"><code>VkAccelerationStructureInstanceKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureInstanceKHR {
///     VkTransformMatrixKHR transform; // @link substring="VkTransformMatrixKHR" target="VkTransformMatrixKHR" @link substring="transform" target="#transform"
///     uint32_t instanceCustomIndex : 24; // @link substring="instanceCustomIndex" target="#instanceCustomIndex"
///     uint32_t mask : 8; // @link substring="mask" target="#mask"
///     uint32_t instanceShaderBindingTableRecordOffset : 24; // @link substring="instanceShaderBindingTableRecordOffset" target="#instanceShaderBindingTableRecordOffset"
///     uint32_t flags : 8; // @link substring="flags" target="#flags"
///     uint64_t accelerationStructureReference; // @link substring="accelerationStructureReference" target="#accelerationStructureReference"
/// } VkAccelerationStructureInstanceKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInstanceKHR.html"><code>VkAccelerationStructureInstanceKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureInstanceKHR(@NotNull MemorySegment segment) implements IVkAccelerationStructureInstanceKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureInstanceKHR.html"><code>VkAccelerationStructureInstanceKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureInstanceKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureInstanceKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureInstanceKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureInstanceKHR {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureInstanceKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureInstanceKHR at(long index) {
            return new VkAccelerationStructureInstanceKHR(segment.asSlice(index * VkAccelerationStructureInstanceKHR.BYTES, VkAccelerationStructureInstanceKHR.BYTES));
        }

        public void write(long index, @NotNull VkAccelerationStructureInstanceKHR value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureInstanceKHR.BYTES, VkAccelerationStructureInstanceKHR.BYTES);
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
            return new Ptr(segment.asSlice(index * VkAccelerationStructureInstanceKHR.BYTES, VkAccelerationStructureInstanceKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkAccelerationStructureInstanceKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkAccelerationStructureInstanceKHR.BYTES,
                (end - start) * VkAccelerationStructureInstanceKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkAccelerationStructureInstanceKHR.BYTES));
        }

        public VkAccelerationStructureInstanceKHR[] toArray() {
            VkAccelerationStructureInstanceKHR[] ret = new VkAccelerationStructureInstanceKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkAccelerationStructureInstanceKHR allocate(Arena arena) {
        return new VkAccelerationStructureInstanceKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureInstanceKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkAccelerationStructureInstanceKHR.Ptr(segment);
    }

    public static VkAccelerationStructureInstanceKHR clone(Arena arena, VkAccelerationStructureInstanceKHR src) {
        VkAccelerationStructureInstanceKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VkTransformMatrixKHR transform() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transform, LAYOUT$transform));
    }

    public void transform(@NotNull VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transform, SIZE$transform);
    }

    public @unsigned int instanceCustomIndex() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceCustomIndex(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int mask() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void mask(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceCustomIndex$mask, LAYOUT$bitfield$instanceCustomIndex$mask);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned int instanceShaderBindingTableRecordOffset() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void instanceShaderBindingTableRecordOffset(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int flags() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        return BitfieldUtil.readBits(s, 24, 32);
    }

    public void flags(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags, LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags);
        BitfieldUtil.writeBits(s, 24, 32, value);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex$mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset$flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$transform = PathElement.groupElement("transform");
    public static final PathElement PATH$bitfield$instanceCustomIndex$mask = PathElement.groupElement("instanceCustomIndex$mask");
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset$flags = PathElement.groupElement("instanceShaderBindingTableRecordOffset$flags");
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement("accelerationStructureReference");

    public static final StructLayout LAYOUT$transform = (StructLayout) LAYOUT.select(PATH$transform);
    public static final OfInt LAYOUT$bitfield$instanceCustomIndex$mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex$mask);
    public static final OfInt LAYOUT$bitfield$instanceShaderBindingTableRecordOffset$flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset$flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$accelerationStructureReference = LAYOUT$accelerationStructureReference.byteSize();

    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$bitfield$instanceCustomIndex$mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex$mask);
    public static final long OFFSET$bitfield$instanceShaderBindingTableRecordOffset$flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset$flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);
}
