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

public record VkCudaFunctionCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("module"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName")
    );

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
        return new VkCudaModuleNV(segment.asSlice(OFFSET$module, LAYOUT$module));
    }

    public void module(VkCudaModuleNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$module, LAYOUT$module.byteSize());
    }

    public @pointer(comment="int8_t*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }
    
    public BytePtr pName() {
        return new BytePtr(pNameRaw());
    }

    public void pName(BytePtr value) {
        pNameRaw(value.segment());
    }


    public static final class VkCudaFunctionCreateInfoNVFactory implements IFactory<VkCudaFunctionCreateInfoNV> {
        @Override
        public Class<VkCudaFunctionCreateInfoNV> clazz() {
            return VkCudaFunctionCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCudaFunctionCreateInfoNV.LAYOUT;
        }

        @Override
        public VkCudaFunctionCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCudaFunctionCreateInfoNV createUninit(MemorySegment segment) {
            return new VkCudaFunctionCreateInfoNV(segment);
        }
    }

    public static final VkCudaFunctionCreateInfoNVFactory FACTORY = new VkCudaFunctionCreateInfoNVFactory();
}
