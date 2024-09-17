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

public record VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pfnGetInstanceProcAddr = PathElement.groupElement("pfnGetInstanceProcAddr");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pfnGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$pfnGetInstanceProcAddr);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pfnGetInstanceProcAddr = LAYOUT.byteOffset(PATH$pfnGetInstanceProcAddr);

    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG);
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

    public @enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment pfnGetInstanceProcAddr() {
        return segment.get(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr);
    }

    public void pfnGetInstanceProcAddr(@pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment value) {
        segment.set(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr, value);
    }


    public static final class VkDirectDriverLoadingInfoLUNARGFactory implements IDataTypeFactory<VkDirectDriverLoadingInfoLUNARG> {
        @Override
        public Class<VkDirectDriverLoadingInfoLUNARG> clazz() {
            return VkDirectDriverLoadingInfoLUNARG.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDirectDriverLoadingInfoLUNARG.LAYOUT;
        }

        @Override
        public VkDirectDriverLoadingInfoLUNARG create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDirectDriverLoadingInfoLUNARG createUninit(MemorySegment segment) {
            return new VkDirectDriverLoadingInfoLUNARG(segment);
        }
    }

    public static final VkDirectDriverLoadingInfoLUNARGFactory FACTORY = new VkDirectDriverLoadingInfoLUNARGFactory();
}
