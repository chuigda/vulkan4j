package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMessageIdName"),
        ValueLayout.JAVA_INT.withName("messageIdNumber"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMessage"),
        ValueLayout.JAVA_INT.withName("queueLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT).withName("pQueueLabels"),
        ValueLayout.JAVA_INT.withName("cmdBufLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT).withName("pCmdBufLabels"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsObjectNameInfoEXT.LAYOUT).withName("pObjects")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pMessageIdName = PathElement.groupElement("pMessageIdName");
    public static final PathElement PATH$messageIdNumber = PathElement.groupElement("messageIdNumber");
    public static final PathElement PATH$pMessage = PathElement.groupElement("pMessage");
    public static final PathElement PATH$queueLabelCount = PathElement.groupElement("queueLabelCount");
    public static final PathElement PATH$pQueueLabels = PathElement.groupElement("pQueueLabels");
    public static final PathElement PATH$cmdBufLabelCount = PathElement.groupElement("cmdBufLabelCount");
    public static final PathElement PATH$pCmdBufLabels = PathElement.groupElement("pCmdBufLabels");
    public static final PathElement PATH$objectCount = PathElement.groupElement("objectCount");
    public static final PathElement PATH$pObjects = PathElement.groupElement("pObjects");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pMessageIdName = (AddressLayout) LAYOUT.select(PATH$pMessageIdName);
    public static final OfInt LAYOUT$messageIdNumber = (OfInt) LAYOUT.select(PATH$messageIdNumber);
    public static final AddressLayout LAYOUT$pMessage = (AddressLayout) LAYOUT.select(PATH$pMessage);
    public static final OfInt LAYOUT$queueLabelCount = (OfInt) LAYOUT.select(PATH$queueLabelCount);
    public static final AddressLayout LAYOUT$pQueueLabels = (AddressLayout) LAYOUT.select(PATH$pQueueLabels);
    public static final OfInt LAYOUT$cmdBufLabelCount = (OfInt) LAYOUT.select(PATH$cmdBufLabelCount);
    public static final AddressLayout LAYOUT$pCmdBufLabels = (AddressLayout) LAYOUT.select(PATH$pCmdBufLabels);
    public static final OfInt LAYOUT$objectCount = (OfInt) LAYOUT.select(PATH$objectCount);
    public static final AddressLayout LAYOUT$pObjects = (AddressLayout) LAYOUT.select(PATH$pObjects);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pMessageIdName = LAYOUT.byteOffset(PATH$pMessageIdName);
    public static final long OFFSET$messageIdNumber = LAYOUT.byteOffset(PATH$messageIdNumber);
    public static final long OFFSET$pMessage = LAYOUT.byteOffset(PATH$pMessage);
    public static final long OFFSET$queueLabelCount = LAYOUT.byteOffset(PATH$queueLabelCount);
    public static final long OFFSET$pQueueLabels = LAYOUT.byteOffset(PATH$pQueueLabels);
    public static final long OFFSET$cmdBufLabelCount = LAYOUT.byteOffset(PATH$cmdBufLabelCount);
    public static final long OFFSET$pCmdBufLabels = LAYOUT.byteOffset(PATH$pCmdBufLabels);
    public static final long OFFSET$objectCount = LAYOUT.byteOffset(PATH$objectCount);
    public static final long OFFSET$pObjects = LAYOUT.byteOffset(PATH$pObjects);

    public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
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

    public @enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCallbackDataFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="int8_t*") MemorySegment pMessageIdNameRaw() {
        return segment.get(LAYOUT$pMessageIdName, OFFSET$pMessageIdName);
    }

    public void pMessageIdNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMessageIdName, OFFSET$pMessageIdName, value);
    }
    
    public BytePtr pMessageIdName() {
        return new BytePtr(pMessageIdNameRaw());
    }

    public void pMessageIdName(BytePtr value) {
        pMessageIdNameRaw(value.segment());
    }

    public int messageIdNumber() {
        return segment.get(LAYOUT$messageIdNumber, OFFSET$messageIdNumber);
    }

    public void messageIdNumber(int value) {
        segment.set(LAYOUT$messageIdNumber, OFFSET$messageIdNumber, value);
    }

    public @pointer(comment="int8_t*") MemorySegment pMessageRaw() {
        return segment.get(LAYOUT$pMessage, OFFSET$pMessage);
    }

    public void pMessageRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMessage, OFFSET$pMessage, value);
    }
    
    public BytePtr pMessage() {
        return new BytePtr(pMessageRaw());
    }

    public void pMessage(BytePtr value) {
        pMessageRaw(value.segment());
    }

    public @unsigned int queueLabelCount() {
        return segment.get(LAYOUT$queueLabelCount, OFFSET$queueLabelCount);
    }

    public void queueLabelCount(@unsigned int value) {
        segment.set(LAYOUT$queueLabelCount, OFFSET$queueLabelCount, value);
    }

    public @pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment pQueueLabelsRaw() {
        return segment.get(LAYOUT$pQueueLabels, OFFSET$pQueueLabels);
    }

    public void pQueueLabelsRaw(@pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment value) {
        segment.set(LAYOUT$pQueueLabels, OFFSET$pQueueLabels, value);
    }
    
    public @nullable VkDebugUtilsLabelEXT pQueueLabels() {
        MemorySegment s = pQueueLabelsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsLabelEXT(s);
    }

    public void pQueueLabels(@nullable VkDebugUtilsLabelEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueLabelsRaw(s);
    }

    public @unsigned int cmdBufLabelCount() {
        return segment.get(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount);
    }

    public void cmdBufLabelCount(@unsigned int value) {
        segment.set(LAYOUT$cmdBufLabelCount, OFFSET$cmdBufLabelCount, value);
    }

    public @pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment pCmdBufLabelsRaw() {
        return segment.get(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels);
    }

    public void pCmdBufLabelsRaw(@pointer(comment="VkDebugUtilsLabelEXT*") MemorySegment value) {
        segment.set(LAYOUT$pCmdBufLabels, OFFSET$pCmdBufLabels, value);
    }
    
    public @nullable VkDebugUtilsLabelEXT pCmdBufLabels() {
        MemorySegment s = pCmdBufLabelsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsLabelEXT(s);
    }

    public void pCmdBufLabels(@nullable VkDebugUtilsLabelEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCmdBufLabelsRaw(s);
    }

    public @unsigned int objectCount() {
        return segment.get(LAYOUT$objectCount, OFFSET$objectCount);
    }

    public void objectCount(@unsigned int value) {
        segment.set(LAYOUT$objectCount, OFFSET$objectCount, value);
    }

    public @pointer(comment="VkDebugUtilsObjectNameInfoEXT*") MemorySegment pObjectsRaw() {
        return segment.get(LAYOUT$pObjects, OFFSET$pObjects);
    }

    public void pObjectsRaw(@pointer(comment="VkDebugUtilsObjectNameInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pObjects, OFFSET$pObjects, value);
    }
    
    public @nullable VkDebugUtilsObjectNameInfoEXT pObjects() {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDebugUtilsObjectNameInfoEXT(s);
    }

    public void pObjects(@nullable VkDebugUtilsObjectNameInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pObjectsRaw(s);
    }


    public static final class Factory implements IFactory<VkDebugUtilsMessengerCallbackDataEXT> {
        @Override
        public Class<VkDebugUtilsMessengerCallbackDataEXT> clazz() {
            return VkDebugUtilsMessengerCallbackDataEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDebugUtilsMessengerCallbackDataEXT.LAYOUT;
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataEXT createUninit(MemorySegment segment) {
            return new VkDebugUtilsMessengerCallbackDataEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
