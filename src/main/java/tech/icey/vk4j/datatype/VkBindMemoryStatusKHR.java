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

public record VkBindMemoryStatusKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResult")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pResult = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pResult = (AddressLayout) LAYOUT.select(PATH$pResult);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pResult = LAYOUT.byteOffset(PATH$pResult);

    public VkBindMemoryStatusKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR);
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

    public @pointer(target=VkResult.class) MemorySegment pResultRaw() {
        return segment.get(LAYOUT$pResult, OFFSET$pResult);
    }
    
    public void pResultRaw(@pointer(target=VkResult.class) MemorySegment value) {
        segment.set(LAYOUT$pResult, OFFSET$pResult, value);
    }
    
    public IntPtr pResult() {
        return new IntPtr(pResultRaw());
    }
    
    public void pResult(IntPtr value) {
        pResultRaw(value.segment());
    }


    public static final class VkBindMemoryStatusKHRFactory implements IDataTypeFactory<VkBindMemoryStatusKHR> {
        @Override
        public Class<VkBindMemoryStatusKHR> clazz() {
            return VkBindMemoryStatusKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindMemoryStatusKHR.LAYOUT;
        }

        @Override
        public VkBindMemoryStatusKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBindMemoryStatusKHR createUninit(MemorySegment segment) {
            return new VkBindMemoryStatusKHR(segment);
        }
    }

    public static final VkBindMemoryStatusKHRFactory FACTORY = new VkBindMemoryStatusKHRFactory();
}
