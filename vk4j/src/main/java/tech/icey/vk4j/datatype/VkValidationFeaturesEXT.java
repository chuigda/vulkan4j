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

public record VkValidationFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pEnabledValidationFeatures"),
        ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$enabledValidationFeatureCount = PathElement.groupElement("enabledValidationFeatureCount");
    public static final PathElement PATH$pEnabledValidationFeatures = PathElement.groupElement("pEnabledValidationFeatures");
    public static final PathElement PATH$disabledValidationFeatureCount = PathElement.groupElement("disabledValidationFeatureCount");
    public static final PathElement PATH$pDisabledValidationFeatures = PathElement.groupElement("pDisabledValidationFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$enabledValidationFeatureCount = (OfInt) LAYOUT.select(PATH$enabledValidationFeatureCount);
    public static final AddressLayout LAYOUT$pEnabledValidationFeatures = (AddressLayout) LAYOUT.select(PATH$pEnabledValidationFeatures);
    public static final OfInt LAYOUT$disabledValidationFeatureCount = (OfInt) LAYOUT.select(PATH$disabledValidationFeatureCount);
    public static final AddressLayout LAYOUT$pDisabledValidationFeatures = (AddressLayout) LAYOUT.select(PATH$pDisabledValidationFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enabledValidationFeatureCount = LAYOUT.byteOffset(PATH$enabledValidationFeatureCount);
    public static final long OFFSET$pEnabledValidationFeatures = LAYOUT.byteOffset(PATH$pEnabledValidationFeatures);
    public static final long OFFSET$disabledValidationFeatureCount = LAYOUT.byteOffset(PATH$disabledValidationFeatureCount);
    public static final long OFFSET$pDisabledValidationFeatures = LAYOUT.byteOffset(PATH$pDisabledValidationFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$enabledValidationFeatureCount = LAYOUT$enabledValidationFeatureCount.byteSize();
    public static final long SIZE$pEnabledValidationFeatures = LAYOUT$pEnabledValidationFeatures.byteSize();
    public static final long SIZE$disabledValidationFeatureCount = LAYOUT$disabledValidationFeatureCount.byteSize();
    public static final long SIZE$pDisabledValidationFeatures = LAYOUT$pDisabledValidationFeatures.byteSize();

    public VkValidationFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
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

    public @unsigned int enabledValidationFeatureCount() {
        return segment.get(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount);
    }

    public void enabledValidationFeatureCount(@unsigned int value) {
        segment.set(LAYOUT$enabledValidationFeatureCount, OFFSET$enabledValidationFeatureCount, value);
    }

    public @pointer(target=VkValidationFeatureEnableEXT.class) MemorySegment pEnabledValidationFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures);
    }
    
    public void pEnabledValidationFeaturesRaw(@pointer(target=VkValidationFeatureEnableEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pEnabledValidationFeatures, OFFSET$pEnabledValidationFeatures, value);
    }
    
    public @nullable IntBuffer pEnabledValidationFeatures() {
        MemorySegment s = pEnabledValidationFeaturesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pEnabledValidationFeatures(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEnabledValidationFeaturesRaw(s);
    }

    public @unsigned int disabledValidationFeatureCount() {
        return segment.get(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount);
    }

    public void disabledValidationFeatureCount(@unsigned int value) {
        segment.set(LAYOUT$disabledValidationFeatureCount, OFFSET$disabledValidationFeatureCount, value);
    }

    public @pointer(target=VkValidationFeatureDisableEXT.class) MemorySegment pDisabledValidationFeaturesRaw() {
        return segment.get(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures);
    }
    
    public void pDisabledValidationFeaturesRaw(@pointer(target=VkValidationFeatureDisableEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDisabledValidationFeatures, OFFSET$pDisabledValidationFeatures, value);
    }
    
    public @nullable IntBuffer pDisabledValidationFeatures() {
        MemorySegment s = pDisabledValidationFeaturesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pDisabledValidationFeatures(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationFeaturesRaw(s);
    }

    public static VkValidationFeaturesEXT allocate(Arena arena) {
        return new VkValidationFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkValidationFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkValidationFeaturesEXT[] ret = new VkValidationFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkValidationFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
