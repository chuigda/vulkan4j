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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRectLayerKHR.html"><code>VkRectLayerKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRectLayerKHR {
///     VkOffset2D offset;
///     VkExtent2D extent;
///     uint32_t layer;
/// } VkRectLayerKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRectLayerKHR.html"><code>VkRectLayerKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRectLayerKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkRectLayerKHR allocate(Arena arena) {
        VkRectLayerKHR ret = new VkRectLayerKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkRectLayerKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRectLayerKHR[] ret = new VkRectLayerKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRectLayerKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkRectLayerKHR clone(Arena arena, VkRectLayerKHR src) {
        VkRectLayerKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRectLayerKHR[] clone(Arena arena, VkRectLayerKHR[] src) {
        VkRectLayerKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public VkOffset2D offset() {
        return new VkOffset2D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
    }

    public VkExtent2D extent() {
        return new VkExtent2D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

    public @unsigned int layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public void layer(@unsigned int value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkOffset2D.LAYOUT.withName("offset"),
        VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");
    public static final PathElement PATH$layer = PathElement.groupElement("PATH$layer");

    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final OfInt LAYOUT$layer = (OfInt) LAYOUT.select(PATH$layer);

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);
}
