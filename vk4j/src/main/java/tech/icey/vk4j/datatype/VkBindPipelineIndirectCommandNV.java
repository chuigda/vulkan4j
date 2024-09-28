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
/// typedef struct VkBindPipelineIndirectCommandNV {
///     VkDeviceAddress pipelineAddress;
/// } VkBindPipelineIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindPipelineIndirectCommandNV.html">VkBindPipelineIndirectCommandNV</a>
public record VkBindPipelineIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkBindPipelineIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long pipelineAddress() {
        return segment.get(LAYOUT$pipelineAddress, OFFSET$pipelineAddress);
    }

    public void pipelineAddress(@unsigned long value) {
        segment.set(LAYOUT$pipelineAddress, OFFSET$pipelineAddress, value);
    }

    public static VkBindPipelineIndirectCommandNV allocate(Arena arena) {
        return new VkBindPipelineIndirectCommandNV(arena.allocate(LAYOUT));
    }
    
    public static VkBindPipelineIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindPipelineIndirectCommandNV[] ret = new VkBindPipelineIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindPipelineIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pipelineAddress = PathElement.groupElement("pipelineAddress");

    public static final OfLong LAYOUT$pipelineAddress = (OfLong) LAYOUT.select(PATH$pipelineAddress);

    public static final long OFFSET$pipelineAddress = LAYOUT.byteOffset(PATH$pipelineAddress);

    public static final long SIZE$pipelineAddress = LAYOUT$pipelineAddress.byteSize();
}
