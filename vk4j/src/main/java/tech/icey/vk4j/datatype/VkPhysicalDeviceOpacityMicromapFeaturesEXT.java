package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$micromap = PathElement.groupElement("micromap");
    public static final PathElement PATH$micromapCaptureReplay = PathElement.groupElement("micromapCaptureReplay");
    public static final PathElement PATH$micromapHostCommands = PathElement.groupElement("micromapHostCommands");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$micromap = (OfInt) LAYOUT.select(PATH$micromap);
    public static final OfInt LAYOUT$micromapCaptureReplay = (OfInt) LAYOUT.select(PATH$micromapCaptureReplay);
    public static final OfInt LAYOUT$micromapHostCommands = (OfInt) LAYOUT.select(PATH$micromapHostCommands);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);
    public static final long OFFSET$micromapCaptureReplay = LAYOUT.byteOffset(PATH$micromapCaptureReplay);
    public static final long OFFSET$micromapHostCommands = LAYOUT.byteOffset(PATH$micromapHostCommands);

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
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

    public @unsigned int micromap() {
        return segment.get(LAYOUT$micromap, OFFSET$micromap);
    }

    public void micromap(@unsigned int value) {
        segment.set(LAYOUT$micromap, OFFSET$micromap, value);
    }

    public @unsigned int micromapCaptureReplay() {
        return segment.get(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay);
    }

    public void micromapCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay, value);
    }

    public @unsigned int micromapHostCommands() {
        return segment.get(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands);
    }

    public void micromapHostCommands(@unsigned int value) {
        segment.set(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands, value);
    }


    public static final class VkPhysicalDeviceOpacityMicromapFeaturesEXTFactory implements IFactory<VkPhysicalDeviceOpacityMicromapFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceOpacityMicromapFeaturesEXT> clazz() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceOpacityMicromapFeaturesEXTFactory FACTORY = new VkPhysicalDeviceOpacityMicromapFeaturesEXTFactory();
}
