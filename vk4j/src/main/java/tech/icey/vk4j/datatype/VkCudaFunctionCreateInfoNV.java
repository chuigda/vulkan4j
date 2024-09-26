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

public record VkCudaFunctionCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("module"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$module = PathElement.groupElement("module");
    public static final PathElement PATH$pName = PathElement.groupElement("pName");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$module = (AddressLayout) LAYOUT.select(PATH$module);
    public static final AddressLayout LAYOUT$pName = (AddressLayout) LAYOUT.select(PATH$pName);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$module = LAYOUT.byteOffset(PATH$module);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$module = LAYOUT$module.byteSize();
    public static final long SIZE$pName = LAYOUT$pName.byteSize();

    public VkCudaFunctionCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV);
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

    public VkCudaModuleNV module() {
        return new VkCudaModuleNV(segment.get(LAYOUT$module, OFFSET$module));
    }

    public void module(VkCudaModuleNV value) {
        segment.set(LAYOUT$module, OFFSET$module, value.segment());
    }

    public @pointer(comment="int8_t*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    public @nullable ByteBuffer pName() {
        MemorySegment s = pNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pName(@nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNameRaw(s);
    }

    public static VkCudaFunctionCreateInfoNV allocate(Arena arena) {
        return new VkCudaFunctionCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkCudaFunctionCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCudaFunctionCreateInfoNV[] ret = new VkCudaFunctionCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCudaFunctionCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
