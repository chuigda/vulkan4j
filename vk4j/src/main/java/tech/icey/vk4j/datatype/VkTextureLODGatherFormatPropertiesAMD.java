package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkTextureLODGatherFormatPropertiesAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportsTextureGatherLODBiasAMD")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportsTextureGatherLODBiasAMD = PathElement.groupElement("supportsTextureGatherLODBiasAMD");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportsTextureGatherLODBiasAMD = (OfInt) LAYOUT.select(PATH$supportsTextureGatherLODBiasAMD);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportsTextureGatherLODBiasAMD = LAYOUT.byteOffset(PATH$supportsTextureGatherLODBiasAMD);

    public VkTextureLODGatherFormatPropertiesAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD);
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

    public @unsigned int supportsTextureGatherLODBiasAMD() {
        return segment.get(LAYOUT$supportsTextureGatherLODBiasAMD, OFFSET$supportsTextureGatherLODBiasAMD);
    }

    public void supportsTextureGatherLODBiasAMD(@unsigned int value) {
        segment.set(LAYOUT$supportsTextureGatherLODBiasAMD, OFFSET$supportsTextureGatherLODBiasAMD, value);
    }


    public static final class Factory implements IFactory<VkTextureLODGatherFormatPropertiesAMD> {
        @Override
        public Class<VkTextureLODGatherFormatPropertiesAMD> clazz() {
            return VkTextureLODGatherFormatPropertiesAMD.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkTextureLODGatherFormatPropertiesAMD.LAYOUT;
        }

        @Override
        public VkTextureLODGatherFormatPropertiesAMD create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkTextureLODGatherFormatPropertiesAMD createUninit(MemorySegment segment) {
            return new VkTextureLODGatherFormatPropertiesAMD(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
