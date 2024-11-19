package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef union VkPerformanceValueDataINTEL {
///     uint32_t value32;
///     uint64_t value64;
///     float valueFloat;
///     VkBool32 valueBool;
///     const char* valueString;
/// } VkPerformanceValueDataINTEL;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPerformanceValueDataINTEL.html">VkPerformanceValueDataINTEL</a>
public record VkPerformanceValueDataINTEL(MemorySegment segment) implements IPointer {
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

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer valueString() {
        MemorySegment s = valueStringRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void valueString(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        valueStringRaw(s);
    }

    public static VkPerformanceValueDataINTEL allocate(Arena arena) {
        return new VkPerformanceValueDataINTEL(arena.allocate(LAYOUT));
    }

    public static VkPerformanceValueDataINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceValueDataINTEL[] ret = new VkPerformanceValueDataINTEL[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPerformanceValueDataINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceValueDataINTEL clone(Arena arena, VkPerformanceValueDataINTEL src) {
        VkPerformanceValueDataINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceValueDataINTEL[] clone(Arena arena, VkPerformanceValueDataINTEL[] src) {
        VkPerformanceValueDataINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("value32"),
        ValueLayout.JAVA_LONG.withName("value64"),
        ValueLayout.JAVA_FLOAT.withName("valueFloat"),
        ValueLayout.JAVA_INT.withName("valueBool"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("valueString")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public static final long SIZE$value32 = LAYOUT$value32.byteSize();
    public static final long SIZE$value64 = LAYOUT$value64.byteSize();
    public static final long SIZE$valueFloat = LAYOUT$valueFloat.byteSize();
    public static final long SIZE$valueBool = LAYOUT$valueBool.byteSize();
    public static final long SIZE$valueString = LAYOUT$valueString.byteSize();
}
