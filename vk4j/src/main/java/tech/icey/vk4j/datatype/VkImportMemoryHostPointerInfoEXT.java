package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImportMemoryHostPointerInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("pHostPointer")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");
    public static final PathElement PATH$pHostPointer = PathElement.groupElement("pHostPointer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$pHostPointer = (AddressLayout) LAYOUT.select(PATH$pHostPointer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$pHostPointer = LAYOUT.byteOffset(PATH$pHostPointer);

    public VkImportMemoryHostPointerInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @pointer(comment="void*") MemorySegment pHostPointer() {
        return segment.get(LAYOUT$pHostPointer, OFFSET$pHostPointer);
    }

    public void pHostPointer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pHostPointer, OFFSET$pHostPointer, value);
    }


    public static final class Factory implements IFactory<VkImportMemoryHostPointerInfoEXT> {
        @Override
        public Class<VkImportMemoryHostPointerInfoEXT> clazz() {
            return VkImportMemoryHostPointerInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkImportMemoryHostPointerInfoEXT.LAYOUT;
        }

        @Override
        public VkImportMemoryHostPointerInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImportMemoryHostPointerInfoEXT createUninit(MemorySegment segment) {
            return new VkImportMemoryHostPointerInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
