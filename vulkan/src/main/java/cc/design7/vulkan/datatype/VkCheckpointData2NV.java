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

/// Represents a pointer to a {@code VkCheckpointData2NV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCheckpointData2NV.html">VkCheckpointData2NV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCheckpointData2NV(@NotNull MemorySegment segment) implements IPointer {
    public VkCheckpointData2NV {
        sType(VkStructureType.CHECKPOINT_DATA_2_NV);
    }

    public static VkCheckpointData2NV allocate(Arena arena) {
        return new VkCheckpointData2NV(arena.allocate(LAYOUT));
    }

    public static VkCheckpointData2NV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCheckpointData2NV[] ret = new VkCheckpointData2NV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCheckpointData2NV(segment.asSlice(i * SIZE, SIZE));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

    public void pCheckpointMarker(IPointer pointer) {
        pCheckpointMarker(pointer.segment());
    }

}
