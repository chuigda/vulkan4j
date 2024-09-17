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

public record VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxBlockMatchWindow = PathElement.groupElement("maxBlockMatchWindow");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$maxBlockMatchWindow = (StructLayout) LAYOUT.select(PATH$maxBlockMatchWindow);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxBlockMatchWindow = LAYOUT.byteOffset(PATH$maxBlockMatchWindow);

    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
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

    public VkExtent2D maxBlockMatchWindow() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow));
    }

    public void maxBlockMatchWindow(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow.byteSize());
    }


    public static final class VkPhysicalDeviceImageProcessing2PropertiesQCOMFactory implements IFactory<VkPhysicalDeviceImageProcessing2PropertiesQCOM> {
        @Override
        public Class<VkPhysicalDeviceImageProcessing2PropertiesQCOM> clazz() {
            return VkPhysicalDeviceImageProcessing2PropertiesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageProcessing2PropertiesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageProcessing2PropertiesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceImageProcessing2PropertiesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment);
        }
    }

    public static final VkPhysicalDeviceImageProcessing2PropertiesQCOMFactory FACTORY = new VkPhysicalDeviceImageProcessing2PropertiesQCOMFactory();
}
