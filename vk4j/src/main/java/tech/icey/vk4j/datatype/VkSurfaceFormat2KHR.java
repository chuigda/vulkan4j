package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSurfaceFormat2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surfaceFormat = PathElement.groupElement("surfaceFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$surfaceFormat = (StructLayout) LAYOUT.select(PATH$surfaceFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surfaceFormat = LAYOUT.byteOffset(PATH$surfaceFormat);

    public VkSurfaceFormat2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR);
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

    public VkSurfaceFormatKHR surfaceFormat() {
        return new VkSurfaceFormatKHR(segment.asSlice(OFFSET$surfaceFormat, LAYOUT$surfaceFormat));
    }

    public void surfaceFormat(VkSurfaceFormatKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surfaceFormat, LAYOUT$surfaceFormat.byteSize());
    }


    public static final class Factory implements IFactory<VkSurfaceFormat2KHR> {
        @Override
        public Class<VkSurfaceFormat2KHR> clazz() {
            return VkSurfaceFormat2KHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSurfaceFormat2KHR.LAYOUT;
        }

        @Override
        public VkSurfaceFormat2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceFormat2KHR createUninit(MemorySegment segment) {
            return new VkSurfaceFormat2KHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
