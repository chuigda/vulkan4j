package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImportMetalBufferInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mtlBuffer = PathElement.groupElement("mtlBuffer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$mtlBuffer = (AddressLayout) LAYOUT.select(PATH$mtlBuffer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mtlBuffer = LAYOUT.byteOffset(PATH$mtlBuffer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mtlBuffer = LAYOUT$mtlBuffer.byteSize();

    public VkImportMetalBufferInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment mtlBuffer() {
        return segment.get(LAYOUT$mtlBuffer, OFFSET$mtlBuffer);
    }

    public void mtlBuffer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlBuffer, OFFSET$mtlBuffer, value);
    }

    public static VkImportMetalBufferInfoEXT allocate(Arena arena) {
        return new VkImportMetalBufferInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkImportMetalBufferInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMetalBufferInfoEXT[] ret = new VkImportMetalBufferInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportMetalBufferInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
