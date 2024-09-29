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
/// typedef struct VkSetStateFlagsIndirectCommandNV {
///     uint32_t data;
/// } VkSetStateFlagsIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSetStateFlagsIndirectCommandNV.html">VkSetStateFlagsIndirectCommandNV</a>
public record VkSetStateFlagsIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int data() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void data(@unsigned int value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }

    public static VkSetStateFlagsIndirectCommandNV allocate(Arena arena) {
        return new VkSetStateFlagsIndirectCommandNV(arena.allocate(LAYOUT));
    }
    
    public static VkSetStateFlagsIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSetStateFlagsIndirectCommandNV[] ret = new VkSetStateFlagsIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSetStateFlagsIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSetStateFlagsIndirectCommandNV clone(Arena arena, VkSetStateFlagsIndirectCommandNV src) {
        VkSetStateFlagsIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSetStateFlagsIndirectCommandNV[] clone(Arena arena, VkSetStateFlagsIndirectCommandNV[] src) {
        VkSetStateFlagsIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("data")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$data = (OfInt) LAYOUT.select(PATH$data);

    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public static final long SIZE$data = LAYOUT$data.byteSize();
}
