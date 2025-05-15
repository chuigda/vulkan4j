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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClearColorValue.html">VkClearColorValue</a>
@ValueBasedCandidate
public record VkClearColorValue(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$float32 = ValueLayout.JAVA_FLOAT.withName("float32");
    public static final OfInt LAYOUT$int32 = ValueLayout.JAVA_INT.withName("int32");
    public static final OfInt LAYOUT$uint32 = ValueLayout.JAVA_INT.withName("uint32");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$float32, LAYOUT$int32, LAYOUT$uint32);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClearColorValue allocate(Arena arena) {
        return new VkClearColorValue(arena.allocate(LAYOUT));
    }

    public static VkClearColorValue[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClearColorValue[] ret = new VkClearColorValue[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClearColorValue(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClearColorValue clone(Arena arena, VkClearColorValue src) {
        VkClearColorValue ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClearColorValue[] clone(Arena arena, VkClearColorValue[] src) {
        VkClearColorValue[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$float32 = PathElement.groupElement("PATH$float32");
    public static final PathElement PATH$int32 = PathElement.groupElement("PATH$int32");
    public static final PathElement PATH$uint32 = PathElement.groupElement("PATH$uint32");

    public static final long SIZE$float32 = LAYOUT$float32.byteSize();
    public static final long SIZE$int32 = LAYOUT$int32.byteSize();
    public static final long SIZE$uint32 = LAYOUT$uint32.byteSize();

    public static final long OFFSET$float32 = LAYOUT.byteOffset(PATH$float32);
    public static final long OFFSET$int32 = LAYOUT.byteOffset(PATH$int32);
    public static final long OFFSET$uint32 = LAYOUT.byteOffset(PATH$uint32);

    public float float32() {
        return segment.get(LAYOUT$float32, OFFSET$float32);
    }

    public void float32(float value) {
        segment.set(LAYOUT$float32, OFFSET$float32, value);
    }

    public int int32() {
        return segment.get(LAYOUT$int32, OFFSET$int32);
    }

    public void int32(int value) {
        segment.set(LAYOUT$int32, OFFSET$int32, value);
    }

    public @unsigned int uint32() {
        return segment.get(LAYOUT$uint32, OFFSET$uint32);
    }

    public void uint32(@unsigned int value) {
        segment.set(LAYOUT$uint32, OFFSET$uint32, value);
    }

}
