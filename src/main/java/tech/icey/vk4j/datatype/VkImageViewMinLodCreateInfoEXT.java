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

public record VkImageViewMinLodCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("minLod")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minLod = PathElement.groupElement("minLod");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfFloat LAYOUT$minLod = (OfFloat) LAYOUT.select(PATH$minLod);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minLod = LAYOUT.byteOffset(PATH$minLod);

    public VkImageViewMinLodCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT);
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

    public float minLod() {
        return segment.get(LAYOUT$minLod, OFFSET$minLod);
    }

    public void minLod(float value) {
        segment.set(LAYOUT$minLod, OFFSET$minLod, value);
    }


    public static final class VkImageViewMinLodCreateInfoEXTFactory implements IDataTypeFactory<VkImageViewMinLodCreateInfoEXT> {
        @Override
        public Class<VkImageViewMinLodCreateInfoEXT> clazz() {
            return VkImageViewMinLodCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageViewMinLodCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkImageViewMinLodCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageViewMinLodCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkImageViewMinLodCreateInfoEXT(segment);
        }
    }

    public static final VkImageViewMinLodCreateInfoEXTFactory FACTORY = new VkImageViewMinLodCreateInfoEXTFactory();
}
