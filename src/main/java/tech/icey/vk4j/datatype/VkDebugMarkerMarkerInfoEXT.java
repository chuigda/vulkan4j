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

public record VkDebugMarkerMarkerInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pMarkerName = PathElement.groupElement(2);
    public static final PathElement PATH$color = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pMarkerName = (AddressLayout) LAYOUT.select(PATH$pMarkerName);
    public static final SequenceLayout LAYOUT$color = (SequenceLayout) LAYOUT.select(PATH$color);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pMarkerName = LAYOUT.byteOffset(PATH$pMarkerName);
    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);

    public VkDebugMarkerMarkerInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
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

    public @pointer(comment="int8_t*") MemorySegment pMarkerNameRaw() {
        return segment.get(LAYOUT$pMarkerName, OFFSET$pMarkerName);
    }

    public void pMarkerNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMarkerName, OFFSET$pMarkerName, value);
    }
    
    public BytePtr pMarkerName() {
        return new BytePtr(pMarkerNameRaw());
    }

    public void pMarkerName(BytePtr value) {
        pMarkerNameRaw(value.segment());
    }

    public MemorySegment colorRaw() {
        return segment.asSlice(OFFSET$color, LAYOUT$color.byteSize());
    }
        
    public FloatArray color(int index) {
        return new FloatArray(colorRaw(), LAYOUT$color.elementCount());
    }
    
    public void color(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, LAYOUT$color.byteSize());
    }


    public static final class VkDebugMarkerMarkerInfoEXTFactory implements IDataTypeFactory<VkDebugMarkerMarkerInfoEXT> {
        @Override
        public Class<VkDebugMarkerMarkerInfoEXT> clazz() {
            return VkDebugMarkerMarkerInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDebugMarkerMarkerInfoEXT.LAYOUT;
        }

        @Override
        public VkDebugMarkerMarkerInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDebugMarkerMarkerInfoEXT createUninit(MemorySegment segment) {
            return new VkDebugMarkerMarkerInfoEXT(segment);
        }
    }

    public static final VkDebugMarkerMarkerInfoEXTFactory FACTORY = new VkDebugMarkerMarkerInfoEXTFactory();
}
