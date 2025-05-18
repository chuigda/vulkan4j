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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryInfoKHR.html"><code>VkPipelineBinaryInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineBinaryInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t binaryCount; // optional // @link substring="binaryCount" target="#binaryCount"
///     VkPipelineBinaryKHR const* pPipelineBinaries; // @link substring="VkPipelineBinaryKHR" target="VkPipelineBinaryKHR" @link substring="pPipelineBinaries" target="#pPipelineBinaries"
/// } VkPipelineBinaryInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR`
///
/// The {@code allocate} ({@link VkPipelineBinaryInfoKHR#allocate(Arena)}, {@link VkPipelineBinaryInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineBinaryInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryInfoKHR.html"><code>VkPipelineBinaryInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineBinaryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineBinaryInfoKHR allocate(Arena arena) {
        VkPipelineBinaryInfoKHR ret = new VkPipelineBinaryInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_BINARY_INFO_KHR);
        return ret;
    }

    public static VkPipelineBinaryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryInfoKHR[] ret = new VkPipelineBinaryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_BINARY_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineBinaryInfoKHR clone(Arena arena, VkPipelineBinaryInfoKHR src) {
        VkPipelineBinaryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryInfoKHR[] clone(Arena arena, VkPipelineBinaryInfoKHR[] src) {
        VkPipelineBinaryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_BINARY_INFO_KHR);
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

    public @unsigned int binaryCount() {
        return segment.get(LAYOUT$binaryCount, OFFSET$binaryCount);
    }

    public void binaryCount(@unsigned int value) {
        segment.set(LAYOUT$binaryCount, OFFSET$binaryCount, value);
    }

    /// Note: the returned {@link VkPipelineBinaryKHR.Ptr} does not have correct {@link VkPipelineBinaryKHR.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipelineBinaryKHR.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipelineBinaryKHR.Ptr pPipelineBinaries() {
        MemorySegment s = pPipelineBinariesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineBinaryKHR.Ptr(s);
    }

    public void pPipelineBinaries(@Nullable VkPipelineBinaryKHR.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinariesRaw(s);
    }

    public @pointer(target=VkPipelineBinaryKHR.class) MemorySegment pPipelineBinariesRaw() {
        return segment.get(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries);
    }

    public void pPipelineBinariesRaw(@pointer(target=VkPipelineBinaryKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelineBinaries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$binaryCount = PathElement.groupElement("PATH$binaryCount");
    public static final PathElement PATH$pPipelineBinaries = PathElement.groupElement("PATH$pPipelineBinaries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$binaryCount = (OfInt) LAYOUT.select(PATH$binaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaries = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$binaryCount = LAYOUT$binaryCount.byteSize();
    public static final long SIZE$pPipelineBinaries = LAYOUT$pPipelineBinaries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$binaryCount = LAYOUT.byteOffset(PATH$binaryCount);
    public static final long OFFSET$pPipelineBinaries = LAYOUT.byteOffset(PATH$pPipelineBinaries);
}
