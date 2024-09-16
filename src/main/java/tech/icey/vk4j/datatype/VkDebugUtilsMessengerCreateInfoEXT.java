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

public record VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$messageSeverity = PathElement.groupElement(3);
    public static final PathElement PATH$messageType = PathElement.groupElement(4);
    public static final PathElement PATH$pfnUserCallback = PathElement.groupElement(5);
    public static final PathElement PATH$pUserData = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$messageSeverity = (OfInt) LAYOUT.select(PATH$messageSeverity);
    public static final OfInt LAYOUT$messageType = (OfInt) LAYOUT.select(PATH$messageType);
    public static final AddressLayout LAYOUT$pfnUserCallback = (AddressLayout) LAYOUT.select(PATH$pfnUserCallback);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$messageSeverity = LAYOUT.byteOffset(PATH$messageSeverity);
    public static final long OFFSET$messageType = LAYOUT.byteOffset(PATH$messageType);
    public static final long OFFSET$pfnUserCallback = LAYOUT.byteOffset(PATH$pfnUserCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

    public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
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

    public @enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity() {
        return segment.get(LAYOUT$messageSeverity, OFFSET$messageSeverity);
    }

    public void messageSeverity(@enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageSeverity, OFFSET$messageSeverity, value);
    }

    public @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType() {
        return segment.get(LAYOUT$messageType, OFFSET$messageType);
    }

    public void messageType(@enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageType, OFFSET$messageType, value);
    }

    public @pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment pfnUserCallback() {
        return segment.get(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback);
    }

    public void pfnUserCallback(@pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment value) {
        segment.set(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback, value);
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }


    public static final class VkDebugUtilsMessengerCreateInfoEXTFactory implements IDataTypeFactory<VkDebugUtilsMessengerCreateInfoEXT> {
        @Override
        public Class<VkDebugUtilsMessengerCreateInfoEXT> clazz() {
            return VkDebugUtilsMessengerCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDebugUtilsMessengerCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkDebugUtilsMessengerCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDebugUtilsMessengerCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkDebugUtilsMessengerCreateInfoEXT(segment);
        }
    }

    public static final VkDebugUtilsMessengerCreateInfoEXTFactory FACTORY = new VkDebugUtilsMessengerCreateInfoEXTFactory();
}
