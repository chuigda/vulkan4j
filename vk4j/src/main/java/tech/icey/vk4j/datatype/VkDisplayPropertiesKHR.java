package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkDisplayPropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("displayName"),
        VkExtent2D.LAYOUT.withName("physicalDimensions"),
        VkExtent2D.LAYOUT.withName("physicalResolution"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("planeReorderPossible"),
        ValueLayout.JAVA_INT.withName("persistentContent")
    );

    public static final PathElement PATH$display = PathElement.groupElement("display");
    public static final PathElement PATH$displayName = PathElement.groupElement("displayName");
    public static final PathElement PATH$physicalDimensions = PathElement.groupElement("physicalDimensions");
    public static final PathElement PATH$physicalResolution = PathElement.groupElement("physicalResolution");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("supportedTransforms");
    public static final PathElement PATH$planeReorderPossible = PathElement.groupElement("planeReorderPossible");
    public static final PathElement PATH$persistentContent = PathElement.groupElement("persistentContent");

    public static final AddressLayout LAYOUT$display = (AddressLayout) LAYOUT.select(PATH$display);
    public static final AddressLayout LAYOUT$displayName = (AddressLayout) LAYOUT.select(PATH$displayName);
    public static final StructLayout LAYOUT$physicalDimensions = (StructLayout) LAYOUT.select(PATH$physicalDimensions);
    public static final StructLayout LAYOUT$physicalResolution = (StructLayout) LAYOUT.select(PATH$physicalResolution);
    public static final OfInt LAYOUT$supportedTransforms = (OfInt) LAYOUT.select(PATH$supportedTransforms);
    public static final OfInt LAYOUT$planeReorderPossible = (OfInt) LAYOUT.select(PATH$planeReorderPossible);
    public static final OfInt LAYOUT$persistentContent = (OfInt) LAYOUT.select(PATH$persistentContent);

    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$displayName = LAYOUT.byteOffset(PATH$displayName);
    public static final long OFFSET$physicalDimensions = LAYOUT.byteOffset(PATH$physicalDimensions);
    public static final long OFFSET$physicalResolution = LAYOUT.byteOffset(PATH$physicalResolution);
    public static final long OFFSET$supportedTransforms = LAYOUT.byteOffset(PATH$supportedTransforms);
    public static final long OFFSET$planeReorderPossible = LAYOUT.byteOffset(PATH$planeReorderPossible);
    public static final long OFFSET$persistentContent = LAYOUT.byteOffset(PATH$persistentContent);

    public VkDisplayPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkDisplayKHR display() {
        return new VkDisplayKHR(segment.asSlice(OFFSET$display, LAYOUT$display));
    }

    public void display(VkDisplayKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$display, LAYOUT$display.byteSize());
    }

    public @pointer(comment="int8_t*") MemorySegment displayNameRaw() {
        return segment.get(LAYOUT$displayName, OFFSET$displayName);
    }

    public void displayNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$displayName, OFFSET$displayName, value);
    }
    
    public BytePtr displayName() {
        return new BytePtr(displayNameRaw());
    }

    public void displayName(BytePtr value) {
        displayNameRaw(value.segment());
    }

    public VkExtent2D physicalDimensions() {
        return new VkExtent2D(segment.asSlice(OFFSET$physicalDimensions, LAYOUT$physicalDimensions));
    }

    public void physicalDimensions(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$physicalDimensions, LAYOUT$physicalDimensions.byteSize());
    }

    public VkExtent2D physicalResolution() {
        return new VkExtent2D(segment.asSlice(OFFSET$physicalResolution, LAYOUT$physicalResolution));
    }

    public void physicalResolution(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$physicalResolution, LAYOUT$physicalResolution.byteSize());
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int supportedTransforms() {
        return segment.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);
    }

    public void supportedTransforms(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);
    }

    public @unsigned int planeReorderPossible() {
        return segment.get(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible);
    }

    public void planeReorderPossible(@unsigned int value) {
        segment.set(LAYOUT$planeReorderPossible, OFFSET$planeReorderPossible, value);
    }

    public @unsigned int persistentContent() {
        return segment.get(LAYOUT$persistentContent, OFFSET$persistentContent);
    }

    public void persistentContent(@unsigned int value) {
        segment.set(LAYOUT$persistentContent, OFFSET$persistentContent, value);
    }


    public static final class Factory implements IFactory<VkDisplayPropertiesKHR> {
        @Override
        public Class<VkDisplayPropertiesKHR> clazz() {
            return VkDisplayPropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayPropertiesKHR.LAYOUT;
        }

        @Override
        public VkDisplayPropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPropertiesKHR createUninit(MemorySegment segment) {
            return new VkDisplayPropertiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
