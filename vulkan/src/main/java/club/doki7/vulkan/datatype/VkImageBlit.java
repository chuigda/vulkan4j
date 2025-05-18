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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageBlit.html"><code>VkImageBlit</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageBlit {
///     VkImageSubresourceLayers srcSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="srcSubresource" target="#srcSubresource"
///     VkOffset3D srcOffsets; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="srcOffsets" target="#srcOffsets"
///     VkImageSubresourceLayers dstSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="dstSubresource" target="#dstSubresource"
///     VkOffset3D dstOffsets; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="dstOffsets" target="#dstOffsets"
/// } VkImageBlit;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageBlit.html"><code>VkImageBlit</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageBlit(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageBlit allocate(Arena arena) {
        return new VkImageBlit(arena.allocate(LAYOUT));
    }

    public static VkImageBlit[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageBlit[] ret = new VkImageBlit[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageBlit(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkImageBlit clone(Arena arena, VkImageBlit src) {
        VkImageBlit ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageBlit[] clone(Arena arena, VkImageBlit[] src) {
        VkImageBlit[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(@NotNull VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, SIZE$srcSubresource);
    }

    public @NotNull VkOffset3D srcOffsets() {
        return new VkOffset3D(segment.asSlice(OFFSET$srcOffsets, LAYOUT$srcOffsets));
    }

    public void srcOffsets(@NotNull VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcOffsets, SIZE$srcOffsets);
    }

    public @NotNull VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(@NotNull VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, SIZE$dstSubresource);
    }

    public @NotNull VkOffset3D dstOffsets() {
        return new VkOffset3D(segment.asSlice(OFFSET$dstOffsets, LAYOUT$dstOffsets));
    }

    public void dstOffsets(@NotNull VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstOffsets, SIZE$dstOffsets);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        VkOffset3D.LAYOUT.withName("srcOffsets"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        VkOffset3D.LAYOUT.withName("dstOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$srcSubresource = PathElement.groupElement("PATH$srcSubresource");
    public static final PathElement PATH$srcOffsets = PathElement.groupElement("PATH$srcOffsets");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("PATH$dstSubresource");
    public static final PathElement PATH$dstOffsets = PathElement.groupElement("PATH$dstOffsets");

    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final StructLayout LAYOUT$srcOffsets = (StructLayout) LAYOUT.select(PATH$srcOffsets);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final StructLayout LAYOUT$dstOffsets = (StructLayout) LAYOUT.select(PATH$dstOffsets);

    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffsets = LAYOUT$srcOffsets.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffsets = LAYOUT$dstOffsets.byteSize();

    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffsets = LAYOUT.byteOffset(PATH$srcOffsets);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffsets = LAYOUT.byteOffset(PATH$dstOffsets);
}
