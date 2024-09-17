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

public record VkInitializePerformanceApiInfoINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pUserData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

    public VkInitializePerformanceApiInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL);
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

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }


    public static final class VkInitializePerformanceApiInfoINTELFactory implements IDataTypeFactory<VkInitializePerformanceApiInfoINTEL> {
        @Override
        public Class<VkInitializePerformanceApiInfoINTEL> clazz() {
            return VkInitializePerformanceApiInfoINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkInitializePerformanceApiInfoINTEL.LAYOUT;
        }

        @Override
        public VkInitializePerformanceApiInfoINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkInitializePerformanceApiInfoINTEL createUninit(MemorySegment segment) {
            return new VkInitializePerformanceApiInfoINTEL(segment);
        }
    }

    public static final VkInitializePerformanceApiInfoINTELFactory FACTORY = new VkInitializePerformanceApiInfoINTELFactory();
}
