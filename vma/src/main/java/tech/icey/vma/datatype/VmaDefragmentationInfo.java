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

public record VmaDefragmentationInfo(MemorySegment segment) implements IPointer {
    public @enumtype(VmaDefragmentationFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VmaDefragmentationFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VmaPool pool() {
        MemorySegment s = segment.asSlice(OFFSET$pool, SIZE$pool);
        if (s.address() == 0) {
            return null;
        }
        return new VmaPool(s);
    }

    public void pool(@Nullable VmaPool value) {
        segment.set(
            LAYOUT$pool,
            OFFSET$pool,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long maxBytesPerPass() {
        return segment.get(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass);
    }

    public void maxBytesPerPass(@unsigned long value) {
        segment.set(LAYOUT$maxBytesPerPass, OFFSET$maxBytesPerPass, value);
    }

    public @unsigned int maxAllocationsPerPass() {
        return segment.get(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass);
    }

    public void maxAllocationsPerPass(@unsigned int value) {
        segment.set(LAYOUT$maxAllocationsPerPass, OFFSET$maxAllocationsPerPass, value);
    }

    public @pointer(comment="PFN_vmaCheckDefragmentationBreakFunction") MemorySegment pfnBreakCallback() {
        return segment.get(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback);
    }

    public void pfnBreakCallback(@pointer(comment="PFN_vmaCheckDefragmentationBreakFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnBreakCallback, OFFSET$pfnBreakCallback, value);
    }

    public void pfnBreakCallback(IPointer pointer) {
        pfnBreakCallback(pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment pBreakCallbackUserData() {
        return segment.get(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData);
    }

    public void pBreakCallbackUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pBreakCallbackUserData, OFFSET$pBreakCallbackUserData, value);
    }

    public void pBreakCallbackUserData(IPointer pointer) {
        pBreakCallbackUserData(pointer.segment());
    }

    public static VmaDefragmentationInfo allocate(Arena arena) {
        return new VmaDefragmentationInfo(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDefragmentationInfo[] ret = new VmaDefragmentationInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDefragmentationInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDefragmentationInfo clone(Arena arena, VmaDefragmentationInfo src) {
        VmaDefragmentationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDefragmentationInfo[] clone(Arena arena, VmaDefragmentationInfo[] src) {
        VmaDefragmentationInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pool"),
        ValueLayout.JAVA_LONG.withName("maxBytesPerPass"),
        ValueLayout.JAVA_INT.withName("maxAllocationsPerPass"),
        ValueLayout.ADDRESS.withName("pfnBreakCallback"),
        ValueLayout.ADDRESS.withName("pBreakCallbackUserData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pool = PathElement.groupElement("pool");
    public static final PathElement PATH$maxBytesPerPass = PathElement.groupElement("maxBytesPerPass");
    public static final PathElement PATH$maxAllocationsPerPass = PathElement.groupElement("maxAllocationsPerPass");
    public static final PathElement PATH$pfnBreakCallback = PathElement.groupElement("pfnBreakCallback");
    public static final PathElement PATH$pBreakCallbackUserData = PathElement.groupElement("pBreakCallbackUserData");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pool = (AddressLayout) LAYOUT.select(PATH$pool);
    public static final OfLong LAYOUT$maxBytesPerPass = (OfLong) LAYOUT.select(PATH$maxBytesPerPass);
    public static final OfInt LAYOUT$maxAllocationsPerPass = (OfInt) LAYOUT.select(PATH$maxAllocationsPerPass);
    public static final AddressLayout LAYOUT$pfnBreakCallback = (AddressLayout) LAYOUT.select(PATH$pfnBreakCallback);
    public static final AddressLayout LAYOUT$pBreakCallbackUserData = (AddressLayout) LAYOUT.select(PATH$pBreakCallbackUserData);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pool = LAYOUT.byteOffset(PATH$pool);
    public static final long OFFSET$maxBytesPerPass = LAYOUT.byteOffset(PATH$maxBytesPerPass);
    public static final long OFFSET$maxAllocationsPerPass = LAYOUT.byteOffset(PATH$maxAllocationsPerPass);
    public static final long OFFSET$pfnBreakCallback = LAYOUT.byteOffset(PATH$pfnBreakCallback);
    public static final long OFFSET$pBreakCallbackUserData = LAYOUT.byteOffset(PATH$pBreakCallbackUserData);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pool = LAYOUT$pool.byteSize();
    public static final long SIZE$maxBytesPerPass = LAYOUT$maxBytesPerPass.byteSize();
    public static final long SIZE$maxAllocationsPerPass = LAYOUT$maxAllocationsPerPass.byteSize();
    public static final long SIZE$pfnBreakCallback = LAYOUT$pfnBreakCallback.byteSize();
    public static final long SIZE$pBreakCallbackUserData = LAYOUT$pBreakCallbackUserData.byteSize();
}

