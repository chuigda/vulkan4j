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

public record VkDrmFormatModifierPropertiesListEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDrmFormatModifierPropertiesEXT.LAYOUT).withName("pDrmFormatModifierProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifierProperties = PathElement.groupElement("pDrmFormatModifierProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$drmFormatModifierCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierCount);
    public static final AddressLayout LAYOUT$pDrmFormatModifierProperties = (AddressLayout) LAYOUT.select(PATH$pDrmFormatModifierProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifierProperties = LAYOUT.byteOffset(PATH$pDrmFormatModifierProperties);

    public VkDrmFormatModifierPropertiesListEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    public @pointer(comment="VkDrmFormatModifierPropertiesEXT*") MemorySegment pDrmFormatModifierPropertiesRaw() {
        return segment.get(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties);
    }

    public void pDrmFormatModifierPropertiesRaw(@pointer(comment="VkDrmFormatModifierPropertiesEXT*") MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifierProperties, OFFSET$pDrmFormatModifierProperties, value);
    }
    
    public @nullable VkDrmFormatModifierPropertiesEXT pDrmFormatModifierProperties() {
        MemorySegment s = pDrmFormatModifierPropertiesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDrmFormatModifierPropertiesEXT(s);
    }

    public void pDrmFormatModifierProperties(@nullable VkDrmFormatModifierPropertiesEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifierPropertiesRaw(s);
    }


    public static final class VkDrmFormatModifierPropertiesListEXTFactory implements IFactory<VkDrmFormatModifierPropertiesListEXT> {
        @Override
        public Class<VkDrmFormatModifierPropertiesListEXT> clazz() {
            return VkDrmFormatModifierPropertiesListEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDrmFormatModifierPropertiesListEXT.LAYOUT;
        }

        @Override
        public VkDrmFormatModifierPropertiesListEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDrmFormatModifierPropertiesListEXT createUninit(MemorySegment segment) {
            return new VkDrmFormatModifierPropertiesListEXT(segment);
        }
    }

    public static final VkDrmFormatModifierPropertiesListEXTFactory FACTORY = new VkDrmFormatModifierPropertiesListEXTFactory();
}