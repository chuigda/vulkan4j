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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html"><code>VkDescriptorBufferInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorBufferInfo {
///     VkBuffer buffer; // optional // @link substring="VkBuffer" target="VkBuffer" @link substring="buffer" target="#buffer"
///     VkDeviceSize offset; // @link substring="offset" target="#offset"
///     VkDeviceSize range; // @link substring="range" target="#range"
/// } VkDescriptorBufferInfo;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBufferInfo.html"><code>VkDescriptorBufferInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorBufferInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorBufferInfo allocate(Arena arena) {
        return new VkDescriptorBufferInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorBufferInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorBufferInfo[] ret = new VkDescriptorBufferInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorBufferInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDescriptorBufferInfo clone(Arena arena, VkDescriptorBufferInfo src) {
        VkDescriptorBufferInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorBufferInfo[] clone(Arena arena, VkDescriptorBufferInfo[] src) {
        VkDescriptorBufferInfo[] ret = allocate(arena, src.length);
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

    public @unsigned long range() {
        return segment.get(LAYOUT$range, OFFSET$range);
    }

    public void range(@unsigned long value) {
        segment.set(LAYOUT$range, OFFSET$range, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("range")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$range = PathElement.groupElement("PATH$range");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$range = (OfLong) LAYOUT.select(PATH$range);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$range = LAYOUT$range.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$range = LAYOUT.byteOffset(PATH$range);
}
