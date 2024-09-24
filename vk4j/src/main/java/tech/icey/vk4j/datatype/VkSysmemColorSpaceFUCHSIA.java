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

public record VkSysmemColorSpaceFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$colorSpace = PathElement.groupElement("colorSpace");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);

    public VkSysmemColorSpaceFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SYSMEM_COLOR_SPACE_FUCHSIA);
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

    public @unsigned int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public void colorSpace(@unsigned int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
    }


    public static final class VkSysmemColorSpaceFUCHSIAFactory implements IFactory<VkSysmemColorSpaceFUCHSIA> {
        @Override
        public Class<VkSysmemColorSpaceFUCHSIA> clazz() {
            return VkSysmemColorSpaceFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSysmemColorSpaceFUCHSIA.LAYOUT;
        }

        @Override
        public VkSysmemColorSpaceFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSysmemColorSpaceFUCHSIA createUninit(MemorySegment segment) {
            return new VkSysmemColorSpaceFUCHSIA(segment);
        }
    }

    public static final VkSysmemColorSpaceFUCHSIAFactory FACTORY = new VkSysmemColorSpaceFUCHSIAFactory();
}
