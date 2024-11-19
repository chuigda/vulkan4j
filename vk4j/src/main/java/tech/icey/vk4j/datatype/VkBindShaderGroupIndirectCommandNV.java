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
/// typedef struct VkBindShaderGroupIndirectCommandNV {
///     uint32_t groupIndex;
/// } VkBindShaderGroupIndirectCommandNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindShaderGroupIndirectCommandNV.html">VkBindShaderGroupIndirectCommandNV</a>
public record VkBindShaderGroupIndirectCommandNV(MemorySegment segment) implements IPointer {
    public VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int groupIndex() {
        return segment.get(LAYOUT$groupIndex, OFFSET$groupIndex);
    }

    public void groupIndex(@unsigned int value) {
        segment.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);
    }

    public static VkBindShaderGroupIndirectCommandNV allocate(Arena arena) {
        return new VkBindShaderGroupIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindShaderGroupIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindShaderGroupIndirectCommandNV[] ret = new VkBindShaderGroupIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindShaderGroupIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindShaderGroupIndirectCommandNV clone(Arena arena, VkBindShaderGroupIndirectCommandNV src) {
        VkBindShaderGroupIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindShaderGroupIndirectCommandNV[] clone(Arena arena, VkBindShaderGroupIndirectCommandNV[] src) {
        VkBindShaderGroupIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$groupIndex = PathElement.groupElement("groupIndex");

    public static final OfInt LAYOUT$groupIndex = (OfInt) LAYOUT.select(PATH$groupIndex);

    public static final long OFFSET$groupIndex = LAYOUT.byteOffset(PATH$groupIndex);

    public static final long SIZE$groupIndex = LAYOUT$groupIndex.byteSize();
}
