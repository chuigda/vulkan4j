package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineTessellationDomainOriginStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("domainOrigin")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$domainOrigin = PathElement.groupElement("domainOrigin");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$domainOrigin = (OfInt) LAYOUT.select(PATH$domainOrigin);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$domainOrigin = LAYOUT.byteOffset(PATH$domainOrigin);

    public VkPipelineTessellationDomainOriginStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO);
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

    public @enumtype(VkTessellationDomainOrigin.class) int domainOrigin() {
        return segment.get(LAYOUT$domainOrigin, OFFSET$domainOrigin);
    }

    public void domainOrigin(@enumtype(VkTessellationDomainOrigin.class) int value) {
        segment.set(LAYOUT$domainOrigin, OFFSET$domainOrigin, value);
    }


    public static final class Factory implements IFactory<VkPipelineTessellationDomainOriginStateCreateInfo> {
        @Override
        public Class<VkPipelineTessellationDomainOriginStateCreateInfo> clazz() {
            return VkPipelineTessellationDomainOriginStateCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineTessellationDomainOriginStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineTessellationDomainOriginStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineTessellationDomainOriginStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineTessellationDomainOriginStateCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
