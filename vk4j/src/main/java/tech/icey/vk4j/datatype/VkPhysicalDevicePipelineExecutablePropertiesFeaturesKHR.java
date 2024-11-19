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
/// typedef struct VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelineExecutableInfo;
/// } VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.html">VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR</a>
public record VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR);
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

    public @unsigned int pipelineExecutableInfo() {
        return segment.get(LAYOUT$pipelineExecutableInfo, OFFSET$pipelineExecutableInfo);
    }

    public void pipelineExecutableInfo(@unsigned int value) {
        segment.set(LAYOUT$pipelineExecutableInfo, OFFSET$pipelineExecutableInfo, value);
    }

    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[] ret = new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR clone(Arena arena, VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR src) {
        VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[] clone(Arena arena, VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[] src) {
        VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineExecutableInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineExecutableInfo = PathElement.groupElement("pipelineExecutableInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineExecutableInfo = (OfInt) LAYOUT.select(PATH$pipelineExecutableInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineExecutableInfo = LAYOUT.byteOffset(PATH$pipelineExecutableInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineExecutableInfo = LAYOUT$pipelineExecutableInfo.byteSize();
}
