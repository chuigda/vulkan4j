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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCheckpointData2NV.html"><code>VkCheckpointData2NV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCheckpointData2NV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineStageFlags2 stage; // @link substring="VkPipelineStageFlags2" target="VkPipelineStageFlags2" @link substring="stage" target="#stage"
///     void* pCheckpointMarker; // @link substring="pCheckpointMarker" target="#pCheckpointMarker"
/// } VkCheckpointData2NV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV`
///
/// The {@code allocate} ({@link VkCheckpointData2NV#allocate(Arena)}, {@link VkCheckpointData2NV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkCheckpointData2NV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCheckpointData2NV.html"><code>VkCheckpointData2NV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCheckpointData2NV(@NotNull MemorySegment segment) implements IPointer {
    public static VkCheckpointData2NV allocate(Arena arena) {
        VkCheckpointData2NV ret = new VkCheckpointData2NV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CHECKPOINT_DATA_2_NV);
        return ret;
    }

    public static VkCheckpointData2NV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCheckpointData2NV[] ret = new VkCheckpointData2NV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCheckpointData2NV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CHECKPOINT_DATA_2_NV);
        }
        return ret;
    }

    public static VkCheckpointData2NV clone(Arena arena, VkCheckpointData2NV src) {
        VkCheckpointData2NV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCheckpointData2NV[] clone(Arena arena, VkCheckpointData2NV[] src) {
        VkCheckpointData2NV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CHECKPOINT_DATA_2_NV);
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

    public @enumtype(VkPipelineStageFlags2.class) long stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkPipelineStageFlags2.class) long value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @pointer(comment="void*") MemorySegment pCheckpointMarker() {
        return segment.get(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker);
    }

    public void pCheckpointMarker(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pCheckpointMarker, OFFSET$pCheckpointMarker, value);
    }

    public void pCheckpointMarker(@Nullable IPointer pointer) {
        pCheckpointMarker(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stage = PathElement.groupElement("PATH$stage");
    public static final PathElement PATH$pCheckpointMarker = PathElement.groupElement("PATH$pCheckpointMarker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$stage = (OfLong) LAYOUT.select(PATH$stage);
    public static final AddressLayout LAYOUT$pCheckpointMarker = (AddressLayout) LAYOUT.select(PATH$pCheckpointMarker);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$pCheckpointMarker = LAYOUT$pCheckpointMarker.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$pCheckpointMarker = LAYOUT.byteOffset(PATH$pCheckpointMarker);
}
