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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryBarrier.html"><code>VkMemoryBarrier</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMemoryBarrier {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkAccessFlags srcAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="srcAccessMask" target="#srcAccessMask"
///     VkAccessFlags dstAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="dstAccessMask" target="#dstAccessMask"
/// } VkMemoryBarrier;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MEMORY_BARRIER`
///
/// The {@code allocate} ({@link VkMemoryBarrier#allocate(Arena)}, {@link VkMemoryBarrier#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkMemoryBarrier#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryBarrier.html"><code>VkMemoryBarrier</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryBarrier(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryBarrier allocate(Arena arena) {
        VkMemoryBarrier ret = new VkMemoryBarrier(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MEMORY_BARRIER);
        return ret;
    }

    public static VkMemoryBarrier[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryBarrier[] ret = new VkMemoryBarrier[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryBarrier(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MEMORY_BARRIER);
        }
        return ret;
    }

    public static VkMemoryBarrier clone(Arena arena, VkMemoryBarrier src) {
        VkMemoryBarrier ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryBarrier[] clone(Arena arena, VkMemoryBarrier[] src) {
        VkMemoryBarrier[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MEMORY_BARRIER);
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

    public @enumtype(VkAccessFlags.class) int srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @enumtype(VkAccessFlags.class) int dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement("PATH$srcAccessMask");
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement("PATH$dstAccessMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$srcAccessMask = (OfInt) LAYOUT.select(PATH$srcAccessMask);
    public static final OfInt LAYOUT$dstAccessMask = (OfInt) LAYOUT.select(PATH$dstAccessMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcAccessMask = LAYOUT$srcAccessMask.byteSize();
    public static final long SIZE$dstAccessMask = LAYOUT$dstAccessMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
}
