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

public record VkExportMemoryWin32HandleInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("name")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pAttributes = PathElement.groupElement(2);
    public static final PathElement PATH$dwAccess = PathElement.groupElement(3);
    public static final PathElement PATH$name = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pAttributes = (AddressLayout) LAYOUT.select(PATH$pAttributes);
    public static final OfInt LAYOUT$dwAccess = (OfInt) LAYOUT.select(PATH$dwAccess);
    public static final AddressLayout LAYOUT$name = (AddressLayout) LAYOUT.select(PATH$name);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pAttributes = LAYOUT.byteOffset(PATH$pAttributes);
    public static final long OFFSET$dwAccess = LAYOUT.byteOffset(PATH$dwAccess);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);

    public VkExportMemoryWin32HandleInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
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

    public @unsigned int dwAccess() {
        return segment.get(LAYOUT$dwAccess, OFFSET$dwAccess);
    }

    public void dwAccess(@unsigned int value) {
        segment.set(LAYOUT$dwAccess, OFFSET$dwAccess, value);
    }

    public @pointer(comment="uint16_t*") MemorySegment nameRaw() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void nameRaw(@pointer(comment="uint16_t*") MemorySegment value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }
    
    public @unsigned ShortPtr name() {
        return new ShortPtr(nameRaw());
    }

    public void name(@unsigned ShortPtr value) {
        nameRaw(value.segment());
    }


    public static final class VkExportMemoryWin32HandleInfoKHRFactory implements IDataTypeFactory<VkExportMemoryWin32HandleInfoKHR> {
        @Override
        public Class<VkExportMemoryWin32HandleInfoKHR> clazz() {
            return VkExportMemoryWin32HandleInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMemoryWin32HandleInfoKHR.LAYOUT;
        }

        @Override
        public VkExportMemoryWin32HandleInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExportMemoryWin32HandleInfoKHR createUninit(MemorySegment segment) {
            return new VkExportMemoryWin32HandleInfoKHR(segment);
        }
    }

    public static final VkExportMemoryWin32HandleInfoKHRFactory FACTORY = new VkExportMemoryWin32HandleInfoKHRFactory();
}
