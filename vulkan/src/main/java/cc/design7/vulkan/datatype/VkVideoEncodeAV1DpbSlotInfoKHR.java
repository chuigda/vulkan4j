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

/// Represents a pointer to a {@code VkVideoEncodeAV1DpbSlotInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1DpbSlotInfoKHR.html">VkVideoEncodeAV1DpbSlotInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1DpbSlotInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoEncodeAV1DpbSlotInfoKHR {
        sType(VkStructureType.VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR);
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1DpbSlotInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1DpbSlotInfoKHR[] ret = new VkVideoEncodeAV1DpbSlotInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1DpbSlotInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR clone(Arena arena, VkVideoEncodeAV1DpbSlotInfoKHR src) {
        VkVideoEncodeAV1DpbSlotInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR[] clone(Arena arena, VkVideoEncodeAV1DpbSlotInfoKHR[] src) {
        VkVideoEncodeAV1DpbSlotInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1ReferenceInfo.LAYOUT).withName("pStdReferenceInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdReferenceInfo = PathElement.groupElement("PATH$pStdReferenceInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdReferenceInfo = (AddressLayout) LAYOUT.select(PATH$pStdReferenceInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdReferenceInfo = LAYOUT$pStdReferenceInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdReferenceInfo = LAYOUT.byteOffset(PATH$pStdReferenceInfo);

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

    public @pointer(comment="StdVideoEncodeAV1ReferenceInfo*") MemorySegment pStdReferenceInfoRaw() {
        return segment.get(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo);
    }

    public void pStdReferenceInfoRaw(@pointer(comment="StdVideoEncodeAV1ReferenceInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo, value);
    }

    public @Nullable StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo() {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeAV1ReferenceInfo(s);
    }

    public void pStdReferenceInfo(@Nullable StdVideoEncodeAV1ReferenceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdReferenceInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1ReferenceInfo[] pStdReferenceInfo(int assumedCount) {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1ReferenceInfo.SIZE);
        StdVideoEncodeAV1ReferenceInfo[] ret = new StdVideoEncodeAV1ReferenceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1ReferenceInfo(s.asSlice(i * StdVideoEncodeAV1ReferenceInfo.SIZE, StdVideoEncodeAV1ReferenceInfo.SIZE));
        }
        return ret;
    }

}
