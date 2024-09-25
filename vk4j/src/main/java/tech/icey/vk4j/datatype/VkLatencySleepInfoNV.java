package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkSemaphore;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV;

public record VkLatencySleepInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$signalSemaphore = PathElement.groupElement("signalSemaphore");
    public static final PathElement PATH$value = PathElement.groupElement("value");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$signalSemaphore = (AddressLayout) LAYOUT.select(PATH$signalSemaphore);
    public static final OfLong LAYOUT$value = (OfLong) LAYOUT.select(PATH$value);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$signalSemaphore = LAYOUT.byteOffset(PATH$signalSemaphore);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);

    public VkLatencySleepInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV);
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

    public VkSemaphore signalSemaphore() {
        return new VkSemaphore(segment.asSlice(OFFSET$signalSemaphore, LAYOUT$signalSemaphore));
    }

    public void signalSemaphore(VkSemaphore value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$signalSemaphore, LAYOUT$signalSemaphore.byteSize());
    }

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }


    public static final class Factory implements IFactory<VkLatencySleepInfoNV> {
        @Override
        public Class<VkLatencySleepInfoNV> clazz() {
            return VkLatencySleepInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkLatencySleepInfoNV.LAYOUT;
        }

        @Override
        public VkLatencySleepInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkLatencySleepInfoNV createUninit(MemorySegment segment) {
            return new VkLatencySleepInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
