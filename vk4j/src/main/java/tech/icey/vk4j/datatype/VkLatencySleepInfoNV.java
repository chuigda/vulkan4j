package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkLatencySleepInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore signalSemaphore;
///     uint64_t value;
/// } VkLatencySleepInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkLatencySleepInfoNV.html">VkLatencySleepInfoNV</a>
public record VkLatencySleepInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$signalSemaphore = LAYOUT$signalSemaphore.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkSemaphore signalSemaphore() {
        return new VkSemaphore(segment.get(LAYOUT$signalSemaphore, OFFSET$signalSemaphore));
    }

    public void signalSemaphore(VkSemaphore value) {
        segment.set(LAYOUT$signalSemaphore, OFFSET$signalSemaphore, value.segment());
    }

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }

    public static VkLatencySleepInfoNV allocate(Arena arena) {
        return new VkLatencySleepInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkLatencySleepInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencySleepInfoNV[] ret = new VkLatencySleepInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkLatencySleepInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
