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

public record VkShadingRatePaletteNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pShadingRatePaletteEntries")
    );

    public static final PathElement PATH$shadingRatePaletteEntryCount = PathElement.groupElement("shadingRatePaletteEntryCount");
    public static final PathElement PATH$pShadingRatePaletteEntries = PathElement.groupElement("pShadingRatePaletteEntries");

    public static final OfInt LAYOUT$shadingRatePaletteEntryCount = (OfInt) LAYOUT.select(PATH$shadingRatePaletteEntryCount);
    public static final AddressLayout LAYOUT$pShadingRatePaletteEntries = (AddressLayout) LAYOUT.select(PATH$pShadingRatePaletteEntries);

    public static final long OFFSET$shadingRatePaletteEntryCount = LAYOUT.byteOffset(PATH$shadingRatePaletteEntryCount);
    public static final long OFFSET$pShadingRatePaletteEntries = LAYOUT.byteOffset(PATH$pShadingRatePaletteEntries);

    public VkShadingRatePaletteNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int shadingRatePaletteEntryCount() {
        return segment.get(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount);
    }

    public void shadingRatePaletteEntryCount(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount, value);
    }

    public @pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment pShadingRatePaletteEntriesRaw() {
        return segment.get(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries);
    }
    
    public void pShadingRatePaletteEntriesRaw(@pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment value) {
        segment.set(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries, value);
    }
    
    public @nullable IntPtr pShadingRatePaletteEntries() {
        MemorySegment s = pShadingRatePaletteEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntPtr(s);
    }
    
    public void pShadingRatePaletteEntries(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePaletteEntriesRaw(s);
    }


    public static final class VkShadingRatePaletteNVFactory implements IDataTypeFactory<VkShadingRatePaletteNV> {
        @Override
        public Class<VkShadingRatePaletteNV> clazz() {
            return VkShadingRatePaletteNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkShadingRatePaletteNV.LAYOUT;
        }

        @Override
        public VkShadingRatePaletteNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkShadingRatePaletteNV createUninit(MemorySegment segment) {
            return new VkShadingRatePaletteNV(segment);
        }
    }

    public static final VkShadingRatePaletteNVFactory FACTORY = new VkShadingRatePaletteNVFactory();
}
