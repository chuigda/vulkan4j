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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerTileBeginInfoQCOM.html"><code>VkPerTileBeginInfoQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerTileBeginInfoQCOM {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
/// } VkPerTileBeginInfoQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM`
///
/// The {@code allocate} ({@link VkPerTileBeginInfoQCOM#allocate(Arena)}, {@link VkPerTileBeginInfoQCOM#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPerTileBeginInfoQCOM#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerTileBeginInfoQCOM.html"><code>VkPerTileBeginInfoQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerTileBeginInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerTileBeginInfoQCOM allocate(Arena arena) {
        VkPerTileBeginInfoQCOM ret = new VkPerTileBeginInfoQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PER_TILE_BEGIN_INFO_QCOM);
        return ret;
    }

    public static VkPerTileBeginInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerTileBeginInfoQCOM[] ret = new VkPerTileBeginInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerTileBeginInfoQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PER_TILE_BEGIN_INFO_QCOM);
        }
        return ret;
    }

    public static VkPerTileBeginInfoQCOM clone(Arena arena, VkPerTileBeginInfoQCOM src) {
        VkPerTileBeginInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerTileBeginInfoQCOM[] clone(Arena arena, VkPerTileBeginInfoQCOM[] src) {
        VkPerTileBeginInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PER_TILE_BEGIN_INFO_QCOM);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
}
