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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription2EXT.html">VkVertexInputBindingDescription2EXT</a>
@ValueBasedCandidate
public record VkVertexInputBindingDescription2EXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$binding = ValueLayout.JAVA_INT.withName("binding");
    public static final OfInt LAYOUT$stride = ValueLayout.JAVA_INT.withName("stride");
    public static final OfInt LAYOUT$inputRate = ValueLayout.JAVA_INT.withName("inputRate");
    public static final OfInt LAYOUT$divisor = ValueLayout.JAVA_INT.withName("divisor");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$binding, LAYOUT$stride, LAYOUT$inputRate, LAYOUT$divisor);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVertexInputBindingDescription2EXT allocate(Arena arena) {
        return new VkVertexInputBindingDescription2EXT(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDescription2EXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDescription2EXT[] ret = new VkVertexInputBindingDescription2EXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVertexInputBindingDescription2EXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVertexInputBindingDescription2EXT clone(Arena arena, VkVertexInputBindingDescription2EXT src) {
        VkVertexInputBindingDescription2EXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVertexInputBindingDescription2EXT[] clone(Arena arena, VkVertexInputBindingDescription2EXT[] src) {
        VkVertexInputBindingDescription2EXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$binding = PathElement.groupElement("PATH$binding");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$inputRate = PathElement.groupElement("PATH$inputRate");
    public static final PathElement PATH$divisor = PathElement.groupElement("PATH$divisor");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$inputRate = LAYOUT$inputRate.byteSize();
    public static final long SIZE$divisor = LAYOUT$divisor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);

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

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }

}
