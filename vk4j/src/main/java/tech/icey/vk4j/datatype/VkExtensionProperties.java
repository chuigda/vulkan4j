package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;

public record VkExtensionProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );

    public static final PathElement PATH$extensionName = PathElement.groupElement("extensionName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("specVersion");

    public static final SequenceLayout LAYOUT$extensionName = (SequenceLayout) LAYOUT.select(PATH$extensionName);
    public static final OfInt LAYOUT$specVersion = (OfInt) LAYOUT.select(PATH$specVersion);

    public static final long OFFSET$extensionName = LAYOUT.byteOffset(PATH$extensionName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);

    public VkExtensionProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment extensionNameRaw() {
        return segment.asSlice(OFFSET$extensionName, LAYOUT$extensionName.byteSize());
    }

    public ByteArray extensionName() {
        return new ByteArray(extensionNameRaw(), LAYOUT$extensionName.elementCount());
    }

    public void extensionName(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extensionName, LAYOUT$extensionName.byteSize());
    }

    public @unsigned int specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public void specVersion(@unsigned int value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
    }


    public static final class Factory implements IFactory<VkExtensionProperties> {
        @Override
        public Class<VkExtensionProperties> clazz() {
            return VkExtensionProperties.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkExtensionProperties.LAYOUT;
        }

        @Override
        public VkExtensionProperties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExtensionProperties createUninit(MemorySegment segment) {
            return new VkExtensionProperties(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
