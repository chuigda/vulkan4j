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

public record VkShaderModuleValidationCacheCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("validationCache")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$validationCache = PathElement.groupElement("validationCache");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$validationCache = (AddressLayout) LAYOUT.select(PATH$validationCache);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$validationCache = LAYOUT.byteOffset(PATH$validationCache);

    public VkShaderModuleValidationCacheCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT);
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

    public VkValidationCacheEXT validationCache() {
        return new VkValidationCacheEXT(segment.asSlice(OFFSET$validationCache, LAYOUT$validationCache));
    }

    public void validationCache(VkValidationCacheEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$validationCache, LAYOUT$validationCache.byteSize());
    }


    public static final class VkShaderModuleValidationCacheCreateInfoEXTFactory implements IFactory<VkShaderModuleValidationCacheCreateInfoEXT> {
        @Override
        public Class<VkShaderModuleValidationCacheCreateInfoEXT> clazz() {
            return VkShaderModuleValidationCacheCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkShaderModuleValidationCacheCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkShaderModuleValidationCacheCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkShaderModuleValidationCacheCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkShaderModuleValidationCacheCreateInfoEXT(segment);
        }
    }

    public static final VkShaderModuleValidationCacheCreateInfoEXTFactory FACTORY = new VkShaderModuleValidationCacheCreateInfoEXTFactory();
}
