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

public record VkDebugUtilsLabelEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLabelName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pLabelName = PathElement.groupElement("pLabelName");
    public static final PathElement PATH$color = PathElement.groupElement("color");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pLabelName = (AddressLayout) LAYOUT.select(PATH$pLabelName);
    public static final SequenceLayout LAYOUT$color = (SequenceLayout) LAYOUT.select(PATH$color);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pLabelName = LAYOUT.byteOffset(PATH$pLabelName);
    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);

    public VkDebugUtilsLabelEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
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

    public @pointer(comment="int8_t*") MemorySegment pLabelNameRaw() {
        return segment.get(LAYOUT$pLabelName, OFFSET$pLabelName);
    }

    public void pLabelNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pLabelName, OFFSET$pLabelName, value);
    }
    
    public BytePtr pLabelName() {
        return new BytePtr(pLabelNameRaw());
    }

    public void pLabelName(BytePtr value) {
        pLabelNameRaw(value.segment());
    }

    public MemorySegment colorRaw() {
        return segment.asSlice(OFFSET$color, LAYOUT$color.byteSize());
    }

    public FloatArray color() {
        return new FloatArray(colorRaw(), LAYOUT$color.elementCount());
    }

    public void color(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, LAYOUT$color.byteSize());
    }


    public static final class VkDebugUtilsLabelEXTFactory implements IFactory<VkDebugUtilsLabelEXT> {
        @Override
        public Class<VkDebugUtilsLabelEXT> clazz() {
            return VkDebugUtilsLabelEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDebugUtilsLabelEXT.LAYOUT;
        }

        @Override
        public VkDebugUtilsLabelEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDebugUtilsLabelEXT createUninit(MemorySegment segment) {
            return new VkDebugUtilsLabelEXT(segment);
        }
    }

    public static final VkDebugUtilsLabelEXTFactory FACTORY = new VkDebugUtilsLabelEXTFactory();
}