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

public record VkExportMemorySciBufInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pAttributes = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pAttributes = (AddressLayout) LAYOUT.select(PATH$pAttributes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pAttributes = LAYOUT.byteOffset(PATH$pAttributes);

    public VkExportMemorySciBufInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_MEMORY_SCI_BUF_INFO_NV);
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

    public @pointer(comment="void*") MemorySegment pAttributes() {
        return segment.get(LAYOUT$pAttributes, OFFSET$pAttributes);
    }

    public void pAttributes(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pAttributes, OFFSET$pAttributes, value);
    }


    public static final class VkExportMemorySciBufInfoNVFactory implements IDataTypeFactory<VkExportMemorySciBufInfoNV> {
        @Override
        public Class<VkExportMemorySciBufInfoNV> clazz() {
            return VkExportMemorySciBufInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMemorySciBufInfoNV.LAYOUT;
        }

        @Override
        public VkExportMemorySciBufInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExportMemorySciBufInfoNV createUninit(MemorySegment segment) {
            return new VkExportMemorySciBufInfoNV(segment);
        }
    }

    public static final VkExportMemorySciBufInfoNVFactory FACTORY = new VkExportMemorySciBufInfoNVFactory();
}