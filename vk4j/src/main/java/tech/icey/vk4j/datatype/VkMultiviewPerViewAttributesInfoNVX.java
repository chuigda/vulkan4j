package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkMultiviewPerViewAttributesInfoNVX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewAttributes"),
        ValueLayout.JAVA_INT.withName("perViewAttributesPositionXOnly")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$perViewAttributes = PathElement.groupElement("perViewAttributes");
    public static final PathElement PATH$perViewAttributesPositionXOnly = PathElement.groupElement("perViewAttributesPositionXOnly");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewAttributes = (OfInt) LAYOUT.select(PATH$perViewAttributes);
    public static final OfInt LAYOUT$perViewAttributesPositionXOnly = (OfInt) LAYOUT.select(PATH$perViewAttributesPositionXOnly);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewAttributes = LAYOUT.byteOffset(PATH$perViewAttributes);
    public static final long OFFSET$perViewAttributesPositionXOnly = LAYOUT.byteOffset(PATH$perViewAttributesPositionXOnly);

    public VkMultiviewPerViewAttributesInfoNVX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_ATTRIBUTES_INFO_NVX);
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

    public @unsigned int perViewAttributes() {
        return segment.get(LAYOUT$perViewAttributes, OFFSET$perViewAttributes);
    }

    public void perViewAttributes(@unsigned int value) {
        segment.set(LAYOUT$perViewAttributes, OFFSET$perViewAttributes, value);
    }

    public @unsigned int perViewAttributesPositionXOnly() {
        return segment.get(LAYOUT$perViewAttributesPositionXOnly, OFFSET$perViewAttributesPositionXOnly);
    }

    public void perViewAttributesPositionXOnly(@unsigned int value) {
        segment.set(LAYOUT$perViewAttributesPositionXOnly, OFFSET$perViewAttributesPositionXOnly, value);
    }


    public static final class Factory implements IFactory<VkMultiviewPerViewAttributesInfoNVX> {
        @Override
        public Class<VkMultiviewPerViewAttributesInfoNVX> clazz() {
            return VkMultiviewPerViewAttributesInfoNVX.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkMultiviewPerViewAttributesInfoNVX.LAYOUT;
        }

        @Override
        public VkMultiviewPerViewAttributesInfoNVX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMultiviewPerViewAttributesInfoNVX createUninit(MemorySegment segment) {
            return new VkMultiviewPerViewAttributesInfoNVX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
