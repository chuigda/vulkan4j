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

public record VkClusterAccelerationStructureInputInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxAccelerationStructureCount = ValueLayout.JAVA_INT.withName("maxAccelerationStructureCount");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$opType = ValueLayout.JAVA_INT.withName("opType");
    public static final OfInt LAYOUT$opMode = ValueLayout.JAVA_INT.withName("opMode");
    public static final StructLayout LAYOUT$opInput = VkClusterAccelerationStructureOpInputNV.LAYOUT.withName("opInput");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxAccelerationStructureCount, LAYOUT$flags, LAYOUT$opType, LAYOUT$opMode, LAYOUT$opInput);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClusterAccelerationStructureInputInfoNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureInputInfoNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureInputInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureInputInfoNV[] ret = new VkClusterAccelerationStructureInputInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureInputInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureInputInfoNV clone(Arena arena, VkClusterAccelerationStructureInputInfoNV src) {
        VkClusterAccelerationStructureInputInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureInputInfoNV[] clone(Arena arena, VkClusterAccelerationStructureInputInfoNV[] src) {
        VkClusterAccelerationStructureInputInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxAccelerationStructureCount = PathElement.groupElement("PATH$maxAccelerationStructureCount");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$opType = PathElement.groupElement("PATH$opType");
    public static final PathElement PATH$opMode = PathElement.groupElement("PATH$opMode");
    public static final PathElement PATH$opInput = PathElement.groupElement("PATH$opInput");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxAccelerationStructureCount = LAYOUT$maxAccelerationStructureCount.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$opType = LAYOUT$opType.byteSize();
    public static final long SIZE$opMode = LAYOUT$opMode.byteSize();
    public static final long SIZE$opInput = LAYOUT$opInput.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxAccelerationStructureCount = LAYOUT.byteOffset(PATH$maxAccelerationStructureCount);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$opType = LAYOUT.byteOffset(PATH$opType);
    public static final long OFFSET$opMode = LAYOUT.byteOffset(PATH$opMode);
    public static final long OFFSET$opInput = LAYOUT.byteOffset(PATH$opInput);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int maxAccelerationStructureCount() {
        return segment.get(LAYOUT$maxAccelerationStructureCount, OFFSET$maxAccelerationStructureCount);
    }

    public void maxAccelerationStructureCount(@unsigned int value) {
        segment.set(LAYOUT$maxAccelerationStructureCount, OFFSET$maxAccelerationStructureCount, value);
    }

    public @enumtype(VkBuildAccelerationStructureFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildAccelerationStructureFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkClusterAccelerationStructureOpTypeNV.class) int opType() {
        return segment.get(LAYOUT$opType, OFFSET$opType);
    }

    public void opType(@enumtype(VkClusterAccelerationStructureOpTypeNV.class) int value) {
        segment.set(LAYOUT$opType, OFFSET$opType, value);
    }

    public @enumtype(VkClusterAccelerationStructureOpModeNV.class) int opMode() {
        return segment.get(LAYOUT$opMode, OFFSET$opMode);
    }

    public void opMode(@enumtype(VkClusterAccelerationStructureOpModeNV.class) int value) {
        segment.set(LAYOUT$opMode, OFFSET$opMode, value);
    }

    public VkClusterAccelerationStructureOpInputNV opInput() {
        return new VkClusterAccelerationStructureOpInputNV(segment.asSlice(OFFSET$opInput, LAYOUT$opInput));
    }

    public void opInput(VkClusterAccelerationStructureOpInputNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$opInput, SIZE$opInput);
    }

}
/// dummy, not implemented yet
