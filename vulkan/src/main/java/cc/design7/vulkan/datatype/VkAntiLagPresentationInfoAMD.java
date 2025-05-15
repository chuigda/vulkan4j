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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagPresentationInfoAMD.html"><code>VkAntiLagPresentationInfoAMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAntiLagPresentationInfoAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkAntiLagStageAMD stage;
///     uint64_t frameIndex;
/// } VkAntiLagPresentationInfoAMD;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD`
///
/// The {@link VkAntiLagPresentationInfoAMD#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAntiLagPresentationInfoAMD#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagPresentationInfoAMD.html"><code>VkAntiLagPresentationInfoAMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAntiLagPresentationInfoAMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkAntiLagPresentationInfoAMD allocate(Arena arena) {
        VkAntiLagPresentationInfoAMD ret = new VkAntiLagPresentationInfoAMD(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ANTI_LAG_PRESENTATION_INFO_AMD);
        return ret;
    }

    public static VkAntiLagPresentationInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAntiLagPresentationInfoAMD[] ret = new VkAntiLagPresentationInfoAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAntiLagPresentationInfoAMD(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ANTI_LAG_PRESENTATION_INFO_AMD);
        }
        return ret;
    }

    public static VkAntiLagPresentationInfoAMD clone(Arena arena, VkAntiLagPresentationInfoAMD src) {
        VkAntiLagPresentationInfoAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAntiLagPresentationInfoAMD[] clone(Arena arena, VkAntiLagPresentationInfoAMD[] src) {
        VkAntiLagPresentationInfoAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ANTI_LAG_PRESENTATION_INFO_AMD);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkAntiLagStageAMD.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkAntiLagStageAMD.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @unsigned long frameIndex() {
        return segment.get(LAYOUT$frameIndex, OFFSET$frameIndex);
    }

    public void frameIndex(@unsigned long value) {
        segment.set(LAYOUT$frameIndex, OFFSET$frameIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("frameIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stage = PathElement.groupElement("PATH$stage");
    public static final PathElement PATH$frameIndex = PathElement.groupElement("PATH$frameIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stage = (OfInt) LAYOUT.select(PATH$stage);
    public static final OfLong LAYOUT$frameIndex = (OfLong) LAYOUT.select(PATH$frameIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$frameIndex = LAYOUT$frameIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$frameIndex = LAYOUT.byteOffset(PATH$frameIndex);
}
