package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkTraceRaysIndirectCommand2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordAddress"),
        ValueLayout.JAVA_LONG.withName("raygenShaderRecordSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("missShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("hitShaderBindingTableStride"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableAddress"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableSize"),
        ValueLayout.JAVA_LONG.withName("callableShaderBindingTableStride"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$raygenShaderRecordAddress = PathElement.groupElement("raygenShaderRecordAddress");
    public static final PathElement PATH$raygenShaderRecordSize = PathElement.groupElement("raygenShaderRecordSize");
    public static final PathElement PATH$missShaderBindingTableAddress = PathElement.groupElement("missShaderBindingTableAddress");
    public static final PathElement PATH$missShaderBindingTableSize = PathElement.groupElement("missShaderBindingTableSize");
    public static final PathElement PATH$missShaderBindingTableStride = PathElement.groupElement("missShaderBindingTableStride");
    public static final PathElement PATH$hitShaderBindingTableAddress = PathElement.groupElement("hitShaderBindingTableAddress");
    public static final PathElement PATH$hitShaderBindingTableSize = PathElement.groupElement("hitShaderBindingTableSize");
    public static final PathElement PATH$hitShaderBindingTableStride = PathElement.groupElement("hitShaderBindingTableStride");
    public static final PathElement PATH$callableShaderBindingTableAddress = PathElement.groupElement("callableShaderBindingTableAddress");
    public static final PathElement PATH$callableShaderBindingTableSize = PathElement.groupElement("callableShaderBindingTableSize");
    public static final PathElement PATH$callableShaderBindingTableStride = PathElement.groupElement("callableShaderBindingTableStride");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$depth = PathElement.groupElement("depth");

    public static final OfLong LAYOUT$raygenShaderRecordAddress = (OfLong) LAYOUT.select(PATH$raygenShaderRecordAddress);
    public static final OfLong LAYOUT$raygenShaderRecordSize = (OfLong) LAYOUT.select(PATH$raygenShaderRecordSize);
    public static final OfLong LAYOUT$missShaderBindingTableAddress = (OfLong) LAYOUT.select(PATH$missShaderBindingTableAddress);
    public static final OfLong LAYOUT$missShaderBindingTableSize = (OfLong) LAYOUT.select(PATH$missShaderBindingTableSize);
    public static final OfLong LAYOUT$missShaderBindingTableStride = (OfLong) LAYOUT.select(PATH$missShaderBindingTableStride);
    public static final OfLong LAYOUT$hitShaderBindingTableAddress = (OfLong) LAYOUT.select(PATH$hitShaderBindingTableAddress);
    public static final OfLong LAYOUT$hitShaderBindingTableSize = (OfLong) LAYOUT.select(PATH$hitShaderBindingTableSize);
    public static final OfLong LAYOUT$hitShaderBindingTableStride = (OfLong) LAYOUT.select(PATH$hitShaderBindingTableStride);
    public static final OfLong LAYOUT$callableShaderBindingTableAddress = (OfLong) LAYOUT.select(PATH$callableShaderBindingTableAddress);
    public static final OfLong LAYOUT$callableShaderBindingTableSize = (OfLong) LAYOUT.select(PATH$callableShaderBindingTableSize);
    public static final OfLong LAYOUT$callableShaderBindingTableStride = (OfLong) LAYOUT.select(PATH$callableShaderBindingTableStride);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$depth = (OfInt) LAYOUT.select(PATH$depth);

    public static final long OFFSET$raygenShaderRecordAddress = LAYOUT.byteOffset(PATH$raygenShaderRecordAddress);
    public static final long OFFSET$raygenShaderRecordSize = LAYOUT.byteOffset(PATH$raygenShaderRecordSize);
    public static final long OFFSET$missShaderBindingTableAddress = LAYOUT.byteOffset(PATH$missShaderBindingTableAddress);
    public static final long OFFSET$missShaderBindingTableSize = LAYOUT.byteOffset(PATH$missShaderBindingTableSize);
    public static final long OFFSET$missShaderBindingTableStride = LAYOUT.byteOffset(PATH$missShaderBindingTableStride);
    public static final long OFFSET$hitShaderBindingTableAddress = LAYOUT.byteOffset(PATH$hitShaderBindingTableAddress);
    public static final long OFFSET$hitShaderBindingTableSize = LAYOUT.byteOffset(PATH$hitShaderBindingTableSize);
    public static final long OFFSET$hitShaderBindingTableStride = LAYOUT.byteOffset(PATH$hitShaderBindingTableStride);
    public static final long OFFSET$callableShaderBindingTableAddress = LAYOUT.byteOffset(PATH$callableShaderBindingTableAddress);
    public static final long OFFSET$callableShaderBindingTableSize = LAYOUT.byteOffset(PATH$callableShaderBindingTableSize);
    public static final long OFFSET$callableShaderBindingTableStride = LAYOUT.byteOffset(PATH$callableShaderBindingTableStride);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);

    public static final long SIZE$raygenShaderRecordAddress = LAYOUT$raygenShaderRecordAddress.byteSize();
    public static final long SIZE$raygenShaderRecordSize = LAYOUT$raygenShaderRecordSize.byteSize();
    public static final long SIZE$missShaderBindingTableAddress = LAYOUT$missShaderBindingTableAddress.byteSize();
    public static final long SIZE$missShaderBindingTableSize = LAYOUT$missShaderBindingTableSize.byteSize();
    public static final long SIZE$missShaderBindingTableStride = LAYOUT$missShaderBindingTableStride.byteSize();
    public static final long SIZE$hitShaderBindingTableAddress = LAYOUT$hitShaderBindingTableAddress.byteSize();
    public static final long SIZE$hitShaderBindingTableSize = LAYOUT$hitShaderBindingTableSize.byteSize();
    public static final long SIZE$hitShaderBindingTableStride = LAYOUT$hitShaderBindingTableStride.byteSize();
    public static final long SIZE$callableShaderBindingTableAddress = LAYOUT$callableShaderBindingTableAddress.byteSize();
    public static final long SIZE$callableShaderBindingTableSize = LAYOUT$callableShaderBindingTableSize.byteSize();
    public static final long SIZE$callableShaderBindingTableStride = LAYOUT$callableShaderBindingTableStride.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$depth = LAYOUT$depth.byteSize();

    public VkTraceRaysIndirectCommand2KHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long raygenShaderRecordAddress() {
        return segment.get(LAYOUT$raygenShaderRecordAddress, OFFSET$raygenShaderRecordAddress);
    }

    public void raygenShaderRecordAddress(@unsigned long value) {
        segment.set(LAYOUT$raygenShaderRecordAddress, OFFSET$raygenShaderRecordAddress, value);
    }

    public @unsigned long raygenShaderRecordSize() {
        return segment.get(LAYOUT$raygenShaderRecordSize, OFFSET$raygenShaderRecordSize);
    }

    public void raygenShaderRecordSize(@unsigned long value) {
        segment.set(LAYOUT$raygenShaderRecordSize, OFFSET$raygenShaderRecordSize, value);
    }

    public @unsigned long missShaderBindingTableAddress() {
        return segment.get(LAYOUT$missShaderBindingTableAddress, OFFSET$missShaderBindingTableAddress);
    }

    public void missShaderBindingTableAddress(@unsigned long value) {
        segment.set(LAYOUT$missShaderBindingTableAddress, OFFSET$missShaderBindingTableAddress, value);
    }

    public @unsigned long missShaderBindingTableSize() {
        return segment.get(LAYOUT$missShaderBindingTableSize, OFFSET$missShaderBindingTableSize);
    }

    public void missShaderBindingTableSize(@unsigned long value) {
        segment.set(LAYOUT$missShaderBindingTableSize, OFFSET$missShaderBindingTableSize, value);
    }

    public @unsigned long missShaderBindingTableStride() {
        return segment.get(LAYOUT$missShaderBindingTableStride, OFFSET$missShaderBindingTableStride);
    }

    public void missShaderBindingTableStride(@unsigned long value) {
        segment.set(LAYOUT$missShaderBindingTableStride, OFFSET$missShaderBindingTableStride, value);
    }

    public @unsigned long hitShaderBindingTableAddress() {
        return segment.get(LAYOUT$hitShaderBindingTableAddress, OFFSET$hitShaderBindingTableAddress);
    }

    public void hitShaderBindingTableAddress(@unsigned long value) {
        segment.set(LAYOUT$hitShaderBindingTableAddress, OFFSET$hitShaderBindingTableAddress, value);
    }

    public @unsigned long hitShaderBindingTableSize() {
        return segment.get(LAYOUT$hitShaderBindingTableSize, OFFSET$hitShaderBindingTableSize);
    }

    public void hitShaderBindingTableSize(@unsigned long value) {
        segment.set(LAYOUT$hitShaderBindingTableSize, OFFSET$hitShaderBindingTableSize, value);
    }

    public @unsigned long hitShaderBindingTableStride() {
        return segment.get(LAYOUT$hitShaderBindingTableStride, OFFSET$hitShaderBindingTableStride);
    }

    public void hitShaderBindingTableStride(@unsigned long value) {
        segment.set(LAYOUT$hitShaderBindingTableStride, OFFSET$hitShaderBindingTableStride, value);
    }

    public @unsigned long callableShaderBindingTableAddress() {
        return segment.get(LAYOUT$callableShaderBindingTableAddress, OFFSET$callableShaderBindingTableAddress);
    }

    public void callableShaderBindingTableAddress(@unsigned long value) {
        segment.set(LAYOUT$callableShaderBindingTableAddress, OFFSET$callableShaderBindingTableAddress, value);
    }

    public @unsigned long callableShaderBindingTableSize() {
        return segment.get(LAYOUT$callableShaderBindingTableSize, OFFSET$callableShaderBindingTableSize);
    }

    public void callableShaderBindingTableSize(@unsigned long value) {
        segment.set(LAYOUT$callableShaderBindingTableSize, OFFSET$callableShaderBindingTableSize, value);
    }

    public @unsigned long callableShaderBindingTableStride() {
        return segment.get(LAYOUT$callableShaderBindingTableStride, OFFSET$callableShaderBindingTableStride);
    }

    public void callableShaderBindingTableStride(@unsigned long value) {
        segment.set(LAYOUT$callableShaderBindingTableStride, OFFSET$callableShaderBindingTableStride, value);
    }

    public @unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(@unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public @unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(@unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public @unsigned int depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(@unsigned int value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

    public static VkTraceRaysIndirectCommand2KHR allocate(Arena arena) {
        return new VkTraceRaysIndirectCommand2KHR(arena.allocate(LAYOUT));
    }
    
    public static VkTraceRaysIndirectCommand2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTraceRaysIndirectCommand2KHR[] ret = new VkTraceRaysIndirectCommand2KHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkTraceRaysIndirectCommand2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
