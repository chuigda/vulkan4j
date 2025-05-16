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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.html"><code>VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t perViewRenderAreaCount; // optional
///     VkRect2D const* pPerViewRenderAreas;
/// } VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM`
///
/// The {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.html"><code>VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM allocate(Arena arena) {
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ret = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
        return ret;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] ret = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
        }
        return ret;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM clone(Arena arena, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) {
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] clone(Arena arena, VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] src) {
        VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
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

    public @unsigned int perViewRenderAreaCount() {
        return segment.get(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount);
    }

    public void perViewRenderAreaCount(@unsigned int value) {
        segment.set(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pPerViewRenderAreasRaw() {
        return segment.get(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas);
    }

    public void pPerViewRenderAreasRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas, value);
    }

    public @Nullable VkRect2D pPerViewRenderAreas() {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pPerViewRenderAreas(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPerViewRenderAreasRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pPerViewRenderAreas(int assumedCount) {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.BYTES);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.BYTES, VkRect2D.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewRenderAreaCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pPerViewRenderAreas")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$perViewRenderAreaCount = PathElement.groupElement("PATH$perViewRenderAreaCount");
    public static final PathElement PATH$pPerViewRenderAreas = PathElement.groupElement("PATH$pPerViewRenderAreas");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewRenderAreaCount = (OfInt) LAYOUT.select(PATH$perViewRenderAreaCount);
    public static final AddressLayout LAYOUT$pPerViewRenderAreas = (AddressLayout) LAYOUT.select(PATH$pPerViewRenderAreas);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$perViewRenderAreaCount = LAYOUT$perViewRenderAreaCount.byteSize();
    public static final long SIZE$pPerViewRenderAreas = LAYOUT$pPerViewRenderAreas.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewRenderAreaCount = LAYOUT.byteOffset(PATH$perViewRenderAreaCount);
    public static final long OFFSET$pPerViewRenderAreas = LAYOUT.byteOffset(PATH$pPerViewRenderAreas);
}
