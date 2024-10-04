package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkVertexInputBindingDescription {
///     uint32_t binding;
///     uint32_t stride;
///     VkVertexInputRate inputRate;
/// } VkVertexInputBindingDescription;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkVertexInputBindingDescription.html">VkVertexInputBindingDescription</a>
public record VkVertexInputBindingDescription(MemorySegment segment) implements IPointer {
    public VkVertexInputBindingDescription(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @enumtype(VkVertexInputRate.class) int inputRate() {
        return segment.get(LAYOUT$inputRate, OFFSET$inputRate);
    }

    public void inputRate(@enumtype(VkVertexInputRate.class) int value) {
        segment.set(LAYOUT$inputRate, OFFSET$inputRate, value);
    }

    public static VkVertexInputBindingDescription allocate(Arena arena) {
        return new VkVertexInputBindingDescription(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDescription[] ret = new VkVertexInputBindingDescription[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkVertexInputBindingDescription(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVertexInputBindingDescription clone(Arena arena, VkVertexInputBindingDescription src) {
        VkVertexInputBindingDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVertexInputBindingDescription[] clone(Arena arena, VkVertexInputBindingDescription[] src) {
        VkVertexInputBindingDescription[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$inputRate = PathElement.groupElement("inputRate");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$inputRate = (OfInt) LAYOUT.select(PATH$inputRate);

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$inputRate = LAYOUT$inputRate.byteSize();
}
