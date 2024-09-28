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
/// typedef struct VkAabbPositionsKHR {
///     float minX;
///     float minY;
///     float minZ;
///     float maxX;
///     float maxY;
///     float maxZ;
/// } VkAabbPositionsKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAabbPositionsKHR.html">VkAabbPositionsKHR</a>
public record VkAabbPositionsKHR(MemorySegment segment) implements IPointer {
    public VkAabbPositionsKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public float minX() {
        return segment.get(LAYOUT$minX, OFFSET$minX);
    }

    public void minX(float value) {
        segment.set(LAYOUT$minX, OFFSET$minX, value);
    }

    public float minY() {
        return segment.get(LAYOUT$minY, OFFSET$minY);
    }

    public void minY(float value) {
        segment.set(LAYOUT$minY, OFFSET$minY, value);
    }

    public float minZ() {
        return segment.get(LAYOUT$minZ, OFFSET$minZ);
    }

    public void minZ(float value) {
        segment.set(LAYOUT$minZ, OFFSET$minZ, value);
    }

    public float maxX() {
        return segment.get(LAYOUT$maxX, OFFSET$maxX);
    }

    public void maxX(float value) {
        segment.set(LAYOUT$maxX, OFFSET$maxX, value);
    }

    public float maxY() {
        return segment.get(LAYOUT$maxY, OFFSET$maxY);
    }

    public void maxY(float value) {
        segment.set(LAYOUT$maxY, OFFSET$maxY, value);
    }

    public float maxZ() {
        return segment.get(LAYOUT$maxZ, OFFSET$maxZ);
    }

    public void maxZ(float value) {
        segment.set(LAYOUT$maxZ, OFFSET$maxZ, value);
    }

    public static VkAabbPositionsKHR allocate(Arena arena) {
        return new VkAabbPositionsKHR(arena.allocate(LAYOUT));
    }
    
    public static VkAabbPositionsKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAabbPositionsKHR[] ret = new VkAabbPositionsKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAabbPositionsKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$minX = PathElement.groupElement("minX");
    public static final PathElement PATH$minY = PathElement.groupElement("minY");
    public static final PathElement PATH$minZ = PathElement.groupElement("minZ");
    public static final PathElement PATH$maxX = PathElement.groupElement("maxX");
    public static final PathElement PATH$maxY = PathElement.groupElement("maxY");
    public static final PathElement PATH$maxZ = PathElement.groupElement("maxZ");

    public static final OfFloat LAYOUT$minX = (OfFloat) LAYOUT.select(PATH$minX);
    public static final OfFloat LAYOUT$minY = (OfFloat) LAYOUT.select(PATH$minY);
    public static final OfFloat LAYOUT$minZ = (OfFloat) LAYOUT.select(PATH$minZ);
    public static final OfFloat LAYOUT$maxX = (OfFloat) LAYOUT.select(PATH$maxX);
    public static final OfFloat LAYOUT$maxY = (OfFloat) LAYOUT.select(PATH$maxY);
    public static final OfFloat LAYOUT$maxZ = (OfFloat) LAYOUT.select(PATH$maxZ);

    public static final long OFFSET$minX = LAYOUT.byteOffset(PATH$minX);
    public static final long OFFSET$minY = LAYOUT.byteOffset(PATH$minY);
    public static final long OFFSET$minZ = LAYOUT.byteOffset(PATH$minZ);
    public static final long OFFSET$maxX = LAYOUT.byteOffset(PATH$maxX);
    public static final long OFFSET$maxY = LAYOUT.byteOffset(PATH$maxY);
    public static final long OFFSET$maxZ = LAYOUT.byteOffset(PATH$maxZ);

    public static final long SIZE$minX = LAYOUT$minX.byteSize();
    public static final long SIZE$minY = LAYOUT$minY.byteSize();
    public static final long SIZE$minZ = LAYOUT$minZ.byteSize();
    public static final long SIZE$maxX = LAYOUT$maxX.byteSize();
    public static final long SIZE$maxY = LAYOUT$maxY.byteSize();
    public static final long SIZE$maxZ = LAYOUT$maxZ.byteSize();
}
