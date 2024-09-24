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

public record VkQueryLowLatencySupportNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pQueriedLowLatencyData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pQueriedLowLatencyData = PathElement.groupElement("pQueriedLowLatencyData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pQueriedLowLatencyData = (AddressLayout) LAYOUT.select(PATH$pQueriedLowLatencyData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pQueriedLowLatencyData = LAYOUT.byteOffset(PATH$pQueriedLowLatencyData);

    public VkQueryLowLatencySupportNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV);
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

    public @pointer(comment="void*") MemorySegment pQueriedLowLatencyData() {
        return segment.get(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData);
    }

    public void pQueriedLowLatencyData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData, value);
    }


    public static final class Factory implements IFactory<VkQueryLowLatencySupportNV> {
        @Override
        public Class<VkQueryLowLatencySupportNV> clazz() {
            return VkQueryLowLatencySupportNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueryLowLatencySupportNV.LAYOUT;
        }

        @Override
        public VkQueryLowLatencySupportNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkQueryLowLatencySupportNV createUninit(MemorySegment segment) {
            return new VkQueryLowLatencySupportNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
