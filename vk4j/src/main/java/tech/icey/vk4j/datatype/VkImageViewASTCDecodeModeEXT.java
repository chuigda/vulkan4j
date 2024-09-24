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

public record VkImageViewASTCDecodeModeEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeMode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$decodeMode = PathElement.groupElement("decodeMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$decodeMode = (OfInt) LAYOUT.select(PATH$decodeMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$decodeMode = LAYOUT.byteOffset(PATH$decodeMode);

    public VkImageViewASTCDecodeModeEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
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

    public @enumtype(VkFormat.class) int decodeMode() {
        return segment.get(LAYOUT$decodeMode, OFFSET$decodeMode);
    }

    public void decodeMode(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$decodeMode, OFFSET$decodeMode, value);
    }


    public static final class VkImageViewASTCDecodeModeEXTFactory implements IFactory<VkImageViewASTCDecodeModeEXT> {
        @Override
        public Class<VkImageViewASTCDecodeModeEXT> clazz() {
            return VkImageViewASTCDecodeModeEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageViewASTCDecodeModeEXT.LAYOUT;
        }

        @Override
        public VkImageViewASTCDecodeModeEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageViewASTCDecodeModeEXT createUninit(MemorySegment segment) {
            return new VkImageViewASTCDecodeModeEXT(segment);
        }
    }

    public static final VkImageViewASTCDecodeModeEXTFactory FACTORY = new VkImageViewASTCDecodeModeEXTFactory();
}
