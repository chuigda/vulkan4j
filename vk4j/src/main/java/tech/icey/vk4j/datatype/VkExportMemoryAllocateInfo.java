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

public record VkExportMemoryAllocateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleTypes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$handleTypes = PathElement.groupElement("handleTypes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleTypes = (OfInt) LAYOUT.select(PATH$handleTypes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleTypes = LAYOUT.byteOffset(PATH$handleTypes);

    public VkExportMemoryAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleTypes() {
        return segment.get(LAYOUT$handleTypes, OFFSET$handleTypes);
    }

    public void handleTypes(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleTypes, OFFSET$handleTypes, value);
    }


    public static final class VkExportMemoryAllocateInfoFactory implements IFactory<VkExportMemoryAllocateInfo> {
        @Override
        public Class<VkExportMemoryAllocateInfo> clazz() {
            return VkExportMemoryAllocateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMemoryAllocateInfo.LAYOUT;
        }

        @Override
        public VkExportMemoryAllocateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExportMemoryAllocateInfo createUninit(MemorySegment segment) {
            return new VkExportMemoryAllocateInfo(segment);
        }
    }

    public static final VkExportMemoryAllocateInfoFactory FACTORY = new VkExportMemoryAllocateInfoFactory();
}
