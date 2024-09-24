package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSubpassResolvePerformanceQueryEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimal")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$optimal = PathElement.groupElement("optimal");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$optimal = (OfInt) LAYOUT.select(PATH$optimal);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$optimal = LAYOUT.byteOffset(PATH$optimal);

    public VkSubpassResolvePerformanceQueryEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT);
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

    public @unsigned int optimal() {
        return segment.get(LAYOUT$optimal, OFFSET$optimal);
    }

    public void optimal(@unsigned int value) {
        segment.set(LAYOUT$optimal, OFFSET$optimal, value);
    }


    public static final class Factory implements IFactory<VkSubpassResolvePerformanceQueryEXT> {
        @Override
        public Class<VkSubpassResolvePerformanceQueryEXT> clazz() {
            return VkSubpassResolvePerformanceQueryEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSubpassResolvePerformanceQueryEXT.LAYOUT;
        }

        @Override
        public VkSubpassResolvePerformanceQueryEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSubpassResolvePerformanceQueryEXT createUninit(MemorySegment segment) {
            return new VkSubpassResolvePerformanceQueryEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
