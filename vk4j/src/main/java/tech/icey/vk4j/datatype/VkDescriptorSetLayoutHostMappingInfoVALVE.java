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

public record VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorOffset = PathElement.groupElement("descriptorOffset");
    public static final PathElement PATH$descriptorSize = PathElement.groupElement("descriptorSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSize = (OfInt) LAYOUT.select(PATH$descriptorSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorOffset = LAYOUT.byteOffset(PATH$descriptorOffset);
    public static final long OFFSET$descriptorSize = LAYOUT.byteOffset(PATH$descriptorSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSize = LAYOUT$descriptorSize.byteSize();

    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
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

    public @unsigned long descriptorOffset() {
            return NativeLayout.readCSizeT(segment, OFFSET$descriptorOffset);
        }
    
        public void descriptorOffset(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$descriptorOffset, value);
        }

    public @unsigned int descriptorSize() {
        return segment.get(LAYOUT$descriptorSize, OFFSET$descriptorSize);
    }

    public void descriptorSize(@unsigned int value) {
        segment.set(LAYOUT$descriptorSize, OFFSET$descriptorSize, value);
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocate(Arena arena) {
        return new VkDescriptorSetLayoutHostMappingInfoVALVE(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorSetLayoutHostMappingInfoVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutHostMappingInfoVALVE[] ret = new VkDescriptorSetLayoutHostMappingInfoVALVE[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
