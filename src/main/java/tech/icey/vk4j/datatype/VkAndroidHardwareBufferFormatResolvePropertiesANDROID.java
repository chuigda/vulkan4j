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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAndroidHardwareBufferFormatResolvePropertiesANDROID(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentFormat")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorAttachmentFormat = PathElement.groupElement("colorAttachmentFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentFormat = (OfInt) LAYOUT.select(PATH$colorAttachmentFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentFormat = LAYOUT.byteOffset(PATH$colorAttachmentFormat);

    public VkAndroidHardwareBufferFormatResolvePropertiesANDROID(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_RESOLVE_PROPERTIES_ANDROID);
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

    public @enumtype(VkFormat.class) int colorAttachmentFormat() {
        return segment.get(LAYOUT$colorAttachmentFormat, OFFSET$colorAttachmentFormat);
    }

    public void colorAttachmentFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$colorAttachmentFormat, OFFSET$colorAttachmentFormat, value);
    }


    public static final class VkAndroidHardwareBufferFormatResolvePropertiesANDROIDFactory implements IDataTypeFactory<VkAndroidHardwareBufferFormatResolvePropertiesANDROID> {
        @Override
        public Class<VkAndroidHardwareBufferFormatResolvePropertiesANDROID> clazz() {
            return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAndroidHardwareBufferFormatResolvePropertiesANDROID.LAYOUT;
        }

        @Override
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAndroidHardwareBufferFormatResolvePropertiesANDROID createUninit(MemorySegment segment) {
            return new VkAndroidHardwareBufferFormatResolvePropertiesANDROID(segment);
        }
    }

    public static final VkAndroidHardwareBufferFormatResolvePropertiesANDROIDFactory FACTORY = new VkAndroidHardwareBufferFormatResolvePropertiesANDROIDFactory();
}
