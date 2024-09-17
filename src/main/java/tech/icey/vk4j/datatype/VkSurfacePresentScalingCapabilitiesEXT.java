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

public record VkSurfacePresentScalingCapabilitiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedPresentScaling"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityX"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityY"),
        VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
        VkExtent2D.LAYOUT.withName("maxScaledImageExtent")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportedPresentScaling = PathElement.groupElement("supportedPresentScaling");
    public static final PathElement PATH$supportedPresentGravityX = PathElement.groupElement("supportedPresentGravityX");
    public static final PathElement PATH$supportedPresentGravityY = PathElement.groupElement("supportedPresentGravityY");
    public static final PathElement PATH$minScaledImageExtent = PathElement.groupElement("minScaledImageExtent");
    public static final PathElement PATH$maxScaledImageExtent = PathElement.groupElement("maxScaledImageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedPresentScaling = (OfInt) LAYOUT.select(PATH$supportedPresentScaling);
    public static final OfInt LAYOUT$supportedPresentGravityX = (OfInt) LAYOUT.select(PATH$supportedPresentGravityX);
    public static final OfInt LAYOUT$supportedPresentGravityY = (OfInt) LAYOUT.select(PATH$supportedPresentGravityY);
    public static final StructLayout LAYOUT$minScaledImageExtent = (StructLayout) LAYOUT.select(PATH$minScaledImageExtent);
    public static final StructLayout LAYOUT$maxScaledImageExtent = (StructLayout) LAYOUT.select(PATH$maxScaledImageExtent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedPresentScaling = LAYOUT.byteOffset(PATH$supportedPresentScaling);
    public static final long OFFSET$supportedPresentGravityX = LAYOUT.byteOffset(PATH$supportedPresentGravityX);
    public static final long OFFSET$supportedPresentGravityY = LAYOUT.byteOffset(PATH$supportedPresentGravityY);
    public static final long OFFSET$minScaledImageExtent = LAYOUT.byteOffset(PATH$minScaledImageExtent);
    public static final long OFFSET$maxScaledImageExtent = LAYOUT.byteOffset(PATH$maxScaledImageExtent);

    public VkSurfacePresentScalingCapabilitiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT);
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

    public @enumtype(VkPresentScalingFlagsEXT.class) int supportedPresentScaling() {
        return segment.get(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling);
    }

    public void supportedPresentScaling(@enumtype(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityX() {
        return segment.get(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX);
    }

    public void supportedPresentGravityX(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityY() {
        return segment.get(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY);
    }

    public void supportedPresentGravityY(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY, value);
    }

    public VkExtent2D minScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minScaledImageExtent, LAYOUT$minScaledImageExtent));
    }

    public void minScaledImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minScaledImageExtent, LAYOUT$minScaledImageExtent.byteSize());
    }

    public VkExtent2D maxScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxScaledImageExtent, LAYOUT$maxScaledImageExtent));
    }

    public void maxScaledImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxScaledImageExtent, LAYOUT$maxScaledImageExtent.byteSize());
    }


    public static final class VkSurfacePresentScalingCapabilitiesEXTFactory implements IDataTypeFactory<VkSurfacePresentScalingCapabilitiesEXT> {
        @Override
        public Class<VkSurfacePresentScalingCapabilitiesEXT> clazz() {
            return VkSurfacePresentScalingCapabilitiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSurfacePresentScalingCapabilitiesEXT.LAYOUT;
        }

        @Override
        public VkSurfacePresentScalingCapabilitiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSurfacePresentScalingCapabilitiesEXT createUninit(MemorySegment segment) {
            return new VkSurfacePresentScalingCapabilitiesEXT(segment);
        }
    }

    public static final VkSurfacePresentScalingCapabilitiesEXTFactory FACTORY = new VkSurfacePresentScalingCapabilitiesEXTFactory();
}
