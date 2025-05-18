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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265DpbSlotInfoKHR.html"><code>VkVideoDecodeH265DpbSlotInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH265DpbSlotInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     StdVideoDecodeH265ReferenceInfo const* pStdReferenceInfo; // @link substring="StdVideoDecodeH265ReferenceInfo" target="StdVideoDecodeH265ReferenceInfo" @link substring="pStdReferenceInfo" target="#pStdReferenceInfo"
/// } VkVideoDecodeH265DpbSlotInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoDecodeH265DpbSlotInfoKHR#allocate(Arena)}, {@link VkVideoDecodeH265DpbSlotInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoDecodeH265DpbSlotInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265DpbSlotInfoKHR.html"><code>VkVideoDecodeH265DpbSlotInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH265DpbSlotInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH265DpbSlotInfoKHR allocate(Arena arena) {
        VkVideoDecodeH265DpbSlotInfoKHR ret = new VkVideoDecodeH265DpbSlotInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH265DpbSlotInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265DpbSlotInfoKHR[] ret = new VkVideoDecodeH265DpbSlotInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265DpbSlotInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH265DpbSlotInfoKHR clone(Arena arena, VkVideoDecodeH265DpbSlotInfoKHR src) {
        VkVideoDecodeH265DpbSlotInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265DpbSlotInfoKHR[] clone(Arena arena, VkVideoDecodeH265DpbSlotInfoKHR[] src) {
        VkVideoDecodeH265DpbSlotInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR);
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

    public @Nullable StdVideoDecodeH265ReferenceInfo pStdReferenceInfo() {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoDecodeH265ReferenceInfo(s);
    }

    public void pStdReferenceInfo(@Nullable StdVideoDecodeH265ReferenceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdReferenceInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeH265ReferenceInfo[] pStdReferenceInfo(int assumedCount) {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeH265ReferenceInfo.BYTES);
        StdVideoDecodeH265ReferenceInfo[] ret = new StdVideoDecodeH265ReferenceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeH265ReferenceInfo(s.asSlice(i * StdVideoDecodeH265ReferenceInfo.BYTES, StdVideoDecodeH265ReferenceInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoDecodeH265ReferenceInfo.class) MemorySegment pStdReferenceInfoRaw() {
        return segment.get(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo);
    }

    public void pStdReferenceInfoRaw(@pointer(target=StdVideoDecodeH265ReferenceInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeH265ReferenceInfo.LAYOUT).withName("pStdReferenceInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

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
}
