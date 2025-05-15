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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalTextureInfoEXT.html"><code>VkExportMetalTextureInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExportMetalTextureInfoEXT {
///     VkStructureType sType;
///     void const* pNext;
///     VkImage image;
///     VkImageView imageView;
///     VkBufferView bufferView;
///     VkImageAspectFlags plane;
///     MTLTexture_id mtlTexture;
/// } VkExportMetalTextureInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT`
///
/// The {@link VkExportMetalTextureInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkExportMetalTextureInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalTextureInfoEXT.html"><code>VkExportMetalTextureInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExportMetalTextureInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkExportMetalTextureInfoEXT allocate(Arena arena) {
        VkExportMetalTextureInfoEXT ret = new VkExportMetalTextureInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.EXPORT_METAL_TEXTURE_INFO_EXT);
        return ret;
    }

    public static VkExportMetalTextureInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalTextureInfoEXT[] ret = new VkExportMetalTextureInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExportMetalTextureInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.EXPORT_METAL_TEXTURE_INFO_EXT);
        }
        return ret;
    }

    public static VkExportMetalTextureInfoEXT clone(Arena arena, VkExportMetalTextureInfoEXT src) {
        VkExportMetalTextureInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalTextureInfoEXT[] clone(Arena arena, VkExportMetalTextureInfoEXT[] src) {
        VkExportMetalTextureInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.EXPORT_METAL_TEXTURE_INFO_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkImageView imageView() {
        MemorySegment s = segment.asSlice(OFFSET$imageView, SIZE$imageView);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@Nullable VkImageView value) {
        segment.set(LAYOUT$imageView, OFFSET$imageView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkBufferView bufferView() {
        MemorySegment s = segment.asSlice(OFFSET$bufferView, SIZE$bufferView);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferView(s);
    }

    public void bufferView(@Nullable VkBufferView value) {
        segment.set(LAYOUT$bufferView, OFFSET$bufferView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageAspectFlags.class) int plane() {
        return segment.get(LAYOUT$plane, OFFSET$plane);
    }

    public void plane(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$plane, OFFSET$plane, value);
    }

    public @pointer(comment="void*") MemorySegment mtlTexture() {
        return segment.get(LAYOUT$mtlTexture, OFFSET$mtlTexture);
    }

    public void mtlTexture(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlTexture, OFFSET$mtlTexture, value);
    }

    public void mtlTexture(IPointer pointer) {
        mtlTexture(pointer.segment());
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.ADDRESS.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$bufferView = PathElement.groupElement("PATH$bufferView");
    public static final PathElement PATH$plane = PathElement.groupElement("PATH$plane");
    public static final PathElement PATH$mtlTexture = PathElement.groupElement("PATH$mtlTexture");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final AddressLayout LAYOUT$bufferView = (AddressLayout) LAYOUT.select(PATH$bufferView);
    public static final OfInt LAYOUT$plane = (OfInt) LAYOUT.select(PATH$plane);
    public static final AddressLayout LAYOUT$mtlTexture = (AddressLayout) LAYOUT.select(PATH$mtlTexture);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$bufferView = LAYOUT$bufferView.byteSize();
    public static final long SIZE$plane = LAYOUT$plane.byteSize();
    public static final long SIZE$mtlTexture = LAYOUT$mtlTexture.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$bufferView = LAYOUT.byteOffset(PATH$bufferView);
    public static final long OFFSET$plane = LAYOUT.byteOffset(PATH$plane);
    public static final long OFFSET$mtlTexture = LAYOUT.byteOffset(PATH$mtlTexture);
}
