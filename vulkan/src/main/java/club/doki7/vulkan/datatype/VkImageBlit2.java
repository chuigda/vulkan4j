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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageBlit2.html"><code>VkImageBlit2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageBlit2 {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageSubresourceLayers srcSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="srcSubresource" target="#srcSubresource"
///     VkOffset3D srcOffsets; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="srcOffsets" target="#srcOffsets"
///     VkImageSubresourceLayers dstSubresource; // @link substring="VkImageSubresourceLayers" target="VkImageSubresourceLayers" @link substring="dstSubresource" target="#dstSubresource"
///     VkOffset3D dstOffsets; // @link substring="VkOffset3D" target="VkOffset3D" @link substring="dstOffsets" target="#dstOffsets"
/// } VkImageBlit2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_BLIT_2`
///
/// The {@code allocate} ({@link VkImageBlit2#allocate(Arena)}, {@link VkImageBlit2#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageBlit2#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageBlit2.html"><code>VkImageBlit2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageBlit2(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageBlit2 allocate(Arena arena) {
        VkImageBlit2 ret = new VkImageBlit2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_BLIT_2);
        return ret;
    }

    public static VkImageBlit2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageBlit2[] ret = new VkImageBlit2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageBlit2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_BLIT_2);
        }
        return ret;
    }

    public static VkImageBlit2 clone(Arena arena, VkImageBlit2 src) {
        VkImageBlit2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageBlit2[] clone(Arena arena, VkImageBlit2[] src) {
        VkImageBlit2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_BLIT_2);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        VkOffset3D.LAYOUT.withName("srcOffsets"),
        VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        VkOffset3D.LAYOUT.withName("dstOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcSubresource = PathElement.groupElement("PATH$srcSubresource");
    public static final PathElement PATH$srcOffsets = PathElement.groupElement("PATH$srcOffsets");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("PATH$dstSubresource");
    public static final PathElement PATH$dstOffsets = PathElement.groupElement("PATH$dstOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$srcSubresource = (StructLayout) LAYOUT.select(PATH$srcSubresource);
    public static final StructLayout LAYOUT$srcOffsets = (StructLayout) LAYOUT.select(PATH$srcOffsets);
    public static final StructLayout LAYOUT$dstSubresource = (StructLayout) LAYOUT.select(PATH$dstSubresource);
    public static final StructLayout LAYOUT$dstOffsets = (StructLayout) LAYOUT.select(PATH$dstOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffsets = LAYOUT$srcOffsets.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffsets = LAYOUT$dstOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffsets = LAYOUT.byteOffset(PATH$srcOffsets);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffsets = LAYOUT.byteOffset(PATH$dstOffsets);
}
