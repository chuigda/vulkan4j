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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryAllocateFlagsInfo.html"><code>VkMemoryAllocateFlagsInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMemoryAllocateFlagsInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkMemoryAllocateFlags flags; // optional // @link substring="VkMemoryAllocateFlags" target="VkMemoryAllocateFlags" @link substring="flags" target="#flags"
///     uint32_t deviceMask; // @link substring="deviceMask" target="#deviceMask"
/// } VkMemoryAllocateFlagsInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO`
///
/// The {@code allocate} ({@link VkMemoryAllocateFlagsInfo#allocate(Arena)}, {@link VkMemoryAllocateFlagsInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkMemoryAllocateFlagsInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryAllocateFlagsInfo.html"><code>VkMemoryAllocateFlagsInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryAllocateFlagsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryAllocateFlagsInfo allocate(Arena arena) {
        VkMemoryAllocateFlagsInfo ret = new VkMemoryAllocateFlagsInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MEMORY_ALLOCATE_FLAGS_INFO);
        return ret;
    }

    public static VkMemoryAllocateFlagsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryAllocateFlagsInfo[] ret = new VkMemoryAllocateFlagsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryAllocateFlagsInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MEMORY_ALLOCATE_FLAGS_INFO);
        }
        return ret;
    }

    public static VkMemoryAllocateFlagsInfo clone(Arena arena, VkMemoryAllocateFlagsInfo src) {
        VkMemoryAllocateFlagsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryAllocateFlagsInfo[] clone(Arena arena, VkMemoryAllocateFlagsInfo[] src) {
        VkMemoryAllocateFlagsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MEMORY_ALLOCATE_FLAGS_INFO);
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

    public @enumtype(VkMemoryAllocateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMemoryAllocateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("PATH$deviceMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);
}
