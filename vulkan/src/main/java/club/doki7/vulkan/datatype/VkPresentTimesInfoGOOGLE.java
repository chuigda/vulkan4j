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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentTimesInfoGOOGLE.html"><code>VkPresentTimesInfoGOOGLE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPresentTimesInfoGOOGLE {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t swapchainCount; // @link substring="swapchainCount" target="#swapchainCount"
///     VkPresentTimeGOOGLE const* pTimes; // optional // @link substring="VkPresentTimeGOOGLE" target="VkPresentTimeGOOGLE" @link substring="pTimes" target="#pTimes"
/// } VkPresentTimesInfoGOOGLE;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE`
///
/// The {@code allocate} ({@link VkPresentTimesInfoGOOGLE#allocate(Arena)}, {@link VkPresentTimesInfoGOOGLE#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPresentTimesInfoGOOGLE#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentTimesInfoGOOGLE.html"><code>VkPresentTimesInfoGOOGLE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPresentTimesInfoGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static VkPresentTimesInfoGOOGLE allocate(Arena arena) {
        VkPresentTimesInfoGOOGLE ret = new VkPresentTimesInfoGOOGLE(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PRESENT_TIMES_INFO_GOOGLE);
        return ret;
    }

    public static VkPresentTimesInfoGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentTimesInfoGOOGLE[] ret = new VkPresentTimesInfoGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentTimesInfoGOOGLE(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PRESENT_TIMES_INFO_GOOGLE);
        }
        return ret;
    }

    public static VkPresentTimesInfoGOOGLE clone(Arena arena, VkPresentTimesInfoGOOGLE src) {
        VkPresentTimesInfoGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentTimesInfoGOOGLE[] clone(Arena arena, VkPresentTimesInfoGOOGLE[] src) {
        VkPresentTimesInfoGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PRESENT_TIMES_INFO_GOOGLE);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @Nullable VkPresentTimeGOOGLE pTimes() {
        MemorySegment s = pTimesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPresentTimeGOOGLE(s);
    }

    public void pTimes(@Nullable VkPresentTimeGOOGLE value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTimesRaw(s);
    }

    @unsafe public @Nullable VkPresentTimeGOOGLE[] pTimes(int assumedCount) {
        MemorySegment s = pTimesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPresentTimeGOOGLE.BYTES);
        VkPresentTimeGOOGLE[] ret = new VkPresentTimeGOOGLE[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPresentTimeGOOGLE(s.asSlice(i * VkPresentTimeGOOGLE.BYTES, VkPresentTimeGOOGLE.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkPresentTimeGOOGLE.class) MemorySegment pTimesRaw() {
        return segment.get(LAYOUT$pTimes, OFFSET$pTimes);
    }

    public void pTimesRaw(@pointer(target=VkPresentTimeGOOGLE.class) MemorySegment value) {
        segment.set(LAYOUT$pTimes, OFFSET$pTimes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPresentTimeGOOGLE.LAYOUT).withName("pTimes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pTimes = PathElement.groupElement("PATH$pTimes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pTimes = (AddressLayout) LAYOUT.select(PATH$pTimes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pTimes = LAYOUT$pTimes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pTimes = LAYOUT.byteOffset(PATH$pTimes);
}
