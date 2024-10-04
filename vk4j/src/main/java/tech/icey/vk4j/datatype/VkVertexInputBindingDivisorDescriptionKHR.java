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
/// typedef struct VkVertexInputBindingDivisorDescriptionKHR {
///     uint32_t binding;
///     uint32_t divisor;
/// } VkVertexInputBindingDivisorDescriptionKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkVertexInputBindingDivisorDescriptionKHR.html">VkVertexInputBindingDivisorDescriptionKHR</a>
public record VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment) implements IPointer {
    public VkVertexInputBindingDivisorDescriptionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }

    public static VkVertexInputBindingDivisorDescriptionKHR allocate(Arena arena) {
        return new VkVertexInputBindingDivisorDescriptionKHR(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDivisorDescriptionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDivisorDescriptionKHR[] ret = new VkVertexInputBindingDivisorDescriptionKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkVertexInputBindingDivisorDescriptionKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVertexInputBindingDivisorDescriptionKHR clone(Arena arena, VkVertexInputBindingDivisorDescriptionKHR src) {
        VkVertexInputBindingDivisorDescriptionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVertexInputBindingDivisorDescriptionKHR[] clone(Arena arena, VkVertexInputBindingDivisorDescriptionKHR[] src) {
        VkVertexInputBindingDivisorDescriptionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$divisor = PathElement.groupElement("divisor");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$divisor = (OfInt) LAYOUT.select(PATH$divisor);

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$divisor = LAYOUT$divisor.byteSize();
}
