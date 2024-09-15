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

public record VkImportMemoryZirconHandleInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$handleType = PathElement.groupElement(2);
    public static final PathElement PATH$handle = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final OfInt LAYOUT$handle = (OfInt) LAYOUT.select(PATH$handle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);

    public VkImportMemoryZirconHandleInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @unsigned int handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@unsigned int value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }


    public static final class VkImportMemoryZirconHandleInfoFUCHSIAFactory implements IDataTypeFactory<VkImportMemoryZirconHandleInfoFUCHSIA> {
        @Override
        public Class<VkImportMemoryZirconHandleInfoFUCHSIA> clazz() {
            return VkImportMemoryZirconHandleInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImportMemoryZirconHandleInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkImportMemoryZirconHandleInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImportMemoryZirconHandleInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkImportMemoryZirconHandleInfoFUCHSIA(segment);
        }
    }

    public static final VkImportMemoryZirconHandleInfoFUCHSIAFactory FACTORY = new VkImportMemoryZirconHandleInfoFUCHSIAFactory();
}
