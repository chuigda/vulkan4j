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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsStreamNV.html"><code>VkIndirectCommandsStreamNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsStreamNV {
///     VkBuffer buffer;
///     VkDeviceSize offset;
/// } VkIndirectCommandsStreamNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsStreamNV.html"><code>VkIndirectCommandsStreamNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsStreamNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsStreamNV allocate(Arena arena) {
        VkIndirectCommandsStreamNV ret = new VkIndirectCommandsStreamNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkIndirectCommandsStreamNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsStreamNV[] ret = new VkIndirectCommandsStreamNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsStreamNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkIndirectCommandsStreamNV clone(Arena arena, VkIndirectCommandsStreamNV src) {
        VkIndirectCommandsStreamNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsStreamNV[] clone(Arena arena, VkIndirectCommandsStreamNV[] src) {
        VkIndirectCommandsStreamNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
}
