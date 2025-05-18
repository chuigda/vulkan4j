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
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceDataNV.html"><code>VkAccelerationStructureMotionInstanceDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMotionInstanceDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureMotionInstanceDataNV allocate(Arena arena) {
        VkAccelerationStructureMotionInstanceDataNV ret = new VkAccelerationStructureMotionInstanceDataNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInstanceDataNV[] ret = new VkAccelerationStructureMotionInstanceDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceDataNV clone(Arena arena, VkAccelerationStructureMotionInstanceDataNV src) {
        VkAccelerationStructureMotionInstanceDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureMotionInstanceDataNV[] clone(Arena arena, VkAccelerationStructureMotionInstanceDataNV[] src) {
        VkAccelerationStructureMotionInstanceDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

    public static final PathElement PATH$staticInstance = PathElement.groupElement("PATH$staticInstance");
    public static final PathElement PATH$matrixMotionInstance = PathElement.groupElement("PATH$matrixMotionInstance");
    public static final PathElement PATH$srtMotionInstance = PathElement.groupElement("PATH$srtMotionInstance");

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
