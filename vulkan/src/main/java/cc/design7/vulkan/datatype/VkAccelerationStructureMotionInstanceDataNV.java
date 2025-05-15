package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VkAccelerationStructureMotionInstanceDataNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMotionInstanceDataNV.html">VkAccelerationStructureMotionInstanceDataNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMotionInstanceDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureMotionInstanceDataNV allocate(Arena arena) {
        return new VkAccelerationStructureMotionInstanceDataNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureMotionInstanceDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMotionInstanceDataNV[] ret = new VkAccelerationStructureMotionInstanceDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(i * SIZE, SIZE));
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

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public VkAccelerationStructureInstanceKHR staticInstance() {
        return new VkAccelerationStructureInstanceKHR(segment.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));
    }

    public void staticInstance(VkAccelerationStructureInstanceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$staticInstance, SIZE$staticInstance);
    }

    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));
    }

    public void matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrixMotionInstance, SIZE$matrixMotionInstance);
    }

    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
        return new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));
    }

    public void srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srtMotionInstance, SIZE$srtMotionInstance);
    }

}
