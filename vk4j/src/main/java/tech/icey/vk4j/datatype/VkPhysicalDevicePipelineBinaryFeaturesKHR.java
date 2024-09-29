package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDevicePipelineBinaryFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineBinaries;
/// } VkPhysicalDevicePipelineBinaryFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePipelineBinaryFeaturesKHR.html">VkPhysicalDevicePipelineBinaryFeaturesKHR</a>
public record VkPhysicalDevicePipelineBinaryFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePipelineBinaryFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int pipelineBinaries() {
        return segment.get(LAYOUT$pipelineBinaries, OFFSET$pipelineBinaries);
    }

    public void pipelineBinaries(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaries, OFFSET$pipelineBinaries, value);
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineBinaryFeaturesKHR[] ret = new VkPhysicalDevicePipelineBinaryFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePipelineBinaryFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR clone(Arena arena, VkPhysicalDevicePipelineBinaryFeaturesKHR src) {
        VkPhysicalDevicePipelineBinaryFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineBinaryFeaturesKHR[] clone(Arena arena, VkPhysicalDevicePipelineBinaryFeaturesKHR[] src) {
        VkPhysicalDevicePipelineBinaryFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinaries = PathElement.groupElement("pipelineBinaries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBinaries = (OfInt) LAYOUT.select(PATH$pipelineBinaries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaries = LAYOUT.byteOffset(PATH$pipelineBinaries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaries = LAYOUT$pipelineBinaries.byteSize();
}
