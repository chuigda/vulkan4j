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

public record VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalFormatResolve")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$externalFormatResolve = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$externalFormatResolve = (OfInt) LAYOUT.select(PATH$externalFormatResolve);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$externalFormatResolve = LAYOUT.byteOffset(PATH$externalFormatResolve);

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID);
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

    public @unsigned int externalFormatResolve() {
        return segment.get(LAYOUT$externalFormatResolve, OFFSET$externalFormatResolve);
    }

    public void externalFormatResolve(@unsigned int value) {
        segment.set(LAYOUT$externalFormatResolve, OFFSET$externalFormatResolve, value);
    }


    public static final class VkPhysicalDeviceExternalFormatResolveFeaturesANDROIDFactory implements IDataTypeFactory<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID> {
        @Override
        public Class<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID> clazz() {
            return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(segment);
        }
    }

    public static final VkPhysicalDeviceExternalFormatResolveFeaturesANDROIDFactory FACTORY = new VkPhysicalDeviceExternalFormatResolveFeaturesANDROIDFactory();
}