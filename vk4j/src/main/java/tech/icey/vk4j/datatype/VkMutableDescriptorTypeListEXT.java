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

public record VkMutableDescriptorTypeListEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorTypes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$descriptorTypeCount = PathElement.groupElement("descriptorTypeCount");
    public static final PathElement PATH$pDescriptorTypes = PathElement.groupElement("pDescriptorTypes");

    public static final OfInt LAYOUT$descriptorTypeCount = (OfInt) LAYOUT.select(PATH$descriptorTypeCount);
    public static final AddressLayout LAYOUT$pDescriptorTypes = (AddressLayout) LAYOUT.select(PATH$pDescriptorTypes);

    public static final long OFFSET$descriptorTypeCount = LAYOUT.byteOffset(PATH$descriptorTypeCount);
    public static final long OFFSET$pDescriptorTypes = LAYOUT.byteOffset(PATH$pDescriptorTypes);

    public static final long SIZE$descriptorTypeCount = LAYOUT$descriptorTypeCount.byteSize();
    public static final long SIZE$pDescriptorTypes = LAYOUT$pDescriptorTypes.byteSize();

    public VkMutableDescriptorTypeListEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int descriptorTypeCount() {
        return segment.get(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount);
    }

    public void descriptorTypeCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount, value);
    }

    public @pointer(target=VkDescriptorType.class) MemorySegment pDescriptorTypesRaw() {
        return segment.get(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes);
    }
    
    public void pDescriptorTypesRaw(@pointer(target=VkDescriptorType.class) MemorySegment value) {
        segment.set(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes, value);
    }
    
    public @nullable IntBuffer pDescriptorTypes() {
        MemorySegment s = pDescriptorTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pDescriptorTypes(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorTypesRaw(s);
    }

    public static VkMutableDescriptorTypeListEXT allocate(Arena arena) {
        return new VkMutableDescriptorTypeListEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMutableDescriptorTypeListEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMutableDescriptorTypeListEXT[] ret = new VkMutableDescriptorTypeListEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMutableDescriptorTypeListEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
