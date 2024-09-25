package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3D"),
        ValueLayout.JAVA_INT.withName("sampler2DViewOf3D")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image2DViewOf3D = PathElement.groupElement("image2DViewOf3D");
    public static final PathElement PATH$sampler2DViewOf3D = PathElement.groupElement("sampler2DViewOf3D");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$image2DViewOf3D = (OfInt) LAYOUT.select(PATH$image2DViewOf3D);
    public static final OfInt LAYOUT$sampler2DViewOf3D = (OfInt) LAYOUT.select(PATH$sampler2DViewOf3D);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image2DViewOf3D = LAYOUT.byteOffset(PATH$image2DViewOf3D);
    public static final long OFFSET$sampler2DViewOf3D = LAYOUT.byteOffset(PATH$sampler2DViewOf3D);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image2DViewOf3D = LAYOUT$image2DViewOf3D.byteSize();
    public static final long SIZE$sampler2DViewOf3D = LAYOUT$sampler2DViewOf3D.byteSize();

    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT);
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

    public @unsigned int image2DViewOf3D() {
        return segment.get(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D);
    }

    public void image2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$image2DViewOf3D, OFFSET$image2DViewOf3D, value);
    }

    public @unsigned int sampler2DViewOf3D() {
        return segment.get(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D);
    }

    public void sampler2DViewOf3D(@unsigned int value) {
        segment.set(LAYOUT$sampler2DViewOf3D, OFFSET$sampler2DViewOf3D, value);
    }

    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[] ret = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
