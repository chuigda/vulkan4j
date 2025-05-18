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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewASTCDecodeModeEXT.html"><code>VkImageViewASTCDecodeModeEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageViewASTCDecodeModeEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFormat decodeMode; // @link substring="VkFormat" target="VkFormat" @link substring="decodeMode" target="#decodeMode"
/// } VkImageViewASTCDecodeModeEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT`
///
/// The {@code allocate} ({@link VkImageViewASTCDecodeModeEXT#allocate(Arena)}, {@link VkImageViewASTCDecodeModeEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageViewASTCDecodeModeEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewASTCDecodeModeEXT.html"><code>VkImageViewASTCDecodeModeEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageViewASTCDecodeModeEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageViewASTCDecodeModeEXT allocate(Arena arena) {
        VkImageViewASTCDecodeModeEXT ret = new VkImageViewASTCDecodeModeEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
        return ret;
    }

    public static VkImageViewASTCDecodeModeEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewASTCDecodeModeEXT[] ret = new VkImageViewASTCDecodeModeEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageViewASTCDecodeModeEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
        }
        return ret;
    }

    public static VkImageViewASTCDecodeModeEXT clone(Arena arena, VkImageViewASTCDecodeModeEXT src) {
        VkImageViewASTCDecodeModeEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewASTCDecodeModeEXT[] clone(Arena arena, VkImageViewASTCDecodeModeEXT[] src) {
        VkImageViewASTCDecodeModeEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
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

    public @enumtype(VkFormat.class) int decodeMode() {
        return segment.get(LAYOUT$decodeMode, OFFSET$decodeMode);
    }

    public void decodeMode(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$decodeMode, OFFSET$decodeMode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decodeMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$decodeMode = PathElement.groupElement("PATH$decodeMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$decodeMode = (OfInt) LAYOUT.select(PATH$decodeMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$decodeMode = LAYOUT$decodeMode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$decodeMode = LAYOUT.byteOffset(PATH$decodeMode);
}
