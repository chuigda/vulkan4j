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

public record VkRenderPassCreationControlEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disallowMerging")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$disallowMerging = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disallowMerging = (OfInt) LAYOUT.select(PATH$disallowMerging);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disallowMerging = LAYOUT.byteOffset(PATH$disallowMerging);

    public VkRenderPassCreationControlEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT);
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

    public @unsigned int disallowMerging() {
        return segment.get(LAYOUT$disallowMerging, OFFSET$disallowMerging);
    }

    public void disallowMerging(@unsigned int value) {
        segment.set(LAYOUT$disallowMerging, OFFSET$disallowMerging, value);
    }


    public static final class VkRenderPassCreationControlEXTFactory implements IDataTypeFactory<VkRenderPassCreationControlEXT> {
        @Override
        public Class<VkRenderPassCreationControlEXT> clazz() {
            return VkRenderPassCreationControlEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassCreationControlEXT.LAYOUT;
        }

        @Override
        public VkRenderPassCreationControlEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassCreationControlEXT createUninit(MemorySegment segment) {
            return new VkRenderPassCreationControlEXT(segment);
        }
    }

    public static final VkRenderPassCreationControlEXTFactory FACTORY = new VkRenderPassCreationControlEXTFactory();
}