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

public record VkLayerSettingEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLayerName"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pSettingName"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("valueCount"),
        ValueLayout.ADDRESS.withName("pValues")
    );

    public static final PathElement PATH$pLayerName = PathElement.groupElement("pLayerName");
    public static final PathElement PATH$pSettingName = PathElement.groupElement("pSettingName");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$valueCount = PathElement.groupElement("valueCount");
    public static final PathElement PATH$pValues = PathElement.groupElement("pValues");

    public static final AddressLayout LAYOUT$pLayerName = (AddressLayout) LAYOUT.select(PATH$pLayerName);
    public static final AddressLayout LAYOUT$pSettingName = (AddressLayout) LAYOUT.select(PATH$pSettingName);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$valueCount = (OfInt) LAYOUT.select(PATH$valueCount);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long OFFSET$pLayerName = LAYOUT.byteOffset(PATH$pLayerName);
    public static final long OFFSET$pSettingName = LAYOUT.byteOffset(PATH$pSettingName);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$valueCount = LAYOUT.byteOffset(PATH$valueCount);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public VkLayerSettingEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @pointer(comment="int8_t*") MemorySegment pLayerNameRaw() {
        return segment.get(LAYOUT$pLayerName, OFFSET$pLayerName);
    }

    public void pLayerNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pLayerName, OFFSET$pLayerName, value);
    }
    
    public BytePtr pLayerName() {
        return new BytePtr(pLayerNameRaw());
    }

    public void pLayerName(BytePtr value) {
        pLayerNameRaw(value.segment());
    }

    public @pointer(comment="int8_t*") MemorySegment pSettingNameRaw() {
        return segment.get(LAYOUT$pSettingName, OFFSET$pSettingName);
    }

    public void pSettingNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pSettingName, OFFSET$pSettingName, value);
    }
    
    public BytePtr pSettingName() {
        return new BytePtr(pSettingNameRaw());
    }

    public void pSettingName(BytePtr value) {
        pSettingNameRaw(value.segment());
    }

    public @enumtype(VkLayerSettingTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkLayerSettingTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int valueCount() {
        return segment.get(LAYOUT$valueCount, OFFSET$valueCount);
    }

    public void valueCount(@unsigned int value) {
        segment.set(LAYOUT$valueCount, OFFSET$valueCount, value);
    }

    public @pointer(comment="void*") MemorySegment pValues() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValues(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }


    public static final class VkLayerSettingEXTFactory implements IFactory<VkLayerSettingEXT> {
        @Override
        public Class<VkLayerSettingEXT> clazz() {
            return VkLayerSettingEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkLayerSettingEXT.LAYOUT;
        }

        @Override
        public VkLayerSettingEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkLayerSettingEXT createUninit(MemorySegment segment) {
            return new VkLayerSettingEXT(segment);
        }
    }

    public static final VkLayerSettingEXTFactory FACTORY = new VkLayerSettingEXTFactory();
}
