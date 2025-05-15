package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkLatencySleepModeInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$lowLatencyMode = ValueLayout.JAVA_INT.withName("lowLatencyMode");
    public static final OfInt LAYOUT$lowLatencyBoost = ValueLayout.JAVA_INT.withName("lowLatencyBoost");
    public static final OfInt LAYOUT$minimumIntervalUs = ValueLayout.JAVA_INT.withName("minimumIntervalUs");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$lowLatencyMode, LAYOUT$lowLatencyBoost, LAYOUT$minimumIntervalUs);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkLatencySleepModeInfoNV allocate(Arena arena) {
        return new VkLatencySleepModeInfoNV(arena.allocate(LAYOUT));
    }

    public static VkLatencySleepModeInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencySleepModeInfoNV[] ret = new VkLatencySleepModeInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLatencySleepModeInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkLatencySleepModeInfoNV clone(Arena arena, VkLatencySleepModeInfoNV src) {
        VkLatencySleepModeInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLatencySleepModeInfoNV[] clone(Arena arena, VkLatencySleepModeInfoNV[] src) {
        VkLatencySleepModeInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$lowLatencyMode = PathElement.groupElement("PATH$lowLatencyMode");
    public static final PathElement PATH$lowLatencyBoost = PathElement.groupElement("PATH$lowLatencyBoost");
    public static final PathElement PATH$minimumIntervalUs = PathElement.groupElement("PATH$minimumIntervalUs");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lowLatencyMode = LAYOUT$lowLatencyMode.byteSize();
    public static final long SIZE$lowLatencyBoost = LAYOUT$lowLatencyBoost.byteSize();
    public static final long SIZE$minimumIntervalUs = LAYOUT$minimumIntervalUs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lowLatencyMode = LAYOUT.byteOffset(PATH$lowLatencyMode);
    public static final long OFFSET$lowLatencyBoost = LAYOUT.byteOffset(PATH$lowLatencyBoost);
    public static final long OFFSET$minimumIntervalUs = LAYOUT.byteOffset(PATH$minimumIntervalUs);

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

    public @unsigned int lowLatencyMode() {
        return segment.get(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode);
    }

    public void lowLatencyMode(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode, value);
    }

    public @unsigned int lowLatencyBoost() {
        return segment.get(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost);
    }

    public void lowLatencyBoost(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost, value);
    }

    public @unsigned int minimumIntervalUs() {
        return segment.get(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs);
    }

    public void minimumIntervalUs(@unsigned int value) {
        segment.set(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs, value);
    }

}
/// dummy, not implemented yet
