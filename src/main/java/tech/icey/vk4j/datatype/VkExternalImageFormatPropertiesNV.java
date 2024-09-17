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

public record VkExternalImageFormatPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );

    public static final PathElement PATH$imageFormatProperties = PathElement.groupElement("imageFormatProperties");
    public static final PathElement PATH$externalMemoryFeatures = PathElement.groupElement("externalMemoryFeatures");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("compatibleHandleTypes");

    public static final StructLayout LAYOUT$imageFormatProperties = (StructLayout) LAYOUT.select(PATH$imageFormatProperties);
    public static final OfInt LAYOUT$externalMemoryFeatures = (OfInt) LAYOUT.select(PATH$externalMemoryFeatures);
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = (OfInt) LAYOUT.select(PATH$exportFromImportedHandleTypes);
    public static final OfInt LAYOUT$compatibleHandleTypes = (OfInt) LAYOUT.select(PATH$compatibleHandleTypes);

    public static final long OFFSET$imageFormatProperties = LAYOUT.byteOffset(PATH$imageFormatProperties);
    public static final long OFFSET$externalMemoryFeatures = LAYOUT.byteOffset(PATH$externalMemoryFeatures);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);

    public VkExternalImageFormatPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    }

    public VkImageFormatProperties imageFormatProperties() {
        return new VkImageFormatProperties(segment.asSlice(OFFSET$imageFormatProperties, LAYOUT$imageFormatProperties));
    }

    public void imageFormatProperties(VkImageFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageFormatProperties, LAYOUT$imageFormatProperties.byteSize());
    }

    public @enumtype(VkExternalMemoryFeatureFlagsNV.class) int externalMemoryFeatures() {
        return segment.get(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures);
    }

    public void externalMemoryFeatures(@enumtype(VkExternalMemoryFeatureFlagsNV.class) int value) {
        segment.set(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }


    public static final class VkExternalImageFormatPropertiesNVFactory implements IDataTypeFactory<VkExternalImageFormatPropertiesNV> {
        @Override
        public Class<VkExternalImageFormatPropertiesNV> clazz() {
            return VkExternalImageFormatPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExternalImageFormatPropertiesNV.LAYOUT;
        }

        @Override
        public VkExternalImageFormatPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExternalImageFormatPropertiesNV createUninit(MemorySegment segment) {
            return new VkExternalImageFormatPropertiesNV(segment);
        }
    }

    public static final VkExternalImageFormatPropertiesNVFactory FACTORY = new VkExternalImageFormatPropertiesNVFactory();
}
