package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaBudget(MemorySegment segment) implements IPointer {
    public VmaStatistics statistics() {
        return new VmaStatistics(segment.asSlice(OFFSET$statistics, LAYOUT$statistics));
    }

    public void statistics(VmaStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$statistics, SIZE$statistics);
    }

    public @unsigned long usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@unsigned long value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public @unsigned long budget() {
        return segment.get(LAYOUT$budget, OFFSET$budget);
    }

    public void budget(@unsigned long value) {
        segment.set(LAYOUT$budget, OFFSET$budget, value);
    }

    public static VmaBudget allocate(Arena arena) {
        return new VmaBudget(arena.allocate(LAYOUT));
    }

    public static VmaBudget[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaBudget[] ret = new VmaBudget[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaBudget(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaBudget clone(Arena arena, VmaBudget src) {
        VmaBudget ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaBudget[] clone(Arena arena, VmaBudget[] src) {
        VmaBudget[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_LONG.withName("usage"),
        ValueLayout.JAVA_LONG.withName("budget")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$statistics = PathElement.groupElement("statistics");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$budget = PathElement.groupElement("budget");

    public static final StructLayout LAYOUT$statistics = (StructLayout) LAYOUT.select(PATH$statistics);
    public static final OfLong LAYOUT$usage = (OfLong) LAYOUT.select(PATH$usage);
    public static final OfLong LAYOUT$budget = (OfLong) LAYOUT.select(PATH$budget);

    public static final long OFFSET$statistics = LAYOUT.byteOffset(PATH$statistics);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$budget = LAYOUT.byteOffset(PATH$budget);

    public static final long SIZE$statistics = LAYOUT$statistics.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$budget = LAYOUT$budget.byteSize();
}

