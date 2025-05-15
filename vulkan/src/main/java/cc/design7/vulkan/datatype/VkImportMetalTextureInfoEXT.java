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

/// Represents a pointer to a {@code VkImportMetalTextureInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMetalTextureInfoEXT.html">VkImportMetalTextureInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportMetalTextureInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkImportMetalTextureInfoEXT {
        sType(VkStructureType.IMPORT_METAL_TEXTURE_INFO_EXT);
    }

    public static VkImportMetalTextureInfoEXT allocate(Arena arena) {
        return new VkImportMetalTextureInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkImportMetalTextureInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMetalTextureInfoEXT[] ret = new VkImportMetalTextureInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportMetalTextureInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportMetalTextureInfoEXT clone(Arena arena, VkImportMetalTextureInfoEXT src) {
        VkImportMetalTextureInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMetalTextureInfoEXT[] clone(Arena arena, VkImportMetalTextureInfoEXT[] src) {
        VkImportMetalTextureInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$plane = PathElement.groupElement("PATH$plane");
    public static final PathElement PATH$mtlTexture = PathElement.groupElement("PATH$mtlTexture");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$plane = (OfInt) LAYOUT.select(PATH$plane);
    public static final AddressLayout LAYOUT$mtlTexture = (AddressLayout) LAYOUT.select(PATH$mtlTexture);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$plane = LAYOUT$plane.byteSize();
    public static final long SIZE$mtlTexture = LAYOUT$mtlTexture.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$plane = LAYOUT.byteOffset(PATH$plane);
    public static final long OFFSET$mtlTexture = LAYOUT.byteOffset(PATH$mtlTexture);

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

}
