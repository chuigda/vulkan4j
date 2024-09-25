package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.enumtype.VkDisplayPowerStateEXT;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT;

public record VkDisplayPowerInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("powerState")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$powerState = PathElement.groupElement("powerState");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$powerState = (OfInt) LAYOUT.select(PATH$powerState);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$powerState = LAYOUT.byteOffset(PATH$powerState);

    public VkDisplayPowerInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT);
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

    public @enumtype(VkDisplayPowerStateEXT.class) int powerState() {
        return segment.get(LAYOUT$powerState, OFFSET$powerState);
    }

    public void powerState(@enumtype(VkDisplayPowerStateEXT.class) int value) {
        segment.set(LAYOUT$powerState, OFFSET$powerState, value);
    }


    public static final class Factory implements IFactory<VkDisplayPowerInfoEXT> {
        @Override
        public Class<VkDisplayPowerInfoEXT> clazz() {
            return VkDisplayPowerInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDisplayPowerInfoEXT.LAYOUT;
        }

        @Override
        public VkDisplayPowerInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPowerInfoEXT createUninit(MemorySegment segment) {
            return new VkDisplayPowerInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
