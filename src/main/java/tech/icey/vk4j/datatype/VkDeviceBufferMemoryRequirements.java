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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceBufferMemoryRequirements(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT).withName("pCreateInfo")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);

    public VkDeviceBufferMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS);
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

    public @pointer(comment="VkBufferCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkBufferCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }
    
    public VkBufferCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferCreateInfo(s);
    }

    public void pCreateInfo(VkBufferCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCreateInfoRaw(s);
    }


    public static final class VkDeviceBufferMemoryRequirementsFactory implements IDataTypeFactory<VkDeviceBufferMemoryRequirements> {
        @Override
        public Class<VkDeviceBufferMemoryRequirements> clazz() {
            return VkDeviceBufferMemoryRequirements.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceBufferMemoryRequirements.LAYOUT;
        }

        @Override
        public VkDeviceBufferMemoryRequirements create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceBufferMemoryRequirements createUninit(MemorySegment segment) {
            return new VkDeviceBufferMemoryRequirements(segment);
        }
    }

    public static final VkDeviceBufferMemoryRequirementsFactory FACTORY = new VkDeviceBufferMemoryRequirementsFactory();
}