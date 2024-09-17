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

public record VkPresentFrameTokenGGP(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("frameToken")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$frameToken = PathElement.groupElement("frameToken");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$frameToken = (OfInt) LAYOUT.select(PATH$frameToken);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$frameToken = LAYOUT.byteOffset(PATH$frameToken);

    public VkPresentFrameTokenGGP(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_FRAME_TOKEN_GGP);
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

    public @unsigned int frameToken() {
        return segment.get(LAYOUT$frameToken, OFFSET$frameToken);
    }

    public void frameToken(@unsigned int value) {
        segment.set(LAYOUT$frameToken, OFFSET$frameToken, value);
    }


    public static final class VkPresentFrameTokenGGPFactory implements IFactory<VkPresentFrameTokenGGP> {
        @Override
        public Class<VkPresentFrameTokenGGP> clazz() {
            return VkPresentFrameTokenGGP.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPresentFrameTokenGGP.LAYOUT;
        }

        @Override
        public VkPresentFrameTokenGGP create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPresentFrameTokenGGP createUninit(MemorySegment segment) {
            return new VkPresentFrameTokenGGP(segment);
        }
    }

    public static final VkPresentFrameTokenGGPFactory FACTORY = new VkPresentFrameTokenGGPFactory();
}
