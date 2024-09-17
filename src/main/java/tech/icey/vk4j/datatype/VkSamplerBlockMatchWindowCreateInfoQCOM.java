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

public record VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$windowExtent = PathElement.groupElement("windowExtent");
    public static final PathElement PATH$windowCompareMode = PathElement.groupElement("windowCompareMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$windowExtent = (StructLayout) LAYOUT.select(PATH$windowExtent);
    public static final OfInt LAYOUT$windowCompareMode = (OfInt) LAYOUT.select(PATH$windowCompareMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$windowExtent = LAYOUT.byteOffset(PATH$windowExtent);
    public static final long OFFSET$windowCompareMode = LAYOUT.byteOffset(PATH$windowCompareMode);

    public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
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

    public VkExtent2D windowExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$windowExtent, LAYOUT$windowExtent));
    }

    public void windowExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$windowExtent, LAYOUT$windowExtent.byteSize());
    }

    public @enumtype(VkBlockMatchWindowCompareModeQCOM.class) int windowCompareMode() {
        return segment.get(LAYOUT$windowCompareMode, OFFSET$windowCompareMode);
    }

    public void windowCompareMode(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        segment.set(LAYOUT$windowCompareMode, OFFSET$windowCompareMode, value);
    }


    public static final class VkSamplerBlockMatchWindowCreateInfoQCOMFactory implements IDataTypeFactory<VkSamplerBlockMatchWindowCreateInfoQCOM> {
        @Override
        public Class<VkSamplerBlockMatchWindowCreateInfoQCOM> clazz() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.LAYOUT;
        }

        @Override
        public VkSamplerBlockMatchWindowCreateInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerBlockMatchWindowCreateInfoQCOM createUninit(MemorySegment segment) {
            return new VkSamplerBlockMatchWindowCreateInfoQCOM(segment);
        }
    }

    public static final VkSamplerBlockMatchWindowCreateInfoQCOMFactory FACTORY = new VkSamplerBlockMatchWindowCreateInfoQCOMFactory();
}
