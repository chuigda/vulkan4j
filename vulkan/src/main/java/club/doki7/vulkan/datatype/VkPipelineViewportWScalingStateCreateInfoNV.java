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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportWScalingStateCreateInfoNV.html"><code>VkPipelineViewportWScalingStateCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineViewportWScalingStateCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 viewportWScalingEnable; // @link substring="viewportWScalingEnable" target="#viewportWScalingEnable"
///     uint32_t viewportCount; // @link substring="viewportCount" target="#viewportCount"
///     VkViewportWScalingNV const* pViewportWScalings; // optional // @link substring="VkViewportWScalingNV" target="VkViewportWScalingNV" @link substring="pViewportWScalings" target="#pViewportWScalings"
/// } VkPipelineViewportWScalingStateCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkPipelineViewportWScalingStateCreateInfoNV#allocate(Arena)}, {@link VkPipelineViewportWScalingStateCreateInfoNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineViewportWScalingStateCreateInfoNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportWScalingStateCreateInfoNV.html"><code>VkPipelineViewportWScalingStateCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportWScalingStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineViewportWScalingStateCreateInfoNV allocate(Arena arena) {
        VkPipelineViewportWScalingStateCreateInfoNV ret = new VkPipelineViewportWScalingStateCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
        return ret;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportWScalingStateCreateInfoNV[] ret = new VkPipelineViewportWScalingStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportWScalingStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV clone(Arena arena, VkPipelineViewportWScalingStateCreateInfoNV src) {
        VkPipelineViewportWScalingStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportWScalingStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportWScalingStateCreateInfoNV[] src) {
        VkPipelineViewportWScalingStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
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

    public @unsigned int viewportWScalingEnable() {
        return segment.get(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable);
    }

    public void viewportWScalingEnable(@unsigned int value) {
        segment.set(LAYOUT$viewportWScalingEnable, OFFSET$viewportWScalingEnable, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @Nullable VkViewportWScalingNV pViewportWScalings() {
        MemorySegment s = pViewportWScalingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkViewportWScalingNV(s);
    }

    public void pViewportWScalings(@Nullable VkViewportWScalingNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportWScalingsRaw(s);
    }

    @unsafe public @Nullable VkViewportWScalingNV[] pViewportWScalings(int assumedCount) {
        MemorySegment s = pViewportWScalingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewportWScalingNV.BYTES);
        VkViewportWScalingNV[] ret = new VkViewportWScalingNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewportWScalingNV(s.asSlice(i * VkViewportWScalingNV.BYTES, VkViewportWScalingNV.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkViewportWScalingNV.class) MemorySegment pViewportWScalingsRaw() {
        return segment.get(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings);
    }

    public void pViewportWScalingsRaw(@pointer(target=VkViewportWScalingNV.class) MemorySegment value) {
        segment.set(LAYOUT$pViewportWScalings, OFFSET$pViewportWScalings, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewportWScalingNV.LAYOUT).withName("pViewportWScalings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$viewportWScalingEnable = PathElement.groupElement("PATH$viewportWScalingEnable");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pViewportWScalings = PathElement.groupElement("PATH$pViewportWScalings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportWScalingEnable = (OfInt) LAYOUT.select(PATH$viewportWScalingEnable);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewportWScalings = (AddressLayout) LAYOUT.select(PATH$pViewportWScalings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewportWScalingEnable = LAYOUT$viewportWScalingEnable.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewportWScalings = LAYOUT$pViewportWScalings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportWScalingEnable = LAYOUT.byteOffset(PATH$viewportWScalingEnable);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportWScalings = LAYOUT.byteOffset(PATH$pViewportWScalings);
}
