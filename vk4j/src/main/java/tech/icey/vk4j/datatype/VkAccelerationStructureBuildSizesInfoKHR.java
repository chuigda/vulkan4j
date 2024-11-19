package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureBuildSizesInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceSize accelerationStructureSize;
///     VkDeviceSize updateScratchSize;
///     VkDeviceSize buildScratchSize;
/// } VkAccelerationStructureBuildSizesInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureBuildSizesInfoKHR.html">VkAccelerationStructureBuildSizesInfoKHR</a>
public record VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_BUILD_SIZES_INFO_KHR);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkAccelerationStructureBuildSizesInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureBuildSizesInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureBuildSizesInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureBuildSizesInfoKHR[] ret = new VkAccelerationStructureBuildSizesInfoKHR[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
        ValueLayout.JAVA_LONG.withName("updateScratchSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructureSize = PathElement.groupElement("accelerationStructureSize");
    public static final PathElement PATH$updateScratchSize = PathElement.groupElement("updateScratchSize");
    public static final PathElement PATH$buildScratchSize = PathElement.groupElement("buildScratchSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$accelerationStructureSize = (OfLong) LAYOUT.select(PATH$accelerationStructureSize);
    public static final OfLong LAYOUT$updateScratchSize = (OfLong) LAYOUT.select(PATH$updateScratchSize);
    public static final OfLong LAYOUT$buildScratchSize = (OfLong) LAYOUT.select(PATH$buildScratchSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructureSize = LAYOUT.byteOffset(PATH$accelerationStructureSize);
    public static final long OFFSET$updateScratchSize = LAYOUT.byteOffset(PATH$updateScratchSize);
    public static final long OFFSET$buildScratchSize = LAYOUT.byteOffset(PATH$buildScratchSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructureSize = LAYOUT$accelerationStructureSize.byteSize();
    public static final long SIZE$updateScratchSize = LAYOUT$updateScratchSize.byteSize();
    public static final long SIZE$buildScratchSize = LAYOUT$buildScratchSize.byteSize();
}
