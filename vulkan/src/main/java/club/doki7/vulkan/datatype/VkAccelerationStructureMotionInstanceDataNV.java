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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceDataNV.html"><code>VkAccelerationStructureMotionInstanceDataNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMotionInstanceDataNV {
///     VkAccelerationStructureInstanceKHR staticInstance; // @link substring="VkAccelerationStructureInstanceKHR" target="VkAccelerationStructureInstanceKHR" @link substring="staticInstance" target="#staticInstance"
///     VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance; // @link substring="VkAccelerationStructureMatrixMotionInstanceNV" target="VkAccelerationStructureMatrixMotionInstanceNV" @link substring="matrixMotionInstance" target="#matrixMotionInstance"
///     VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance; // @link substring="VkAccelerationStructureSRTMotionInstanceNV" target="VkAccelerationStructureSRTMotionInstanceNV" @link substring="srtMotionInstance" target="#srtMotionInstance"
/// } VkAccelerationStructureMotionInstanceDataNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceDataNV.html"><code>VkAccelerationStructureMotionInstanceDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMotionInstanceDataNV(@NotNull MemorySegment segment) implements IVkAccelerationStructureMotionInstanceDataNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceDataNV.html"><code>VkAccelerationStructureMotionInstanceDataNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureMotionInstanceDataNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureMotionInstanceDataNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureMotionInstanceDataNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureMotionInstanceDataNV {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureMotionInstanceDataNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureMotionInstanceDataNV at(long index) {
            return new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(index * VkAccelerationStructureMotionInstanceDataNV.BYTES, VkAccelerationStructureMotionInstanceDataNV.BYTES));
        }
        public void write(long index, @NotNull VkAccelerationStructureMotionInstanceDataNV value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureMotionInstanceDataNV.BYTES, VkAccelerationStructureMotionInstanceDataNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkAccelerationStructureMotionInstanceDataNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInstanceDataNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMotionInstanceDataNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInstanceDataNV.Ptr ret = new VkAccelerationStructureMotionInstanceDataNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceDataNV clone(Arena arena, VkAccelerationStructureMotionInstanceDataNV src) {
        VkAccelerationStructureMotionInstanceDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VkAccelerationStructureInstanceKHR staticInstance() {
        return new VkAccelerationStructureInstanceKHR(segment.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));
    }

    public void staticInstance(@NotNull VkAccelerationStructureInstanceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$staticInstance, SIZE$staticInstance);
    }

    public @NotNull VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));
    }

    public void matrixMotionInstance(@NotNull VkAccelerationStructureMatrixMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrixMotionInstance, SIZE$matrixMotionInstance);
    }

    public @NotNull VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
        return new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));
    }

    public void srtMotionInstance(@NotNull VkAccelerationStructureSRTMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srtMotionInstance, SIZE$srtMotionInstance);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$staticInstance = PathElement.groupElement("staticInstance");
    public static final PathElement PATH$matrixMotionInstance = PathElement.groupElement("matrixMotionInstance");
    public static final PathElement PATH$srtMotionInstance = PathElement.groupElement("srtMotionInstance");

    public static final StructLayout LAYOUT$staticInstance = (StructLayout) LAYOUT.select(PATH$staticInstance);
    public static final StructLayout LAYOUT$matrixMotionInstance = (StructLayout) LAYOUT.select(PATH$matrixMotionInstance);
    public static final StructLayout LAYOUT$srtMotionInstance = (StructLayout) LAYOUT.select(PATH$srtMotionInstance);

    public static final long SIZE$staticInstance = LAYOUT$staticInstance.byteSize();
    public static final long SIZE$matrixMotionInstance = LAYOUT$matrixMotionInstance.byteSize();
    public static final long SIZE$srtMotionInstance = LAYOUT$srtMotionInstance.byteSize();

    public static final long OFFSET$staticInstance = LAYOUT.byteOffset(PATH$staticInstance);
    public static final long OFFSET$matrixMotionInstance = LAYOUT.byteOffset(PATH$matrixMotionInstance);
    public static final long OFFSET$srtMotionInstance = LAYOUT.byteOffset(PATH$srtMotionInstance);
}
