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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryBarrierAccessFlags3KHR.html"><code>VkMemoryBarrierAccessFlags3KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMemoryBarrierAccessFlags3KHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkAccessFlags3KHR srcAccessMask3; // optional // @link substring="VkAccessFlags3KHR" target="VkAccessFlags3KHR" @link substring="srcAccessMask3" target="#srcAccessMask3"
///     VkAccessFlags3KHR dstAccessMask3; // optional // @link substring="VkAccessFlags3KHR" target="VkAccessFlags3KHR" @link substring="dstAccessMask3" target="#dstAccessMask3"
/// } VkMemoryBarrierAccessFlags3KHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR`
///
/// The {@code allocate} ({@link VkMemoryBarrierAccessFlags3KHR#allocate(Arena)}, {@link VkMemoryBarrierAccessFlags3KHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkMemoryBarrierAccessFlags3KHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryBarrierAccessFlags3KHR.html"><code>VkMemoryBarrierAccessFlags3KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryBarrierAccessFlags3KHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryBarrierAccessFlags3KHR allocate(Arena arena) {
        VkMemoryBarrierAccessFlags3KHR ret = new VkMemoryBarrierAccessFlags3KHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
        return ret;
    }

    public static VkMemoryBarrierAccessFlags3KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryBarrierAccessFlags3KHR[] ret = new VkMemoryBarrierAccessFlags3KHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryBarrierAccessFlags3KHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
        }
        return ret;
    }

    public static VkMemoryBarrierAccessFlags3KHR clone(Arena arena, VkMemoryBarrierAccessFlags3KHR src) {
        VkMemoryBarrierAccessFlags3KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryBarrierAccessFlags3KHR[] clone(Arena arena, VkMemoryBarrierAccessFlags3KHR[] src) {
        VkMemoryBarrierAccessFlags3KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MEMORY_BARRIER_ACCESS_FLAGS_3_KHR);
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

    public @enumtype(VkAccessFlags3KHR.class) long srcAccessMask3() {
        return segment.get(LAYOUT$srcAccessMask3, OFFSET$srcAccessMask3);
    }

    public void srcAccessMask3(@enumtype(VkAccessFlags3KHR.class) long value) {
        segment.set(LAYOUT$srcAccessMask3, OFFSET$srcAccessMask3, value);
    }

    public @enumtype(VkAccessFlags3KHR.class) long dstAccessMask3() {
        return segment.get(LAYOUT$dstAccessMask3, OFFSET$dstAccessMask3);
    }

    public void dstAccessMask3(@enumtype(VkAccessFlags3KHR.class) long value) {
        segment.set(LAYOUT$dstAccessMask3, OFFSET$dstAccessMask3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcAccessMask3"),
        ValueLayout.JAVA_LONG.withName("dstAccessMask3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcAccessMask3 = PathElement.groupElement("PATH$srcAccessMask3");
    public static final PathElement PATH$dstAccessMask3 = PathElement.groupElement("PATH$dstAccessMask3");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$srcAccessMask3 = (OfLong) LAYOUT.select(PATH$srcAccessMask3);
    public static final OfLong LAYOUT$dstAccessMask3 = (OfLong) LAYOUT.select(PATH$dstAccessMask3);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcAccessMask3 = LAYOUT$srcAccessMask3.byteSize();
    public static final long SIZE$dstAccessMask3 = LAYOUT$dstAccessMask3.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcAccessMask3 = LAYOUT.byteOffset(PATH$srcAccessMask3);
    public static final long OFFSET$dstAccessMask3 = LAYOUT.byteOffset(PATH$dstAccessMask3);
}
