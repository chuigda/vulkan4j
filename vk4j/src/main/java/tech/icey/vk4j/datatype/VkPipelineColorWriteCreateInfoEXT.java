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

public record VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorWriteEnables")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$attachmentCount = PathElement.groupElement("attachmentCount");
    public static final PathElement PATH$pColorWriteEnables = PathElement.groupElement("pColorWriteEnables");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pColorWriteEnables = (AddressLayout) LAYOUT.select(PATH$pColorWriteEnables);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pColorWriteEnables = LAYOUT.byteOffset(PATH$pColorWriteEnables);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentCount = LAYOUT$attachmentCount.byteSize();
    public static final long SIZE$pColorWriteEnables = LAYOUT$pColorWriteEnables.byteSize();

    public VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT);
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

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pColorWriteEnablesRaw() {
        return segment.get(LAYOUT$pColorWriteEnables, OFFSET$pColorWriteEnables);
    }

    public void pColorWriteEnablesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pColorWriteEnables, OFFSET$pColorWriteEnables, value);
    }

    public @nullable @unsigned IntBuffer pColorWriteEnables() {
        MemorySegment s = pColorWriteEnablesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pColorWriteEnables(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorWriteEnablesRaw(s);
    }

    public static VkPipelineColorWriteCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineColorWriteCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineColorWriteCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorWriteCreateInfoEXT[] ret = new VkPipelineColorWriteCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineColorWriteCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
