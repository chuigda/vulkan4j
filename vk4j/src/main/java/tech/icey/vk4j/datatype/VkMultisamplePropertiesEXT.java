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

public record VkMultisamplePropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxSampleLocationGridSize = PathElement.groupElement("maxSampleLocationGridSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$maxSampleLocationGridSize = (StructLayout) LAYOUT.select(PATH$maxSampleLocationGridSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxSampleLocationGridSize = LAYOUT.byteOffset(PATH$maxSampleLocationGridSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxSampleLocationGridSize = LAYOUT$maxSampleLocationGridSize.byteSize();

    public VkMultisamplePropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkExtent2D maxSampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize));
    }

    public void maxSampleLocationGridSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSampleLocationGridSize, SIZE$maxSampleLocationGridSize);
    }

    public static VkMultisamplePropertiesEXT allocate(Arena arena) {
        return new VkMultisamplePropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMultisamplePropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultisamplePropertiesEXT[] ret = new VkMultisamplePropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMultisamplePropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
