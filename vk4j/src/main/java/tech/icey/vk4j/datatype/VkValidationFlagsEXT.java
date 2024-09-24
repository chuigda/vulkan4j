package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkValidationFlagsEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDisabledValidationChecks")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$disabledValidationCheckCount = PathElement.groupElement("disabledValidationCheckCount");
    public static final PathElement PATH$pDisabledValidationChecks = PathElement.groupElement("pDisabledValidationChecks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$disabledValidationCheckCount = (OfInt) LAYOUT.select(PATH$disabledValidationCheckCount);
    public static final AddressLayout LAYOUT$pDisabledValidationChecks = (AddressLayout) LAYOUT.select(PATH$pDisabledValidationChecks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$disabledValidationCheckCount = LAYOUT.byteOffset(PATH$disabledValidationCheckCount);
    public static final long OFFSET$pDisabledValidationChecks = LAYOUT.byteOffset(PATH$pDisabledValidationChecks);

    public VkValidationFlagsEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT);
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

    public @unsigned int disabledValidationCheckCount() {
        return segment.get(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount);
    }

    public void disabledValidationCheckCount(@unsigned int value) {
        segment.set(LAYOUT$disabledValidationCheckCount, OFFSET$disabledValidationCheckCount, value);
    }

    public @pointer(target=VkValidationCheckEXT.class) MemorySegment pDisabledValidationChecksRaw() {
        return segment.get(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks);
    }

    public void pDisabledValidationChecksRaw(@pointer(target=VkValidationCheckEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDisabledValidationChecks, OFFSET$pDisabledValidationChecks, value);
    }

    public @nullable IntPtr pDisabledValidationChecks() {
        MemorySegment s = pDisabledValidationChecksRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntPtr(s);
    }

    public void pDisabledValidationChecks(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDisabledValidationChecksRaw(s);
    }


    public static final class Factory implements IFactory<VkValidationFlagsEXT> {
        @Override
        public Class<VkValidationFlagsEXT> clazz() {
            return VkValidationFlagsEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkValidationFlagsEXT.LAYOUT;
        }

        @Override
        public VkValidationFlagsEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkValidationFlagsEXT createUninit(MemorySegment segment) {
            return new VkValidationFlagsEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
