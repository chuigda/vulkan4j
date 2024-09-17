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

public record VkRenderingFragmentDensityMapAttachmentInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("imageLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);

    public VkRenderingFragmentDensityMapAttachmentInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT);
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

    public VkImageView imageView() {
        return new VkImageView(segment.asSlice(OFFSET$imageView, LAYOUT$imageView));
    }

    public void imageView(VkImageView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageView, LAYOUT$imageView.byteSize());
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }


    public static final class VkRenderingFragmentDensityMapAttachmentInfoEXTFactory implements IDataTypeFactory<VkRenderingFragmentDensityMapAttachmentInfoEXT> {
        @Override
        public Class<VkRenderingFragmentDensityMapAttachmentInfoEXT> clazz() {
            return VkRenderingFragmentDensityMapAttachmentInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderingFragmentDensityMapAttachmentInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderingFragmentDensityMapAttachmentInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderingFragmentDensityMapAttachmentInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment);
        }
    }

    public static final VkRenderingFragmentDensityMapAttachmentInfoEXTFactory FACTORY = new VkRenderingFragmentDensityMapAttachmentInfoEXTFactory();
}
