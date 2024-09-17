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

public record VkDisplayModePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("displayMode"),
        VkDisplayModeParametersKHR.LAYOUT.withName("parameters")
    );

    public static final PathElement PATH$displayMode = PathElement.groupElement("displayMode");
    public static final PathElement PATH$parameters = PathElement.groupElement("parameters");

    public static final AddressLayout LAYOUT$displayMode = (AddressLayout) LAYOUT.select(PATH$displayMode);
    public static final StructLayout LAYOUT$parameters = (StructLayout) LAYOUT.select(PATH$parameters);

    public static final long OFFSET$displayMode = LAYOUT.byteOffset(PATH$displayMode);
    public static final long OFFSET$parameters = LAYOUT.byteOffset(PATH$parameters);

    public VkDisplayModePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkDisplayModeKHR displayMode() {
        return new VkDisplayModeKHR(segment.asSlice(OFFSET$displayMode, LAYOUT$displayMode));
    }

    public void displayMode(VkDisplayModeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayMode, LAYOUT$displayMode.byteSize());
    }

    public VkDisplayModeParametersKHR parameters() {
        return new VkDisplayModeParametersKHR(segment.asSlice(OFFSET$parameters, LAYOUT$parameters));
    }

    public void parameters(VkDisplayModeParametersKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$parameters, LAYOUT$parameters.byteSize());
    }


    public static final class VkDisplayModePropertiesKHRFactory implements IFactory<VkDisplayModePropertiesKHR> {
        @Override
        public Class<VkDisplayModePropertiesKHR> clazz() {
            return VkDisplayModePropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDisplayModePropertiesKHR.LAYOUT;
        }

        @Override
        public VkDisplayModePropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDisplayModePropertiesKHR createUninit(MemorySegment segment) {
            return new VkDisplayModePropertiesKHR(segment);
        }
    }

    public static final VkDisplayModePropertiesKHRFactory FACTORY = new VkDisplayModePropertiesKHRFactory();
}
