package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceValueINTEL.html"><code>VkPerformanceValueINTEL</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceValueINTEL {
///     VkPerformanceValueTypeINTEL type;
///     VkPerformanceValueDataINTEL data;
/// } VkPerformanceValueINTEL;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceValueINTEL.html"><code>VkPerformanceValueINTEL</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceValueINTEL(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerformanceValueINTEL allocate(Arena arena) {
        VkPerformanceValueINTEL ret = new VkPerformanceValueINTEL(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkPerformanceValueINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceValueINTEL[] ret = new VkPerformanceValueINTEL[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceValueINTEL(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPerformanceValueINTEL clone(Arena arena, VkPerformanceValueINTEL src) {
        VkPerformanceValueINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceValueINTEL[] clone(Arena arena, VkPerformanceValueINTEL[] src) {
        VkPerformanceValueINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkPerformanceValueTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceValueTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public VkPerformanceValueDataINTEL data() {
        return new VkPerformanceValueDataINTEL(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkPerformanceValueDataINTEL value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        VkPerformanceValueDataINTEL.LAYOUT.withName("data")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$data = (StructLayout) LAYOUT.select(PATH$data);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
}
