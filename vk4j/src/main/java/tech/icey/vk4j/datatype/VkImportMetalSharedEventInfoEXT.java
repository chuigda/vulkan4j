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

public record VkImportMetalSharedEventInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mtlSharedEvent = PathElement.groupElement("mtlSharedEvent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$mtlSharedEvent = (AddressLayout) LAYOUT.select(PATH$mtlSharedEvent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mtlSharedEvent = LAYOUT.byteOffset(PATH$mtlSharedEvent);

    public VkImportMetalSharedEventInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment mtlSharedEvent() {
        return segment.get(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent);
    }

    public void mtlSharedEvent(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent, value);
    }


    public static final class VkImportMetalSharedEventInfoEXTFactory implements IFactory<VkImportMetalSharedEventInfoEXT> {
        @Override
        public Class<VkImportMetalSharedEventInfoEXT> clazz() {
            return VkImportMetalSharedEventInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImportMetalSharedEventInfoEXT.LAYOUT;
        }

        @Override
        public VkImportMetalSharedEventInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImportMetalSharedEventInfoEXT createUninit(MemorySegment segment) {
            return new VkImportMetalSharedEventInfoEXT(segment);
        }
    }

    public static final VkImportMetalSharedEventInfoEXTFactory FACTORY = new VkImportMetalSharedEventInfoEXTFactory();
}
