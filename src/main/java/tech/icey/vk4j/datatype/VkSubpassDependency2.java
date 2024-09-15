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

public record VkSubpassDependency2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("viewOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$srcSubpass = PathElement.groupElement(2);
    public static final PathElement PATH$dstSubpass = PathElement.groupElement(3);
    public static final PathElement PATH$srcStageMask = PathElement.groupElement(4);
    public static final PathElement PATH$dstStageMask = PathElement.groupElement(5);
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement(6);
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement(7);
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement(8);
    public static final PathElement PATH$viewOffset = PathElement.groupElement(9);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$srcSubpass = (OfInt) LAYOUT.select(PATH$srcSubpass);
    public static final OfInt LAYOUT$dstSubpass = (OfInt) LAYOUT.select(PATH$dstSubpass);
    public static final OfInt LAYOUT$srcStageMask = (OfInt) LAYOUT.select(PATH$srcStageMask);
    public static final OfInt LAYOUT$dstStageMask = (OfInt) LAYOUT.select(PATH$dstStageMask);
    public static final OfInt LAYOUT$srcAccessMask = (OfInt) LAYOUT.select(PATH$srcAccessMask);
    public static final OfInt LAYOUT$dstAccessMask = (OfInt) LAYOUT.select(PATH$dstAccessMask);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);
    public static final OfInt LAYOUT$viewOffset = (OfInt) LAYOUT.select(PATH$viewOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubpass = LAYOUT.byteOffset(PATH$srcSubpass);
    public static final long OFFSET$dstSubpass = LAYOUT.byteOffset(PATH$dstSubpass);
    public static final long OFFSET$srcStageMask = LAYOUT.byteOffset(PATH$srcStageMask);
    public static final long OFFSET$dstStageMask = LAYOUT.byteOffset(PATH$dstStageMask);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
    public static final long OFFSET$viewOffset = LAYOUT.byteOffset(PATH$viewOffset);

    public VkSubpassDependency2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_DEPENDENCY_2);
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

    public @unsigned int srcSubpass() {
        return segment.get(LAYOUT$srcSubpass, OFFSET$srcSubpass);
    }

    public void srcSubpass(@unsigned int value) {
        segment.set(LAYOUT$srcSubpass, OFFSET$srcSubpass, value);
    }

    public @unsigned int dstSubpass() {
        return segment.get(LAYOUT$dstSubpass, OFFSET$dstSubpass);
    }

    public void dstSubpass(@unsigned int value) {
        segment.set(LAYOUT$dstSubpass, OFFSET$dstSubpass, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int srcStageMask() {
        return segment.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);
    }

    public void srcStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int dstStageMask() {
        return segment.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);
    }

    public void dstStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);
    }

    public @enumtype(VkAccessFlags.class) int srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @enumtype(VkAccessFlags.class) int dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public @enumtype(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@enumtype(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public int viewOffset() {
        return segment.get(LAYOUT$viewOffset, OFFSET$viewOffset);
    }

    public void viewOffset(int value) {
        segment.set(LAYOUT$viewOffset, OFFSET$viewOffset, value);
    }


    public static final class VkSubpassDependency2Factory implements IDataTypeFactory<VkSubpassDependency2> {
        @Override
        public Class<VkSubpassDependency2> clazz() {
            return VkSubpassDependency2.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubpassDependency2.LAYOUT;
        }

        @Override
        public VkSubpassDependency2 create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSubpassDependency2 createUninit(MemorySegment segment) {
            return new VkSubpassDependency2(segment);
        }
    }

    public static final VkSubpassDependency2Factory FACTORY = new VkSubpassDependency2Factory();
}
