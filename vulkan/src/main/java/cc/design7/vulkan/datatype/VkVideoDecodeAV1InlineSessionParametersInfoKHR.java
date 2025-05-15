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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeAV1InlineSessionParametersInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeAV1InlineSessionParametersInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     StdVideoAV1SequenceHeader const* pStdSequenceHeader; // optional
/// } VkVideoDecodeAV1InlineSessionParametersInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR`
///
/// The {@link VkVideoDecodeAV1InlineSessionParametersInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeAV1InlineSessionParametersInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1InlineSessionParametersInfoKHR.html"><code>VkVideoDecodeAV1InlineSessionParametersInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeAV1InlineSessionParametersInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR allocate(Arena arena) {
        VkVideoDecodeAV1InlineSessionParametersInfoKHR ret = new VkVideoDecodeAV1InlineSessionParametersInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1InlineSessionParametersInfoKHR[] ret = new VkVideoDecodeAV1InlineSessionParametersInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeAV1InlineSessionParametersInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR clone(Arena arena, VkVideoDecodeAV1InlineSessionParametersInfoKHR src) {
        VkVideoDecodeAV1InlineSessionParametersInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR[] clone(Arena arena, VkVideoDecodeAV1InlineSessionParametersInfoKHR[] src) {
        VkVideoDecodeAV1InlineSessionParametersInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
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

    public @pointer(comment="StdVideoAV1SequenceHeader*") MemorySegment pStdSequenceHeaderRaw() {
        return segment.get(LAYOUT$pStdSequenceHeader, OFFSET$pStdSequenceHeader);
    }

    public void pStdSequenceHeaderRaw(@pointer(comment="StdVideoAV1SequenceHeader*") MemorySegment value) {
        segment.set(LAYOUT$pStdSequenceHeader, OFFSET$pStdSequenceHeader, value);
    }

    public @Nullable StdVideoAV1SequenceHeader pStdSequenceHeader() {
        MemorySegment s = pStdSequenceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoAV1SequenceHeader(s);
    }

    public void pStdSequenceHeader(@Nullable StdVideoAV1SequenceHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSequenceHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1SequenceHeader[] pStdSequenceHeader(int assumedCount) {
        MemorySegment s = pStdSequenceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1SequenceHeader.BYTES);
        StdVideoAV1SequenceHeader[] ret = new StdVideoAV1SequenceHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1SequenceHeader(s.asSlice(i * StdVideoAV1SequenceHeader.BYTES, StdVideoAV1SequenceHeader.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1SequenceHeader.LAYOUT).withName("pStdSequenceHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdSequenceHeader = PathElement.groupElement("PATH$pStdSequenceHeader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdSequenceHeader = (AddressLayout) LAYOUT.select(PATH$pStdSequenceHeader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdSequenceHeader = LAYOUT$pStdSequenceHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdSequenceHeader = LAYOUT.byteOffset(PATH$pStdSequenceHeader);
}
