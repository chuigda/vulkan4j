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
/// typedef struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShaderSampleInterlock;
///     VkBool32 fragmentShaderPixelInterlock;
///     VkBool32 fragmentShaderShadingRateInterlock;
/// } VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.html">VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT</a>
public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
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

    public @unsigned int fragmentShaderSampleInterlock() {
        return segment.get(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock);
    }

    public void fragmentShaderSampleInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock, value);
    }

    public @unsigned int fragmentShaderPixelInterlock() {
        return segment.get(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock);
    }

    public void fragmentShaderPixelInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock, value);
    }

    public @unsigned int fragmentShaderShadingRateInterlock() {
        return segment.get(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock);
    }

    public void fragmentShaderShadingRateInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock, value);
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] ret = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentShaderSampleInterlock = PathElement.groupElement("fragmentShaderSampleInterlock");
    public static final PathElement PATH$fragmentShaderPixelInterlock = PathElement.groupElement("fragmentShaderPixelInterlock");
    public static final PathElement PATH$fragmentShaderShadingRateInterlock = PathElement.groupElement("fragmentShaderShadingRateInterlock");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShaderSampleInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderSampleInterlock);
    public static final OfInt LAYOUT$fragmentShaderPixelInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderPixelInterlock);
    public static final OfInt LAYOUT$fragmentShaderShadingRateInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderShadingRateInterlock);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShaderSampleInterlock = LAYOUT.byteOffset(PATH$fragmentShaderSampleInterlock);
    public static final long OFFSET$fragmentShaderPixelInterlock = LAYOUT.byteOffset(PATH$fragmentShaderPixelInterlock);
    public static final long OFFSET$fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PATH$fragmentShaderShadingRateInterlock);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentShaderSampleInterlock = LAYOUT$fragmentShaderSampleInterlock.byteSize();
    public static final long SIZE$fragmentShaderPixelInterlock = LAYOUT$fragmentShaderPixelInterlock.byteSize();
    public static final long SIZE$fragmentShaderShadingRateInterlock = LAYOUT$fragmentShaderShadingRateInterlock.byteSize();

}
