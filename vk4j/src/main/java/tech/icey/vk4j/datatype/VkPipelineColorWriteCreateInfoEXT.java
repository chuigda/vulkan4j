package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorWriteEnables")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("attachmentCount");
    public static final PathElement PATH$pColorWriteEnables = PathElement.groupElement("pColorWriteEnables");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pColorWriteEnables = (AddressLayout) LAYOUT.select(PATH$pColorWriteEnables);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pColorWriteEnables = LAYOUT.byteOffset(PATH$pColorWriteEnables);

    public VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT);
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

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pColorWriteEnablesRaw() {
        return segment.get(LAYOUT$pColorWriteEnables, OFFSET$pColorWriteEnables);
    }

    public void pColorWriteEnablesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pColorWriteEnables, OFFSET$pColorWriteEnables, value);
    }

    public @unsigned IntPtr pColorWriteEnables() {
        return new IntPtr(pColorWriteEnablesRaw());
    }

    public void pColorWriteEnables(@unsigned IntPtr value) {
        pColorWriteEnablesRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkPipelineColorWriteCreateInfoEXT> {
        @Override
        public Class<VkPipelineColorWriteCreateInfoEXT> clazz() {
            return VkPipelineColorWriteCreateInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineColorWriteCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkPipelineColorWriteCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineColorWriteCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkPipelineColorWriteCreateInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
