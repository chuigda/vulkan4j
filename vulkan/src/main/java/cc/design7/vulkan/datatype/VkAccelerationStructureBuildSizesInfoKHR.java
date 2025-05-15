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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildSizesInfoKHR.html">VkAccelerationStructureBuildSizesInfoKHR</a>
@ValueBasedCandidate
public record VkAccelerationStructureBuildSizesInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$accelerationStructureSize = ValueLayout.JAVA_LONG.withName("accelerationStructureSize");
    public static final OfLong LAYOUT$updateScratchSize = ValueLayout.JAVA_LONG.withName("updateScratchSize");
    public static final OfLong LAYOUT$buildScratchSize = ValueLayout.JAVA_LONG.withName("buildScratchSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$accelerationStructureSize, LAYOUT$updateScratchSize, LAYOUT$buildScratchSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureBuildSizesInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildSizesInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureBuildSizesInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildSizesInfoKHR[] ret = new VkAccelerationStructureBuildSizesInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureBuildSizesInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureBuildSizesInfoKHR clone(Arena arena, VkAccelerationStructureBuildSizesInfoKHR src) {
        VkAccelerationStructureBuildSizesInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureBuildSizesInfoKHR[] clone(Arena arena, VkAccelerationStructureBuildSizesInfoKHR[] src) {
        VkAccelerationStructureBuildSizesInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$accelerationStructureSize = PathElement.groupElement("PATH$accelerationStructureSize");
    public static final PathElement PATH$updateScratchSize = PathElement.groupElement("PATH$updateScratchSize");
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement("PATH$buildScratchSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructureSize = LAYOUT$accelerationStructureSize.byteSize();
    public static final long SIZE$updateScratchSize = LAYOUT$updateScratchSize.byteSize();
    public static final long SIZE$buildScratchSize = LAYOUT$buildScratchSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructureSize = LAYOUT.byteOffset(PATH$accelerationStructureSize);
    public static final long OFFSET$updateScratchSize = LAYOUT.byteOffset(PATH$updateScratchSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);

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

    public @unsigned long accelerationStructureSize() {
        return segment.get(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize);
    }

    public void accelerationStructureSize(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureSize, OFFSET$accelerationStructureSize, value);
    }

    public @unsigned long updateScratchSize() {
        return segment.get(LAYOUT$updateScratchSize, OFFSET$updateScratchSize);
    }

    public void updateScratchSize(@unsigned long value) {
        segment.set(LAYOUT$updateScratchSize, OFFSET$updateScratchSize, value);
    }

    public @unsigned long buildScratchSize() {
        return segment.get(LAYOUT$buildScratchSize, OFFSET$buildScratchSize);
    }

    public void buildScratchSize(@unsigned long value) {
        segment.set(LAYOUT$buildScratchSize, OFFSET$buildScratchSize, value);
    }

}
