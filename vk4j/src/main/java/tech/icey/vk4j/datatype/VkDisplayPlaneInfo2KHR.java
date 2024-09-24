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

public record VkDisplayPlaneInfo2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mode"),
        ValueLayout.JAVA_INT.withName("planeIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$planeIndex = PathElement.groupElement("planeIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$mode = (AddressLayout) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$planeIndex = (OfInt) LAYOUT.select(PATH$planeIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$planeIndex = LAYOUT.byteOffset(PATH$planeIndex);

    public VkDisplayPlaneInfo2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR);
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

    public VkDisplayModeKHR mode() {
        return new VkDisplayModeKHR(segment.asSlice(OFFSET$mode, LAYOUT$mode));
    }

    public void mode(VkDisplayModeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$mode, LAYOUT$mode.byteSize());
    }

    public @unsigned int planeIndex() {
        return segment.get(LAYOUT$planeIndex, OFFSET$planeIndex);
    }

    public void planeIndex(@unsigned int value) {
        segment.set(LAYOUT$planeIndex, OFFSET$planeIndex, value);
    }


    public static final class VkDisplayPlaneInfo2KHRFactory implements IFactory<VkDisplayPlaneInfo2KHR> {
        @Override
        public Class<VkDisplayPlaneInfo2KHR> clazz() {
            return VkDisplayPlaneInfo2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayPlaneInfo2KHR.LAYOUT;
        }

        @Override
        public VkDisplayPlaneInfo2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPlaneInfo2KHR createUninit(MemorySegment segment) {
            return new VkDisplayPlaneInfo2KHR(segment);
        }
    }

    public static final VkDisplayPlaneInfo2KHRFactory FACTORY = new VkDisplayPlaneInfo2KHRFactory();
}
