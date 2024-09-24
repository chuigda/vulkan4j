package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderPassTransformBeginInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$transform = PathElement.groupElement("transform");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$transform = (OfInt) LAYOUT.select(PATH$transform);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);

    public VkRenderPassTransformBeginInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM);
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

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int transform() {
        return segment.get(LAYOUT$transform, OFFSET$transform);
    }

    public void transform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$transform, OFFSET$transform, value);
    }


    public static final class Factory implements IFactory<VkRenderPassTransformBeginInfoQCOM> {
        @Override
        public Class<VkRenderPassTransformBeginInfoQCOM> clazz() {
            return VkRenderPassTransformBeginInfoQCOM.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkRenderPassTransformBeginInfoQCOM.LAYOUT;
        }

        @Override
        public VkRenderPassTransformBeginInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRenderPassTransformBeginInfoQCOM createUninit(MemorySegment segment) {
            return new VkRenderPassTransformBeginInfoQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
