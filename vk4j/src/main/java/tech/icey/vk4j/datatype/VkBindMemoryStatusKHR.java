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

public record VkBindMemoryStatusKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResult")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pResult = PathElement.groupElement("pResult");

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
    
    public @nullable IntBuffer pResult() {
        MemorySegment s = pResultRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pResult(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResultRaw(s);
    }

    public static VkBindMemoryStatusKHR allocate(Arena arena) {
        return new VkBindMemoryStatusKHR(arena.allocate(LAYOUT));
    }
    
    public static VkBindMemoryStatusKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindMemoryStatusKHR[] ret = new VkBindMemoryStatusKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindMemoryStatusKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
