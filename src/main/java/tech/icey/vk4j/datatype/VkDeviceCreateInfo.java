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

public record VkDeviceCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueCreateInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceQueueCreateInfo.LAYOUT).withName("pQueueCreateInfos"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledExtensionNames"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFeatures.LAYOUT).withName("pEnabledFeatures")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$queueCreateInfoCount = PathElement.groupElement("queueCreateInfoCount");
    public static final PathElement PATH$pQueueCreateInfos = PathElement.groupElement("pQueueCreateInfos");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("ppEnabledExtensionNames");
    public static final PathElement PATH$pEnabledFeatures = PathElement.groupElement("pEnabledFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queueCreateInfoCount = (OfInt) LAYOUT.select(PATH$queueCreateInfoCount);
    public static final AddressLayout LAYOUT$pQueueCreateInfos = (AddressLayout) LAYOUT.select(PATH$pQueueCreateInfos);
    public static final OfInt LAYOUT$enabledLayerCount = (OfInt) LAYOUT.select(PATH$enabledLayerCount);
    public static final AddressLayout LAYOUT$ppEnabledLayerNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$ppEnabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledExtensionNames);
    public static final AddressLayout LAYOUT$pEnabledFeatures = (AddressLayout) LAYOUT.select(PATH$pEnabledFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueCreateInfoCount = LAYOUT.byteOffset(PATH$queueCreateInfoCount);
    public static final long OFFSET$pQueueCreateInfos = LAYOUT.byteOffset(PATH$pQueueCreateInfos);
    public static final long OFFSET$enabledLayerCount = LAYOUT.byteOffset(PATH$enabledLayerCount);
    public static final long OFFSET$ppEnabledLayerNames = LAYOUT.byteOffset(PATH$ppEnabledLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$ppEnabledExtensionNames = LAYOUT.byteOffset(PATH$ppEnabledExtensionNames);
    public static final long OFFSET$pEnabledFeatures = LAYOUT.byteOffset(PATH$pEnabledFeatures);

    public VkDeviceCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
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

    public @enumtype(VkDeviceCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int queueCreateInfoCount() {
        return segment.get(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount);
    }

    public void queueCreateInfoCount(@unsigned int value) {
        segment.set(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount, value);
    }

    public @pointer(comment="VkDeviceQueueCreateInfo*") MemorySegment pQueueCreateInfosRaw() {
        return segment.get(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos);
    }

    public void pQueueCreateInfosRaw(@pointer(comment="VkDeviceQueueCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos, value);
    }
    
    public @nullable VkDeviceQueueCreateInfo pQueueCreateInfos() {
        MemorySegment s = pQueueCreateInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceQueueCreateInfo(s);
    }

    public void pQueueCreateInfos(@nullable VkDeviceQueueCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueCreateInfosRaw(s);
    }

    public @unsigned int enabledLayerCount() {
        return segment.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);
    }

    public void enabledLayerCount(@unsigned int value) {
        segment.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledLayerNames() {
        return segment.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);
    }

    public void ppEnabledLayerNames(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);
    }

    public @unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public void enabledExtensionCount(@unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledExtensionNames() {
        return segment.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);
    }

    public void ppEnabledExtensionNames(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);
    }

    public @pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment pEnabledFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures);
    }

    public void pEnabledFeaturesRaw(@pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment value) {
        segment.set(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures, value);
    }
    
    public @nullable VkPhysicalDeviceFeatures pEnabledFeatures() {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDeviceFeatures(s);
    }

    public void pEnabledFeatures(@nullable VkPhysicalDeviceFeatures value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEnabledFeaturesRaw(s);
    }


    public static final class VkDeviceCreateInfoFactory implements IDataTypeFactory<VkDeviceCreateInfo> {
        @Override
        public Class<VkDeviceCreateInfo> clazz() {
            return VkDeviceCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceCreateInfo.LAYOUT;
        }

        @Override
        public VkDeviceCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceCreateInfo createUninit(MemorySegment segment) {
            return new VkDeviceCreateInfo(segment);
        }
    }

    public static final VkDeviceCreateInfoFactory FACTORY = new VkDeviceCreateInfoFactory();
}
