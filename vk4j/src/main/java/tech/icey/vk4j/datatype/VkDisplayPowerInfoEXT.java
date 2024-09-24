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


    public static final class VkDisplayPowerInfoEXTFactory implements IFactory<VkDisplayPowerInfoEXT> {
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

    public static final VkDisplayPowerInfoEXTFactory FACTORY = new VkDisplayPowerInfoEXTFactory();
}
