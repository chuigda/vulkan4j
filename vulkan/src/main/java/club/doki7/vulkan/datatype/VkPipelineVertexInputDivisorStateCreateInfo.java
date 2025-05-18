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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineVertexInputDivisorStateCreateInfo.html"><code>VkPipelineVertexInputDivisorStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineVertexInputDivisorStateCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t vertexBindingDivisorCount; // @link substring="vertexBindingDivisorCount" target="#vertexBindingDivisorCount"
///     VkVertexInputBindingDivisorDescription const* pVertexBindingDivisors; // @link substring="VkVertexInputBindingDivisorDescription" target="VkVertexInputBindingDivisorDescription" @link substring="pVertexBindingDivisors" target="#pVertexBindingDivisors"
/// } VkPipelineVertexInputDivisorStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineVertexInputDivisorStateCreateInfo#allocate(Arena)}, {@link VkPipelineVertexInputDivisorStateCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineVertexInputDivisorStateCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineVertexInputDivisorStateCreateInfo.html"><code>VkPipelineVertexInputDivisorStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineVertexInputDivisorStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineVertexInputDivisorStateCreateInfo allocate(Arena arena) {
        VkPipelineVertexInputDivisorStateCreateInfo ret = new VkPipelineVertexInputDivisorStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineVertexInputDivisorStateCreateInfo[] ret = new VkPipelineVertexInputDivisorStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineVertexInputDivisorStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo clone(Arena arena, VkPipelineVertexInputDivisorStateCreateInfo src) {
        VkPipelineVertexInputDivisorStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineVertexInputDivisorStateCreateInfo[] clone(Arena arena, VkPipelineVertexInputDivisorStateCreateInfo[] src) {
        VkPipelineVertexInputDivisorStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO);
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

    public @unsigned int vertexBindingDivisorCount() {
        return segment.get(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount);
    }

    public void vertexBindingDivisorCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount, value);
    }

    public @Nullable VkVertexInputBindingDivisorDescription pVertexBindingDivisors() {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescription(s);
    }

    public void pVertexBindingDivisors(@Nullable VkVertexInputBindingDivisorDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDivisorsRaw(s);
    }

    @unsafe public @Nullable VkVertexInputBindingDivisorDescription[] pVertexBindingDivisors(int assumedCount) {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVertexInputBindingDivisorDescription.BYTES);
        VkVertexInputBindingDivisorDescription[] ret = new VkVertexInputBindingDivisorDescription[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVertexInputBindingDivisorDescription(s.asSlice(i * VkVertexInputBindingDivisorDescription.BYTES, VkVertexInputBindingDivisorDescription.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkVertexInputBindingDivisorDescription.class) MemorySegment pVertexBindingDivisorsRaw() {
        return segment.get(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors);
    }

    public void pVertexBindingDivisorsRaw(@pointer(target=VkVertexInputBindingDivisorDescription.class) MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDivisorDescription.LAYOUT).withName("pVertexBindingDivisors")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexBindingDivisorCount = PathElement.groupElement("PATH$vertexBindingDivisorCount");
    public static final PathElement PATH$pVertexBindingDivisors = PathElement.groupElement("PATH$pVertexBindingDivisors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexBindingDivisorCount = (OfInt) LAYOUT.select(PATH$vertexBindingDivisorCount);
    public static final AddressLayout LAYOUT$pVertexBindingDivisors = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDivisors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexBindingDivisorCount = LAYOUT$vertexBindingDivisorCount.byteSize();
    public static final long SIZE$pVertexBindingDivisors = LAYOUT$pVertexBindingDivisors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexBindingDivisorCount = LAYOUT.byteOffset(PATH$vertexBindingDivisorCount);
    public static final long OFFSET$pVertexBindingDivisors = LAYOUT.byteOffset(PATH$pVertexBindingDivisors);
}
