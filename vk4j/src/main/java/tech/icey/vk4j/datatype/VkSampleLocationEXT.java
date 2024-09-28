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
/// typedef struct VkSampleLocationEXT {
///     float x;
///     float y;
/// } VkSampleLocationEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSampleLocationEXT.html">VkSampleLocationEXT</a>
public record VkSampleLocationEXT(MemorySegment segment) implements IPointer {
    public VkSampleLocationEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public static VkSampleLocationEXT allocate(Arena arena) {
        return new VkSampleLocationEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSampleLocationEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSampleLocationEXT[] ret = new VkSampleLocationEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSampleLocationEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
}
