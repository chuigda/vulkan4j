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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAabbPositionsKHR.html"><code>VkAabbPositionsKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAabbPositionsKHR {
///     float minX;
///     float minY;
///     float minZ;
///     float maxX;
///     float maxY;
///     float maxZ;
/// } VkAabbPositionsKHR;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAabbPositionsKHR.html"><code>VkAabbPositionsKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAabbPositionsKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkAabbPositionsKHR allocate(Arena arena) {
        VkAabbPositionsKHR ret = new VkAabbPositionsKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkAabbPositionsKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAabbPositionsKHR[] ret = new VkAabbPositionsKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAabbPositionsKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkAabbPositionsKHR clone(Arena arena, VkAabbPositionsKHR src) {
        VkAabbPositionsKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAabbPositionsKHR[] clone(Arena arena, VkAabbPositionsKHR[] src) {
        VkAabbPositionsKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$minX = PathElement.groupElement("PATH$minX");
    public static final PathElement PATH$minY = PathElement.groupElement("PATH$minY");
    public static final PathElement PATH$minZ = PathElement.groupElement("PATH$minZ");
    public static final PathElement PATH$maxX = PathElement.groupElement("PATH$maxX");
    public static final PathElement PATH$maxY = PathElement.groupElement("PATH$maxY");
    public static final PathElement PATH$maxZ = PathElement.groupElement("PATH$maxZ");

    public static final OfFloat LAYOUT$minX = (OfFloat) LAYOUT.select(PATH$minX);
    public static final OfFloat LAYOUT$minY = (OfFloat) LAYOUT.select(PATH$minY);
    public static final OfFloat LAYOUT$minZ = (OfFloat) LAYOUT.select(PATH$minZ);
    public static final OfFloat LAYOUT$maxX = (OfFloat) LAYOUT.select(PATH$maxX);
    public static final OfFloat LAYOUT$maxY = (OfFloat) LAYOUT.select(PATH$maxY);
    public static final OfFloat LAYOUT$maxZ = (OfFloat) LAYOUT.select(PATH$maxZ);

    public static final long SIZE$minX = LAYOUT$minX.byteSize();
    public static final long SIZE$minY = LAYOUT$minY.byteSize();
    public static final long SIZE$minZ = LAYOUT$minZ.byteSize();
    public static final long SIZE$maxX = LAYOUT$maxX.byteSize();
    public static final long SIZE$maxY = LAYOUT$maxY.byteSize();
    public static final long SIZE$maxZ = LAYOUT$maxZ.byteSize();

    public static final long OFFSET$minX = LAYOUT.byteOffset(PATH$minX);
    public static final long OFFSET$minY = LAYOUT.byteOffset(PATH$minY);
    public static final long OFFSET$minZ = LAYOUT.byteOffset(PATH$minZ);
    public static final long OFFSET$maxX = LAYOUT.byteOffset(PATH$maxX);
    public static final long OFFSET$maxY = LAYOUT.byteOffset(PATH$maxY);
    public static final long OFFSET$maxZ = LAYOUT.byteOffset(PATH$maxZ);
}
