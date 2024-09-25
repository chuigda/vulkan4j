package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAccelerationStructureVersionInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pVersionData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pVersionData = PathElement.groupElement("pVersionData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pVersionData = (AddressLayout) LAYOUT.select(PATH$pVersionData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pVersionData = LAYOUT.byteOffset(PATH$pVersionData);

    public VkAccelerationStructureVersionInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR);
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

    public @pointer(comment="uint8_t*") MemorySegment pVersionDataRaw() {
        return segment.get(LAYOUT$pVersionData, OFFSET$pVersionData);
    }

    public void pVersionDataRaw(@pointer(comment="uint8_t*") MemorySegment value) {
        segment.set(LAYOUT$pVersionData, OFFSET$pVersionData, value);
    }
    
    public @unsigned ByteBuffer pVersionData() {
        return new ByteBuffer(pVersionDataRaw());
    }

    public void pVersionData(@unsigned ByteBuffer value) {
        pVersionDataRaw(value.segment());
    }

    public static VkAccelerationStructureVersionInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureVersionInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAccelerationStructureVersionInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureVersionInfoKHR[] ret = new VkAccelerationStructureVersionInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureVersionInfoKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
