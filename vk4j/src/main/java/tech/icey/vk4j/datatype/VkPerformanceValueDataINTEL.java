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

public record VkPerformanceValueDataINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("value32"),
        ValueLayout.JAVA_LONG.withName("value64"),
        ValueLayout.JAVA_FLOAT.withName("valueFloat"),
        ValueLayout.JAVA_INT.withName("valueBool"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("valueString")
    );

    public static final PathElement PATH$value32 = PathElement.groupElement("value32");
    public static final PathElement PATH$value64 = PathElement.groupElement("value64");
    public static final PathElement PATH$valueFloat = PathElement.groupElement("valueFloat");
    public static final PathElement PATH$valueBool = PathElement.groupElement("valueBool");
    public static final PathElement PATH$valueString = PathElement.groupElement("valueString");

    public static final OfInt LAYOUT$value32 = (OfInt) LAYOUT.select(PATH$value32);
    public static final OfLong LAYOUT$value64 = (OfLong) LAYOUT.select(PATH$value64);
    public static final OfFloat LAYOUT$valueFloat = (OfFloat) LAYOUT.select(PATH$valueFloat);
    public static final OfInt LAYOUT$valueBool = (OfInt) LAYOUT.select(PATH$valueBool);
    public static final AddressLayout LAYOUT$valueString = (AddressLayout) LAYOUT.select(PATH$valueString);

    public static final long OFFSET$value32 = LAYOUT.byteOffset(PATH$value32);
    public static final long OFFSET$value64 = LAYOUT.byteOffset(PATH$value64);
    public static final long OFFSET$valueFloat = LAYOUT.byteOffset(PATH$valueFloat);
    public static final long OFFSET$valueBool = LAYOUT.byteOffset(PATH$valueBool);
    public static final long OFFSET$valueString = LAYOUT.byteOffset(PATH$valueString);

    public VkPerformanceValueDataINTEL(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int value32() {
        return segment.get(LAYOUT$value32, OFFSET$value32);
    }

    public void value32(@unsigned int value) {
        segment.set(LAYOUT$value32, OFFSET$value32, value);
    }

    public @unsigned long value64() {
        return segment.get(LAYOUT$value64, OFFSET$value64);
    }

    public void value64(@unsigned long value) {
        segment.set(LAYOUT$value64, OFFSET$value64, value);
    }

    public float valueFloat() {
        return segment.get(LAYOUT$valueFloat, OFFSET$valueFloat);
    }

    public void valueFloat(float value) {
        segment.set(LAYOUT$valueFloat, OFFSET$valueFloat, value);
    }

    public @unsigned int valueBool() {
        return segment.get(LAYOUT$valueBool, OFFSET$valueBool);
    }

    public void valueBool(@unsigned int value) {
        segment.set(LAYOUT$valueBool, OFFSET$valueBool, value);
    }

    public @pointer(comment="int8_t*") MemorySegment valueStringRaw() {
        return segment.get(LAYOUT$valueString, OFFSET$valueString);
    }

    public void valueStringRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$valueString, OFFSET$valueString, value);
    }
    
    public BytePtr valueString() {
        return new BytePtr(valueStringRaw());
    }

    public void valueString(BytePtr value) {
        valueStringRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkPerformanceValueDataINTEL> {
        @Override
        public Class<VkPerformanceValueDataINTEL> clazz() {
            return VkPerformanceValueDataINTEL.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceValueDataINTEL.LAYOUT;
        }

        @Override
        public VkPerformanceValueDataINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceValueDataINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceValueDataINTEL(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
