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

public record VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$fragmentDensityMapAttachment = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentDensityMapAttachment = (StructLayout) LAYOUT.select(PATH$fragmentDensityMapAttachment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMapAttachment = LAYOUT.byteOffset(PATH$fragmentDensityMapAttachment);

    public VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
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

    public VkAttachmentReference fragmentDensityMapAttachment() {
        return new VkAttachmentReference(segment.asSlice(OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment));
    }

    public void fragmentDensityMapAttachment(VkAttachmentReference value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment.byteSize());
    }


    public static final class VkRenderPassFragmentDensityMapCreateInfoEXTFactory implements IDataTypeFactory<VkRenderPassFragmentDensityMapCreateInfoEXT> {
        @Override
        public Class<VkRenderPassFragmentDensityMapCreateInfoEXT> clazz() {
            return VkRenderPassFragmentDensityMapCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassFragmentDensityMapCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderPassFragmentDensityMapCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassFragmentDensityMapCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderPassFragmentDensityMapCreateInfoEXT(segment);
        }
    }

    public static final VkRenderPassFragmentDensityMapCreateInfoEXTFactory FACTORY = new VkRenderPassFragmentDensityMapCreateInfoEXTFactory();
}