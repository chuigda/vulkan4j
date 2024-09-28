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

public record VkDescriptorGetInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        VkDescriptorDataEXT.LAYOUT.withName("data")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public VkDescriptorGetInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT);
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

    public @enumtype(VkDescriptorType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public VkDescriptorDataEXT data() {
        return new VkDescriptorDataEXT(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkDescriptorDataEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public static VkDescriptorGetInfoEXT allocate(Arena arena) {
        return new VkDescriptorGetInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorGetInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorGetInfoEXT[] ret = new VkDescriptorGetInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorGetInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
